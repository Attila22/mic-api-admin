/**
 * This class is generated by jOOQ
 */
package myicellar.jooq.tables;


import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import myicellar.jooq.Keys;
import myicellar.jooq.MicCore;
import myicellar.jooq.records.VintageJQR;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TblVintage extends TableImpl<VintageJQR> {

	private static final long serialVersionUID = -1637687853;

	/**
	 * The reference instance of <code>mic_core.vintage</code>
	 */
	public static final TblVintage VINTAGE = new TblVintage();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<VintageJQR> getRecordType() {
		return VintageJQR.class;
	}

	/**
	 * The column <code>mic_core.vintage.wine_id</code>.
	 */
	public final TableField<VintageJQR, Long> WINE_ID = createField("wine_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>mic_core.vintage.vintage_tag</code>.
	 */
	public final TableField<VintageJQR, Short> VINTAGE_TAG = createField("vintage_tag", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mic_core.vintage.vintage_name</code>.
	 */
	public final TableField<VintageJQR, String> VINTAGE_NAME = createField("vintage_name", org.jooq.impl.SQLDataType.VARCHAR.length(127), this, "");

	/**
	 * The column <code>mic_core.vintage.note</code>.
	 */
	public final TableField<VintageJQR, String> NOTE = createField("note", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>mic_core.vintage.vintage_img</code>.
	 */
	public final TableField<VintageJQR, UUID> VINTAGE_IMG = createField("vintage_img", org.jooq.impl.SQLDataType.UUID, this, "");

	/**
	 * The column <code>mic_core.vintage.is_valid</code>.
	 */
	public final TableField<VintageJQR, Boolean> IS_VALID = createField("is_valid", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

	/**
	 * The column <code>mic_core.vintage.seo_url</code>.
	 */
	public final TableField<VintageJQR, String> SEO_URL = createField("seo_url", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * Create a <code>mic_core.vintage</code> table reference
	 */
	public TblVintage() {
		this("vintage", null);
	}

	/**
	 * Create an aliased <code>mic_core.vintage</code> table reference
	 */
	public TblVintage(String alias) {
		this(alias, VINTAGE);
	}

	private TblVintage(String alias, Table<VintageJQR> aliased) {
		this(alias, aliased, null);
	}

	private TblVintage(String alias, Table<VintageJQR> aliased, Field<?>[] parameters) {
		super(alias, MicCore.MIC_CORE, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<VintageJQR> getPrimaryKey() {
		return Keys.VINTAGE_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<VintageJQR>> getKeys() {
		return Arrays.<UniqueKey<VintageJQR>>asList(Keys.VINTAGE_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TblVintage as(String alias) {
		return new TblVintage(alias, this);
	}

	/**
	 * Rename this table
	 */
	public TblVintage rename(String name) {
		return new TblVintage(name, null);
	}
}
