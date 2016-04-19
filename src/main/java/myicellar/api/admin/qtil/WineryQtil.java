package myicellar.api.admin.qtil;

import myicellar.jooq.records.WineryJQR;
import myicellar.jooq.records.WineryRegionJQR;
import myicellar.jooq.tables.TblWinery;
import myicellar.jooq.tables.TblWineryCountry;
import myicellar.jooq.tables.TblWineryRegion;
import org.jooq.*;
import org.jooq.impl.DSL;

import java.util.Set;

/**
 * Created by charlie on 25/2/16.
 */
public class WineryQtil {
    public static TblWinery tblWinery = TblWinery.WINERY;
    public static TblWineryRegion tblRegion = TblWineryRegion.WINERY_REGION;
    public static TblWineryCountry tblCountry = TblWineryCountry.WINERY_COUNTRY;

    /* --------------------------------------------------------QUERIES FOR WINERY REGION TABLE -------------------------------------------------- */
    public final static Select<Record> queryAllInWineryRegion(DSLContext dslContext){
        return dslContext.select().from(tblRegion);
    }


    public final static SelectConditionStep<Record> queryOneInWineryRegion(DSLContext dslContext, Integer regionIdQ) {

        return dslContext.select().from(tblRegion)
                .where(tblRegion.REGION_ID.eq(regionIdQ));
    }

       /* --------------------------------------------------------UPDATE WINERY REGION TABLE -------------------------------------------------- */



    public final static UpdateConditionStep<WineryRegionJQR> updateRowWineryRegion(DSLContext dslContext, Integer regionId, Boolean isValid, Integer regionAltId, Integer countryId, String wineryRegionEngUpd, String wineryRegionCHTUpd,
                                                                                   String wineryRegionCHSUpd, String wineryRegionNoteUpd, String wineryRegionSEOUrlUpd)
    {
        return dslContext.update(tblRegion)
                .set(DSL.row(tblRegion.IS_VALID, tblRegion.REGION_ALT_ID, tblRegion.COUNTRY_ID, tblRegion.REGION_NAME_ENG, tblRegion.REGION_NAME_CHT, tblRegion.REGION_NAME_CHS, tblRegion.NOTE, tblRegion.SEO_URL),
                        DSL.row( DSL.val(isValid, tblRegion.IS_VALID), DSL.val(regionAltId, tblRegion.REGION_ALT_ID), DSL.val(countryId, tblRegion.COUNTRY_ID), DSL.val(wineryRegionEngUpd, tblRegion.REGION_NAME_ENG), DSL.val(wineryRegionCHTUpd, tblRegion.REGION_NAME_CHT), DSL.val(wineryRegionCHSUpd, tblRegion.REGION_NAME_CHS),
                                DSL.val(wineryRegionNoteUpd, tblRegion.NOTE), DSL.val(wineryRegionSEOUrlUpd, tblRegion.SEO_URL)))
                .where(tblRegion.REGION_ID.eq(regionId));
    }
    public final static UpdateConditionStep<WineryRegionJQR> invalidateRowInWineryRegion(DSLContext dslContext, Integer regionId, Boolean isVal){
        return dslContext.update(tblRegion)
                .set(tblRegion.IS_VALID, isVal)
                .where(tblRegion.REGION_ID.eq(regionId));
    }
       /* --------------------------------------------------------CREATE ROW IN WINERY REGION TABLE -------------------------------------------------- */



