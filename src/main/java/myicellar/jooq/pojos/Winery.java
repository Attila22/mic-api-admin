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
public final class Winery implements Serializable {

	private static final long serialVersionUID = 1471460123;

	@JsonDeserialize(using = myicellar.api.admin.jackson.IdLongDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdLongSerializer.class)
	private final Long    wineryId;
	private final String  wineryNameUsr;
	private final String  wineryNameEng;
	private final String  wineryNameChs;
	private final String  wineryNameCht;
	@JsonDeserialize(using = myicellar.api.admin.jackson.IdIntegerDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdIntegerSerializer.class)
	private final Integer regionId;
	@JsonDeserialize(using = myicellar.api.admin.jackson.IdIntegerDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdIntegerSerializer.class)
	private final Integer regionAltId;
	@JsonDeserialize(using = myicellar.api.admin.jackson.IdIntegerDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdIntegerSerializer.class)
	private final Integer countryId;
	private final String  note;
	private final UUID    wineryImg;
	private final Boolean isValid;
	private final String  seoUrl;
	private final UUID    officialUserId;
	private final Integer lastUpdMictime;


	@JsonCreator
	public Winery(
		@JsonProperty("wineryId")       Long    wineryId,
		@JsonProperty("wineryNameUsr")  String  wineryNameUsr,
		@JsonProperty("wineryNameEng")  String  wineryNameEng,
		@JsonProperty("wineryNameChs")  String  wineryNameChs,
		@JsonProperty("wineryNameCht")  String  wineryNameCht,
		@JsonProperty("regionId")       Integer regionId,
		@JsonProperty("regionAltId")    Integer regionAltId,
		@JsonProperty("countryId")      Integer countryId,
		@JsonProperty("note")           String  note,
		@JsonProperty("wineryImg")      UUID    wineryImg,
		@JsonProperty("isValid")        Boolean isValid,
		@JsonProperty("seoUrl")         String  seoUrl,
		@JsonProperty("officialUserId") UUID    officialUserId,
		@JsonProperty("lastUpdMictime") Integer lastUpdMictime
	) {
		this.wineryId = wineryId;
		this.wineryNameUsr = wineryNameUsr;
		this.wineryNameEng = wineryNameEng;
		this.wineryNameChs = wineryNameChs;
		this.wineryNameCht = wineryNameCht;
		this.regionId = regionId;
		this.regionAltId = regionAltId;
		this.countryId = countryId;
		this.note = note;
		this.wineryImg = wineryImg;
		this.isValid = isValid;
		this.seoUrl = seoUrl;
		this.officialUserId = officialUserId;
		this.lastUpdMictime = lastUpdMictime;
	}

	public Long getWineryId() {
		return this.wineryId;
	}

	public String getWineryNameUsr() {
		return this.wineryNameUsr;
	}

	public String getWineryNameEng() {
		return this.wineryNameEng;
	}

	public String getWineryNameChs() {
		return this.wineryNameChs;
	}

	public String getWineryNameCht() {
		return this.wineryNameCht;
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

	public String getNote() {
		return this.note;
	}

	public UUID getWineryImg() {
		return this.wineryImg;
	}

	public Boolean getIsValid() {
		return this.isValid;
	}

	public String getSeoUrl() {
		return this.seoUrl;
	}

	public UUID getOfficialUserId() {
		return this.officialUserId;
	}

	public Integer getLastUpdMictime() {
		return this.lastUpdMictime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Winery (");

		sb.append(wineryId);
		sb.append(", ").append(wineryNameUsr);
		sb.append(", ").append(wineryNameEng);
		sb.append(", ").append(wineryNameChs);
		sb.append(", ").append(wineryNameCht);
		sb.append(", ").append(regionId);
		sb.append(", ").append(regionAltId);
		sb.append(", ").append(countryId);
		sb.append(", ").append(note);
		sb.append(", ").append(wineryImg);
		sb.append(", ").append(isValid);
		sb.append(", ").append(seoUrl);
		sb.append(", ").append(officialUserId);
		sb.append(", ").append(lastUpdMictime);

		sb.append(")");
		return sb.toString();
	}
}
