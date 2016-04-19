package myicellar.api.admin.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import myicellar.api.admin.mpojos.MicRequHdr;
import myicellar.api.admin.qtil.CommonQtil;
import myicellar.api.admin.qtil.WineQtil;
import myicellar.api.admin.util.LoggerUtil;
import myicellar.jooq.pojos.WineDetailJoin;
import myicellar.jooq.records.WineJQR;
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
public class WineHandlerCreate implements Handler {

    @Override
    public void handle(Context ctx) throws Exception {
        final ObjectMapper obm = ctx.get(ObjectMapper.class);
        ctx.parse(Jackson.jsonNode())
                .map(rootNode -> {
                    MicRequHdr header = parseRequHdr(obm, rootNode);
                    WineDetailJoin obj = parseRequCntnObj(obm, WineDetailJoin.class, rootNode);
                    return Pair.of(header, obj);
                })

                .blockingMap(pair -> {
                    try (Connection connection = ctx.get(DataSource.class).getConnection()) {
                        DSLContext dslContext = CommonQtil.getDSLCtx(connection);
                        {
                            if (pair.right != null) {
                                LoggerUtil.LOGGER.debug(pair.right.toString());

                                WineJQR wine = WineQtil.insertValuesInWine(dslContext, pair.right.getIsValid(), pair.right.getWineTypeId(), pair.right.getWineryId()).fetchOne();
                                return WineQtil.insertValuesInWine2(dslContext, wine.getWineId(), pair.right.getIsValid(), pair.right.getWineNameUsr(), pair.right.getWineNameEng(), pair.right.getWineNameCht(), pair.right.getWineNameChs()).execute();

                            } else
                                return null;
                        }

                    }
                })
                .onNull(() -> ctx.render(jsonFailure(HTTP_CODE_BAD_REQUEST)))

                .map(rows -> {
                    if (rows.intValue() == 1)
                        return jsonSuccess();
                    else
                        return
                                jsonFailure(HTTP_CODE_BAD_REQUEST);
                })
                .then(ctx::render);
    }
}
