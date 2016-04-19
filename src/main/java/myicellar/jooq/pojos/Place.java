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
public final class Place implements Serializable {

	private static final long serialVersionUID = 1070008918;

	@JsonDeserialize(using = myicellar.api.admin.jackson.IdLongDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdLongSerializer.class)
	private final Long    placeId;
	private final String  placeName;
	private final UUID    placeNameHash;
	private final Boolean isArchived;
	private final Integer lastUpdMictime;


	@JsonCreator
	public Place(
		@JsonProperty("placeId")        Long    placeId,
		@JsonProperty("placeName")      String  placeName,
		@JsonProperty("placeNameHash")  UUID    placeNameHash,
		@JsonProperty("isArchived")     Boolean isArchived,
		@JsonProperty("lastUpdMictime") Integer lastUpdMictime
	) {
		this.placeId = placeId;
		this.placeName = placeName;
		this.placeNameHash = placeNameHash;
		this.isArchived = isArchived;
		this.lastUpdMictime = lastUpdMictime;
	}

	public Long getPlaceId() {
		return this.placeId;
	}

	public String getPlaceName() {
		return this.placeName;
	}

	public UUID getPlaceNameHash() {
		return this.placeNameHash;
	}

	public Boolean getIsArchived() {
		return this.isArchived;
	}

	public Integer getLastUpdMictime() {
		return this.lastUpdMictime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Place (");

		sb.append(placeId);
		sb.append(", ").append(placeName);
		sb.append(", ").append(placeNameHash);
		sb.append(", ").append(isArchived);
		sb.append(", ").append(lastUpdMictime);

		sb.append(")");
		return sb.toString();
	}
}
