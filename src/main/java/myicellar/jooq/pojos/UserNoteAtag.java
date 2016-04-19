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
public final class UserNoteAtag implements Serializable {

	private static final long serialVersionUID = -416045566;

	@JsonDeserialize(using = myicellar.api.admin.jackson.IdLongDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdLongSerializer.class)
	private final Long    noteId;
	@JsonDeserialize(using = myicellar.api.admin.jackson.IdLongDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdLongSerializer.class)
	private final Long    atagId;
	private final Integer lastUpdMictime;


	@JsonCreator
	public UserNoteAtag(
		@JsonProperty("noteId")         Long    noteId,
		@JsonProperty("atagId")         Long    atagId,
		@JsonProperty("lastUpdMictime") Integer lastUpdMictime
	) {
		this.noteId = noteId;
		this.atagId = atagId;
		this.lastUpdMictime = lastUpdMictime;
	}

	public Long getNoteId() {
		return this.noteId;
	}

	public Long getAtagId() {
		return this.atagId;
	}

	public Integer getLastUpdMictime() {
		return this.lastUpdMictime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("UserNoteAtag (");

		sb.append(noteId);
		sb.append(", ").append(atagId);
		sb.append(", ").append(lastUpdMictime);

		sb.append(")");
		return sb.toString();
	}
}
