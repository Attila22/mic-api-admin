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
public final class UserFavWine implements Serializable {

	private static final long serialVersionUID = 406135987;

	private final UUID    userId;
	@JsonDeserialize(using = myicellar.api.admin.jackson.IdLongDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdLongSerializer.class)
	private final Long    wineId;
	private final Short   vintageTag;
	private final Boolean isArchived;
	private final Integer lastUpdMictime;


	@JsonCreator
	public UserFavWine(
		@JsonProperty("userId")         UUID    userId,
		@JsonProperty("wineId")         Long    wineId,
		@JsonProperty("vintageTag")     Short   vintageTag,
		@JsonProperty("isArchived")     Boolean isArchived,
		@JsonProperty("lastUpdMictime") Integer lastUpdMictime
	) {
		this.userId = userId;
		this.wineId = wineId;
		this.vintageTag = vintageTag;
		this.isArchived = isArchived;
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

	public Boolean getIsArchived() {
		return this.isArchived;
	}

	public Integer getLastUpdMictime() {
		return this.lastUpdMictime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("UserFavWine (");

		sb.append(userId);
		sb.append(", ").append(wineId);
		sb.append(", ").append(vintageTag);
		sb.append(", ").append(isArchived);
		sb.append(", ").append(lastUpdMictime);

		sb.append(")");
		return sb.toString();
	}
}
