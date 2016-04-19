package myicellar.api.admin.qtil;

import myicellar.jooq.records.WineJQR;
import myicellar.jooq.records.WineNameJQR;
import myicellar.jooq.records.WineryRegionJQR;
import myicellar.jooq.tables.TblWine;
import myicellar.jooq.tables.TblWineName;
import myicellar.jooq.tables.TblWineType;
import myicellar.jooq.tables.TblWinery;
import myicellar.jooq.tables.TblWineryRegion;
import myicellar.jooq.tables.TblWineryCountry;
import org.jooq.*;
import org.jooq.impl.DSL;


/**
 * Created by charlie on 25/2/16.
 */
public class WineQtil {

    public static TblWine tblWine = TblWine.WINE;
    public static TblWineName tblWineName = TblWineName.WINE_NAME;
    public static TblWineType tblWineType = TblWineType.WINE_TYPE;
    public static TblWinery tblWinery = TblWinery.WINERY;
    public static TblWineryRegion tblRegion = TblWineryRegion.WINERY_REGION;
    public static TblWineryCountry tblCountry = TblWineryCountry.WINERY_COUNTRY;

/* ----------------------------------------------------------- QUERY WINE TABLE ----------------------------------------------------------- */
    public final static SelectConditionStep<Record> queryOneInWine(DSLContext dslContext, Long wineIdQ){
        return dslContext.select().from(tblWine)
                .where(tblWine.WINE_ID.eq(wineIdQ));
    }

    public final static SelectJoinStep<Record> queryAllInWine(DSLContext dslContext) {
        return dslContext.select().from(tblWine);

    }

    /* -------------------------------------------------------- QUERIES WINE JOINS -------------------------------------------------- */

    public final static SelectOnConditionStep<Record9<Long,Boolean,String,String,String,String,String,String,String>> queryAllInWineJoin(DSLContext dslContext) {

        return dslContext.select(tblWine.WINE_ID, tblWine.IS_VALID, tblWineName.WINE_NAME_USR, tblWineName.WINE_NAME_ENG, tblWineName.WINE_NAME_CHS, tblWineName.WINE_NAME_CHT,
                tblWinery.WINERY_NAME_ENG, tblRegion.REGION_NAME_ENG, tblCountry.COUNTRY_NAME_ENG)
                .from(tblWine)
                .join(tblWineName).on(tblWine.WINE_ID.eq(tblWineName.WINE_ID))
                .join(tblWineType).on(tblWine.WINE_TYPE_ID.eq(tblWineType.WINE_TYPE_ID))
                .join(tblWinery).on(tblWine.WINERY_ID.eq(tblWinery.WINERY_ID))
                .join(tblRegion).on(tblWinery.REGION_ID.eq(tblRegion.REGION_ID))
                .join(tblCountry).on(tblRegion.COUNTRY_ID.eq(tblCountry.COUNTRY_ID));
    }

    public final static SelectConditionStep<Record8<Long,Boolean,String,String,String,String,String,String>> queryOneInWineJoin(DSLContext dslContext, Long wineId) {

        return dslContext.select(tblWine.WINE_ID, tblWine.IS_VALID, tblWineName.WINE_NAME_USR, tblWineName.WINE_NAME_ENG, tblWineName.WINE_NAME_CHS, tblWineName.WINE_NAME_CHT,
                tblWinery.WINERY_NAME_ENG, tblCountry.COUNTRY_NAME_ENG)
                .from(tblWine)
                .join(tblWineName).on(tblWine.WINE_ID.eq(tblWineName.WINE_ID))
                .join(tblWineType).on(tblWine.WINE_TYPE_ID.eq(tblWineType.WINE_TYPE_ID))
                .join(tblWinery).on(tblWine.WINERY_ID.eq(tblWinery.WINERY_ID))
                .join(tblCountry).on(tblWinery.COUNTRY_ID.eq(tblCountry.COUNTRY_ID))
                .where(tblWine.WINE_ID.eq(wineId));
    }

       /* -------------------------------------------------------- QUERY FOR WINE DETAIL -------------------------------------------------- */

    public final static SelectConditionStep<Record8<Long,Boolean,String,String,String,String,Short,Long>> queryOneForDetail(DSLContext dslContext, Long wineIdD){
        return dslContext.select(tblWine.WINE_ID, tblWine.IS_VALID, tblWineName.WINE_NAME_USR, tblWineName.WINE_NAME_ENG, tblWineName.WINE_NAME_CHS, tblWineName.WINE_NAME_CHT, tblWineType.WINE_TYPE_ID, tblWinery.WINERY_ID)
                .from(tblWine)
                .join(tblWineName).on(tblWine.WINE_ID.eq(tblWineName.WINE_ID))
                .join(tblWineType).on(tblWine.WINE_TYPE_ID.eq(tblWineType.WINE_TYPE_ID))
                .join(tblWinery).on(tblWine.WINERY_ID.eq(tblWinery.WINERY_ID))
                .where(tblWine.WINE_ID.eq(wineIdD));
    }

      /* -------------------------------------------------------- QUERY FOR WINE TYPE -------------------------------------------------- */

