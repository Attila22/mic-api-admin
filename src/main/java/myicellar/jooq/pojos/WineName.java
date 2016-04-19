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
public final class WineName implements Serializable {

	private static final long serialVersionUID = 1309658658;

	@JsonDeserialize(using = myicellar.api.admin.jackson.IdLongDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdLongSerializer.class)
	private final Long    wineNameId;
	@JsonDeserialize(using = myicellar.api.admin.jackson.IdLongDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdLongSerializer.class)
	private final Long    wineId;
	private final String  wineNameUsr;
	private final String  wineNameEng;
	private final String  wineNameChs;
	private final String  wineNameCht;
	private final Boolean isValid;
	private final Integer lastUpdMictime;


	@JsonCreator
	public WineName(
		@JsonProperty("wineNameId")     Long    wineNameId,
		@JsonProperty("wineId")         Long    wineId,
		@JsonProperty("wineNameUsr")    String  wineNameUsr,
		@JsonProperty("wineNameEng")    String  wineNameEng,
		@JsonProperty("wineNameChs")    String  wineNameChs,
		@JsonProperty("wineNameCht")    String  wineNameCht,
		@JsonProperty("isValid")        Boolean isValid,
		@JsonProperty("lastUpdMictime") Integer lastUpdMictime
	) {
		this.wineNameId = wineNameId;
		this.wineId = wineId;
		this.wineNameUsr = wineNameUsr;
		this.wineNameEng = wineNameEng;
		this.wineNameChs = wineNameChs;
		this.wineNameCht = wineNameCht;
		this.isValid = isValid;
		this.lastUpdMictime = lastUpdMictime;
	}

	public Long getWineNameId() {
		return this.wineNameId;
	}

	public Long getWineId() {
		return this.wineId;
	}

	public String getWineNameUsr() {
		return this.wineNameUsr;
	}

	public String getWineNameEng() {
		return this.wineNameEng;
	}

	public String getWineNameChs() {
		return this.wineNameChs;
	}

	public String getWineNameCht() {
		return this.wineNameCht;
	}

	public Boolean getIsValid() {
		return this.isValid;
	}

	public Integer getLastUpdMictime() {
		return this.lastUpdMictime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("WineName (");

		sb.append(wineNameId);
		sb.append(", ").append(wineId);
		sb.append(", ").append(wineNameUsr);
		sb.append(", ").append(wineNameEng);
		sb.append(", ").append(wineNameChs);
		sb.append(", ").append(wineNameCht);
		sb.append(", ").append(isValid);
		sb.append(", ").append(lastUpdMictime);

		sb.append(")");
		return sb.toString();
	}
}
