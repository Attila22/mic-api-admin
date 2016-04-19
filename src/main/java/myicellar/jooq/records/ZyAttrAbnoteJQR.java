/**
 * This class is generated by jOOQ
 */
package myicellar.jooq.records;


import java.sql.Timestamp;
import java.util.UUID;

import myicellar.jooq.tables.TblZyAttrAbnote;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ZyAttrAbnoteJQR extends TableRecordImpl<ZyAttrAbnoteJQR> implements Record4<Long, Short, Timestamp, UUID> {

	private static final long serialVersionUID = -1791208828;

	/**
	 * Setter for <code>mic_core.zy_attr_abnote.attr_id</code>.
	 */
	public void setAttrId(Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>mic_core.zy_attr_abnote.attr_id</code>.
	 */
	public Long getAttrId() {
		return (Long) getValue(0);
	}

	/**
	 * Setter for <code>mic_core.zy_attr_abnote.action_name_id</code>.
	 */
	public void setActionNameId(Short value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>mic_core.zy_attr_abnote.action_name_id</code>.
	 */
	public Short getActionNameId() {
		return (Short) getValue(1);
	}

	/**
	 * Setter for <code>mic_core.zy_attr_abnote.action_time</code>.
	 */
	public void setActionTime(Timestamp value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>mic_core.zy_attr_abnote.action_time</code>.
	 */
	public Timestamp getActionTime() {
		return (Timestamp) getValue(2);
	}

	/**
	 * Setter for <code>mic_core.zy_attr_abnote.action_by</code>.
	 */
	public void setActionBy(UUID value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>mic_core.zy_attr_abnote.action_by</code>.
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
		return TblZyAttrAbnote.ZY_ATTR_ABNOTE.ATTR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Short> field2() {
		return TblZyAttrAbnote.ZY_ATTR_ABNOTE.ACTION_NAME_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field3() {
		return TblZyAttrAbnote.ZY_ATTR_ABNOTE.ACTION_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UUID> field4() {
		return TblZyAttrAbnote.ZY_ATTR_ABNOTE.ACTION_BY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value1() {
		return getAttrId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Short value2() {
		return getActionNameId();
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
	public ZyAttrAbnoteJQR value1(Long value) {
		setAttrId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ZyAttrAbnoteJQR value2(Short value) {
		setActionNameId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ZyAttrAbnoteJQR value3(Timestamp value) {
		setActionTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ZyAttrAbnoteJQR value4(UUID value) {
		setActionBy(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ZyAttrAbnoteJQR values(Long value1, Short value2, Timestamp value3, UUID value4) {
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
	 * Create a detached ZyAttrAbnoteJQR
	 */
	public ZyAttrAbnoteJQR() {
		super(TblZyAttrAbnote.ZY_ATTR_ABNOTE);
	}

	/**
	 * Create a detached, initialised ZyAttrAbnoteJQR
	 */
	public ZyAttrAbnoteJQR(Long attrId, Short actionNameId, Timestamp actionTime, UUID actionBy) {
		super(TblZyAttrAbnote.ZY_ATTR_ABNOTE);

		setValue(0, attrId);
		setValue(1, actionNameId);
		setValue(2, actionTime);
		setValue(3, actionBy);
	}
}