package myicellar.api.admin.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import myicellar.api.admin.mpojos.MicRequHdr;
import myicellar.api.admin.qtil.CommonQtil;
import myicellar.api.admin.qtil.WineryQtil;
import myicellar.jooq.pojos.Winery;
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
 * Created by charlie on 26/2/16.
 */

public class WineryHandlerCreate implements Handler{
    @Override
    public void handle(Context ctx) throws Exception {
        final ObjectMapper obm = ctx.get(ObjectMapper.class);
        ctx.parse(Jackson.jsonNode())
                .map(rootNode -> {
                    MicRequHdr header = parseRequHdr(obm, rootNode);

                    Winery obj = parseRequCntnObj(obm, Winery.class, rootNode);
                    return Pair.of(header, obj);
                })

                .blockingMap(pair -> {
                    try (Connection connection = ctx.get(DataSource.class).getConnection()) {
                        DSLContext dslContext = CommonQtil.getDSLCtx(connection);
                        {
                            return WineryQtil.createRowInWinery(dslContext, pair.right.getIsValid(), pair.right.getWineryNameUsr(), pair.right.getWineryNameEng(), pair.right.getWineryNameCht(), pair.right.getWineryNameChs(), pair.right.getRegionId(),
                                    pair.right.getRegionId(), pair.right.getCountryId(), pair.right.getNote(), pair.right.getSeoUrl()).execute();
                        }
                    }
                })
                .onNull(()-> ctx.render(jsonFailure(HTTP_CODE_BAD_REQUEST)))

                .map(nrow -> {
                    if(nrow.intValue() == 1)
                        return jsonSuccess();
                    else
                        return jsonFailure(HTTP_CODE_BAD_REQUEST);
                })
                .then(ctx::render);

    }
}

