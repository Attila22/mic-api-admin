/**
 * This class is generated by jOOQ
 */
package myicellar.jooq.records;


import java.sql.Date;
import java.util.UUID;

import myicellar.jooq.tables.TblUserProfile;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserProfileJQR extends UpdatableRecordImpl<UserProfileJQR> implements Record14<UUID, Date, Short, Short, String, String, String, String, UUID, Integer, Date, Integer, Integer, Boolean> {

	private static final long serialVersionUID = -1814169763;

	/**
	 * Setter for <code>mic_core.user_profile.user_id</code>.
	 */
	public void setUserId(UUID value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>mic_core.user_profile.user_id</code>.
	 */
	public UUID getUserId() {
		return (UUID) getValue(0);
	}

	/**
	 * Setter for <code>mic_core.user_profile.dob</code>.
	 */
	public void setDob(Date value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>mic_core.user_profile.dob</code>.
	 */
	public Date getDob() {
		return (Date) getValue(1);
	}

	/**
	 * Setter for <code>mic_core.user_profile.decadob</code>.
	 */
	public void setDecadob(Short value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>mic_core.user_profile.decadob</code>.
	 */
	public Short getDecadob() {
		return (Short) getValue(2);
	}

	/**
	 * Setter for <code>mic_core.user_profile.sex</code>.
	 */
	public void setSex(Short value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>mic_core.user_profile.sex</code>.
	 */
	public Short getSex() {
		return (Short) getValue(3);
	}

	/**
	 * Setter for <code>mic_core.user_profile.toast_line</code>.
	 */
	public void setToastLine(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>mic_core.user_profile.toast_line</code>.
	 */
	public String getToastLine() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>mic_core.user_profile.about_me</code>.
	 */
	public void setAboutMe(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>mic_core.user_profile.about_me</code>.
	 */
	public String getAboutMe() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>mic_core.user_profile.email_me</code>.
	 */
	public void setEmailMe(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>mic_core.user_profile.email_me</code>.
	 */
	public String getEmailMe() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>mic_core.user_profile.url_me</code>.
	 */
	public void setUrlMe(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>mic_core.user_profile.url_me</code>.
	 */
	public String getUrlMe() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>mic_core.user_profile.profile_banner</code>.
	 */
	public void setProfileBanner(UUID value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>mic_core.user_profile.profile_banner</code>.
	 */
	public UUID getProfileBanner() {
		return (UUID) getValue(8);
	}

	/**
	 * Setter for <code>mic_core.user_profile.city_id</code>.
	 */
	public void setCityId(Integer value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>mic_core.user_profile.city_id</code>.
	 */
	public Integer getCityId() {
		return (Integer) getValue(9);
	}

	/**
	 * Setter for <code>mic_core.user_profile.signup_date</code>.
	 */
	public void setSignupDate(Date value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>mic_core.user_profile.signup_date</code>.
	 */
	public Date getSignupDate() {
		return (Date) getValue(10);
	}

	/**
	 * Setter for <code>mic_core.user_profile.signup_mictime</code>.
	 */
	public void setSignupMictime(Integer value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>mic_core.user_profile.signup_mictime</code>.
	 */
	public Integer getSignupMictime() {
		return (Integer) getValue(11);
	}

	/**
	 * Setter for <code>mic_core.user_profile.last_upd_mictime</code>.
	 */
	public void setLastUpdMictime(Integer value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>mic_core.user_profile.last_upd_mictime</code>.
	 */
	public Integer getLastUpdMictime() {
		return (Integer) getValue(12);
	}

	/**
	 * Setter for <code>mic_core.user_profile.signup_comp</code>.
	 */
	public void setSignupComp(Boolean value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>mic_core.user_profile.signup_comp</code>.
	 */
	public Boolean getSignupComp() {
		return (Boolean) getValue(13);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<UUID> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record14 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row14<UUID, Date, Short, Short, String, String, String, String, UUID, Integer, Date, Integer, Integer, Boolean> fieldsRow() {
		return (Row14) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row14<UUID, Date, Short, Short, String, String, String, String, UUID, Integer, Date, Integer, Integer, Boolean> valuesRow() {
		return (Row14) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UUID> field1() {
		return TblUserProfile.USER_PROFILE.USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field2() {
		return TblUserProfile.USER_PROFILE.DOB;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Short> field3() {
		return TblUserProfile.USER_PROFILE.DECADOB;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Short> field4() {
		return TblUserProfile.USER_PROFILE.SEX;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return TblUserProfile.USER_PROFILE.TOAST_LINE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return TblUserProfile.USER_PROFILE.ABOUT_ME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return TblUserProfile.USER_PROFILE.EMAIL_ME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return TblUserProfile.USER_PROFILE.URL_ME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UUID> field9() {
		return TblUserProfile.USER_PROFILE.PROFILE_BANNER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field10() {
		return TblUserProfile.USER_PROFILE.CITY_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field11() {
		return TblUserProfile.USER_PROFILE.SIGNUP_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field12() {
		return TblUserProfile.USER_PROFILE.SIGNUP_MICTIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field13() {
		return TblUserProfile.USER_PROFILE.LAST_UPD_MICTIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean> field14() {
		return TblUserProfile.USER_PROFILE.SIGNUP_COMP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UUID value1() {
		return getUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value2() {
		return getDob();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Short value3() {
		return getDecadob();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Short value4() {
		return getSex();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getToastLine();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getAboutMe();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getEmailMe();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getUrlMe();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UUID value9() {
		return getProfileBanner();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value10() {
		return getCityId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value11() {
		return getSignupDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value12() {
		return getSignupMictime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value13() {
		return getLastUpdMictime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean value14() {
		return getSignupComp();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserProfileJQR value1(UUID value) {
		setUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserProfileJQR value2(Date value) {
		setDob(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserProfileJQR value3(Short value) {
		setDecadob(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserProfileJQR value4(Short value) {
		setSex(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserProfileJQR value5(String value) {
		setToastLine(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserProfileJQR value6(String value) {
		setAboutMe(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserProfileJQR value7(String value) {
		setEmailMe(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserProfileJQR value8(String value) {
		setUrlMe(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserProfileJQR value9(UUID value) {
		setProfileBanner(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserProfileJQR value10(Integer value) {
		setCityId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserProfileJQR value11(Date value) {
		setSignupDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserProfileJQR value12(Integer value) {
		setSignupMictime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserProfileJQR value13(Integer value) {
		setLastUpdMictime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserProfileJQR value14(Boolean value) {
		setSignupComp(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserProfileJQR values(UUID value1, Date value2, Short value3, Short value4, String value5, String value6, String value7, String value8, UUID value9, Integer value10, Date value11, Integer value12, Integer value13, Boolean value14) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		value10(value10);
		value11(value11);
		value12(value12);
		value13(value13);
		value14(value14);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached UserProfileJQR
	 */
	public UserProfileJQR() {
		super(TblUserProfile.USER_PROFILE);
	}

	/**
	 * Create a detached, initialised UserProfileJQR
	 */
	public UserProfileJQR(UUID userId, Date dob, Short decadob, Short sex, String toastLine, String aboutMe, String emailMe, String urlMe, UUID profileBanner, Integer cityId, Date signupDate, Integer signupMictime, Integer lastUpdMictime, Boolean signupComp) {
		super(TblUserProfile.USER_PROFILE);

		setValue(0, userId);
		setValue(1, dob);
		setValue(2, decadob);
		setValue(3, sex);
		setValue(4, toastLine);
		setValue(5, aboutMe);
		setValue(6, emailMe);
		setValue(7, urlMe);
		setValue(8, profileBanner);
		setValue(9, cityId);
		setValue(10, signupDate);
		setValue(11, signupMictime);
		setValue(12, lastUpdMictime);
		setValue(13, signupComp);
	}
}