package myicellar.api.admin.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import myicellar.api.admin.mpojos.MicRequHdr;
import myicellar.api.admin.qtil.CommonQtil;
import myicellar.api.admin.qtil.VintageQtil;
import myicellar.jooq.pojos.Vintage;
import org.jooq.DSLContext;
import ratpack.func.Pair;
import ratpack.handling.Context;
import ratpack.handling.Handler;
import ratpack.jackson.Jackson;

import javax.sql.DataSource;
import java.sql.Connection;

import static myicellar.api.admin.util.MicRequUtil.parseRequCntnObj;
import static myicellar.api.admin.util.MicRequUtil.parseRequHdr;
import static myicellar.api.admin.util.MicRspnUtil.HTTP_CODE_BAD_REQUEST;
import static myicellar.api.admin.util.MicRspnUtil.jsonFailure;
import static myicellar.api.admin.util.MicRspnUtil.jsonSuccess;

/**
 * Created by charlie on 29/2/16.
 */
public class VintageHandlerUpdate implements Handler{


    @Override
    public void handle(Context ctx) throws Exception{
        final ObjectMapper obm = ctx.get(ObjectMapper.class);
        ctx.parse(Jackson.jsonNode())
                .map(rootNode -> {
                    MicRequHdr header = parseRequHdr(obm, rootNode);
                    Vintage obj = parseRequCntnObj(obm, Vintage.class, rootNode);
                    return Pair.of(header, obj);
                })

                .blockingMap(pair-> {
                    try (Connection connection = ctx.get(DataSource.class).getConnection()) {
                        DSLContext dslContext = CommonQtil.getDSLCtx(connection);
                        {
                            return VintageQtil.updateVintage(dslContext, pair.right.getWineId(), pair.right.getVintageTag(),
                                    pair.right.getVintageName(), pair.right.getIsValid()).execute();
                            }
                        }
                    })
                    .onNull(()-> ctx.render(jsonFailure(HTTP_CODE_BAD_REQUEST)))

                    .map(urow -> {
                        if(urow.intValue() == 1)
                            return jsonSuccess();
                        else
                            return null;
                    })

                    .then(ctx::render);




        }
    }
