/**
 * This class is generated by jOOQ
 */
package myicellar.jooq.records;


import java.util.UUID;

import myicellar.jooq.tables.TblAttrAbvintageFolw;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AttrAbvintageFolwJQR extends TableRecordImpl<AttrAbvintageFolwJQR> implements Record3<UUID, Long, Integer> {

	private static final long serialVersionUID = 917809826;

	/**
	 * Setter for <code>mic_core.attr_abvintage_folw.user_id</code>.
	 */
	public void setUserId(UUID value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>mic_core.attr_abvintage_folw.user_id</code>.
	 */
	public UUID getUserId() {
		return (UUID) getValue(0);
	}

	/**
	 * Setter for <code>mic_core.attr_abvintage_folw.attr_id</code>.
	 */
	public void setAttrId(Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>mic_core.attr_abvintage_folw.attr_id</code>.
	 */
	public Long getAttrId() {
		return (Long) getValue(1);
	}

	/**
	 * Setter for <code>mic_core.attr_abvintage_folw.last_upd_mictime</code>.
	 */
	public void setLastUpdMictime(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>mic_core.attr_abvintage_folw.last_upd_mictime</code>.
	 */
	public Integer getLastUpdMictime() {
		return (Integer) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<UUID, Long, Integer> fieldsRow() {
		return (Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<UUID, Long, Integer> valuesRow() {
		return (Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UUID> field1() {
		return TblAttrAbvintageFolw.ATTR_ABVINTAGE_FOLW.USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field2() {
		return TblAttrAbvintageFolw.ATTR_ABVINTAGE_FOLW.ATTR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return TblAttrAbvintageFolw.ATTR_ABVINTAGE_FOLW.LAST_UPD_MICTIME;
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
	public Long value2() {
		return getAttrId();
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
	public AttrAbvintageFolwJQR value1(UUID value) {
		setUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AttrAbvintageFolwJQR value2(Long value) {
		setAttrId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AttrAbvintageFolwJQR value3(Integer value) {
		setLastUpdMictime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AttrAbvintageFolwJQR values(UUID value1, Long value2, Integer value3) {
		value1(value1);
		value2(value2);
		value3(value3);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached AttrAbvintageFolwJQR
	 */
	public AttrAbvintageFolwJQR() {
		super(TblAttrAbvintageFolw.ATTR_ABVINTAGE_FOLW);
	}

	/**
	 * Create a detached, initialised AttrAbvintageFolwJQR
	 */
	public AttrAbvintageFolwJQR(UUID userId, Long attrId, Integer lastUpdMictime) {
		super(TblAttrAbvintageFolw.ATTR_ABVINTAGE_FOLW);

		setValue(0, userId);
		setValue(1, attrId);
		setValue(2, lastUpdMictime);
	}
}
