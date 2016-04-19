/**
 * This class is generated by jOOQ
 */
package myicellar.jooq.tables;


import java.sql.Timestamp;
import java.util.UUID;

import myicellar.jooq.MicCore;
import myicellar.jooq.records.ZyWineJQR;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TblZyWine extends TableImpl<ZyWineJQR> {

	private static final long serialVersionUID = -1867994370;

	/**
	 * The reference instance of <code>mic_core.zy_wine</code>
	 */
	public static final TblZyWine ZY_WINE = new TblZyWine();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ZyWineJQR> getRecordType() {
		return ZyWineJQR.class;
	}

	/**
	 * The column <code>mic_core.zy_wine.wine_id</code>.
	 */
	public final TableField<ZyWineJQR, Long> WINE_ID = createField("wine_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>mic_core.zy_wine.action_type</code>.
	 */
	public final TableField<ZyWineJQR, Short> ACTION_TYPE = createField("action_type", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

	/**
	 * The column <code>mic_core.zy_wine.action_time</code>.
	 */
	public final TableField<ZyWineJQR, Timestamp> ACTION_TIME = createField("action_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mic_core.zy_wine.action_by</code>.
	 */
	public final TableField<ZyWineJQR, UUID> ACTION_BY = createField("action_by", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

	/**
	 * Create a <code>mic_core.zy_wine</code> table reference
	 */
	public TblZyWine() {
		this("zy_wine", null);
	}

	/**
	 * Create an aliased <code>mic_core.zy_wine</code> table reference
	 */
	public TblZyWine(String alias) {
		this(alias, ZY_WINE);
	}

	private TblZyWine(String alias, Table<ZyWineJQR> aliased) {
		this(alias, aliased, null);
	}

	private TblZyWine(String alias, Table<ZyWineJQR> aliased, Field<?>[] parameters) {
		super(alias, MicCore.MIC_CORE, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TblZyWine as(String alias) {
		return new TblZyWine(alias, this);
	}

	/**
	 * Rename this table
	 */
	public TblZyWine rename(String name) {
		return new TblZyWine(name, null);
	}
}
