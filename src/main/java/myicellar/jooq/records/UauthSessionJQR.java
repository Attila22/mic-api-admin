/**
 * This class is generated by jOOQ
 */
package myicellar.jooq.records;


import java.sql.Timestamp;
import java.util.UUID;

import myicellar.jooq.tables.TblUauthSession;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UauthSessionJQR extends UpdatableRecordImpl<UauthSessionJQR> implements Record4<UUID, String, Boolean, Timestamp> {

	private static final long serialVersionUID = -708952717;

	/**
	 * Setter for <code>mic_core.uauth_session.user_id</code>.
	 */
	public void setUserId(UUID value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>mic_core.uauth_session.user_id</code>.
	 */
	public UUID getUserId() {
		return (UUID) getValue(0);
	}

	/**
	 * Setter for <code>mic_core.uauth_session.secure_token</code>.
	 */
	public void setSecureToken(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>mic_core.uauth_session.secure_token</code>.
	 */
	public String getSecureToken() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>mic_core.uauth_session.is_activated</code>.
	 */
	public void setIsActivated(Boolean value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>mic_core.uauth_session.is_activated</code>.
	 */
	public Boolean getIsActivated() {
		return (Boolean) getValue(2);
	}

	/**
	 * Setter for <code>mic_core.uauth_session.expiry_date</code>.
	 */
	public void setExpiryDate(Timestamp value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>mic_core.uauth_session.expiry_date</code>.
	 */
	public Timestamp getExpiryDate() {
		return (Timestamp) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<UUID> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<UUID, String, Boolean, Timestamp> fieldsRow() {
		return (Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<UUID, String, Boolean, Timestamp> valuesRow() {
		return (Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UUID> field1() {
		return TblUauthSession.UAUTH_SESSION.USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return TblUauthSession.UAUTH_SESSION.SECURE_TOKEN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean> field3() {
		return TblUauthSession.UAUTH_SESSION.IS_ACTIVATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field4() {
		return TblUauthSession.UAUTH_SESSION.EXPIRY_DATE;
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
		return getSecureToken();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean value3() {
		return getIsActivated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value4() {
		return getExpiryDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UauthSessionJQR value1(UUID value) {
		setUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UauthSessionJQR value2(String value) {
		setSecureToken(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UauthSessionJQR value3(Boolean value) {
		setIsActivated(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UauthSessionJQR value4(Timestamp value) {
		setExpiryDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UauthSessionJQR values(UUID value1, String value2, Boolean value3, Timestamp value4) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached UauthSessionJQR
	 */
	public UauthSessionJQR() {
		super(TblUauthSession.UAUTH_SESSION);
	}

	/**
	 * Create a detached, initialised UauthSessionJQR
	 */
	public UauthSessionJQR(UUID userId, String secureToken, Boolean isActivated, Timestamp expiryDate) {
		super(TblUauthSession.UAUTH_SESSION);

		setValue(0, userId);
		setValue(1, secureToken);
		setValue(2, isActivated);
		setValue(3, expiryDate);
	}
}
