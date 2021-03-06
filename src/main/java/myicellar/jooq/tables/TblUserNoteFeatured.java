/**
 * This class is generated by jOOQ
 */
package myicellar.jooq.tables;


import java.util.Arrays;
import java.util.List;

import myicellar.jooq.Keys;
import myicellar.jooq.MicCore;
import myicellar.jooq.records.UserNoteFeaturedJQR;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TblUserNoteFeatured extends TableImpl<UserNoteFeaturedJQR> {

	private static final long serialVersionUID = -1706468989;

	/**
	 * The reference instance of <code>mic_core.user_note_featured</code>
	 */
	public static final TblUserNoteFeatured USER_NOTE_FEATURED = new TblUserNoteFeatured();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<UserNoteFeaturedJQR> getRecordType() {
		return UserNoteFeaturedJQR.class;
	}

	/**
	 * The column <code>mic_core.user_note_featured.note_id</code>.
	 */
	public final TableField<UserNoteFeaturedJQR, Long> NOTE_ID = createField("note_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * Create a <code>mic_core.user_note_featured</code> table reference
	 */
	public TblUserNoteFeatured() {
		this("user_note_featured", null);
	}

	/**
	 * Create an aliased <code>mic_core.user_note_featured</code> table reference
	 */
	public TblUserNoteFeatured(String alias) {
		this(alias, USER_NOTE_FEATURED);
	}

	private TblUserNoteFeatured(String alias, Table<UserNoteFeaturedJQR> aliased) {
		this(alias, aliased, null);
	}

	private TblUserNoteFeatured(String alias, Table<UserNoteFeaturedJQR> aliased, Field<?>[] parameters) {
		super(alias, MicCore.MIC_CORE, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<UserNoteFeaturedJQR> getPrimaryKey() {
		return Keys.USER_NOTE_FEATURED_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<UserNoteFeaturedJQR>> getKeys() {
		return Arrays.<UniqueKey<UserNoteFeaturedJQR>>asList(Keys.USER_NOTE_FEATURED_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TblUserNoteFeatured as(String alias) {
		return new TblUserNoteFeatured(alias, this);
	}

	/**
	 * Rename this table
	 */
	public TblUserNoteFeatured rename(String name) {
		return new TblUserNoteFeatured(name, null);
	}
}
