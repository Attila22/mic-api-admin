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
public final class UserCountry implements Serializable {

	private static final long serialVersionUID = -112149047;

	@JsonDeserialize(using = myicellar.api.admin.jackson.IdShortDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdShortSerializer.class)
	private final Short  countryId;
	private final String countryCode;
	private final String countryNameEng;
	private final String countryNameChs;
	private final String countryNameCht;
	private final Short  rank;


	@JsonCreator
	public UserCountry(
		@JsonProperty("countryId")      Short  countryId,
		@JsonProperty("countryCode")    String countryCode,
		@JsonProperty("countryNameEng") String countryNameEng,
		@JsonProperty("countryNameChs") String countryNameChs,
		@JsonProperty("countryNameCht") String countryNameCht,
		@JsonProperty("rank")           Short  rank
	) {
		this.countryId = countryId;
		this.countryCode = countryCode;
		this.countryNameEng = countryNameEng;
		this.countryNameChs = countryNameChs;
		this.countryNameCht = countryNameCht;
		this.rank = rank;
	}

	public Short getCountryId() {
		return this.countryId;
	}

	public String getCountryCode() {
		return this.countryCode;
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

	public Short getRank() {
		return this.rank;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("UserCountry (");

		sb.append(countryId);
		sb.append(", ").append(countryCode);
		sb.append(", ").append(countryNameEng);
		sb.append(", ").append(countryNameChs);
		sb.append(", ").append(countryNameCht);
		sb.append(", ").append(rank);

		sb.append(")");
		return sb.toString();
	}
}
