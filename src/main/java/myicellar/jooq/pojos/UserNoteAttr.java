package myicellar.jooq.pojos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;


/**
 * This class is auto-generated.
 * Please DO NOT modify unless you know exactly what you are doing.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public final class UserNoteAttr implements Serializable {

	private static final long serialVersionUID = -1044372716;

	@JsonDeserialize(using = myicellar.api.admin.jackson.IdLongDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdLongSerializer.class)
	private final Long    noteId;
	@JsonDeserialize(using = myicellar.api.admin.jackson.IdLongDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdLongSerializer.class)
	private final Long    attrId;
	private final Short   attrAssocVal;
	private final Integer lastUpdMictime;


	@JsonCreator
	public UserNoteAttr(
		@JsonProperty("noteId")         Long    noteId,
		@JsonProperty("attrId")         Long    attrId,
		@JsonProperty("attrAssocVal")   Short   attrAssocVal,
		@JsonProperty("lastUpdMictime") Integer lastUpdMictime
	) {
		this.noteId = noteId;
		this.attrId = attrId;
		this.attrAssocVal = attrAssocVal;
		this.lastUpdMictime = lastUpdMictime;
	}

	public Long getNoteId() {
		return this.noteId;
	}

	public Long getAttrId() {
		return this.attrId;
	}

	public Short getAttrAssocVal() {
		return this.attrAssocVal;
	}

	public Integer getLastUpdMictime() {
		return this.lastUpdMictime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("UserNoteAttr (");

		sb.append(noteId);
		sb.append(", ").append(attrId);
		sb.append(", ").append(attrAssocVal);
		sb.append(", ").append(lastUpdMictime);

		sb.append(")");
		return sb.toString();
	}
}
