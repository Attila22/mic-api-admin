/**
 * This class is generated by jOOQ
 */
package myicellar.jooq.records;


import java.util.UUID;

import myicellar.jooq.tables.TblFood;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FoodJQR extends UpdatableRecordImpl<FoodJQR> implements Record5<Long, String, UUID, Boolean, Integer> {

	private static final long serialVersionUID = 1809395902;

	/**
	 * Setter for <code>mic_core.food.food_id</code>.
	 */
	public void setFoodId(Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>mic_core.food.food_id</code>.
	 */
	public Long getFoodId() {
		return (Long) getValue(0);
	}

	/**
	 * Setter for <code>mic_core.food.food_name</code>.
	 */
	public void setFoodName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>mic_core.food.food_name</code>.
	 */
	public String getFoodName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>mic_core.food.food_name_hash</code>.
	 */
	public void setFoodNameHash(UUID value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>mic_core.food.food_name_hash</code>.
	 */
	public UUID getFoodNameHash() {
		return (UUID) getValue(2);
	}

	/**
	 * Setter for <code>mic_core.food.is_archived</code>.
	 */
	public void setIsArchived(Boolean value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>mic_core.food.is_archived</code>.
	 */
	public Boolean getIsArchived() {
		return (Boolean) getValue(3);
	}

	/**
	 * Setter for <code>mic_core.food.last_upd_mictime</code>.
	 */
	public void setLastUpdMictime(Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>mic_core.food.last_upd_mictime</code>.
	 */
	public Integer getLastUpdMictime() {
		return (Integer) getValue(4);
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
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<Long, String, UUID, Boolean, Integer> fieldsRow() {
		return (Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<Long, String, UUID, Boolean, Integer> valuesRow() {
		return (Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field1() {
		return TblFood.FOOD.FOOD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return TblFood.FOOD.FOOD_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UUID> field3() {
		return TblFood.FOOD.FOOD_NAME_HASH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean> field4() {
		return TblFood.FOOD.IS_ARCHIVED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field5() {
		return TblFood.FOOD.LAST_UPD_MICTIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value1() {
		return getFoodId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getFoodName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UUID value3() {
		return getFoodNameHash();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean value4() {
		return getIsArchived();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value5() {
		return getLastUpdMictime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FoodJQR value1(Long value) {
		setFoodId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FoodJQR value2(String value) {
		setFoodName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FoodJQR value3(UUID value) {
		setFoodNameHash(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FoodJQR value4(Boolean value) {
		setIsArchived(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FoodJQR value5(Integer value) {
		setLastUpdMictime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FoodJQR values(Long value1, String value2, UUID value3, Boolean value4, Integer value5) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached FoodJQR
	 */
	public FoodJQR() {
		super(TblFood.FOOD);
	}

	/**
	 * Create a detached, initialised FoodJQR
	 */
	public FoodJQR(Long foodId, String foodName, UUID foodNameHash, Boolean isArchived, Integer lastUpdMictime) {
		super(TblFood.FOOD);

		setValue(0, foodId);
		setValue(1, foodName);
		setValue(2, foodNameHash);
		setValue(3, isArchived);
		setValue(4, lastUpdMictime);
	}
}
