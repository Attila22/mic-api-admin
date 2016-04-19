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
public final class WineryCountryFolw implements Serializable {

	private static final long serialVersionUID = -1489591164;

	private final UUID    userId;
	@JsonDeserialize(using = myicellar.api.admin.jackson.IdIntegerDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdIntegerSerializer.class)
	private final Integer countryId;
	private final Integer lastUpdMictime;


	@JsonCreator
	public WineryCountryFolw(
		@JsonProperty("userId")         UUID    userId,
		@JsonProperty("countryId")      Integer countryId,
		@JsonProperty("lastUpdMictime") Integer lastUpdMictime
	) {
		this.userId = userId;
		this.countryId = countryId;
		this.lastUpdMictime = lastUpdMictime;
	}

	public UUID getUserId() {
		return this.userId;
	}

	public Integer getCountryId() {
		return this.countryId;
	}

	public Integer getLastUpdMictime() {
		return this.lastUpdMictime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("WineryCountryFolw (");

		sb.append(userId);
		sb.append(", ").append(countryId);
		sb.append(", ").append(lastUpdMictime);

		sb.append(")");
		return sb.toString();
	}
}
