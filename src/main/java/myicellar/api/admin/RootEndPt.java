package myicellar.api.admin;


import myicellar.api.admin.handler.*;
import myicellar.api.admin.util.LoggerUtil;
import myicellar.api.admin.util.MicRspnUtil;
import ratpack.error.ClientErrorHandler;
import ratpack.error.ServerErrorHandler;
import ratpack.hikari.HikariModule;

import ratpack.server.RatpackServer;
import ratpack.server.ServerConfig;

import java.net.InetAddress;

/**
 * Created by lwbu on 15-10-12.
 */
public final class RootEndPt {

    private static final class MServerConfig{
        public final int numOfThread;
        public final int port;
        public final String hostname;

        public MServerConfig(int n, int p, String h){
            this.numOfThread = n;
            this.port = p;
            this.hostname = h;
        }
    }

    private static MServerConfig _mServerConfig;

    private final static MServerConfig initMServerConfig(String[] args){
        // init config
        int numOfThread = 0;
        int port = 8888; // default port
        String hostname = null;
        if(args!=null){
            if(args.length>0) {
                int n = Integer.parseInt(args[0]);
                if(n<1||n>4)
                    numOfThread = ServerConfig.DEFAULT_THREADS; // between 1 and 4 otherwise default
                else numOfThread = n;
            }
            if(args.length>1)
                port = Integer.parseInt(args[1]);
            if(args.length>2 && args[2]!=null && args[2].trim().length()>0)
                hostname = args[2].trim();
        }
        return new MServerConfig(numOfThread, port, hostname);
    }

