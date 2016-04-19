package myicellar.api.admin.qtil;

import myicellar.jooq.records.VintageAttrJQR;
import myicellar.jooq.records.VintageJQR;
import myicellar.jooq.records.WineJQR;
import myicellar.jooq.tables.TblAttrAbvintage;
import myicellar.jooq.tables.TblAttrName;
import myicellar.jooq.tables.TblVintage;
import myicellar.jooq.tables.TblVintageAttr;
import org.jooq.*;
import org.jooq.impl.DSL;

/**
 * Created by charlie on 29/2/16.
 */
public class VintageQtil {
    public static TblVintage tblVintage = TblVintage.VINTAGE;
    public static TblVintageAttr tblVintageAttr = TblVintageAttr.VINTAGE_ATTR;
    public static TblAttrAbvintage tblAttrAbvintage = TblAttrAbvintage.ATTR_ABVINTAGE;
    public static TblAttrName tblAttrName = TblAttrName.ATTR_NAME;

     /* -------------------------------------------------------- QUERY FOR VINTAGE -------------------------------------------------- */

    public final static SelectConditionStep<Record4<Long, Short, String, Boolean>> queryOneVintage(DSLContext dslContext, Long wineId) {

        return dslContext.select(tblVintage.WINE_ID, tblVintage.VINTAGE_TAG, tblVintage.VINTAGE_NAME, tblVintage.IS_VALID).from(tblVintage)
                .where(tblVintage.WINE_ID.eq(wineId));
    }

    public final static SelectJoinStep<Record4<Long, Short, String, Boolean>> queryAllVintage(DSLContext dslContext) {
        return dslContext.select(tblVintage.WINE_ID, tblVintage.VINTAGE_TAG, tblVintage.VINTAGE_NAME, tblVintage.IS_VALID).from(tblVintage);
    }

     /* -------------------------------------------------------- UPDATE VINTAGE DETAIL -------------------------------------------------- */

    public final static Update<VintageJQR> updateVintage(DSLContext dslContext, Long wineId, Short vintageTag, String vintageName, Boolean isValid) {
        return dslContext.update(tblVintage)
                .set(DSL.row(tblVintage.VINTAGE_NAME, tblVintage.IS_VALID),
                        DSL.row(DSL.val(vintageName, tblVintage.VINTAGE_NAME), DSL.val(isValid, tblVintage.IS_VALID)))
                .where(tblVintage.WINE_ID.eq(wineId))
                .and(tblVintage.VINTAGE_TAG.eq(vintageTag));
    }

    //    /* -------------------------------------------------------- CREATE WINE DETAIL -------------------------------------------------- */
    public final static InsertValuesStep4<VintageJQR, Long, Short, String, Boolean> createInVintage(DSLContext dslContext, Long wineId, Short vintageTag,
                                                                                                    String vintageName, Boolean isValid) {
        return dslContext.insertInto(tblVintage)
                .columns(tblVintage.WINE_ID, tblVintage.VINTAGE_TAG, tblVintage.VINTAGE_NAME, tblVintage.IS_VALID)
                .values(wineId, vintageTag, vintageName, isValid);
    }

     /* -------------------------------------------------------- QUERY FOR VINTAGE DETAIL -------------------------------------------------- */

//    public final static SelectConditionStep queryVintageDetail (DSLContext dslContext, Long wineId, Short vintageTag){
//        return dslContext.select()
//                .from(tblVintage)
//                .where(tblVintage.WINE_ID.eq(wineId))
//                .and(tblVintage.VINTAGE_TAG.eq(vintageTag));
//    }

//    public final static Select queryVintageAttributes (DSLContext dslContext, Long wineId, Short vintageTag, Long attrID, String attrName, Short attrAssocVal){
//        return dslContext.select(tblVintageAttr.WINE_ID, tblVintageAttr.VINTAGE_TAG, tblVintageAttr.ATTR_ID, tblAttrName.ATTR_NAME_ENG, tblVintageAttr.ATTR_ASSOC_VAL)
//                .from(tblVintageAttr)
//                .join(tblAttrName).on(tblVintageAttr.ATTR_ID.eq(tblAttrName.ID));
//    }

    /* -------------------------------------------------------- QUERY FOR VINTAGE DETAIL ATTRIBUTES -------------------------------------------------- */

