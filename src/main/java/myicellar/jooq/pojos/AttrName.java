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
public final class AttrName implements Serializable {

	private static final long serialVersionUID = -568279551;

	@JsonDeserialize(using = myicellar.api.admin.jackson.IdShortDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdShortSerializer.class)
	private final Short  attrNameId;
	@JsonDeserialize(using = myicellar.api.admin.jackson.IdShortDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdShortSerializer.class)
	private final Short  attrNameTypeId;
	private final Short  attrNameRank;
	private final String attrNameEng;
	private final String attrNameChs;
	private final String attrNameCht;
	private final String attrNamecode;
	private final String note;
	private final String seoUrl;
	private final String extUrl;


	@JsonCreator
	public AttrName(
		@JsonProperty("attrNameId")     Short  attrNameId,
		@JsonProperty("attrNameTypeId") Short  attrNameTypeId,
		@JsonProperty("attrNameRank")   Short  attrNameRank,
		@JsonProperty("attrNameEng")    String attrNameEng,
		@JsonProperty("attrNameChs")    String attrNameChs,
		@JsonProperty("attrNameCht")    String attrNameCht,
		@JsonProperty("attrNamecode")   String attrNamecode,
		@JsonProperty("note")           String note,
		@JsonProperty("seoUrl")         String seoUrl,
		@JsonProperty("extUrl")         String extUrl
	) {
		this.attrNameId = attrNameId;
		this.attrNameTypeId = attrNameTypeId;
		this.attrNameRank = attrNameRank;
		this.attrNameEng = attrNameEng;
		this.attrNameChs = attrNameChs;
		this.attrNameCht = attrNameCht;
		this.attrNamecode = attrNamecode;
		this.note = note;
		this.seoUrl = seoUrl;
		this.extUrl = extUrl;
	}

	public Short getAttrNameId() {
		return this.attrNameId;
	}

	public Short getAttrNameTypeId() {
		return this.attrNameTypeId;
	}

	public Short getAttrNameRank() {
		return this.attrNameRank;
	}

	public String getAttrNameEng() {
		return this.attrNameEng;
	}

	public String getAttrNameChs() {
		return this.attrNameChs;
	}

	public String getAttrNameCht() {
		return this.attrNameCht;
	}

	public String getAttrNamecode() {
		return this.attrNamecode;
	}

	public String getNote() {
		return this.note;
	}

	public String getSeoUrl() {
		return this.seoUrl;
	}

	public String getExtUrl() {
		return this.extUrl;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("AttrName (");

		sb.append(attrNameId);
		sb.append(", ").append(attrNameTypeId);
		sb.append(", ").append(attrNameRank);
		sb.append(", ").append(attrNameEng);
		sb.append(", ").append(attrNameChs);
		sb.append(", ").append(attrNameCht);
		sb.append(", ").append(attrNamecode);
		sb.append(", ").append(note);
		sb.append(", ").append(seoUrl);
		sb.append(", ").append(extUrl);

		sb.append(")");
		return sb.toString();
	}
}