    public static void main(String[] args){
        try {

            _mServerConfig = initMServerConfig(args);

            RatpackServer.start(server -> server
                    .serverConfig(
                            ServerConfig.builder().development(true)
                                    .address(_mServerConfig.hostname == null ? null : InetAddress.getByName(_mServerConfig.hostname))
                                    .port(_mServerConfig.port)
                                    .threads(_mServerConfig.numOfThread)
                    )
                    .registry(ratpack.guice.Guice.registry(db -> db
                                    .module(HikariModule.class, hikariConfig -> {
                                        hikariConfig.setDataSourceClassName("org.postgresql.ds.PGSimpleDataSource");
                                        hikariConfig.addDataSourceProperty("serverName", "localhost");
                                        hikariConfig.addDataSourceProperty("portNumber", "5432");
                                        hikariConfig.addDataSourceProperty("databaseName", "postgres");
                                        hikariConfig.addDataSourceProperty("user", "charlie");
                                        hikariConfig.addDataSourceProperty("password", "");
                                        hikariConfig.setConnectionTestQuery("select 1");
                                    })
                            )
                    )
                    .handlers(rootchain -> rootchain
                            .register(r -> r.add(ServerErrorHandler.class, (ctx, throwable) -> {
                                StringBuilder sbThrowable = new StringBuilder();
                                String msgErr = null;
                                String msgThrowable = null;
                                if (throwable != null) {
                                    sbThrowable.append(throwable.getMessage());
                                    if (throwable.getCause() != null)
                                        sbThrowable.append(" %%% ").append(throwable.getCause().getMessage());
                                    if (throwable.getMessage() != null)
                                        msgErr = throwable.getMessage().replace("io.netty.buffer.ByteBufInputStream", "");
                                    msgThrowable = sbThrowable.toString();
                                }
                                if (ctx.getRequest() != null) {

                                        LoggerUtil.LOGGER.error(LoggerUtil.constructRequestLogMsg(ctx.getRequest(), "ERRserver(" + msgThrowable + ")", true, false), throwable);
                                        ctx.render(MicRspnUtil.jsonFailure(MicRspnUtil.HTTP_CODE_ERROR_SERVER, msgErr));

                                } else {
                                    LoggerUtil.LOGGER.warn("ERRserver REQUEST Received is NULL", throwable);
                                    ctx.render(MicRspnUtil.jsonFailure(MicRspnUtil.HTTP_CODE_BAD_REQUEST, "REQUEST Received is NULL"));
                                }
                            }))
                            .register(r -> r.add(ClientErrorHandler.class, (ctx, throwable) -> {
                                        if (ctx.getRequest() != null) {
                                            LoggerUtil.LOGGER.warn(LoggerUtil.constructRequestLogMsg(ctx.getRequest(), "ERRclient(" + throwable + ")", true, true));
                                        } else {
                                            LoggerUtil.LOGGER.warn("ERRclient REQUEST Received is NULL", throwable);
                                        }
                                        ctx.render(MicRspnUtil.jsonFailure(MicRspnUtil.HTTP_CODE_BAD_REQUEST, "Client Request Error (" + throwable + ")"));
                                    })
                            )
                            .all(ctx -> {
                                if (ctx.getRequest() != null) {
                                    LoggerUtil.LOGGER.debug(LoggerUtil.constructRequestLogMsg(ctx.getRequest(), "ALLfirst", true, false));
                                }
                                ctx.next();
                            })
                            .all(ctx -> {
                                ctx.getResponse().getHeaders()
                                        .set("Access-Control-Allow-Origin", "*")
                                        .set("Access-Control-Allow-Headers", "content-type")
                                        .set("Access-Control-Allow-Methods", "POST");
                                ctx.next();
                            })
                            .prefix(":versmajor:[0-9]+/:lang:chs|eng|cht", mainchain -> mainchain
                                    .prefix("a", aBR -> aBR
                                            .prefix("WineryRegion", afterBR -> afterBR
                                                    .post("Summary", new JoinWineryRegionHandler(JoinWineryRegionHandler.OPTION_ALL))
                                                    .post("Detail", new WineryRegionHandlerQuery(WineryRegionHandlerQuery.OPTION_ONE))
                                                    .post("Update", new WineryRegionHandlerUpdate())
                                                    .post("Create", new WineryRegionHandlerCreate())
                                                    .post("Invalidate", new WineryRegionHandlerInvalidate())
                                            )
                                    )
                                    .prefix("b", bBR -> bBR
                                            .prefix("Winery", afterBR -> afterBR
                                                    .post("Summary", new JoinWineryHandler(JoinWineryHandler.OPTION_ALL))
                                                    .post("Detail", new WineryHandlerQuery(WineryHandlerQuery.OPTION_ONE))
                                                    .post("Update", new WineryHandlerUpdate())
                                                    .post("Create", new WineryHandlerCreate())
                                                    .post("Invalidate", new WineryHandlerInvalidate())
                                            )
                                    )
                                    .prefix("c", cBR -> cBR
                                            .prefix("Wine", afterBR -> afterBR
                                                    .post("Summary", new JoinWineHandler(JoinWineHandler.OPTION_ALL))
                                                    .post("Detail", new WineDetailQueryHandler(WineDetailQueryHandler.OPTION_ONE))
                                                    .post("Vintage", new VintageQueryHandler(VintageQueryHandler.OPTION_ONE))
                                                    .post("Update", new WineHandlerUpdate())
                                                    .post("Create", new WineHandlerCreate())
                                                    .post("Invalidate", new WineHandlerInvalidate())
                                                )
                                    )
                                    .prefix("d", dBR -> dBR
                                            .prefix("Vintage", afterBR -> afterBR
                                                    .post("Detail", new VintageDetailQueryHandler())
                                                    .post("Update", new VintageUpdate())
                                                    .post("Create", new VintageCreate())
                                                    .post("AddAttributes", new VintageAttributeCreate())
                                                    .post("Invalidate", new VintageInvalidate())
                                                    .post("Remove", new AttributeRemoveHandler())
//
                                            )
                                    )
                                    .prefix("e", eBR-> eBR
                                            .prefix("Dropdown", afterBR -> afterBR
                                                .post("Country", new WineryCountryHandler())
                                                .post("WineType", new WineTypeHandler())
                                                .post("Attributes", new AttributeHandler())
                                            )
                                    )
                            )
                            .notFound()));
        }
        catch (Throwable t){
            LoggerUtil.LOGGER.error("Unknown Server Error in Context Chain", t);
            throw new RuntimeException("Unknown Server Error in Context Chain");
        }
    }
}
