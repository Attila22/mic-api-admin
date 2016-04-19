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
public final class WineryRegion implements Serializable {

	private static final long serialVersionUID = -1042869151;

	@JsonDeserialize(using = myicellar.api.admin.jackson.IdIntegerDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdIntegerSerializer.class)
	private final Integer regionId;
	@JsonDeserialize(using = myicellar.api.admin.jackson.IdIntegerDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdIntegerSerializer.class)
	private final Integer regionAltId;
	@JsonDeserialize(using = myicellar.api.admin.jackson.IdIntegerDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdIntegerSerializer.class)
	private final Integer countryId;
	private final String  regionNameEng;
	private final String  regionNameChs;
	private final String  regionNameCht;
	private final String  note;
	private final UUID    regionImg;
	private final Boolean isValid;
	private final String  seoUrl;
	private final Integer lastUpdMictime;


	@JsonCreator
	public WineryRegion(
		@JsonProperty("regionId")       Integer regionId,
		@JsonProperty("regionAltId")    Integer regionAltId,
		@JsonProperty("countryId")      Integer countryId,
		@JsonProperty("regionNameEng")  String  regionNameEng,
		@JsonProperty("regionNameChs")  String  regionNameChs,
		@JsonProperty("regionNameCht")  String  regionNameCht,
		@JsonProperty("note")           String  note,
		@JsonProperty("regionImg")      UUID    regionImg,
		@JsonProperty("isValid")        Boolean isValid,
		@JsonProperty("seoUrl")         String  seoUrl,
		@JsonProperty("lastUpdMictime") Integer lastUpdMictime
	) {
		this.regionId = regionId;
		this.regionAltId = regionAltId;
		this.countryId = countryId;
		this.regionNameEng = regionNameEng;
		this.regionNameChs = regionNameChs;
		this.regionNameCht = regionNameCht;
		this.note = note;
		this.regionImg = regionImg;
		this.isValid = isValid;
		this.seoUrl = seoUrl;
		this.lastUpdMictime = lastUpdMictime;
	}

	public Integer getRegionId() {
		return this.regionId;
	}

	public Integer getRegionAltId() {
		return this.regionAltId;
	}

	public Integer getCountryId() {
		return this.countryId;
	}

	public String getRegionNameEng() {
		return this.regionNameEng;
	}

	public String getRegionNameChs() {
		return this.regionNameChs;
	}

	public String getRegionNameCht() {
		return this.regionNameCht;
	}

	public String getNote() {
		return this.note;
	}

	public UUID getRegionImg() {
		return this.regionImg;
	}

	public Boolean getIsValid() {
		return this.isValid;
	}

	public String getSeoUrl() {
		return this.seoUrl;
	}

	public Integer getLastUpdMictime() {
		return this.lastUpdMictime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("WineryRegion (");

		sb.append(regionId);
		sb.append(", ").append(regionAltId);
		sb.append(", ").append(countryId);
		sb.append(", ").append(regionNameEng);
		sb.append(", ").append(regionNameChs);
		sb.append(", ").append(regionNameCht);
		sb.append(", ").append(note);
		sb.append(", ").append(regionImg);
		sb.append(", ").append(isValid);
		sb.append(", ").append(seoUrl);
		sb.append(", ").append(lastUpdMictime);

		sb.append(")");
		return sb.toString();
	}
}
