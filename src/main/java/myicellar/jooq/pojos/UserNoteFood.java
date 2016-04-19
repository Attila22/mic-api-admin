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
public final class UserNoteFood implements Serializable {

	private static final long serialVersionUID = 1955674485;

	@JsonDeserialize(using = myicellar.api.admin.jackson.IdLongDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdLongSerializer.class)
	private final Long noteId;
	@JsonDeserialize(using = myicellar.api.admin.jackson.IdLongDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdLongSerializer.class)
	private final Long foodId;


	@JsonCreator
	public UserNoteFood(
		@JsonProperty("noteId") Long noteId,
		@JsonProperty("foodId") Long foodId
	) {
		this.noteId = noteId;
		this.foodId = foodId;
	}

	public Long getNoteId() {
		return this.noteId;
	}

	public Long getFoodId() {
		return this.foodId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("UserNoteFood (");

		sb.append(noteId);
		sb.append(", ").append(foodId);

		sb.append(")");
		return sb.toString();
	}
}
