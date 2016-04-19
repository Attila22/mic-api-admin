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
public final class Vintage implements Serializable {

	private static final long serialVersionUID = -750330635;

	@JsonDeserialize(using = myicellar.api.admin.jackson.IdLongDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdLongSerializer.class)
	private final Long    wineId;
	private final Short   vintageTag;
	private final String  vintageName;
	private final String  note;
	private final UUID    vintageImg;
	private final Boolean isValid;
	private final String  seoUrl;


	@JsonCreator
	public Vintage(
		@JsonProperty("wineId")      Long    wineId,
		@JsonProperty("vintageTag")  Short   vintageTag,
		@JsonProperty("vintageName") String  vintageName,
		@JsonProperty("note")        String  note,
		@JsonProperty("vintageImg")  UUID    vintageImg,
		@JsonProperty("isValid")     Boolean isValid,
		@JsonProperty("seoUrl")      String  seoUrl
	) {
		this.wineId = wineId;
		this.vintageTag = vintageTag;
		this.vintageName = vintageName;
		this.note = note;
		this.vintageImg = vintageImg;
		this.isValid = isValid;
		this.seoUrl = seoUrl;
	}

	public Long getWineId() {
		return this.wineId;
	}

	public Short getVintageTag() {
		return this.vintageTag;
	}

	public String getVintageName() {
		return this.vintageName;
	}

	public String getNote() {
		return this.note;
	}

	public UUID getVintageImg() {
		return this.vintageImg;
	}

	public Boolean getIsValid() {
		return this.isValid;
	}

	public String getSeoUrl() {
		return this.seoUrl;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Vintage (");

		sb.append(wineId);
		sb.append(", ").append(vintageTag);
		sb.append(", ").append(vintageName);
		sb.append(", ").append(note);
		sb.append(", ").append(vintageImg);
		sb.append(", ").append(isValid);
		sb.append(", ").append(seoUrl);

		sb.append(")");
		return sb.toString();
	}
}
