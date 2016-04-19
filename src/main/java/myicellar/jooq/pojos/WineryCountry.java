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
public final class WineryCountry implements Serializable {

	private static final long serialVersionUID = -839010496;

	@JsonDeserialize(using = myicellar.api.admin.jackson.IdIntegerDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdIntegerSerializer.class)
	private final Integer countryId;
	private final String  countryCode;
	private final Short   rank;
	private final String  countryNameEng;
	private final String  countryNameChs;
	private final String  countryNameCht;
	private final String  note;
	private final String  seoUrl;


	@JsonCreator
	public WineryCountry(
		@JsonProperty("countryId")      Integer countryId,
		@JsonProperty("countryCode")    String  countryCode,
		@JsonProperty("rank")           Short   rank,
		@JsonProperty("countryNameEng") String  countryNameEng,
		@JsonProperty("countryNameChs") String  countryNameChs,
		@JsonProperty("countryNameCht") String  countryNameCht,
		@JsonProperty("note")           String  note,
		@JsonProperty("seoUrl")         String  seoUrl
	) {
		this.countryId = countryId;
		this.countryCode = countryCode;
		this.rank = rank;
		this.countryNameEng = countryNameEng;
		this.countryNameChs = countryNameChs;
		this.countryNameCht = countryNameCht;
		this.note = note;
		this.seoUrl = seoUrl;
	}

	public Integer getCountryId() {
		return this.countryId;
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public Short getRank() {
		return this.rank;
	}

	public String getCountryNameEng() {
		return this.countryNameEng;
	}

	public String getCountryNameChs() {
		return this.countryNameChs;
	}

	public String getCountryNameCht() {
		return this.countryNameCht;
	}

	public String getNote() {
		return this.note;
	}

	public String getSeoUrl() {
		return this.seoUrl;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("WineryCountry (");

		sb.append(countryId);
		sb.append(", ").append(countryCode);
		sb.append(", ").append(rank);
		sb.append(", ").append(countryNameEng);
		sb.append(", ").append(countryNameChs);
		sb.append(", ").append(countryNameCht);
		sb.append(", ").append(note);
		sb.append(", ").append(seoUrl);

		sb.append(")");
		return sb.toString();
	}
}
