/**
 * This class is generated by jOOQ
 */
package myicellar.jooq.records;


import java.util.UUID;

import myicellar.jooq.tables.TblWineTypeFolw;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WineTypeFolwJQR extends UpdatableRecordImpl<WineTypeFolwJQR> implements Record3<UUID, Short, Integer> {

	private static final long serialVersionUID = -952391938;

	/**
	 * Setter for <code>mic_core.wine_type_folw.user_id</code>.
	 */
	public void setUserId(UUID value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>mic_core.wine_type_folw.user_id</code>.
	 */
	public UUID getUserId() {
		return (UUID) getValue(0);
	}

	/**
	 * Setter for <code>mic_core.wine_type_folw.wine_type_id</code>.
	 */
	public void setWineTypeId(Short value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>mic_core.wine_type_folw.wine_type_id</code>.
	 */
	public Short getWineTypeId() {
		return (Short) getValue(1);
	}

	/**
	 * Setter for <code>mic_core.wine_type_folw.last_upd_mictime</code>.
	 */
	public void setLastUpdMictime(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>mic_core.wine_type_folw.last_upd_mictime</code>.
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
	public Record2<UUID, Short> key() {
		return (Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<UUID, Short, Integer> fieldsRow() {
		return (Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<UUID, Short, Integer> valuesRow() {
		return (Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UUID> field1() {
		return TblWineTypeFolw.WINE_TYPE_FOLW.USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Short> field2() {
		return TblWineTypeFolw.WINE_TYPE_FOLW.WINE_TYPE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return TblWineTypeFolw.WINE_TYPE_FOLW.LAST_UPD_MICTIME;
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
	public Short value2() {
		return getWineTypeId();
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
	public WineTypeFolwJQR value1(UUID value) {
		setUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WineTypeFolwJQR value2(Short value) {
		setWineTypeId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WineTypeFolwJQR value3(Integer value) {
		setLastUpdMictime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WineTypeFolwJQR values(UUID value1, Short value2, Integer value3) {
		value1(value1);
		value2(value2);
		value3(value3);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached WineTypeFolwJQR
	 */
	public WineTypeFolwJQR() {
		super(TblWineTypeFolw.WINE_TYPE_FOLW);
	}

	/**
	 * Create a detached, initialised WineTypeFolwJQR
	 */
	public WineTypeFolwJQR(UUID userId, Short wineTypeId, Integer lastUpdMictime) {
		super(TblWineTypeFolw.WINE_TYPE_FOLW);

		setValue(0, userId);
		setValue(1, wineTypeId);
		setValue(2, lastUpdMictime);
	}
}
