/**
 * This class is generated by jOOQ
 */
package myicellar.jooq.records;


import myicellar.jooq.tables.TblWineType;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WineTypeJQR extends UpdatableRecordImpl<WineTypeJQR> implements Record7<Short, String, String, String, Short, String, Integer> {

	private static final long serialVersionUID = 1987091077;

	/**
	 * Setter for <code>mic_core.wine_type.wine_type_id</code>.
	 */
	public void setWineTypeId(Short value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>mic_core.wine_type.wine_type_id</code>.
	 */
	public Short getWineTypeId() {
		return (Short) getValue(0);
	}

	/**
	 * Setter for <code>mic_core.wine_type.wine_type_name_eng</code>.
	 */
	public void setWineTypeNameEng(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>mic_core.wine_type.wine_type_name_eng</code>.
	 */
	public String getWineTypeNameEng() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>mic_core.wine_type.wine_type_name_chs</code>.
	 */
	public void setWineTypeNameChs(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>mic_core.wine_type.wine_type_name_chs</code>.
	 */
	public String getWineTypeNameChs() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>mic_core.wine_type.wine_type_name_cht</code>.
	 */
	public void setWineTypeNameCht(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>mic_core.wine_type.wine_type_name_cht</code>.
	 */
	public String getWineTypeNameCht() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>mic_core.wine_type.rank</code>.
	 */
	public void setRank(Short value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>mic_core.wine_type.rank</code>.
	 */
	public Short getRank() {
		return (Short) getValue(4);
	}

	/**
	 * Setter for <code>mic_core.wine_type.seo_url</code>.
	 */
	public void setSeoUrl(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>mic_core.wine_type.seo_url</code>.
	 */
	public String getSeoUrl() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>mic_core.wine_type.last_upd_mictime</code>.
	 */
	public void setLastUpdMictime(Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>mic_core.wine_type.last_upd_mictime</code>.
	 */
	public Integer getLastUpdMictime() {
		return (Integer) getValue(6);
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
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<Short, String, String, String, Short, String, Integer> fieldsRow() {
		return (Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<Short, String, String, String, Short, String, Integer> valuesRow() {
		return (Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Short> field1() {
		return TblWineType.WINE_TYPE.WINE_TYPE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return TblWineType.WINE_TYPE.WINE_TYPE_NAME_ENG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return TblWineType.WINE_TYPE.WINE_TYPE_NAME_CHS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return TblWineType.WINE_TYPE.WINE_TYPE_NAME_CHT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Short> field5() {
		return TblWineType.WINE_TYPE.RANK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return TblWineType.WINE_TYPE.SEO_URL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field7() {
		return TblWineType.WINE_TYPE.LAST_UPD_MICTIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Short value1() {
		return getWineTypeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getWineTypeNameEng();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getWineTypeNameChs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getWineTypeNameCht();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Short value5() {
		return getRank();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getSeoUrl();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value7() {
		return getLastUpdMictime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WineTypeJQR value1(Short value) {
		setWineTypeId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WineTypeJQR value2(String value) {
		setWineTypeNameEng(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WineTypeJQR value3(String value) {
		setWineTypeNameChs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WineTypeJQR value4(String value) {
		setWineTypeNameCht(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WineTypeJQR value5(Short value) {
		setRank(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WineTypeJQR value6(String value) {
		setSeoUrl(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WineTypeJQR value7(Integer value) {
		setLastUpdMictime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WineTypeJQR values(Short value1, String value2, String value3, String value4, Short value5, String value6, Integer value7) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached WineTypeJQR
	 */
	public WineTypeJQR() {
		super(TblWineType.WINE_TYPE);
	}

	/**
	 * Create a detached, initialised WineTypeJQR
	 */
	public WineTypeJQR(Short wineTypeId, String wineTypeNameEng, String wineTypeNameChs, String wineTypeNameCht, Short rank, String seoUrl, Integer lastUpdMictime) {
		super(TblWineType.WINE_TYPE);

		setValue(0, wineTypeId);
		setValue(1, wineTypeNameEng);
		setValue(2, wineTypeNameChs);
		setValue(3, wineTypeNameCht);
		setValue(4, rank);
		setValue(5, seoUrl);
		setValue(6, lastUpdMictime);
	}
}
