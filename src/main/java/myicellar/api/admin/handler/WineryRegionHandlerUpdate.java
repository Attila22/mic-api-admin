package myicellar.api.admin.handler;


import com.fasterxml.jackson.databind.ObjectMapper;
import myicellar.api.admin.mpojos.MicRequHdr;
import myicellar.api.admin.qtil.CommonQtil;
import myicellar.api.admin.qtil.WineryQtil;
import myicellar.api.admin.util.LoggerUtil;
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

/**
 * Created by charlie on 22/2/16.
 */
public class WineryRegionHandlerUpdate implements Handler {
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
                        {
                            if (pair.right != null) {
                                LoggerUtil.LOGGER.debug(pair.right.toString());
                                return WineryQtil.updateRowWineryRegion(dslContext, pair.right.getRegionId(),  pair.right.getIsValid(),
                                        pair.right.getRegionAltId(), pair.right.getCountryId(), pair.right.getRegionNameEng(),
                                        pair.right.getRegionNameCht(), pair.right.getRegionNameChs(), pair.right.getNote(),
                                        pair.right.getSeoUrl()).execute();
                            }
                            else
                                return null;
                        }
                    }
                })
                .onNull(()-> ctx.render(jsonFailure(HTTP_CODE_BAD_REQUEST)))
                .map(row -> {
                    if(row.intValue()==1)
                        return jsonSuccess();
                    else
                        return jsonFailure(HTTP_CODE_BAD_REQUEST);
                })
                .then(ctx::render);
    }
}
