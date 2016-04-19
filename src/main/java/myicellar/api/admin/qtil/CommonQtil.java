package myicellar.api.admin.qtil;

//import myicellar.api.admin.util.LanguageUtil;
import org.jooq.*;
import org.jooq.conf.Settings;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.text.SimpleDateFormat;

/**
 * Created by lwbu on 15-12-2.
 */
public final class CommonQtil {

    public final static SimpleDateFormat YYYYMMDDHHMMSS = new SimpleDateFormat("yyyyMMddHHmmss");

    private final static Settings JOOQ_SETTTINGS_NOTATTACHREC = initJOOQSettingsNotAttachRecrod();

    private final static Settings initJOOQSettingsNotAttachRecrod(){
        return new Settings().withAttachRecords(false);
    }

    public final static DSLContext getDSLCtx(Connection connection){
        return DSL.using(connection, SQLDialect.POSTGRES_9_5, JOOQ_SETTTINGS_NOTATTACHREC);
    }

    public final static Condition appendOrCndt(Condition base, Condition append){
        if(base==null)
            return append;
        else
            return base.or(append);
    }



}
