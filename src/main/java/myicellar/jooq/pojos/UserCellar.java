package myicellar.jooq.pojos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;
import java.util.UUID;


/**
 * This class is auto-generated.
 * Please DO NOT modify unless you know exactly what you are doing.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public final class UserCellar implements Serializable {

	private static final long serialVersionUID = -976529410;

	private final UUID    userId;
	@JsonDeserialize(using = myicellar.api.admin.jackson.IdLongDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdLongSerializer.class)
	private final Long    wineId;
	private final Short   vintageTag;
	private final Integer quantity;
	private final String  note;
	private final UUID    wineImg;
	private final Integer lastUpdMictime;


	@JsonCreator
	public UserCellar(
		@JsonProperty("userId")         UUID    userId,
		@JsonProperty("wineId")         Long    wineId,
		@JsonProperty("vintageTag")     Short   vintageTag,
		@JsonProperty("quantity")       Integer quantity,
		@JsonProperty("note")           String  note,
		@JsonProperty("wineImg")        UUID    wineImg,
		@JsonProperty("lastUpdMictime") Integer lastUpdMictime
	) {
		this.userId = userId;
		this.wineId = wineId;
		this.vintageTag = vintageTag;
		this.quantity = quantity;
		this.note = note;
		this.wineImg = wineImg;
		this.lastUpdMictime = lastUpdMictime;
	}

	public UUID getUserId() {
		return this.userId;
	}

	public Long getWineId() {
		return this.wineId;
	}

	public Short getVintageTag() {
		return this.vintageTag;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public String getNote() {
		return this.note;
	}

	public UUID getWineImg() {
		return this.wineImg;
	}

	public Integer getLastUpdMictime() {
		return this.lastUpdMictime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("UserCellar (");

		sb.append(userId);
		sb.append(", ").append(wineId);
		sb.append(", ").append(vintageTag);
		sb.append(", ").append(quantity);
		sb.append(", ").append(note);
		sb.append(", ").append(wineImg);
		sb.append(", ").append(lastUpdMictime);

		sb.append(")");
		return sb.toString();
	}
}
