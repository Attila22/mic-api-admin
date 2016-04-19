package myicellar.api.admin.qtil;

import myicellar.jooq.tables.TblWineryCountry;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.SelectJoinStep;

/**
 * Created by charlie on 9/3/16.
 */
public class CountryQtil {
        public static TblWineryCountry tblWineryCountry = TblWineryCountry.WINERY_COUNTRY;

        /* --------------------------------------------------------QUERIES FOR WINERY COUNTRY TABLE -------------------------------------------------- */

        public final static SelectJoinStep<Record> queryAllInWineryCountry(DSLContext dslContext){
            return dslContext.select().from(tblWineryCountry);
        }
}
