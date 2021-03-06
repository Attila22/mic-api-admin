/**
 * This class is generated by jOOQ
 */
package myicellar.jooq.tables;


import myicellar.jooq.MicCore;
import myicellar.jooq.records.UserNoteAtagJQR;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TblUserNoteAtag extends TableImpl<UserNoteAtagJQR> {

	private static final long serialVersionUID = -1284408298;

	/**
	 * The reference instance of <code>mic_core.user_note_atag</code>
	 */
	public static final TblUserNoteAtag USER_NOTE_ATAG = new TblUserNoteAtag();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<UserNoteAtagJQR> getRecordType() {
		return UserNoteAtagJQR.class;
	}

	/**
	 * The column <code>mic_core.user_note_atag.note_id</code>.
	 */
	public final TableField<UserNoteAtagJQR, Long> NOTE_ID = createField("note_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>mic_core.user_note_atag.atag_id</code>.
	 */
	public final TableField<UserNoteAtagJQR, Long> ATAG_ID = createField("atag_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>mic_core.user_note_atag.last_upd_mictime</code>.
	 */
	public final TableField<UserNoteAtagJQR, Integer> LAST_UPD_MICTIME = createField("last_upd_mictime", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>mic_core.user_note_atag</code> table reference
	 */
	public TblUserNoteAtag() {
		this("user_note_atag", null);
	}

	/**
	 * Create an aliased <code>mic_core.user_note_atag</code> table reference
	 */
	public TblUserNoteAtag(String alias) {
		this(alias, USER_NOTE_ATAG);
	}

	private TblUserNoteAtag(String alias, Table<UserNoteAtagJQR> aliased) {
		this(alias, aliased, null);
	}

	private TblUserNoteAtag(String alias, Table<UserNoteAtagJQR> aliased, Field<?>[] parameters) {
		super(alias, MicCore.MIC_CORE, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TblUserNoteAtag as(String alias) {
		return new TblUserNoteAtag(alias, this);
	}

	/**
	 * Rename this table
	 */
	public TblUserNoteAtag rename(String name) {
		return new TblUserNoteAtag(name, null);
	}
}
