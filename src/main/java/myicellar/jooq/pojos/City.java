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
public final class City implements Serializable {

	private static final long serialVersionUID = -49840874;

	@JsonDeserialize(using = myicellar.api.admin.jackson.IdIntegerDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdIntegerSerializer.class)
	private final Integer cityId;
	private final String  cityNameEng;
	private final String  cityNameChs;
	private final String  cityNameCht;
	private final Short   rank;
	@JsonDeserialize(using = myicellar.api.admin.jackson.IdShortDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdShortSerializer.class)
	private final Short   countryId;


	@JsonCreator
	public City(
		@JsonProperty("cityId")      Integer cityId,
		@JsonProperty("cityNameEng") String  cityNameEng,
		@JsonProperty("cityNameChs") String  cityNameChs,
		@JsonProperty("cityNameCht") String  cityNameCht,
		@JsonProperty("rank")        Short   rank,
		@JsonProperty("countryId")   Short   countryId
	) {
		this.cityId = cityId;
		this.cityNameEng = cityNameEng;
		this.cityNameChs = cityNameChs;
		this.cityNameCht = cityNameCht;
		this.rank = rank;
		this.countryId = countryId;
	}

	public Integer getCityId() {
		return this.cityId;
	}

	public String getCityNameEng() {
		return this.cityNameEng;
	}

	public String getCityNameChs() {
		return this.cityNameChs;
	}

	public String getCityNameCht() {
		return this.cityNameCht;
	}

	public Short getRank() {
		return this.rank;
	}

	public Short getCountryId() {
		return this.countryId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("City (");

		sb.append(cityId);
		sb.append(", ").append(cityNameEng);
		sb.append(", ").append(cityNameChs);
		sb.append(", ").append(cityNameCht);
		sb.append(", ").append(rank);
		sb.append(", ").append(countryId);

		sb.append(")");
		return sb.toString();
	}
}
