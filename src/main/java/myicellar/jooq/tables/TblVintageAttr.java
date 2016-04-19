/**
 * This class is generated by jOOQ
 */
package myicellar.jooq.tables;


import java.util.Arrays;
import java.util.List;

import myicellar.jooq.Keys;
import myicellar.jooq.MicCore;
import myicellar.jooq.records.VintageAttrJQR;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TblVintageAttr extends TableImpl<VintageAttrJQR> {

	private static final long serialVersionUID = -238933176;

	/**
	 * The reference instance of <code>mic_core.vintage_attr</code>
	 */
	public static final TblVintageAttr VINTAGE_ATTR = new TblVintageAttr();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<VintageAttrJQR> getRecordType() {
		return VintageAttrJQR.class;
	}

	/**
	 * The column <code>mic_core.vintage_attr.wine_id</code>.
	 */
	public final TableField<VintageAttrJQR, Long> WINE_ID = createField("wine_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>mic_core.vintage_attr.vintage_tag</code>.
	 */
	public final TableField<VintageAttrJQR, Short> VINTAGE_TAG = createField("vintage_tag", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

	/**
	 * The column <code>mic_core.vintage_attr.attr_id</code>.
	 */
	public final TableField<VintageAttrJQR, Long> ATTR_ID = createField("attr_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>mic_core.vintage_attr.attr_assoc_val</code>.
	 */
	public final TableField<VintageAttrJQR, Short> ATTR_ASSOC_VAL = createField("attr_assoc_val", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * The column <code>mic_core.vintage_attr.last_upd_mictime</code>.
	 */
	public final TableField<VintageAttrJQR, Integer> LAST_UPD_MICTIME = createField("last_upd_mictime", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>mic_core.vintage_attr</code> table reference
	 */
	public TblVintageAttr() {
		this("vintage_attr", null);
	}

	/**
	 * Create an aliased <code>mic_core.vintage_attr</code> table reference
	 */
	public TblVintageAttr(String alias) {
		this(alias, VINTAGE_ATTR);
	}

	private TblVintageAttr(String alias, Table<VintageAttrJQR> aliased) {
		this(alias, aliased, null);
	}

	private TblVintageAttr(String alias, Table<VintageAttrJQR> aliased, Field<?>[] parameters) {
		super(alias, MicCore.MIC_CORE, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<VintageAttrJQR> getPrimaryKey() {
		return Keys.VINTAGE_ATTR_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<VintageAttrJQR>> getKeys() {
		return Arrays.<UniqueKey<VintageAttrJQR>>asList(Keys.VINTAGE_ATTR_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TblVintageAttr as(String alias) {
		return new TblVintageAttr(alias, this);
	}

	/**
	 * Rename this table
	 */
	public TblVintageAttr rename(String name) {
		return new TblVintageAttr(name, null);
	}
}