    public final static SelectConditionStep<Record12<Long, Short, String, Boolean, Short, Long, Short, String, String, String, Integer, String>> queryVintageDetail(DSLContext dslContext, Long wineId, Short vintageTag) {
        return dslContext.select(tblVintage.WINE_ID, tblVintage.VINTAGE_TAG, tblVintage.VINTAGE_NAME, tblVintage.IS_VALID, tblVintageAttr.ATTR_ASSOC_VAL, tblVintageAttr.ATTR_ID, tblAttrAbvintage.ATTR_NAME_ID, tblAttrAbvintage.ATTR_VAL_ENG, tblAttrAbvintage.ATTR_VAL_CHS, tblAttrAbvintage.ATTR_VAL_CHT,
                tblAttrAbvintage.LAST_UPD_MICTIME, tblAttrName.ATTR_NAME_ENG)
                .from(tblVintage)
                .join(tblVintageAttr).on(tblVintage.WINE_ID.eq(tblVintageAttr.WINE_ID))
                .join(tblAttrAbvintage).on(tblVintageAttr.ATTR_ID.eq(tblAttrAbvintage.ATTR_ID))
                .join(tblAttrName).on(tblAttrAbvintage.ATTR_NAME_ID.eq(tblAttrName.ATTR_NAME_ID))
                .where(tblVintage.WINE_ID.eq(wineId))
                .and(tblVintage.VINTAGE_TAG.eq(vintageTag));
    }


     /* -------------------------------------------------------- UPDATE VINTAGE DETAIL ATTRIBUTES -------------------------------------------------- */


    public final static UpdateConditionStep<VintageJQR> updateVintageDetail(DSLContext dslContext, Long wineId, Short vintageTag, String vintageName, Boolean isValid) {
        return dslContext.update(tblVintage)
                .set(DSL.row(tblVintage.VINTAGE_NAME, tblVintage.IS_VALID),
                        DSL.row(DSL.val(vintageName, tblVintage.VINTAGE_NAME), DSL.val(isValid, tblVintage.IS_VALID)))
                .where(tblVintage.WINE_ID.eq(wineId))
                .and(tblVintage.VINTAGE_TAG.eq(vintageTag));

    }

    public final static DeleteConditionStep<VintageAttrJQR> removeVintageAttribute(DSLContext dslContext, Long wineId, Short vintageTag, Long attrId){
        return dslContext.delete((tblVintageAttr))
                .where(tblVintageAttr.WINE_ID.eq(wineId))
                .and(tblVintageAttr.VINTAGE_TAG.eq(vintageTag))
                .and(tblVintageAttr.ATTR_ID.eq(attrId));
    }

    /* -------------------------------------------------------- CREATE VINTAGE DETAIL ATTRIBUTES -------------------------------------------------- */

    public final static Insert createVintageDetail(DSLContext dslContext, Long wineId, Short vintageTag, String vintageName, Boolean isValid) {
        return dslContext.insertInto(tblVintage)
                .columns(tblVintage.WINE_ID, tblVintage.VINTAGE_TAG, tblVintage.VINTAGE_NAME, tblVintage.IS_VALID)
                .values(wineId, vintageTag, vintageName, isValid);
    }

    public final static InsertValuesStep4<VintageAttrJQR, Long, Short, Long, Short> createVintageAttributes(DSLContext dslContext, Long wineId, Short vintageTag, Long attrId, Short assocVal) {
        return dslContext.insertInto(tblVintageAttr)
                .columns(tblVintageAttr.WINE_ID, tblVintageAttr.VINTAGE_TAG, tblVintageAttr.ATTR_ID, tblVintageAttr.ATTR_ASSOC_VAL)
                .values(wineId, vintageTag, attrId, assocVal);
    }

/* ------------------------------------------------------------------------------------------- QUERY ALL ATTRIBUTES FOR DROPDOWN ------------------------------------------------------------------------------------------------------------------------- */

    public final static Select queryAllInAttribute(DSLContext dslContext) {
        return dslContext.select(tblVintageAttr.ATTR_ID, tblAttrAbvintage.ATTR_NAME_ID, tblAttrName.ATTR_NAME_ENG, tblVintageAttr.ATTR_ASSOC_VAL)
                .from(tblVintageAttr)
                .join(tblAttrAbvintage).on(tblVintageAttr.ATTR_ID.eq(tblAttrAbvintage.ATTR_ID))
                .join(tblAttrName).on(tblAttrAbvintage.ATTR_NAME_ID.eq(tblAttrName.ATTR_NAME_ID));
    }


/* ------------------------------------------------------------------------------------------- INVALIDATE VINTAGE TAG ------------------------------------------------------------------------------------------------------------------------- */

    public final static UpdateConditionStep invalidateVintageTag(DSLContext dslContext, Long wineId, Short vintageTag, Boolean isVal) {
        return dslContext.update(tblVintage)
                .set(tblVintage.IS_VALID, isVal)
                .where(tblVintage.WINE_ID.eq(wineId))
                .and(tblVintage.VINTAGE_TAG.eq(vintageTag));
    }
}