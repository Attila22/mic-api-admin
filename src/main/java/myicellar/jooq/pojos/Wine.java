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
public final class Wine implements Serializable {

	private static final long serialVersionUID = 1516557553;

	@JsonDeserialize(using = myicellar.api.admin.jackson.IdLongDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdLongSerializer.class)
	private final Long    wineId;
	@JsonDeserialize(using = myicellar.api.admin.jackson.IdShortDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdShortSerializer.class)
	private final Short   wineTypeId;
	@JsonDeserialize(using = myicellar.api.admin.jackson.IdLongDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdLongSerializer.class)
	private final Long    wineryId;
	private final String  note;
	private final UUID    wineImg;
	private final Boolean isValid;
	private final String  seoUrl;
	private final Integer lastUpdMictime;


	@JsonCreator
	public Wine(
		@JsonProperty("wineId")         Long    wineId,
		@JsonProperty("wineTypeId")     Short   wineTypeId,
		@JsonProperty("wineryId")       Long    wineryId,
		@JsonProperty("note")           String  note,
		@JsonProperty("wineImg")        UUID    wineImg,
		@JsonProperty("isValid")        Boolean isValid,
		@JsonProperty("seoUrl")         String  seoUrl,
		@JsonProperty("lastUpdMictime") Integer lastUpdMictime
	) {
		this.wineId = wineId;
		this.wineTypeId = wineTypeId;
		this.wineryId = wineryId;
		this.note = note;
		this.wineImg = wineImg;
		this.isValid = isValid;
		this.seoUrl = seoUrl;
		this.lastUpdMictime = lastUpdMictime;
	}

	public Long getWineId() {
		return this.wineId;
	}

	public Short getWineTypeId() {
		return this.wineTypeId;
	}

	public Long getWineryId() {return this.wineryId;}

	public String getNote() {
		return this.note;
	}

	public UUID getWineImg() {
		return this.wineImg;
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
		StringBuilder sb = new StringBuilder("Wine (");

		sb.append(wineId);
		sb.append(", ").append(wineTypeId);
		sb.append(", ").append(wineryId);
		sb.append(", ").append(note);
		sb.append(", ").append(wineImg);
		sb.append(", ").append(isValid);
		sb.append(", ").append(seoUrl);
		sb.append(", ").append(lastUpdMictime);

		sb.append(")");
		return sb.toString();
	}
}
