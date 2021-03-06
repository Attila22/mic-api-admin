/**
 * This class is generated by jOOQ
 */
package myicellar.jooq.records;


import java.util.UUID;

import myicellar.jooq.tables.TblUserNotification;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserNotificationJQR extends UpdatableRecordImpl<UserNotificationJQR> implements Record5<UUID, Long, String, String, Integer> {

	private static final long serialVersionUID = 1081883326;

	/**
	 * Setter for <code>mic_core.user_notification.user_id</code>.
	 */
	public void setUserId(UUID value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>mic_core.user_notification.user_id</code>.
	 */
	public UUID getUserId() {
		return (UUID) getValue(0);
	}

	/**
	 * Setter for <code>mic_core.user_notification.entity_id</code>.
	 */
	public void setEntityId(Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>mic_core.user_notification.entity_id</code>.
	 */
	public Long getEntityId() {
		return (Long) getValue(1);
	}

	/**
	 * Setter for <code>mic_core.user_notification.enitty_type</code>.
	 */
	public void setEnittyType(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>mic_core.user_notification.enitty_type</code>.
	 */
	public String getEnittyType() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>mic_core.user_notification.msg_body</code>.
	 */
	public void setMsgBody(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>mic_core.user_notification.msg_body</code>.
	 */
	public String getMsgBody() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>mic_core.user_notification.event_mictime</code>.
	 */
	public void setEventMictime(Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>mic_core.user_notification.event_mictime</code>.
	 */
	public Integer getEventMictime() {
		return (Integer) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record2<UUID, Integer> key() {
		return (Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<UUID, Long, String, String, Integer> fieldsRow() {
		return (Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<UUID, Long, String, String, Integer> valuesRow() {
		return (Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UUID> field1() {
		return TblUserNotification.USER_NOTIFICATION.USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field2() {
		return TblUserNotification.USER_NOTIFICATION.ENTITY_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return TblUserNotification.USER_NOTIFICATION.ENITTY_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return TblUserNotification.USER_NOTIFICATION.MSG_BODY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field5() {
		return TblUserNotification.USER_NOTIFICATION.EVENT_MICTIME;
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
	public Long value2() {
		return getEntityId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getEnittyType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getMsgBody();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value5() {
		return getEventMictime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserNotificationJQR value1(UUID value) {
		setUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserNotificationJQR value2(Long value) {
		setEntityId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserNotificationJQR value3(String value) {
		setEnittyType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserNotificationJQR value4(String value) {
		setMsgBody(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserNotificationJQR value5(Integer value) {
		setEventMictime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserNotificationJQR values(UUID value1, Long value2, String value3, String value4, Integer value5) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached UserNotificationJQR
	 */
	public UserNotificationJQR() {
		super(TblUserNotification.USER_NOTIFICATION);
	}

	/**
	 * Create a detached, initialised UserNotificationJQR
	 */
	public UserNotificationJQR(UUID userId, Long entityId, String enittyType, String msgBody, Integer eventMictime) {
		super(TblUserNotification.USER_NOTIFICATION);

		setValue(0, userId);
		setValue(1, entityId);
		setValue(2, enittyType);
		setValue(3, msgBody);
		setValue(4, eventMictime);
	}
}