    public final static InsertValuesStep8<WineryRegionJQR, Boolean, Integer, Integer, String, String, String, String, String> createWineryRegion(DSLContext dslContext, Boolean isValid, Integer wineryRegionAltIdCre, Integer wineryCountryIdCre,
                                                                                                                                                 String wineryRegionEngCre, String wineryRegionCHTCre, String wineryRegionCHSCre, String wineryRegionNoteCre, String seOUrlCre)
    {
        return dslContext.insertInto(tblRegion)
                .columns(tblRegion.IS_VALID, tblRegion.REGION_ALT_ID, tblRegion.COUNTRY_ID, tblRegion.REGION_NAME_ENG, tblRegion.REGION_NAME_CHT, tblRegion.REGION_NAME_CHS, tblRegion.NOTE, tblRegion.SEO_URL)
                .values(DSL.val(isValid, tblRegion.IS_VALID), DSL.val(wineryRegionAltIdCre, tblRegion.REGION_ALT_ID), DSL.val(wineryCountryIdCre, tblRegion.COUNTRY_ID), DSL.val(wineryRegionEngCre, tblRegion.REGION_NAME_ENG), DSL.val(wineryRegionCHTCre, tblRegion.REGION_NAME_CHT), DSL.val(wineryRegionCHSCre, tblRegion.REGION_NAME_CHS),
                        DSL.val(wineryRegionNoteCre, tblRegion.NOTE), DSL.val(seOUrlCre, tblRegion.SEO_URL));
    }

   /* -------------------------------------------------------- QUERIES WINERY REGION COUNTRY JOIN -------------------------------------------------- */



    public final static SelectConditionStep<Record7<Integer,Boolean,String,Integer,String,String,String>> queryOneInWineryRegionJoin(DSLContext dslContext, Integer regionIdQ) {
        return dslContext.select(tblRegion.REGION_ID, tblRegion.IS_VALID, tblCountry.COUNTRY_NAME_ENG, tblRegion.REGION_ALT_ID, tblRegion.REGION_NAME_ENG, tblRegion.REGION_NAME_CHT, tblRegion.REGION_NAME_CHS).from(tblRegion).join(tblCountry)
                .on(tblRegion.COUNTRY_ID.eq(tblCountry.COUNTRY_ID))
                .where(tblRegion.REGION_ID.eq(regionIdQ));
    }


    public final static SelectOnConditionStep<Record7<Integer, Boolean, String, Integer, String, String, String>> queryAllInWineryRegionJoin(DSLContext dslContext) {


        return dslContext.select(tblRegion.REGION_ID, tblRegion.IS_VALID, tblCountry.COUNTRY_NAME_ENG, tblRegion.REGION_ALT_ID, tblRegion.REGION_NAME_ENG, tblRegion.REGION_NAME_CHT, tblRegion.REGION_NAME_CHS).from(tblRegion).join(tblCountry)
                .on(tblRegion.COUNTRY_ID.eq(tblCountry.COUNTRY_ID));
    }

       /* -------------------------------------------------------- QUERY WINERY TABLE -------------------------------------------------- */


    public final static SelectConditionStep<Record> queryOneInWinery(DSLContext dslContext, Long wineryIdQ){
        return dslContext.select().from(tblWinery)
                .where(tblWinery.WINERY_ID.eq(wineryIdQ));
    }


    public final static SelectJoinStep<Record> queryAllInWinery(DSLContext dslContext) {
        return dslContext.select().from(tblWinery);
    }

       /* --------------------------------------------------------UPDATE ROW IN WINERY TABLE -------------------------------------------------- */


    public final static UpdateConditionStep<WineryJQR> updateRowInWinery(DSLContext dslContext, Long wineryIdU, Boolean isValid, String wineryNameUsr, String wineryNameEng, String wineryNameCht, String wineryNameChs, Integer regionId, String wineryNote, String winerySEO){
        return dslContext.update(tblWinery)
                .set(DSL.row(tblWinery.IS_VALID, tblWinery.WINERY_NAME_USR, tblWinery.WINERY_NAME_ENG, tblWinery.WINERY_NAME_CHS, tblWinery.WINERY_NAME_CHT, tblWinery.REGION_ID, tblWinery.NOTE, tblWinery.SEO_URL),
                        DSL.row(DSL.val(isValid, tblWinery.IS_VALID), DSL.val(wineryNameUsr, tblWinery.WINERY_NAME_USR), DSL.val(wineryNameEng, tblWinery.WINERY_NAME_ENG), DSL.val(wineryNameCht, tblWinery.WINERY_NAME_CHT), DSL.val(wineryNameChs, tblWinery.WINERY_NAME_CHS), DSL.val(regionId, tblWinery.REGION_ID),
                                DSL.val(wineryNote, tblWinery.NOTE), DSL.val(winerySEO, tblWinery.SEO_URL)))
                .where(tblWinery.WINERY_ID.eq(wineryIdU));
    }

