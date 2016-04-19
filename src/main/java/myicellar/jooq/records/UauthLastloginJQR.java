/**
 * This class is generated by jOOQ
 */
package myicellar.jooq.records;


import java.sql.Timestamp;
import java.util.UUID;

import myicellar.jooq.tables.TblUauthLastlogin;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UauthLastloginJQR extends TableRecordImpl<UauthLastloginJQR> implements Record2<UUID, Timestamp> {

	private static final long serialVersionUID = 999995739;

	/**
	 * Setter for <code>mic_core.uauth_lastlogin.user_id</code>.
	 */
	public void setUserId(UUID value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>mic_core.uauth_lastlogin.user_id</code>.
	 */
	public UUID getUserId() {
		return (UUID) getValue(0);
	}

	/**
	 * Setter for <code>mic_core.uauth_lastlogin.login_date</code>.
	 */
	public void setLoginDate(Timestamp value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>mic_core.uauth_lastlogin.login_date</code>.
	 */
	public Timestamp getLoginDate() {
		return (Timestamp) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<UUID, Timestamp> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<UUID, Timestamp> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UUID> field1() {
		return TblUauthLastlogin.UAUTH_LASTLOGIN.USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field2() {
		return TblUauthLastlogin.UAUTH_LASTLOGIN.LOGIN_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UUID value1() {
		return getUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value2() {
		return getLoginDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UauthLastloginJQR value1(UUID value) {
		setUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UauthLastloginJQR value2(Timestamp value) {
		setLoginDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UauthLastloginJQR values(UUID value1, Timestamp value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached UauthLastloginJQR
	 */
	public UauthLastloginJQR() {
		super(TblUauthLastlogin.UAUTH_LASTLOGIN);
	}

	/**
	 * Create a detached, initialised UauthLastloginJQR
	 */
	public UauthLastloginJQR(UUID userId, Timestamp loginDate) {
		super(TblUauthLastlogin.UAUTH_LASTLOGIN);

		setValue(0, userId);
		setValue(1, loginDate);
	}
}