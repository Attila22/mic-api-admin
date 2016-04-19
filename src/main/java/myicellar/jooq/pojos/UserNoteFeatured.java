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
public final class UserNoteFeatured implements Serializable {

	private static final long serialVersionUID = -2016785619;

	@JsonDeserialize(using = myicellar.api.admin.jackson.IdLongDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdLongSerializer.class)
	private final Long noteId;


	@JsonCreator
	public UserNoteFeatured(
		@JsonProperty("noteId") Long noteId
	) {
		this.noteId = noteId;
	}

	public Long getNoteId() {
		return this.noteId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("UserNoteFeatured (");

		sb.append(noteId);

		sb.append(")");
		return sb.toString();
	}
}
