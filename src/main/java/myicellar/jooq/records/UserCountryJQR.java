/**
 * This class is generated by jOOQ
 */
package myicellar.jooq.records;


import myicellar.jooq.tables.TblUserCountry;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserCountryJQR extends UpdatableRecordImpl<UserCountryJQR> implements Record6<Short, String, String, String, String, Short> {

	private static final long serialVersionUID = 869918714;

	/**
	 * Setter for <code>mic_core.user_country.country_id</code>.
	 */
	public void setCountryId(Short value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>mic_core.user_country.country_id</code>.
	 */
	public Short getCountryId() {
		return (Short) getValue(0);
	}

	/**
	 * Setter for <code>mic_core.user_country.country_code</code>.
	 */
	public void setCountryCode(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>mic_core.user_country.country_code</code>.
	 */
	public String getCountryCode() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>mic_core.user_country.country_name_eng</code>.
	 */
	public void setCountryNameEng(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>mic_core.user_country.country_name_eng</code>.
	 */
	public String getCountryNameEng() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>mic_core.user_country.country_name_chs</code>.
	 */
	public void setCountryNameChs(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>mic_core.user_country.country_name_chs</code>.
	 */
	public String getCountryNameChs() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>mic_core.user_country.country_name_cht</code>.
	 */
	public void setCountryNameCht(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>mic_core.user_country.country_name_cht</code>.
	 */
	public String getCountryNameCht() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>mic_core.user_country.rank</code>.
	 */
	public void setRank(Short value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>mic_core.user_country.rank</code>.
	 */
	public Short getRank() {
		return (Short) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Short> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Short, String, String, String, String, Short> fieldsRow() {
		return (Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Short, String, String, String, String, Short> valuesRow() {
		return (Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Short> field1() {
		return TblUserCountry.USER_COUNTRY.COUNTRY_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return TblUserCountry.USER_COUNTRY.COUNTRY_CODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return TblUserCountry.USER_COUNTRY.COUNTRY_NAME_ENG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return TblUserCountry.USER_COUNTRY.COUNTRY_NAME_CHS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return TblUserCountry.USER_COUNTRY.COUNTRY_NAME_CHT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Short> field6() {
		return TblUserCountry.USER_COUNTRY.RANK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Short value1() {
		return getCountryId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getCountryCode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getCountryNameEng();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getCountryNameChs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getCountryNameCht();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Short value6() {
		return getRank();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserCountryJQR value1(Short value) {
		setCountryId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserCountryJQR value2(String value) {
		setCountryCode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserCountryJQR value3(String value) {
		setCountryNameEng(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserCountryJQR value4(String value) {
		setCountryNameChs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserCountryJQR value5(String value) {
		setCountryNameCht(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserCountryJQR value6(Short value) {
		setRank(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserCountryJQR values(Short value1, String value2, String value3, String value4, String value5, Short value6) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached UserCountryJQR
	 */
	public UserCountryJQR() {
		super(TblUserCountry.USER_COUNTRY);
	}

	/**
	 * Create a detached, initialised UserCountryJQR
	 */
	public UserCountryJQR(Short countryId, String countryCode, String countryNameEng, String countryNameChs, String countryNameCht, Short rank) {
		super(TblUserCountry.USER_COUNTRY);

		setValue(0, countryId);
		setValue(1, countryCode);
		setValue(2, countryNameEng);
		setValue(3, countryNameChs);
		setValue(4, countryNameCht);
		setValue(5, rank);
	}
}
