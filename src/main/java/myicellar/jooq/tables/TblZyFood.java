/**
 * This class is generated by jOOQ
 */
package myicellar.jooq.tables;


import java.sql.Timestamp;
import java.util.UUID;

import myicellar.jooq.MicCore;
import myicellar.jooq.records.ZyFoodJQR;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TblZyFood extends TableImpl<ZyFoodJQR> {

	private static final long serialVersionUID = -701750266;

	/**
	 * The reference instance of <code>mic_core.zy_food</code>
	 */
	public static final TblZyFood ZY_FOOD = new TblZyFood();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ZyFoodJQR> getRecordType() {
		return ZyFoodJQR.class;
	}

	/**
	 * The column <code>mic_core.zy_food.food_id</code>.
	 */
	public final TableField<ZyFoodJQR, Long> FOOD_ID = createField("food_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>mic_core.zy_food.action_type</code>.
	 */
	public final TableField<ZyFoodJQR, Short> ACTION_TYPE = createField("action_type", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

	/**
	 * The column <code>mic_core.zy_food.action_time</code>.
	 */
	public final TableField<ZyFoodJQR, Timestamp> ACTION_TIME = createField("action_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mic_core.zy_food.action_by</code>.
	 */
	public final TableField<ZyFoodJQR, UUID> ACTION_BY = createField("action_by", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

	/**
	 * Create a <code>mic_core.zy_food</code> table reference
	 */
	public TblZyFood() {
		this("zy_food", null);
	}

	/**
	 * Create an aliased <code>mic_core.zy_food</code> table reference
	 */
	public TblZyFood(String alias) {
		this(alias, ZY_FOOD);
	}

	private TblZyFood(String alias, Table<ZyFoodJQR> aliased) {
		this(alias, aliased, null);
	}

	private TblZyFood(String alias, Table<ZyFoodJQR> aliased, Field<?>[] parameters) {
		super(alias, MicCore.MIC_CORE, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TblZyFood as(String alias) {
		return new TblZyFood(alias, this);
	}

	/**
	 * Rename this table
	 */
	public TblZyFood rename(String name) {
		return new TblZyFood(name, null);
	}
}
