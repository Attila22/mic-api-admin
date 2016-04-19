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
public final class AttrAbnote implements Serializable {

	private static final long serialVersionUID = -1469077160;

	@JsonDeserialize(using = myicellar.api.admin.jackson.IdLongDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdLongSerializer.class)
	private final Long    attrId;
	@JsonDeserialize(using = myicellar.api.admin.jackson.IdShortDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdShortSerializer.class)
	private final Short   attrNameId;
	private final String  attrValUsr;
	private final String  attrValEng;
	private final String  attrValChs;
	private final String  attrValCht;
	private final Boolean isValid;
	private final Integer lastUpdMictime;


	@JsonCreator
	public AttrAbnote(
		@JsonProperty("attrId")         Long    attrId,
		@JsonProperty("attrNameId")     Short   attrNameId,
		@JsonProperty("attrValUsr")     String  attrValUsr,
		@JsonProperty("attrValEng")     String  attrValEng,
		@JsonProperty("attrValChs")     String  attrValChs,
		@JsonProperty("attrValCht")     String  attrValCht,
		@JsonProperty("isValid")        Boolean isValid,
		@JsonProperty("lastUpdMictime") Integer lastUpdMictime
	) {
		this.attrId = attrId;
		this.attrNameId = attrNameId;
		this.attrValUsr = attrValUsr;
		this.attrValEng = attrValEng;
		this.attrValChs = attrValChs;
		this.attrValCht = attrValCht;
		this.isValid = isValid;
		this.lastUpdMictime = lastUpdMictime;
	}

	public Long getAttrId() {
		return this.attrId;
	}

	public Short getAttrNameId() {
		return this.attrNameId;
	}

	public String getAttrValUsr() {
		return this.attrValUsr;
	}

	public String getAttrValEng() {
		return this.attrValEng;
	}

	public String getAttrValChs() {
		return this.attrValChs;
	}

	public String getAttrValCht() {
		return this.attrValCht;
	}

	public Boolean getIsValid() {
		return this.isValid;
	}

	public Integer getLastUpdMictime() {
		return this.lastUpdMictime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("AttrAbnote (");

		sb.append(attrId);
		sb.append(", ").append(attrNameId);
		sb.append(", ").append(attrValUsr);
		sb.append(", ").append(attrValEng);
		sb.append(", ").append(attrValChs);
		sb.append(", ").append(attrValCht);
		sb.append(", ").append(isValid);
		sb.append(", ").append(lastUpdMictime);

		sb.append(")");
		return sb.toString();
	}
}
