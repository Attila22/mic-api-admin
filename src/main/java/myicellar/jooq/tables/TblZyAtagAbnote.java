/**
 * This class is generated by jOOQ
 */
package myicellar.jooq.tables;


import java.sql.Timestamp;
import java.util.UUID;

import myicellar.jooq.MicCore;
import myicellar.jooq.records.ZyAtagAbnoteJQR;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TblZyAtagAbnote extends TableImpl<ZyAtagAbnoteJQR> {

	private static final long serialVersionUID = 830024581;

	/**
	 * The reference instance of <code>mic_core.zy_atag_abnote</code>
	 */
	public static final TblZyAtagAbnote ZY_ATAG_ABNOTE = new TblZyAtagAbnote();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ZyAtagAbnoteJQR> getRecordType() {
		return ZyAtagAbnoteJQR.class;
	}

	/**
	 * The column <code>mic_core.zy_atag_abnote.atag_id</code>.
	 */
	public final TableField<ZyAtagAbnoteJQR, Long> ATAG_ID = createField("atag_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>mic_core.zy_atag_abnote.action_type_id</code>.
	 */
	public final TableField<ZyAtagAbnoteJQR, Short> ACTION_TYPE_ID = createField("action_type_id", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

	/**
	 * The column <code>mic_core.zy_atag_abnote.action_time</code>.
	 */
	public final TableField<ZyAtagAbnoteJQR, Timestamp> ACTION_TIME = createField("action_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mic_core.zy_atag_abnote.action_by</code>.
	 */
	public final TableField<ZyAtagAbnoteJQR, UUID> ACTION_BY = createField("action_by", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

	/**
	 * Create a <code>mic_core.zy_atag_abnote</code> table reference
	 */
	public TblZyAtagAbnote() {
		this("zy_atag_abnote", null);
	}

	/**
	 * Create an aliased <code>mic_core.zy_atag_abnote</code> table reference
	 */
	public TblZyAtagAbnote(String alias) {
		this(alias, ZY_ATAG_ABNOTE);
	}

	private TblZyAtagAbnote(String alias, Table<ZyAtagAbnoteJQR> aliased) {
		this(alias, aliased, null);
	}

	private TblZyAtagAbnote(String alias, Table<ZyAtagAbnoteJQR> aliased, Field<?>[] parameters) {
		super(alias, MicCore.MIC_CORE, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TblZyAtagAbnote as(String alias) {
		return new TblZyAtagAbnote(alias, this);
	}

	/**
	 * Rename this table
	 */
	public TblZyAtagAbnote rename(String name) {
		return new TblZyAtagAbnote(name, null);
	}
}