/**
 * This class is generated by jOOQ
 */
package myicellar.jooq.records;


import myicellar.jooq.tables.TblUserNoteFeatured;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserNoteFeaturedJQR extends UpdatableRecordImpl<UserNoteFeaturedJQR> implements Record1<Long> {

	private static final long serialVersionUID = 2104439084;

	/**
	 * Setter for <code>mic_core.user_note_featured.note_id</code>.
	 */
	public void setNoteId(Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>mic_core.user_note_featured.note_id</code>.
	 */
	public Long getNoteId() {
		return (Long) getValue(0);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Long> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record1 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row1<Long> fieldsRow() {
		return (Row1) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row1<Long> valuesRow() {
		return (Row1) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field1() {
		return TblUserNoteFeatured.USER_NOTE_FEATURED.NOTE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value1() {
		return getNoteId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserNoteFeaturedJQR value1(Long value) {
		setNoteId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserNoteFeaturedJQR values(Long value1) {
		value1(value1);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached UserNoteFeaturedJQR
	 */
	public UserNoteFeaturedJQR() {
		super(TblUserNoteFeatured.USER_NOTE_FEATURED);
	}

	/**
	 * Create a detached, initialised UserNoteFeaturedJQR
	 */
	public UserNoteFeaturedJQR(Long noteId) {
		super(TblUserNoteFeatured.USER_NOTE_FEATURED);

		setValue(0, noteId);
	}
}