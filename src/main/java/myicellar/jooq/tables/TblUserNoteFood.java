/**
 * This class is generated by jOOQ
 */
package myicellar.jooq.tables;


import java.util.Arrays;
import java.util.List;

import myicellar.jooq.Keys;
import myicellar.jooq.MicCore;
import myicellar.jooq.records.UserNoteFoodJQR;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TblUserNoteFood extends TableImpl<UserNoteFoodJQR> {

	private static final long serialVersionUID = 514981216;

	/**
	 * The reference instance of <code>mic_core.user_note_food</code>
	 */
	public static final TblUserNoteFood USER_NOTE_FOOD = new TblUserNoteFood();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<UserNoteFoodJQR> getRecordType() {
		return UserNoteFoodJQR.class;
	}

	/**
	 * The column <code>mic_core.user_note_food.note_id</code>.
	 */
	public final TableField<UserNoteFoodJQR, Long> NOTE_ID = createField("note_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>mic_core.user_note_food.food_id</code>.
	 */
	public final TableField<UserNoteFoodJQR, Long> FOOD_ID = createField("food_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * Create a <code>mic_core.user_note_food</code> table reference
	 */
	public TblUserNoteFood() {
		this("user_note_food", null);
	}

	/**
	 * Create an aliased <code>mic_core.user_note_food</code> table reference
	 */
	public TblUserNoteFood(String alias) {
		this(alias, USER_NOTE_FOOD);
	}

	private TblUserNoteFood(String alias, Table<UserNoteFoodJQR> aliased) {
		this(alias, aliased, null);
	}

	private TblUserNoteFood(String alias, Table<UserNoteFoodJQR> aliased, Field<?>[] parameters) {
		super(alias, MicCore.MIC_CORE, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<UserNoteFoodJQR> getPrimaryKey() {
		return Keys.USER_NOTE_FOOD_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<UserNoteFoodJQR>> getKeys() {
		return Arrays.<UniqueKey<UserNoteFoodJQR>>asList(Keys.USER_NOTE_FOOD_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TblUserNoteFood as(String alias) {
		return new TblUserNoteFood(alias, this);
	}

	/**
	 * Rename this table
	 */
	public TblUserNoteFood rename(String name) {
		return new TblUserNoteFood(name, null);
	}
}
