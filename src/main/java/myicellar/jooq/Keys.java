/**
 * This class is generated by jOOQ
 */
package myicellar.jooq;


import myicellar.jooq.records.AtagAbnoteJQR;
import myicellar.jooq.records.AttrAbnoteJQR;
import myicellar.jooq.records.AttrAbvintageJQR;
import myicellar.jooq.records.AttrNameJQR;
import myicellar.jooq.records.CityJQR;
import myicellar.jooq.records.FoodJQR;
import myicellar.jooq.records.PlaceJQR;
import myicellar.jooq.records.UauthSclntwJQR;
import myicellar.jooq.records.UauthSessionJQR;
import myicellar.jooq.records.UauthSimpleJQR;
import myicellar.jooq.records.UserCellarJQR;
import myicellar.jooq.records.UserCountryJQR;
import myicellar.jooq.records.UserDlvrProfJQR;
import myicellar.jooq.records.UserFavWineJQR;
import myicellar.jooq.records.UserHeaderJQR;
import myicellar.jooq.records.UserNoteAttrJQR;
import myicellar.jooq.records.UserNoteFeaturedJQR;
import myicellar.jooq.records.UserNoteFoodJQR;
import myicellar.jooq.records.UserNoteJQR;
import myicellar.jooq.records.UserNotificationJQR;
import myicellar.jooq.records.UserOccasJQR;
import myicellar.jooq.records.UserOccasWithJQR;
import myicellar.jooq.records.UserProfileJQR;
import myicellar.jooq.records.VintageAttrJQR;
import myicellar.jooq.records.VintageJQR;
import myicellar.jooq.records.WineJQR;
import myicellar.jooq.records.WineNameJQR;
import myicellar.jooq.records.WineTypeFolwJQR;
import myicellar.jooq.records.WineTypeJQR;
import myicellar.jooq.records.WineryCountryFolwJQR;
import myicellar.jooq.records.WineryCountryJQR;
import myicellar.jooq.records.WineryFolwJQR;
import myicellar.jooq.records.WineryJQR;
import myicellar.jooq.records.WineryRegionFolwJQR;
import myicellar.jooq.records.WineryRegionJQR;
import myicellar.jooq.tables.TblAtagAbnote;
import myicellar.jooq.tables.TblAttrAbnote;
import myicellar.jooq.tables.TblAttrAbvintage;
import myicellar.jooq.tables.TblAttrName;
import myicellar.jooq.tables.TblCity;
import myicellar.jooq.tables.TblFood;
import myicellar.jooq.tables.TblPlace;
import myicellar.jooq.tables.TblUauthSclntw;
import myicellar.jooq.tables.TblUauthSession;
import myicellar.jooq.tables.TblUauthSimple;
import myicellar.jooq.tables.TblUserCellar;
import myicellar.jooq.tables.TblUserCountry;
import myicellar.jooq.tables.TblUserDlvrProf;
import myicellar.jooq.tables.TblUserFavWine;
import myicellar.jooq.tables.TblUserHeader;
import myicellar.jooq.tables.TblUserNote;
import myicellar.jooq.tables.TblUserNoteAttr;
import myicellar.jooq.tables.TblUserNoteFeatured;
import myicellar.jooq.tables.TblUserNoteFood;
import myicellar.jooq.tables.TblUserNotification;
import myicellar.jooq.tables.TblUserOccas;
import myicellar.jooq.tables.TblUserOccasWith;
import myicellar.jooq.tables.TblUserProfile;
import myicellar.jooq.tables.TblVintage;
import myicellar.jooq.tables.TblVintageAttr;
import myicellar.jooq.tables.TblWine;
import myicellar.jooq.tables.TblWineName;
import myicellar.jooq.tables.TblWineType;
import myicellar.jooq.tables.TblWineTypeFolw;
import myicellar.jooq.tables.TblWinery;
import myicellar.jooq.tables.TblWineryCountry;
import myicellar.jooq.tables.TblWineryCountryFolw;
import myicellar.jooq.tables.TblWineryFolw;
import myicellar.jooq.tables.TblWineryRegion;
import myicellar.jooq.tables.TblWineryRegionFolw;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>mic_core</code> 
 * schema
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final Identity<AtagAbnoteJQR, Long> IDENTITY_ATAG_ABNOTE = Identities0.IDENTITY_ATAG_ABNOTE;
	public static final Identity<AttrAbnoteJQR, Long> IDENTITY_ATTR_ABNOTE = Identities0.IDENTITY_ATTR_ABNOTE;
	public static final Identity<AttrAbvintageJQR, Long> IDENTITY_ATTR_ABVINTAGE = Identities0.IDENTITY_ATTR_ABVINTAGE;
	public static final Identity<FoodJQR, Long> IDENTITY_FOOD = Identities0.IDENTITY_FOOD;
	public static final Identity<PlaceJQR, Long> IDENTITY_PLACE = Identities0.IDENTITY_PLACE;
	public static final Identity<UserDlvrProfJQR, Long> IDENTITY_USER_DLVR_PROF = Identities0.IDENTITY_USER_DLVR_PROF;
	public static final Identity<UserNoteJQR, Long> IDENTITY_USER_NOTE = Identities0.IDENTITY_USER_NOTE;
	public static final Identity<UserOccasJQR, Long> IDENTITY_USER_OCCAS = Identities0.IDENTITY_USER_OCCAS;
	public static final Identity<WineJQR, Long> IDENTITY_WINE = Identities0.IDENTITY_WINE;
	public static final Identity<WineNameJQR, Long> IDENTITY_WINE_NAME = Identities0.IDENTITY_WINE_NAME;
	public static final Identity<WineryJQR, Long> IDENTITY_WINERY = Identities0.IDENTITY_WINERY;
	public static final Identity<WineryRegionJQR, Integer> IDENTITY_WINERY_REGION = Identities0.IDENTITY_WINERY_REGION;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final UniqueKey<AtagAbnoteJQR> ATAG_ABNOTE_PKEY = UniqueKeys0.ATAG_ABNOTE_PKEY;
	public static final UniqueKey<AttrAbnoteJQR> ATTR_ABNOTE_PKEY = UniqueKeys0.ATTR_ABNOTE_PKEY;
	public static final UniqueKey<AttrAbvintageJQR> ATTR_ABVINTAGE_PKEY = UniqueKeys0.ATTR_ABVINTAGE_PKEY;
	public static final UniqueKey<AttrAbvintageJQR> ATTR_ABVINTAGE_ATTR_NAME_ID_ATTR_VAL_ENG_KEY = UniqueKeys0.ATTR_ABVINTAGE_ATTR_NAME_ID_ATTR_VAL_ENG_KEY;
	public static final UniqueKey<AttrNameJQR> ATTR_NAME_PKEY = UniqueKeys0.ATTR_NAME_PKEY;
	public static final UniqueKey<AttrNameJQR> ATTR_NAME_ATTR_NAME_ENG_KEY = UniqueKeys0.ATTR_NAME_ATTR_NAME_ENG_KEY;
	public static final UniqueKey<AttrNameJQR> ATTR_NAME_ATTR_NAMECODE_KEY = UniqueKeys0.ATTR_NAME_ATTR_NAMECODE_KEY;
	public static final UniqueKey<CityJQR> CITY_PKEY = UniqueKeys0.CITY_PKEY;
	public static final UniqueKey<FoodJQR> FOOD_PKEY = UniqueKeys0.FOOD_PKEY;
	public static final UniqueKey<PlaceJQR> PLACE_PKEY = UniqueKeys0.PLACE_PKEY;
	public static final UniqueKey<UauthSclntwJQR> UAUTH_SCLNTW_PKEY = UniqueKeys0.UAUTH_SCLNTW_PKEY;
	public static final UniqueKey<UauthSessionJQR> UAUTH_SESSION_PKEY = UniqueKeys0.UAUTH_SESSION_PKEY;
	public static final UniqueKey<UauthSimpleJQR> UAUTH_SIMPLE_PKEY = UniqueKeys0.UAUTH_SIMPLE_PKEY;
	public static final UniqueKey<UserCellarJQR> USER_CELLAR_PKEY = UniqueKeys0.USER_CELLAR_PKEY;
	public static final UniqueKey<UserCountryJQR> USER_COUNTRY_PKEY = UniqueKeys0.USER_COUNTRY_PKEY;
	public static final UniqueKey<UserDlvrProfJQR> USER_DLVR_PROF_PKEY = UniqueKeys0.USER_DLVR_PROF_PKEY;
	public static final UniqueKey<UserFavWineJQR> USER_FAV_WINE_PKEY = UniqueKeys0.USER_FAV_WINE_PKEY;
	public static final UniqueKey<UserHeaderJQR> USER_HEADER_PKEY = UniqueKeys0.USER_HEADER_PKEY;
	public static final UniqueKey<UserHeaderJQR> USER_HEADER_USER_NAME_KEY = UniqueKeys0.USER_HEADER_USER_NAME_KEY;
	public static final UniqueKey<UserNoteJQR> USER_NOTE_PKEY = UniqueKeys0.USER_NOTE_PKEY;
	public static final UniqueKey<UserNoteAttrJQR> USER_NOTE_ATTR_PKEY = UniqueKeys0.USER_NOTE_ATTR_PKEY;
	public static final UniqueKey<UserNoteFeaturedJQR> USER_NOTE_FEATURED_PKEY = UniqueKeys0.USER_NOTE_FEATURED_PKEY;
	public static final UniqueKey<UserNoteFoodJQR> USER_NOTE_FOOD_PKEY = UniqueKeys0.USER_NOTE_FOOD_PKEY;
	public static final UniqueKey<UserNotificationJQR> USER_NOTIFICATION_PKEY = UniqueKeys0.USER_NOTIFICATION_PKEY;
	public static final UniqueKey<UserOccasJQR> USER_OCCAS_PKEY = UniqueKeys0.USER_OCCAS_PKEY;
	public static final UniqueKey<UserOccasJQR> USER_OCCAS_HOST_USER_ID_OCCAS_DATE_OCCAS_TAG_KEY = UniqueKeys0.USER_OCCAS_HOST_USER_ID_OCCAS_DATE_OCCAS_TAG_KEY;
	public static final UniqueKey<UserOccasWithJQR> USER_OCCAS_WITH_PKEY = UniqueKeys0.USER_OCCAS_WITH_PKEY;
	public static final UniqueKey<UserProfileJQR> USER_PROFILE_PKEY1 = UniqueKeys0.USER_PROFILE_PKEY1;
	public static final UniqueKey<VintageJQR> VINTAGE_PKEY = UniqueKeys0.VINTAGE_PKEY;
	public static final UniqueKey<VintageAttrJQR> VINTAGE_ATTR_PKEY = UniqueKeys0.VINTAGE_ATTR_PKEY;
	public static final UniqueKey<WineJQR> WINE_PKEY = UniqueKeys0.WINE_PKEY;
	public static final UniqueKey<WineNameJQR> WINE_NAME_PKEY1 = UniqueKeys0.WINE_NAME_PKEY1;
	public static final UniqueKey<WineNameJQR> WINE_NAME_WINE_ID_WINE_NAME_ID_KEY = UniqueKeys0.WINE_NAME_WINE_ID_WINE_NAME_ID_KEY;
	public static final UniqueKey<WineryJQR> WINERY_PKEY = UniqueKeys0.WINERY_PKEY;
	public static final UniqueKey<WineryCountryJQR> WINE_COUNTRY_PKEY = UniqueKeys0.WINE_COUNTRY_PKEY;
	public static final UniqueKey<WineryCountryJQR> WINE_COUNTRY_COUNTRY_CODE_KEY = UniqueKeys0.WINE_COUNTRY_COUNTRY_CODE_KEY;
	public static final UniqueKey<WineryCountryFolwJQR> WINERY_COUNTRY_FOLW_PKEY = UniqueKeys0.WINERY_COUNTRY_FOLW_PKEY;
	public static final UniqueKey<WineryFolwJQR> WINERY_FOLW_PKEY = UniqueKeys0.WINERY_FOLW_PKEY;
	public static final UniqueKey<WineryRegionJQR> WINERY_REGION_PKEY = UniqueKeys0.WINERY_REGION_PKEY;
	public static final UniqueKey<WineryRegionFolwJQR> WINERY_REGION_FOLW_PKEY = UniqueKeys0.WINERY_REGION_FOLW_PKEY;
	public static final UniqueKey<WineTypeJQR> WINE_TYPE_PKEY = UniqueKeys0.WINE_TYPE_PKEY;
	public static final UniqueKey<WineTypeFolwJQR> WINE_TYPE_FOLW_PKEY = UniqueKeys0.WINE_TYPE_FOLW_PKEY;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends AbstractKeys {
		public static Identity<AtagAbnoteJQR, Long> IDENTITY_ATAG_ABNOTE = createIdentity(TblAtagAbnote.ATAG_ABNOTE, TblAtagAbnote.ATAG_ABNOTE.ATAG_ID);
		public static Identity<AttrAbnoteJQR, Long> IDENTITY_ATTR_ABNOTE = createIdentity(TblAttrAbnote.ATTR_ABNOTE, TblAttrAbnote.ATTR_ABNOTE.ATTR_ID);
		public static Identity<AttrAbvintageJQR, Long> IDENTITY_ATTR_ABVINTAGE = createIdentity(TblAttrAbvintage.ATTR_ABVINTAGE, TblAttrAbvintage.ATTR_ABVINTAGE.ATTR_ID);
		public static Identity<FoodJQR, Long> IDENTITY_FOOD = createIdentity(TblFood.FOOD, TblFood.FOOD.FOOD_ID);
		public static Identity<PlaceJQR, Long> IDENTITY_PLACE = createIdentity(TblPlace.PLACE, TblPlace.PLACE.PLACE_ID);
		public static Identity<UserDlvrProfJQR, Long> IDENTITY_USER_DLVR_PROF = createIdentity(TblUserDlvrProf.USER_DLVR_PROF, TblUserDlvrProf.USER_DLVR_PROF.DLVR_ID);
		public static Identity<UserNoteJQR, Long> IDENTITY_USER_NOTE = createIdentity(TblUserNote.USER_NOTE, TblUserNote.USER_NOTE.NOTE_ID);
		public static Identity<UserOccasJQR, Long> IDENTITY_USER_OCCAS = createIdentity(TblUserOccas.USER_OCCAS, TblUserOccas.USER_OCCAS.OCCAS_ID);
		public static Identity<WineJQR, Long> IDENTITY_WINE = createIdentity(TblWine.WINE, TblWine.WINE.WINE_ID);
		public static Identity<WineNameJQR, Long> IDENTITY_WINE_NAME = createIdentity(TblWineName.WINE_NAME, TblWineName.WINE_NAME.WINE_NAME_ID);
		public static Identity<WineryJQR, Long> IDENTITY_WINERY = createIdentity(TblWinery.WINERY, TblWinery.WINERY.WINERY_ID);
		public static Identity<WineryRegionJQR, Integer> IDENTITY_WINERY_REGION = createIdentity(TblWineryRegion.WINERY_REGION, TblWineryRegion.WINERY_REGION.REGION_ID);
	}

	private static class UniqueKeys0 extends AbstractKeys {
		public static final UniqueKey<AtagAbnoteJQR> ATAG_ABNOTE_PKEY = createUniqueKey(TblAtagAbnote.ATAG_ABNOTE, TblAtagAbnote.ATAG_ABNOTE.ATAG_ID);
		public static final UniqueKey<AttrAbnoteJQR> ATTR_ABNOTE_PKEY = createUniqueKey(TblAttrAbnote.ATTR_ABNOTE, TblAttrAbnote.ATTR_ABNOTE.ATTR_ID);
		public static final UniqueKey<AttrAbvintageJQR> ATTR_ABVINTAGE_PKEY = createUniqueKey(TblAttrAbvintage.ATTR_ABVINTAGE, TblAttrAbvintage.ATTR_ABVINTAGE.ATTR_ID);
		public static final UniqueKey<AttrAbvintageJQR> ATTR_ABVINTAGE_ATTR_NAME_ID_ATTR_VAL_ENG_KEY = createUniqueKey(TblAttrAbvintage.ATTR_ABVINTAGE, TblAttrAbvintage.ATTR_ABVINTAGE.ATTR_NAME_ID, TblAttrAbvintage.ATTR_ABVINTAGE.ATTR_VAL_ENG);
		public static final UniqueKey<AttrNameJQR> ATTR_NAME_PKEY = createUniqueKey(TblAttrName.ATTR_NAME, TblAttrName.ATTR_NAME.ATTR_NAME_ID);
		public static final UniqueKey<AttrNameJQR> ATTR_NAME_ATTR_NAME_ENG_KEY = createUniqueKey(TblAttrName.ATTR_NAME, TblAttrName.ATTR_NAME.ATTR_NAME_ENG);
		public static final UniqueKey<AttrNameJQR> ATTR_NAME_ATTR_NAMECODE_KEY = createUniqueKey(TblAttrName.ATTR_NAME, TblAttrName.ATTR_NAME.ATTR_NAMECODE);
		public static final UniqueKey<CityJQR> CITY_PKEY = createUniqueKey(TblCity.CITY, TblCity.CITY.CITY_ID);
		public static final UniqueKey<FoodJQR> FOOD_PKEY = createUniqueKey(TblFood.FOOD, TblFood.FOOD.FOOD_ID);
		public static final UniqueKey<PlaceJQR> PLACE_PKEY = createUniqueKey(TblPlace.PLACE, TblPlace.PLACE.PLACE_ID);
		public static final UniqueKey<UauthSclntwJQR> UAUTH_SCLNTW_PKEY = createUniqueKey(TblUauthSclntw.UAUTH_SCLNTW, TblUauthSclntw.UAUTH_SCLNTW.SN_USERID);
		public static final UniqueKey<UauthSessionJQR> UAUTH_SESSION_PKEY = createUniqueKey(TblUauthSession.UAUTH_SESSION, TblUauthSession.UAUTH_SESSION.USER_ID);
		public static final UniqueKey<UauthSimpleJQR> UAUTH_SIMPLE_PKEY = createUniqueKey(TblUauthSimple.UAUTH_SIMPLE, TblUauthSimple.UAUTH_SIMPLE.LOGIN_EMAIL);
		public static final UniqueKey<UserCellarJQR> USER_CELLAR_PKEY = createUniqueKey(TblUserCellar.USER_CELLAR, TblUserCellar.USER_CELLAR.USER_ID, TblUserCellar.USER_CELLAR.WINE_ID, TblUserCellar.USER_CELLAR.VINTAGE_TAG);
		public static final UniqueKey<UserCountryJQR> USER_COUNTRY_PKEY = createUniqueKey(TblUserCountry.USER_COUNTRY, TblUserCountry.USER_COUNTRY.COUNTRY_ID);
		public static final UniqueKey<UserDlvrProfJQR> USER_DLVR_PROF_PKEY = createUniqueKey(TblUserDlvrProf.USER_DLVR_PROF, TblUserDlvrProf.USER_DLVR_PROF.DLVR_ID);
		public static final UniqueKey<UserFavWineJQR> USER_FAV_WINE_PKEY = createUniqueKey(TblUserFavWine.USER_FAV_WINE, TblUserFavWine.USER_FAV_WINE.USER_ID, TblUserFavWine.USER_FAV_WINE.WINE_ID, TblUserFavWine.USER_FAV_WINE.VINTAGE_TAG);
		public static final UniqueKey<UserHeaderJQR> USER_HEADER_PKEY = createUniqueKey(TblUserHeader.USER_HEADER, TblUserHeader.USER_HEADER.USER_ID);
		public static final UniqueKey<UserHeaderJQR> USER_HEADER_USER_NAME_KEY = createUniqueKey(TblUserHeader.USER_HEADER, TblUserHeader.USER_HEADER.USER_NAME);
		public static final UniqueKey<UserNoteJQR> USER_NOTE_PKEY = createUniqueKey(TblUserNote.USER_NOTE, TblUserNote.USER_NOTE.NOTE_ID);
		public static final UniqueKey<UserNoteAttrJQR> USER_NOTE_ATTR_PKEY = createUniqueKey(TblUserNoteAttr.USER_NOTE_ATTR, TblUserNoteAttr.USER_NOTE_ATTR.NOTE_ID, TblUserNoteAttr.USER_NOTE_ATTR.ATTR_ID);
		public static final UniqueKey<UserNoteFeaturedJQR> USER_NOTE_FEATURED_PKEY = createUniqueKey(TblUserNoteFeatured.USER_NOTE_FEATURED, TblUserNoteFeatured.USER_NOTE_FEATURED.NOTE_ID);
		public static final UniqueKey<UserNoteFoodJQR> USER_NOTE_FOOD_PKEY = createUniqueKey(TblUserNoteFood.USER_NOTE_FOOD, TblUserNoteFood.USER_NOTE_FOOD.NOTE_ID, TblUserNoteFood.USER_NOTE_FOOD.FOOD_ID);
		public static final UniqueKey<UserNotificationJQR> USER_NOTIFICATION_PKEY = createUniqueKey(TblUserNotification.USER_NOTIFICATION, TblUserNotification.USER_NOTIFICATION.USER_ID, TblUserNotification.USER_NOTIFICATION.EVENT_MICTIME);
		public static final UniqueKey<UserOccasJQR> USER_OCCAS_PKEY = createUniqueKey(TblUserOccas.USER_OCCAS, TblUserOccas.USER_OCCAS.OCCAS_ID);
		public static final UniqueKey<UserOccasJQR> USER_OCCAS_HOST_USER_ID_OCCAS_DATE_OCCAS_TAG_KEY = createUniqueKey(TblUserOccas.USER_OCCAS, TblUserOccas.USER_OCCAS.HOST_USER_ID, TblUserOccas.USER_OCCAS.OCCAS_DATE, TblUserOccas.USER_OCCAS.OCCAS_TAG);
		public static final UniqueKey<UserOccasWithJQR> USER_OCCAS_WITH_PKEY = createUniqueKey(TblUserOccasWith.USER_OCCAS_WITH, TblUserOccasWith.USER_OCCAS_WITH.OCCAS_ID, TblUserOccasWith.USER_OCCAS_WITH.USER_ID);
		public static final UniqueKey<UserProfileJQR> USER_PROFILE_PKEY1 = createUniqueKey(TblUserProfile.USER_PROFILE, TblUserProfile.USER_PROFILE.USER_ID);
		public static final UniqueKey<VintageJQR> VINTAGE_PKEY = createUniqueKey(TblVintage.VINTAGE, TblVintage.VINTAGE.WINE_ID, TblVintage.VINTAGE.VINTAGE_TAG);
		public static final UniqueKey<VintageAttrJQR> VINTAGE_ATTR_PKEY = createUniqueKey(TblVintageAttr.VINTAGE_ATTR, TblVintageAttr.VINTAGE_ATTR.WINE_ID, TblVintageAttr.VINTAGE_ATTR.VINTAGE_TAG, TblVintageAttr.VINTAGE_ATTR.ATTR_ID);
		public static final UniqueKey<WineJQR> WINE_PKEY = createUniqueKey(TblWine.WINE, TblWine.WINE.WINE_ID);
		public static final UniqueKey<WineNameJQR> WINE_NAME_PKEY1 = createUniqueKey(TblWineName.WINE_NAME, TblWineName.WINE_NAME.WINE_NAME_ID);
		public static final UniqueKey<WineNameJQR> WINE_NAME_WINE_ID_WINE_NAME_ID_KEY = createUniqueKey(TblWineName.WINE_NAME, TblWineName.WINE_NAME.WINE_ID, TblWineName.WINE_NAME.WINE_NAME_ID);
		public static final UniqueKey<WineryJQR> WINERY_PKEY = createUniqueKey(TblWinery.WINERY, TblWinery.WINERY.WINERY_ID);
		public static final UniqueKey<WineryCountryJQR> WINE_COUNTRY_PKEY = createUniqueKey(TblWineryCountry.WINERY_COUNTRY, TblWineryCountry.WINERY_COUNTRY.COUNTRY_ID);
		public static final UniqueKey<WineryCountryJQR> WINE_COUNTRY_COUNTRY_CODE_KEY = createUniqueKey(TblWineryCountry.WINERY_COUNTRY, TblWineryCountry.WINERY_COUNTRY.COUNTRY_CODE);
		public static final UniqueKey<WineryCountryFolwJQR> WINERY_COUNTRY_FOLW_PKEY = createUniqueKey(TblWineryCountryFolw.WINERY_COUNTRY_FOLW, TblWineryCountryFolw.WINERY_COUNTRY_FOLW.USER_ID, TblWineryCountryFolw.WINERY_COUNTRY_FOLW.COUNTRY_ID);
		public static final UniqueKey<WineryFolwJQR> WINERY_FOLW_PKEY = createUniqueKey(TblWineryFolw.WINERY_FOLW, TblWineryFolw.WINERY_FOLW.USER_ID, TblWineryFolw.WINERY_FOLW.WINERY_ID);
		public static final UniqueKey<WineryRegionJQR> WINERY_REGION_PKEY = createUniqueKey(TblWineryRegion.WINERY_REGION, TblWineryRegion.WINERY_REGION.REGION_ID);
		public static final UniqueKey<WineryRegionFolwJQR> WINERY_REGION_FOLW_PKEY = createUniqueKey(TblWineryRegionFolw.WINERY_REGION_FOLW, TblWineryRegionFolw.WINERY_REGION_FOLW.USER_ID, TblWineryRegionFolw.WINERY_REGION_FOLW.REGION_ID);
		public static final UniqueKey<WineTypeJQR> WINE_TYPE_PKEY = createUniqueKey(TblWineType.WINE_TYPE, TblWineType.WINE_TYPE.WINE_TYPE_ID);
		public static final UniqueKey<WineTypeFolwJQR> WINE_TYPE_FOLW_PKEY = createUniqueKey(TblWineTypeFolw.WINE_TYPE_FOLW, TblWineTypeFolw.WINE_TYPE_FOLW.USER_ID, TblWineTypeFolw.WINE_TYPE_FOLW.WINE_TYPE_ID);
	}
}