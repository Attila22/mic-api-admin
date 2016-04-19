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
public final class AtagAbnote implements Serializable {

	private static final long serialVersionUID = 1718305288;

	@JsonDeserialize(using = myicellar.api.admin.jackson.IdLongDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdLongSerializer.class)
	private final Long    atagId;
	private final String  atagValue;
	private final String  seoUrl;
	private final Integer lastUpdMictime;


	@JsonCreator
	public AtagAbnote(
		@JsonProperty("atagId")         Long    atagId,
		@JsonProperty("atagValue")      String  atagValue,
		@JsonProperty("seoUrl")         String  seoUrl,
		@JsonProperty("lastUpdMictime") Integer lastUpdMictime
	) {
		this.atagId = atagId;
		this.atagValue = atagValue;
		this.seoUrl = seoUrl;
		this.lastUpdMictime = lastUpdMictime;
	}

	public Long getAtagId() {
		return this.atagId;
	}

	public String getAtagValue() {
		return this.atagValue;
	}

	public String getSeoUrl() {
		return this.seoUrl;
	}

	public Integer getLastUpdMictime() {
		return this.lastUpdMictime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("AtagAbnote (");

		sb.append(atagId);
		sb.append(", ").append(atagValue);
		sb.append(", ").append(seoUrl);
		sb.append(", ").append(lastUpdMictime);

		sb.append(")");
		return sb.toString();
	}
}
