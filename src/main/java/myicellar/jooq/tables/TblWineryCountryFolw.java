/**
 * This class is generated by jOOQ
 */
package myicellar.jooq.tables;


import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import myicellar.jooq.Keys;
import myicellar.jooq.MicCore;
import myicellar.jooq.records.WineryCountryFolwJQR;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TblWineryCountryFolw extends TableImpl<WineryCountryFolwJQR> {

	private static final long serialVersionUID = 819297996;

	/**
	 * The reference instance of <code>mic_core.winery_country_folw</code>
	 */
	public static final TblWineryCountryFolw WINERY_COUNTRY_FOLW = new TblWineryCountryFolw();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<WineryCountryFolwJQR> getRecordType() {
		return WineryCountryFolwJQR.class;
	}

	/**
	 * The column <code>mic_core.winery_country_folw.user_id</code>.
	 */
	public final TableField<WineryCountryFolwJQR, UUID> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

	/**
	 * The column <code>mic_core.winery_country_folw.country_id</code>.
	 */
	public final TableField<WineryCountryFolwJQR, Integer> COUNTRY_ID = createField("country_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>mic_core.winery_country_folw.last_upd_mictime</code>.
	 */
	public final TableField<WineryCountryFolwJQR, Integer> LAST_UPD_MICTIME = createField("last_upd_mictime", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>mic_core.winery_country_folw</code> table reference
	 */
	public TblWineryCountryFolw() {
		this("winery_country_folw", null);
	}

	/**
	 * Create an aliased <code>mic_core.winery_country_folw</code> table reference
	 */
	public TblWineryCountryFolw(String alias) {
		this(alias, WINERY_COUNTRY_FOLW);
	}

	private TblWineryCountryFolw(String alias, Table<WineryCountryFolwJQR> aliased) {
		this(alias, aliased, null);
	}

	private TblWineryCountryFolw(String alias, Table<WineryCountryFolwJQR> aliased, Field<?>[] parameters) {
		super(alias, MicCore.MIC_CORE, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<WineryCountryFolwJQR> getPrimaryKey() {
		return Keys.WINERY_COUNTRY_FOLW_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<WineryCountryFolwJQR>> getKeys() {
		return Arrays.<UniqueKey<WineryCountryFolwJQR>>asList(Keys.WINERY_COUNTRY_FOLW_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TblWineryCountryFolw as(String alias) {
		return new TblWineryCountryFolw(alias, this);
	}

	/**
	 * Rename this table
	 */
	public TblWineryCountryFolw rename(String name) {
		return new TblWineryCountryFolw(name, null);
	}
}
