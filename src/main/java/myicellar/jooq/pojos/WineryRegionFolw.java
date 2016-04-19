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
public final class WineryRegionFolw implements Serializable {

	private static final long serialVersionUID = 1721814682;

	private final UUID    userId;
	@JsonDeserialize(using = myicellar.api.admin.jackson.IdIntegerDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdIntegerSerializer.class)
	private final Integer regionId;
	private final Integer lastUpdMictime;


	@JsonCreator
	public WineryRegionFolw(
		@JsonProperty("userId")         UUID    userId,
		@JsonProperty("regionId")       Integer regionId,
		@JsonProperty("lastUpdMictime") Integer lastUpdMictime
	) {
		this.userId = userId;
		this.regionId = regionId;
		this.lastUpdMictime = lastUpdMictime;
	}

	public UUID getUserId() {
		return this.userId;
	}

	public Integer getRegionId() {
		return this.regionId;
	}

	public Integer getLastUpdMictime() {
		return this.lastUpdMictime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("WineryRegionFolw (");

		sb.append(userId);
		sb.append(", ").append(regionId);
		sb.append(", ").append(lastUpdMictime);

		sb.append(")");
		return sb.toString();
	}
}
