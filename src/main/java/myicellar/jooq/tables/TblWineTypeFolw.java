/**
 * This class is generated by jOOQ
 */
package myicellar.jooq.tables;


import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import myicellar.jooq.Keys;
import myicellar.jooq.MicCore;
import myicellar.jooq.records.WineTypeFolwJQR;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TblWineTypeFolw extends TableImpl<WineTypeFolwJQR> {

	private static final long serialVersionUID = -783401828;

	/**
	 * The reference instance of <code>mic_core.wine_type_folw</code>
	 */
	public static final TblWineTypeFolw WINE_TYPE_FOLW = new TblWineTypeFolw();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<WineTypeFolwJQR> getRecordType() {
		return WineTypeFolwJQR.class;
	}

	/**
	 * The column <code>mic_core.wine_type_folw.user_id</code>.
	 */
	public final TableField<WineTypeFolwJQR, UUID> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

	/**
	 * The column <code>mic_core.wine_type_folw.wine_type_id</code>.
	 */
	public final TableField<WineTypeFolwJQR, Short> WINE_TYPE_ID = createField("wine_type_id", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

	/**
	 * The column <code>mic_core.wine_type_folw.last_upd_mictime</code>.
	 */
	public final TableField<WineTypeFolwJQR, Integer> LAST_UPD_MICTIME = createField("last_upd_mictime", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>mic_core.wine_type_folw</code> table reference
	 */
	public TblWineTypeFolw() {
		this("wine_type_folw", null);
	}

	/**
	 * Create an aliased <code>mic_core.wine_type_folw</code> table reference
	 */
	public TblWineTypeFolw(String alias) {
		this(alias, WINE_TYPE_FOLW);
	}

	private TblWineTypeFolw(String alias, Table<WineTypeFolwJQR> aliased) {
		this(alias, aliased, null);
	}

	private TblWineTypeFolw(String alias, Table<WineTypeFolwJQR> aliased, Field<?>[] parameters) {
		super(alias, MicCore.MIC_CORE, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<WineTypeFolwJQR> getPrimaryKey() {
		return Keys.WINE_TYPE_FOLW_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<WineTypeFolwJQR>> getKeys() {
		return Arrays.<UniqueKey<WineTypeFolwJQR>>asList(Keys.WINE_TYPE_FOLW_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TblWineTypeFolw as(String alias) {
		return new TblWineTypeFolw(alias, this);
	}

	/**
	 * Rename this table
	 */
	public TblWineTypeFolw rename(String name) {
		return new TblWineTypeFolw(name, null);
	}
}
