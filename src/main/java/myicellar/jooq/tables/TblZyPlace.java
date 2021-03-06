/**
 * This class is generated by jOOQ
 */
package myicellar.jooq.tables;


import java.sql.Timestamp;
import java.util.UUID;

import myicellar.jooq.MicCore;
import myicellar.jooq.records.ZyPlaceJQR;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TblZyPlace extends TableImpl<ZyPlaceJQR> {

	private static final long serialVersionUID = 400364226;

	/**
	 * The reference instance of <code>mic_core.zy_place</code>
	 */
	public static final TblZyPlace ZY_PLACE = new TblZyPlace();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ZyPlaceJQR> getRecordType() {
		return ZyPlaceJQR.class;
	}

	/**
	 * The column <code>mic_core.zy_place.place_id</code>.
	 */
	public final TableField<ZyPlaceJQR, Long> PLACE_ID = createField("place_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>mic_core.zy_place.action_type</code>.
	 */
	public final TableField<ZyPlaceJQR, Short> ACTION_TYPE = createField("action_type", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

	/**
	 * The column <code>mic_core.zy_place.action_time</code>.
	 */
	public final TableField<ZyPlaceJQR, Timestamp> ACTION_TIME = createField("action_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mic_core.zy_place.action_by</code>.
	 */
	public final TableField<ZyPlaceJQR, UUID> ACTION_BY = createField("action_by", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

	/**
	 * Create a <code>mic_core.zy_place</code> table reference
	 */
	public TblZyPlace() {
		this("zy_place", null);
	}

	/**
	 * Create an aliased <code>mic_core.zy_place</code> table reference
	 */
	public TblZyPlace(String alias) {
		this(alias, ZY_PLACE);
	}

	private TblZyPlace(String alias, Table<ZyPlaceJQR> aliased) {
		this(alias, aliased, null);
	}

	private TblZyPlace(String alias, Table<ZyPlaceJQR> aliased, Field<?>[] parameters) {
		super(alias, MicCore.MIC_CORE, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TblZyPlace as(String alias) {
		return new TblZyPlace(alias, this);
	}

	/**
	 * Rename this table
	 */
	public TblZyPlace rename(String name) {
		return new TblZyPlace(name, null);
	}
}
