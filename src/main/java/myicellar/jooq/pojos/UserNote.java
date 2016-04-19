package myicellar.jooq.pojos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;
import java.sql.Date;
import java.util.UUID;


/**
 * This class is auto-generated.
 * Please DO NOT modify unless you know exactly what you are doing.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public final class UserNote implements Serializable {

	private static final long serialVersionUID = 1667274209;

	@JsonDeserialize(using = myicellar.api.admin.jackson.IdLongDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdLongSerializer.class)
	private final Long    noteId;
	private final UUID    userId;
	@JsonDeserialize(using = myicellar.api.admin.jackson.IdLongDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdLongSerializer.class)
	private final Long    occasId;
	@JsonDeserialize(using = myicellar.api.admin.jackson.SqlDateDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.SqlDateSerializer.class)
	private final Date    noteDate;
	@JsonDeserialize(using = myicellar.api.admin.jackson.IdLongDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdLongSerializer.class)
	private final Long    wineId;
	private final Short   vintageTag;
	private final Short   rate;
	private final String  note;
	private final Boolean isArchived;
	private final UUID    noteImg;
	private final Integer lastUpdMictime;


	@JsonCreator
	public UserNote(
		@JsonProperty("noteId")         Long    noteId,
		@JsonProperty("userId")         UUID    userId,
		@JsonProperty("occasId")        Long    occasId,
		@JsonProperty("noteDate")       Date    noteDate,
		@JsonProperty("wineId")         Long    wineId,
		@JsonProperty("vintageTag")     Short   vintageTag,
		@JsonProperty("rate")           Short   rate,
		@JsonProperty("note")           String  note,
		@JsonProperty("isArchived")     Boolean isArchived,
		@JsonProperty("noteImg")        UUID    noteImg,
		@JsonProperty("lastUpdMictime") Integer lastUpdMictime
	) {
		this.noteId = noteId;
		this.userId = userId;
		this.occasId = occasId;
		this.noteDate = noteDate;
		this.wineId = wineId;
		this.vintageTag = vintageTag;
		this.rate = rate;
		this.note = note;
		this.isArchived = isArchived;
		this.noteImg = noteImg;
		this.lastUpdMictime = lastUpdMictime;
	}

	public Long getNoteId() {
		return this.noteId;
	}

	public UUID getUserId() {
		return this.userId;
	}

	public Long getOccasId() {
		return this.occasId;
	}

	public Date getNoteDate() {
		return this.noteDate;
	}

	public Long getWineId() {
		return this.wineId;
	}

	public Short getVintageTag() {
		return this.vintageTag;
	}

	public Short getRate() {
		return this.rate;
	}

	public String getNote() {
		return this.note;
	}

	public Boolean getIsArchived() {
		return this.isArchived;
	}

	public UUID getNoteImg() {
		return this.noteImg;
	}

	public Integer getLastUpdMictime() {
		return this.lastUpdMictime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("UserNote (");

		sb.append(noteId);
		sb.append(", ").append(userId);
		sb.append(", ").append(occasId);
		sb.append(", ").append(noteDate);
		sb.append(", ").append(wineId);
		sb.append(", ").append(vintageTag);
		sb.append(", ").append(rate);
		sb.append(", ").append(note);
		sb.append(", ").append(isArchived);
		sb.append(", ").append(noteImg);
		sb.append(", ").append(lastUpdMictime);

		sb.append(")");
		return sb.toString();
	}
}
