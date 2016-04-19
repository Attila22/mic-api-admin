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
public final class WineType implements Serializable {

	private static final long serialVersionUID = -349653545;

	@JsonDeserialize(using = myicellar.api.admin.jackson.IdShortDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdShortSerializer.class)
	private final Short   wineTypeId;
	private final String  wineTypeNameEng;
	private final String  wineTypeNameChs;
	private final String  wineTypeNameCht;
	private final Short   rank;
	private final String  seoUrl;
	private final Integer lastUpdMictime;


	@JsonCreator
	public WineType(
		@JsonProperty("wineTypeId")      Short   wineTypeId,
		@JsonProperty("wineTypeNameEng") String  wineTypeNameEng,
		@JsonProperty("wineTypeNameChs") String  wineTypeNameChs,
		@JsonProperty("wineTypeNameCht") String  wineTypeNameCht,
		@JsonProperty("rank")            Short   rank,
		@JsonProperty("seoUrl")          String  seoUrl,
		@JsonProperty("lastUpdMictime")  Integer lastUpdMictime
	) {
		this.wineTypeId = wineTypeId;
		this.wineTypeNameEng = wineTypeNameEng;
		this.wineTypeNameChs = wineTypeNameChs;
		this.wineTypeNameCht = wineTypeNameCht;
		this.rank = rank;
		this.seoUrl = seoUrl;
		this.lastUpdMictime = lastUpdMictime;
	}

	public Short getWineTypeId() {
		return this.wineTypeId;
	}

	public String getWineTypeNameEng() {
		return this.wineTypeNameEng;
	}

	public String getWineTypeNameChs() {
		return this.wineTypeNameChs;
	}

	public String getWineTypeNameCht() {
		return this.wineTypeNameCht;
	}

	public Short getRank() {
		return this.rank;
	}

	public String getSeoUrl() {
		return this.seoUrl;
	}

	public Integer getLastUpdMictime() {
		return this.lastUpdMictime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("WineType (");

		sb.append(wineTypeId);
		sb.append(", ").append(wineTypeNameEng);
		sb.append(", ").append(wineTypeNameChs);
		sb.append(", ").append(wineTypeNameCht);
		sb.append(", ").append(rank);
		sb.append(", ").append(seoUrl);
		sb.append(", ").append(lastUpdMictime);

		sb.append(")");
		return sb.toString();
	}
}
