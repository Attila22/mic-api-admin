/**
 * This class is generated by jOOQ
 */
package myicellar.jooq.records;


import java.util.UUID;

import myicellar.jooq.tables.TblUserUptoFolw;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserUptoFolwJQR extends TableRecordImpl<UserUptoFolwJQR> implements Record3<UUID, UUID, Integer> {

	private static final long serialVersionUID = -1498762951;

	/**
	 * Setter for <code>mic_core.user_upto_folw.follower_id</code>.
	 */
	public void setFollowerId(UUID value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>mic_core.user_upto_folw.follower_id</code>.
	 */
	public UUID getFollowerId() {
		return (UUID) getValue(0);
	}

	/**
	 * Setter for <code>mic_core.user_upto_folw.following_id</code>.
	 */
	public void setFollowingId(UUID value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>mic_core.user_upto_folw.following_id</code>.
	 */
	public UUID getFollowingId() {
		return (UUID) getValue(1);
	}

	/**
	 * Setter for <code>mic_core.user_upto_folw.last_upd_mictime</code>.
	 */
	public void setLastUpdMictime(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>mic_core.user_upto_folw.last_upd_mictime</code>.
	 */
	public Integer getLastUpdMictime() {
		return (Integer) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<UUID, UUID, Integer> fieldsRow() {
		return (Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<UUID, UUID, Integer> valuesRow() {
		return (Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UUID> field1() {
		return TblUserUptoFolw.USER_UPTO_FOLW.FOLLOWER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UUID> field2() {
		return TblUserUptoFolw.USER_UPTO_FOLW.FOLLOWING_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return TblUserUptoFolw.USER_UPTO_FOLW.LAST_UPD_MICTIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UUID value1() {
		return getFollowerId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UUID value2() {
		return getFollowingId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getLastUpdMictime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserUptoFolwJQR value1(UUID value) {
		setFollowerId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserUptoFolwJQR value2(UUID value) {
		setFollowingId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserUptoFolwJQR value3(Integer value) {
		setLastUpdMictime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserUptoFolwJQR values(UUID value1, UUID value2, Integer value3) {
		value1(value1);
		value2(value2);
		value3(value3);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached UserUptoFolwJQR
	 */
	public UserUptoFolwJQR() {
		super(TblUserUptoFolw.USER_UPTO_FOLW);
	}

	/**
	 * Create a detached, initialised UserUptoFolwJQR
	 */
	public UserUptoFolwJQR(UUID followerId, UUID followingId, Integer lastUpdMictime) {
		super(TblUserUptoFolw.USER_UPTO_FOLW);

		setValue(0, followerId);
		setValue(1, followingId);
		setValue(2, lastUpdMictime);
	}
}