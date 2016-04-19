package myicellar.api.admin.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import myicellar.api.admin.mpojos.MicRequHdr;
import myicellar.api.admin.qtil.CommonQtil;
import myicellar.api.admin.qtil.WineryQtil;
import myicellar.jooq.pojos.WineryRegion;
import org.jooq.DSLContext;
import ratpack.func.Pair;
import ratpack.handling.Context;
import ratpack.handling.Handler;
import ratpack.jackson.Jackson;


import javax.sql.DataSource;
import java.sql.Connection;

import static myicellar.api.admin.util.MicRequUtil.*;
import static myicellar.api.admin.util.MicRspnUtil.*;

public final class WineryRegionHandlerQuery implements Handler {
    public final static int OPTION_ONE = 1;
    public final static int OPTION_ALL = 2;

    private final int _option;

    public WineryRegionHandlerQuery(int option) {this._option = option;}

    @Override
    public void handle(Context ctx) throws Exception {
         final ObjectMapper obm = ctx.get(ObjectMapper.class);
        ctx.parse(Jackson.jsonNode())
                .map(rootNode -> {
                    MicRequHdr header = parseRequHdr(obm, rootNode);
                   WineryRegion obj = parseRequCntnObj(obm, WineryRegion.class, rootNode);
                    return Pair.of(header, obj);
                })

                .blockingMap(pair -> {
                    try (Connection connection = ctx.get(DataSource.class).getConnection()) {
                        DSLContext dslContext = CommonQtil.getDSLCtx(connection);

                        if (_option == OPTION_ONE) {
                            return WineryQtil
                                    .queryOneInWineryRegion(dslContext, pair.right.getRegionId()).fetch();
                        }

                        if (_option == OPTION_ALL) {
                            return WineryQtil
                                    .queryAllInWineryRegion(dslContext).fetch();

                        } else
                            return null;
                    }
                    })

                .onNull(()-> ctx.render(jsonFailure(HTTP_CODE_BAD_REQUEST)))

                .map(rec -> jsonSuccess(rec.into(WineryRegion.class)))
                .then(ctx::render);

    }
}