    public final static SelectJoinStep<Record> queryForTypes(DSLContext dslContext){
        return dslContext.select().from(tblWineType);
    }

       /* --------------------------------------------------------UPDATE ROW IN WINE TABLE -------------------------------------------------- */


    public final static Batch updateRowsInWine(DSLContext dslContext, Long wineId, Boolean isValid, Short wineTypeId, Long wineryId, String wineNameUsr, String wineNameEng, String wineNameCht, String wineNameChs) {
        return dslContext.batch(
                updateRowInWine(dslContext, wineId, isValid, wineTypeId, wineryId),
                updateRowInWineName(dslContext, wineId, wineNameUsr, wineNameEng, wineNameCht, wineNameChs));
    }

    public final static UpdateConditionStep<WineJQR> updateRowInWine(DSLContext dslContext, Long wineId, Boolean isValid, Short wineTypeId, Long wineryId){
        return dslContext.update(tblWine)
                .set(DSL.row(tblWine.IS_VALID, tblWine.WINE_TYPE_ID, tblWine.WINERY_ID),
                        DSL.row(DSL.val(isValid, tblWine.IS_VALID), DSL.val(wineTypeId, tblWine.WINE_TYPE_ID), DSL.val(wineryId, tblWine.WINERY_ID)))
                .where(tblWine.WINE_ID.eq(wineId));
    }

    public final static UpdateConditionStep<WineNameJQR> updateRowInWineName(DSLContext dslContext, Long wineId, String wineNameUsr, String wineNameEng, String wineNameCht, String wineNameChs){
        return dslContext.update(tblWineName)
                .set(DSL.row(tblWineName.WINE_NAME_USR, tblWineName.WINE_NAME_ENG, tblWineName.WINE_NAME_CHT, tblWineName.WINE_NAME_CHS),
                        DSL.row(DSL.val(wineNameUsr, tblWineName.WINE_NAME_USR), DSL.val(wineNameEng, tblWineName.WINE_NAME_ENG), DSL.val(wineNameCht, tblWineName.WINE_NAME_CHT), DSL.val(wineNameChs, tblWineName.WINE_NAME_CHS)))
                        .where(tblWineName.WINE_ID.eq(wineId));
    }

    public final static UpdateConditionStep<WineJQR> invalidateRowInWine(DSLContext dslContext, Long wineId, Boolean isVal){
        return dslContext.update(tblWine)
                .set(tblWine.IS_VALID, isVal)
                .where(tblWine.WINE_ID.eq(wineId));
    }

       /* --------------------------------------------------------CREATE ROW IN WINE TABLE -------------------------------------------------- */


    public final static InsertResultStep<WineJQR> insertValuesInWine(DSLContext dslContext, Boolean isValid, Short wineTypeId, Long wineryId){

        return dslContext.insertInto(tblWine)
                .set(tblWine.IS_VALID, isValid)
                .set(tblWine.WINE_TYPE_ID, wineTypeId)
                .set(tblWine.WINERY_ID, wineryId)
                .returning(tblWine.WINE_ID);
    }


    public final static Insert insertValuesInWine2(DSLContext dslContext, Long wineID, Boolean isValid, String wineNameUsr, String wineNameEng, String wineNameCht, String wineNameChs){
        return dslContext.insertInto(tblWineName)
                .set(tblWineName.WINE_ID, wineID)
                .set(tblWineName.IS_VALID, isValid)
                .set(tblWineName.WINE_NAME_USR, wineNameUsr)
                .set(tblWineName.WINE_NAME_ENG, wineNameEng)
                .set(tblWineName.WINE_NAME_CHT, wineNameCht)
                .set(tblWineName.WINE_NAME_CHS, wineNameChs);
    }



//    public final static Batch insertValuesInWine(DSLContext dslContext, Boolean isValid, Short wineTypeId, Long wineryId, Long wineId, String wineNameUsr, String wineNameEng, String wineNameCht, String wineNameChs){
//        return dslContext.batch(
//                createRowInWine(dslContext,isValid, wineTypeId, wineryId),
//                createRowInWineName(dslContext, wineId, wineNameUsr, wineNameEng, wineNameCht, wineNameChs));
//    }
//
//    public final static InsertValuesStep3<WineJQR, Boolean, Short, Long> createRowInWine(DSLContext dslContext, Boolean isValid, Short wineType, Long wineryId)
//    {
//        return dslContext.insertInto(tblWine)
//                .columns(tblWine.IS_VALID,  tblWine.WINE_TYPE_ID, tblWine.WINERY_ID)
//                .values(isValid, wineType, wineryId);
//    }
//
//    public final static InsertValuesStep5<WineNameJQR, Long, String, String, String, String> createRowInWineName(DSLContext dslContext, Long wineId, String wineNameUsr, String wineNameEng, String wineNameCht, String wineNameChs){
//        return dslContext.insertInto(tblWineName)
//                .columns(tblWineName.WINE_ID, tblWineName.WINE_NAME_USR, tblWineName.WINE_NAME_ENG, tblWineName.WINE_NAME_CHT, tblWineName.WINE_NAME_CHS)
//                .values( wineId, wineNameUsr, wineNameEng, wineNameCht, wineNameChs);
//
//    }

}
