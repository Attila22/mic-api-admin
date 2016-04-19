package myicellar.api.admin.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import myicellar.api.admin.mpojos.MicRequHdr;
import myicellar.api.admin.qtil.CommonQtil;
import myicellar.api.admin.qtil.WineQtil;
import myicellar.jooq.pojos.WineDetailJoin;
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
 * Created by charlie on 29/2/16.
 */
public class WineHandlerUpdate implements Handler{

    @Override
    public void handle(Context ctx) throws Exception{
        final ObjectMapper obm = ctx.get(ObjectMapper.class);
        ctx.parse(Jackson.jsonNode())
                .map(rootNode -> {
                    MicRequHdr header = parseRequHdr(obm, rootNode);

                    WineDetailJoin obj = parseRequCntnObj(obm, WineDetailJoin.class, rootNode);
                    return Pair.of(header, obj);
                })

                .blockingMap(pair-> {

                    try (Connection connection = ctx.get(DataSource.class).getConnection()) {
                        DSLContext dslContext = CommonQtil.getDSLCtx(connection);
                        {
                            return WineQtil.updateRowsInWine(dslContext, pair.right.getWineId(), pair.right.getIsValid(), pair.right.getWineTypeId(), pair.right.getWineryId(), pair.right.getWineNameUsr(), pair.right.getWineNameEng(), pair.right.getWineNameCht(), pair.right.getWineNameChs()).execute();
                        }
                    }
                })
                .onNull(()-> ctx.render(jsonFailure(HTTP_CODE_BAD_REQUEST)))

                .map(urow -> {
//                    if(urow.intValue() == 1)
                        return jsonSuccess();
//                    else
//                        return null;
                })

                .then(ctx::render);




    }
}
