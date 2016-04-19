/**
 * This class is generated by jOOQ
 */
package myicellar.jooq.records;


import java.util.UUID;

import myicellar.jooq.tables.TblWineryCountryFolw;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WineryCountryFolwJQR extends UpdatableRecordImpl<WineryCountryFolwJQR> implements Record3<UUID, Integer, Integer> {

	private static final long serialVersionUID = 322750977;

	/**
	 * Setter for <code>mic_core.winery_country_folw.user_id</code>.
	 */
	public void setUserId(UUID value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>mic_core.winery_country_folw.user_id</code>.
	 */
	public UUID getUserId() {
		return (UUID) getValue(0);
	}

	/**
	 * Setter for <code>mic_core.winery_country_folw.country_id</code>.
	 */
	public void setCountryId(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>mic_core.winery_country_folw.country_id</code>.
	 */
	public Integer getCountryId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>mic_core.winery_country_folw.last_upd_mictime</code>.
	 */
	public void setLastUpdMictime(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>mic_core.winery_country_folw.last_upd_mictime</code>.
	 */
	public Integer getLastUpdMictime() {
		return (Integer) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record2<UUID, Integer> key() {
		return (Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<UUID, Integer, Integer> fieldsRow() {
		return (Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<UUID, Integer, Integer> valuesRow() {
		return (Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UUID> field1() {
		return TblWineryCountryFolw.WINERY_COUNTRY_FOLW.USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return TblWineryCountryFolw.WINERY_COUNTRY_FOLW.COUNTRY_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return TblWineryCountryFolw.WINERY_COUNTRY_FOLW.LAST_UPD_MICTIME;
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
	public Integer value2() {
		return getCountryId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getLastUpdMictime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WineryCountryFolwJQR value1(UUID value) {
		setUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WineryCountryFolwJQR value2(Integer value) {
		setCountryId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WineryCountryFolwJQR value3(Integer value) {
		setLastUpdMictime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WineryCountryFolwJQR values(UUID value1, Integer value2, Integer value3) {
		value1(value1);
		value2(value2);
		value3(value3);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached WineryCountryFolwJQR
	 */
	public WineryCountryFolwJQR() {
		super(TblWineryCountryFolw.WINERY_COUNTRY_FOLW);
	}

	/**
	 * Create a detached, initialised WineryCountryFolwJQR
	 */
	public WineryCountryFolwJQR(UUID userId, Integer countryId, Integer lastUpdMictime) {
		super(TblWineryCountryFolw.WINERY_COUNTRY_FOLW);

		setValue(0, userId);
		setValue(1, countryId);
		setValue(2, lastUpdMictime);
	}
}