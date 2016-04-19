/**
 * This class is generated by jOOQ
 */
package myicellar.jooq.records;


import java.sql.Timestamp;
import java.util.UUID;

import myicellar.jooq.tables.TblZyWineName;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ZyWineNameJQR extends TableRecordImpl<ZyWineNameJQR> implements Record4<Long, Short, Timestamp, UUID> {

	private static final long serialVersionUID = -1054015789;

	/**
	 * Setter for <code>mic_core.zy_wine_name.wine_name_id</code>.
	 */
	public void setWineNameId(Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>mic_core.zy_wine_name.wine_name_id</code>.
	 */
	public Long getWineNameId() {
		return (Long) getValue(0);
	}

	/**
	 * Setter for <code>mic_core.zy_wine_name.action_type</code>.
	 */
	public void setActionType(Short value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>mic_core.zy_wine_name.action_type</code>.
	 */
	public Short getActionType() {
		return (Short) getValue(1);
	}

	/**
	 * Setter for <code>mic_core.zy_wine_name.action_time</code>.
	 */
	public void setActionTime(Timestamp value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>mic_core.zy_wine_name.action_time</code>.
	 */
	public Timestamp getActionTime() {
		return (Timestamp) getValue(2);
	}

	/**
	 * Setter for <code>mic_core.zy_wine_name.action_by</code>.
	 */
	public void setActionBy(UUID value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>mic_core.zy_wine_name.action_by</code>.
	 */
	public UUID getActionBy() {
		return (UUID) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<Long, Short, Timestamp, UUID> fieldsRow() {
		return (Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<Long, Short, Timestamp, UUID> valuesRow() {
		return (Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field1() {
		return TblZyWineName.ZY_WINE_NAME.WINE_NAME_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Short> field2() {
		return TblZyWineName.ZY_WINE_NAME.ACTION_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field3() {
		return TblZyWineName.ZY_WINE_NAME.ACTION_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UUID> field4() {
		return TblZyWineName.ZY_WINE_NAME.ACTION_BY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value1() {
		return getWineNameId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Short value2() {
		return getActionType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value3() {
		return getActionTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UUID value4() {
		return getActionBy();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ZyWineNameJQR value1(Long value) {
		setWineNameId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ZyWineNameJQR value2(Short value) {
		setActionType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ZyWineNameJQR value3(Timestamp value) {
		setActionTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ZyWineNameJQR value4(UUID value) {
		setActionBy(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ZyWineNameJQR values(Long value1, Short value2, Timestamp value3, UUID value4) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ZyWineNameJQR
	 */
	public ZyWineNameJQR() {
		super(TblZyWineName.ZY_WINE_NAME);
	}

	/**
	 * Create a detached, initialised ZyWineNameJQR
	 */
	public ZyWineNameJQR(Long wineNameId, Short actionType, Timestamp actionTime, UUID actionBy) {
		super(TblZyWineName.ZY_WINE_NAME);

		setValue(0, wineNameId);
		setValue(1, actionType);
		setValue(2, actionTime);
		setValue(3, actionBy);
	}
}