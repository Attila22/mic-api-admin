package myicellar.api.admin.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import myicellar.api.admin.mpojos.MicRequHdr;
import myicellar.api.admin.qtil.CommonQtil;
import myicellar.api.admin.qtil.WineQtil;
import myicellar.jooq.pojos.WineType;
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
 * Created by charlie on 14/3/16.
 */
public class WineTypeHandler implements Handler{

        @Override
        public void handle(Context ctx) throws Exception {
            final ObjectMapper obm = ctx.get(ObjectMapper.class);
            ctx.parse(Jackson.jsonNode())
                    .map(rootNode -> {
                        MicRequHdr header = parseRequHdr(obm, rootNode);
                        WineType obj = parseRequCntnObj(obm, WineType.class, rootNode);
                        return Pair.of(header, obj);
                    })

                    .blockingMap(pair -> {
                        try (Connection connection = ctx.get(DataSource.class).getConnection()) {
                            DSLContext dslContext = CommonQtil.getDSLCtx(connection);

                            return WineQtil.queryForTypes(dslContext).fetch();
                        }
                    })

                    .onNull(()-> ctx.render(jsonFailure(HTTP_CODE_BAD_REQUEST)))

                    .map(rec -> jsonSuccess(rec.into(WineType.class)))
                    .then(ctx::render);

        }
    }
