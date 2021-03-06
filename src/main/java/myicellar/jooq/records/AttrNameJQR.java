/**
 * This class is generated by jOOQ
 */
package myicellar.jooq.records;


import myicellar.jooq.tables.TblAttrName;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AttrNameJQR extends UpdatableRecordImpl<AttrNameJQR> implements Record10<Short, Short, Short, String, String, String, String, String, String, String> {

	private static final long serialVersionUID = -395595387;

	/**
	 * Setter for <code>mic_core.attr_name.attr_name_id</code>.
	 */
	public void setAttrNameId(Short value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>mic_core.attr_name.attr_name_id</code>.
	 */
	public Short getAttrNameId() {
		return (Short) getValue(0);
	}

	/**
	 * Setter for <code>mic_core.attr_name.attr_name_type_id</code>.
	 */
	public void setAttrNameTypeId(Short value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>mic_core.attr_name.attr_name_type_id</code>.
	 */
	public Short getAttrNameTypeId() {
		return (Short) getValue(1);
	}

	/**
	 * Setter for <code>mic_core.attr_name.attr_name_rank</code>.
	 */
	public void setAttrNameRank(Short value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>mic_core.attr_name.attr_name_rank</code>.
	 */
	public Short getAttrNameRank() {
		return (Short) getValue(2);
	}

	/**
	 * Setter for <code>mic_core.attr_name.attr_name_eng</code>.
	 */
	public void setAttrNameEng(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>mic_core.attr_name.attr_name_eng</code>.
	 */
	public String getAttrNameEng() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>mic_core.attr_name.attr_name_chs</code>.
	 */
	public void setAttrNameChs(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>mic_core.attr_name.attr_name_chs</code>.
	 */
	public String getAttrNameChs() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>mic_core.attr_name.attr_name_cht</code>.
	 */
	public void setAttrNameCht(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>mic_core.attr_name.attr_name_cht</code>.
	 */
	public String getAttrNameCht() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>mic_core.attr_name.attr_namecode</code>.
	 */
	public void setAttrNamecode(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>mic_core.attr_name.attr_namecode</code>.
	 */
	public String getAttrNamecode() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>mic_core.attr_name.note</code>.
	 */
	public void setNote(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>mic_core.attr_name.note</code>.
	 */
	public String getNote() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>mic_core.attr_name.seo_url</code>.
	 */
	public void setSeoUrl(String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>mic_core.attr_name.seo_url</code>.
	 */
	public String getSeoUrl() {
		return (String) getValue(8);
	}

	/**
	 * Setter for <code>mic_core.attr_name.ext_url</code>.
	 */
	public void setExtUrl(String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>mic_core.attr_name.ext_url</code>.
	 */
	public String getExtUrl() {
		return (String) getValue(9);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Short> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record10 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row10<Short, Short, Short, String, String, String, String, String, String, String> fieldsRow() {
		return (Row10) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row10<Short, Short, Short, String, String, String, String, String, String, String> valuesRow() {
		return (Row10) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Short> field1() {
		return TblAttrName.ATTR_NAME.ATTR_NAME_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Short> field2() {
		return TblAttrName.ATTR_NAME.ATTR_NAME_TYPE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Short> field3() {
		return TblAttrName.ATTR_NAME.ATTR_NAME_RANK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return TblAttrName.ATTR_NAME.ATTR_NAME_ENG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return TblAttrName.ATTR_NAME.ATTR_NAME_CHS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return TblAttrName.ATTR_NAME.ATTR_NAME_CHT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return TblAttrName.ATTR_NAME.ATTR_NAMECODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return TblAttrName.ATTR_NAME.NOTE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field9() {
		return TblAttrName.ATTR_NAME.SEO_URL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field10() {
		return TblAttrName.ATTR_NAME.EXT_URL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Short value1() {
		return getAttrNameId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Short value2() {
		return getAttrNameTypeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Short value3() {
		return getAttrNameRank();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getAttrNameEng();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getAttrNameChs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getAttrNameCht();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getAttrNamecode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getNote();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value9() {
		return getSeoUrl();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value10() {
		return getExtUrl();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AttrNameJQR value1(Short value) {
		setAttrNameId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AttrNameJQR value2(Short value) {
		setAttrNameTypeId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AttrNameJQR value3(Short value) {
		setAttrNameRank(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AttrNameJQR value4(String value) {
		setAttrNameEng(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AttrNameJQR value5(String value) {
		setAttrNameChs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AttrNameJQR value6(String value) {
		setAttrNameCht(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AttrNameJQR value7(String value) {
		setAttrNamecode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AttrNameJQR value8(String value) {
		setNote(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AttrNameJQR value9(String value) {
		setSeoUrl(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AttrNameJQR value10(String value) {
		setExtUrl(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AttrNameJQR values(Short value1, Short value2, Short value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		value10(value10);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached AttrNameJQR
	 */
	public AttrNameJQR() {
		super(TblAttrName.ATTR_NAME);
	}

	/**
	 * Create a detached, initialised AttrNameJQR
	 */
	public AttrNameJQR(Short attrNameId, Short attrNameTypeId, Short attrNameRank, String attrNameEng, String attrNameChs, String attrNameCht, String attrNamecode, String note, String seoUrl, String extUrl) {
		super(TblAttrName.ATTR_NAME);

		setValue(0, attrNameId);
		setValue(1, attrNameTypeId);
		setValue(2, attrNameRank);
		setValue(3, attrNameEng);
		setValue(4, attrNameChs);
		setValue(5, attrNameCht);
		setValue(6, attrNamecode);
		setValue(7, note);
		setValue(8, seoUrl);
		setValue(9, extUrl);
	}
}