    public final static UpdateConditionStep invalidateRowInWinery(DSLContext dslContext, Long wineryIdU, Boolean isVal){
        return dslContext.update(tblWinery)
                .set(tblWinery.IS_VALID, isVal)
                .where(tblWinery.WINERY_ID.eq(wineryIdU));
    }

       /* --------------------------------------------------------CREATE ROW IN WINERY TABLE -------------------------------------------------- */

    public final static InsertValuesStep10<WineryJQR, Boolean, String, String, String, String, Integer, Integer, Integer, String, String> createRowInWinery(DSLContext dslContext, Boolean isValid, String wineryNameUsr, String wineryNameEng, String wineryNameCht,
                                                                                                                                                  String wineryNameChs, Integer regionId, Integer regionAltId, Integer countryId, String wineryNote, String seoUrl)
    {
        return dslContext.insertInto(tblWinery)
                .columns(tblWinery.IS_VALID, tblWinery.WINERY_NAME_USR, tblWinery.WINERY_NAME_ENG, tblWinery.WINERY_NAME_CHT, tblWinery.WINERY_NAME_CHS, tblWinery.REGION_ID, tblWinery.REGION_ALT_ID, tblWinery.COUNTRY_ID, tblWinery.NOTE, tblWinery.SEO_URL)
                .values(DSL.val(isValid, tblWinery.IS_VALID), DSL.val(wineryNameUsr, tblWinery.WINERY_NAME_USR), DSL.val(wineryNameEng, tblWinery.WINERY_NAME_ENG), DSL.val(wineryNameCht, tblWinery.WINERY_NAME_CHT), DSL.val(wineryNameChs, tblWinery.WINERY_NAME_CHS), DSL.val(regionId, tblWinery.REGION_ID),
                        DSL.val(regionAltId, tblWinery.REGION_ALT_ID), DSL.val(countryId, tblWinery.COUNTRY_ID), DSL.val(wineryNote, tblWinery.NOTE), DSL.val(seoUrl, tblWinery.SEO_URL));
    }

       /* -------------------------------------------------------- QUERIES FOR WINERY, REGION AND COUNTRY JOIN -------------------------------------------------- */

    public final static SelectConditionStep<Record8<Long,Boolean,String,String,String,String,String,String>> queryOneInWineryJoin(DSLContext dslContext, Long wineryId) {


        return dslContext.select(tblWinery.WINERY_ID, tblWinery.IS_VALID, tblWinery.WINERY_NAME_USR, tblWinery.WINERY_NAME_ENG, tblWinery.WINERY_NAME_CHS, tblWinery.WINERY_NAME_CHT, tblRegion.REGION_NAME_ENG, tblCountry.COUNTRY_NAME_ENG)
                .from(tblWinery)
                .join(tblRegion).on(tblWinery.REGION_ID.eq(tblRegion.REGION_ID))
                .join(tblCountry).on(tblWinery.COUNTRY_ID.eq(tblCountry.COUNTRY_ID)).where(tblWinery.WINERY_ID.eq(wineryId));
    }

    public final static SelectOnConditionStep<Record8<Long,Boolean,String,String,String,String,String,String>> queryAllInWineryJoin(DSLContext dslContext) {

        return dslContext.select(tblWinery.WINERY_ID, tblWinery.IS_VALID, tblWinery.WINERY_NAME_USR, tblWinery.WINERY_NAME_ENG, tblWinery.WINERY_NAME_CHS, tblWinery.WINERY_NAME_CHT, tblRegion.REGION_NAME_ENG, tblCountry.COUNTRY_NAME_ENG)
                .from(tblWinery)
                .join(tblRegion).on(tblWinery.REGION_ID.eq(tblRegion.REGION_ID))
                .join(tblCountry).on(tblRegion.COUNTRY_ID.eq(tblCountry.COUNTRY_ID));
    }
}
