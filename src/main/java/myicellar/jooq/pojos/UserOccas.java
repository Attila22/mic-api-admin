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
public final class UserOccas implements Serializable {

	private static final long serialVersionUID = -467967654;

	@JsonDeserialize(using = myicellar.api.admin.jackson.IdLongDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdLongSerializer.class)
	private final Long    occasId;
	private final UUID    hostUserId;
	@JsonDeserialize(using = myicellar.api.admin.jackson.IdLongDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdLongSerializer.class)
	private final Long    hostPlaceId;
	@JsonDeserialize(using = myicellar.api.admin.jackson.SqlDateDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.SqlDateSerializer.class)
	private final Date    occasDate;
	private final String  occasTag;
	private final Boolean isArchived;
	private final String  seoUrl;
	private final Integer lastUpdMictime;


	@JsonCreator
	public UserOccas(
		@JsonProperty("occasId")        Long    occasId,
		@JsonProperty("hostUserId")     UUID    hostUserId,
		@JsonProperty("hostPlaceId")    Long    hostPlaceId,
		@JsonProperty("occasDate")      Date    occasDate,
		@JsonProperty("occasTag")       String  occasTag,
		@JsonProperty("isArchived")     Boolean isArchived,
		@JsonProperty("seoUrl")         String  seoUrl,
		@JsonProperty("lastUpdMictime") Integer lastUpdMictime
	) {
		this.occasId = occasId;
		this.hostUserId = hostUserId;
		this.hostPlaceId = hostPlaceId;
		this.occasDate = occasDate;
		this.occasTag = occasTag;
		this.isArchived = isArchived;
		this.seoUrl = seoUrl;
		this.lastUpdMictime = lastUpdMictime;
	}

	public Long getOccasId() {
		return this.occasId;
	}

	public UUID getHostUserId() {
		return this.hostUserId;
	}

	public Long getHostPlaceId() {
		return this.hostPlaceId;
	}

	public Date getOccasDate() {
		return this.occasDate;
	}

	public String getOccasTag() {
		return this.occasTag;
	}

	public Boolean getIsArchived() {
		return this.isArchived;
	}

	public String getSeoUrl() {
		return this.seoUrl;
	}

	public Integer getLastUpdMictime() {
		return this.lastUpdMictime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("UserOccas (");

		sb.append(occasId);
		sb.append(", ").append(hostUserId);
		sb.append(", ").append(hostPlaceId);
		sb.append(", ").append(occasDate);
		sb.append(", ").append(occasTag);
		sb.append(", ").append(isArchived);
		sb.append(", ").append(seoUrl);
		sb.append(", ").append(lastUpdMictime);

		sb.append(")");
		return sb.toString();
	}
}
