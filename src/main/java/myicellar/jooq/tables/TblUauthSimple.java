/**
 * This class is generated by jOOQ
 */
package myicellar.jooq.tables;


import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import myicellar.jooq.Keys;
import myicellar.jooq.MicCore;
import myicellar.jooq.records.UauthSimpleJQR;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TblUauthSimple extends TableImpl<UauthSimpleJQR> {

	private static final long serialVersionUID = -1324001354;

	/**
	 * The reference instance of <code>mic_core.uauth_simple</code>
	 */
	public static final TblUauthSimple UAUTH_SIMPLE = new TblUauthSimple();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<UauthSimpleJQR> getRecordType() {
		return UauthSimpleJQR.class;
	}

	/**
	 * The column <code>mic_core.uauth_simple.user_id</code>.
	 */
	public final TableField<UauthSimpleJQR, UUID> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

	/**
	 * The column <code>mic_core.uauth_simple.login_email</code>.
	 */
	public final TableField<UauthSimpleJQR, String> LOGIN_EMAIL = createField("login_email", org.jooq.impl.SQLDataType.VARCHAR.length(127).nullable(false), this, "");

	/**
	 * The column <code>mic_core.uauth_simple.pwd_hash</code>.
	 */
	public final TableField<UauthSimpleJQR, String> PWD_HASH = createField("pwd_hash", org.jooq.impl.SQLDataType.VARCHAR.length(63).nullable(false), this, "");

	/**
	 * The column <code>mic_core.uauth_simple.tlas</code>.
	 */
	public final TableField<UauthSimpleJQR, String> TLAS = createField("tlas", org.jooq.impl.SQLDataType.VARCHAR.length(16).nullable(false), this, "");

	/**
	 * The column <code>mic_core.uauth_simple.last_upd_mictime</code>.
	 */
	public final TableField<UauthSimpleJQR, Integer> LAST_UPD_MICTIME = createField("last_upd_mictime", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>mic_core.uauth_simple</code> table reference
	 */
	public TblUauthSimple() {
		this("uauth_simple", null);
	}

	/**
	 * Create an aliased <code>mic_core.uauth_simple</code> table reference
	 */
	public TblUauthSimple(String alias) {
		this(alias, UAUTH_SIMPLE);
	}

	private TblUauthSimple(String alias, Table<UauthSimpleJQR> aliased) {
		this(alias, aliased, null);
	}

	private TblUauthSimple(String alias, Table<UauthSimpleJQR> aliased, Field<?>[] parameters) {
		super(alias, MicCore.MIC_CORE, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<UauthSimpleJQR> getPrimaryKey() {
		return Keys.UAUTH_SIMPLE_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<UauthSimpleJQR>> getKeys() {
		return Arrays.<UniqueKey<UauthSimpleJQR>>asList(Keys.UAUTH_SIMPLE_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TblUauthSimple as(String alias) {
		return new TblUauthSimple(alias, this);
	}

	/**
	 * Rename this table
	 */
	public TblUauthSimple rename(String name) {
		return new TblUauthSimple(name, null);
	}
}
