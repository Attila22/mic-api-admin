/**
 * This class is generated by jOOQ
 */
package myicellar.jooq.records;


import java.util.UUID;

import myicellar.jooq.tables.TblWine;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WineJQR extends UpdatableRecordImpl<WineJQR> implements Record8<Long, Short, Long, String, UUID, Boolean, String, Integer> {

	private static final long serialVersionUID = 556629856;

	/**
	 * Setter for <code>mic_core.wine.wine_id</code>.
	 */
	public void setWineId(Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>mic_core.wine.wine_id</code>.
	 */
	public Long getWineId() {
		return (Long) getValue(0);
	}

	/**
	 * Setter for <code>mic_core.wine.wine_type_id</code>.
	 */
	public void setWineTypeId(Short value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>mic_core.wine.wine_type_id</code>.
	 */
	public Short getWineTypeId() {
		return (Short) getValue(1);
	}

	/**
	 * Setter for <code>mic_core.wine.winery_id</code>.
	 */
	public void setWineryId(Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>mic_core.wine.winery_id</code>.
	 */
	public Long getWineryId() {
		return (Long) getValue(2);
	}

	/**
	 * Setter for <code>mic_core.wine.note</code>.
	 */
	public void setNote(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>mic_core.wine.note</code>.
	 */
	public String getNote() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>mic_core.wine.wine_img</code>.
	 */
	public void setWineImg(UUID value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>mic_core.wine.wine_img</code>.
	 */
	public UUID getWineImg() {
		return (UUID) getValue(4);
	}

	/**
	 * Setter for <code>mic_core.wine.is_valid</code>.
	 */
	public void setIsValid(Boolean value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>mic_core.wine.is_valid</code>.
	 */
	public Boolean getIsValid() {
		return (Boolean) getValue(5);
	}

	/**
	 * Setter for <code>mic_core.wine.seo_url</code>.
	 */
	public void setSeoUrl(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>mic_core.wine.seo_url</code>.
	 */
	public String getSeoUrl() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>mic_core.wine.last_upd_mictime</code>.
	 */
	public void setLastUpdMictime(Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>mic_core.wine.last_upd_mictime</code>.
	 */
	public Integer getLastUpdMictime() {
		return (Integer) getValue(7);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Long> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<Long, Short, Long, String, UUID, Boolean, String, Integer> fieldsRow() {
		return (Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<Long, Short, Long, String, UUID, Boolean, String, Integer> valuesRow() {
		return (Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field1() {
		return TblWine.WINE.WINE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Short> field2() {
		return TblWine.WINE.WINE_TYPE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field3() {
		return TblWine.WINE.WINERY_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return TblWine.WINE.NOTE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UUID> field5() {
		return TblWine.WINE.WINE_IMG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean> field6() {
		return TblWine.WINE.IS_VALID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return TblWine.WINE.SEO_URL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field8() {
		return TblWine.WINE.LAST_UPD_MICTIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value1() {
		return getWineId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Short value2() {
		return getWineTypeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value3() {
		return getWineryId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getNote();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UUID value5() {
		return getWineImg();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean value6() {
		return getIsValid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getSeoUrl();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value8() {
		return getLastUpdMictime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WineJQR value1(Long value) {
		setWineId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WineJQR value2(Short value) {
		setWineTypeId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WineJQR value3(Long value) {
		setWineryId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WineJQR value4(String value) {
		setNote(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WineJQR value5(UUID value) {
		setWineImg(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WineJQR value6(Boolean value) {
		setIsValid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WineJQR value7(String value) {
		setSeoUrl(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WineJQR value8(Integer value) {
		setLastUpdMictime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WineJQR values(Long value1, Short value2, Long value3, String value4, UUID value5, Boolean value6, String value7, Integer value8) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached WineJQR
	 */
	public WineJQR() {
		super(TblWine.WINE);
	}

	/**
	 * Create a detached, initialised WineJQR
	 */
	public WineJQR(Long wineId, Short wineTypeId, Long wineryId, String note, UUID wineImg, Boolean isValid, String seoUrl, Integer lastUpdMictime) {
		super(TblWine.WINE);

		setValue(0, wineId);
		setValue(1, wineTypeId);
		setValue(2, wineryId);
		setValue(3, note);
		setValue(4, wineImg);
		setValue(5, isValid);
		setValue(6, seoUrl);
		setValue(7, lastUpdMictime);
	}
}
