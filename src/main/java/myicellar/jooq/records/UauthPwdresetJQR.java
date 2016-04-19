/**
 * This class is generated by jOOQ
 */
package myicellar.jooq.records;


import java.sql.Timestamp;
import java.util.UUID;

import myicellar.jooq.tables.TblUauthPwdreset;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UauthPwdresetJQR extends TableRecordImpl<UauthPwdresetJQR> implements Record3<UUID, String, Timestamp> {

	private static final long serialVersionUID = -1280884825;

	/**
	 * Setter for <code>mic_core.uauth_pwdreset.user_id</code>.
	 */
	public void setUserId(UUID value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>mic_core.uauth_pwdreset.user_id</code>.
	 */
	public UUID getUserId() {
		return (UUID) getValue(0);
	}

	/**
	 * Setter for <code>mic_core.uauth_pwdreset.pwdreset_token</code>.
	 */
	public void setPwdresetToken(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>mic_core.uauth_pwdreset.pwdreset_token</code>.
	 */
	public String getPwdresetToken() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>mic_core.uauth_pwdreset.expiry_date</code>.
	 */
	public void setExpiryDate(Timestamp value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>mic_core.uauth_pwdreset.expiry_date</code>.
	 */
	public Timestamp getExpiryDate() {
		return (Timestamp) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<UUID, String, Timestamp> fieldsRow() {
		return (Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<UUID, String, Timestamp> valuesRow() {
		return (Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UUID> field1() {
		return TblUauthPwdreset.UAUTH_PWDRESET.USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return TblUauthPwdreset.UAUTH_PWDRESET.PWDRESET_TOKEN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field3() {
		return TblUauthPwdreset.UAUTH_PWDRESET.EXPIRY_DATE;
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
	public String value2() {
		return getPwdresetToken();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value3() {
		return getExpiryDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UauthPwdresetJQR value1(UUID value) {
		setUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UauthPwdresetJQR value2(String value) {
		setPwdresetToken(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UauthPwdresetJQR value3(Timestamp value) {
		setExpiryDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UauthPwdresetJQR values(UUID value1, String value2, Timestamp value3) {
		value1(value1);
		value2(value2);
		value3(value3);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached UauthPwdresetJQR
	 */
	public UauthPwdresetJQR() {
		super(TblUauthPwdreset.UAUTH_PWDRESET);
	}

	/**
	 * Create a detached, initialised UauthPwdresetJQR
	 */
	public UauthPwdresetJQR(UUID userId, String pwdresetToken, Timestamp expiryDate) {
		super(TblUauthPwdreset.UAUTH_PWDRESET);

		setValue(0, userId);
		setValue(1, pwdresetToken);
		setValue(2, expiryDate);
	}
}