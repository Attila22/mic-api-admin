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
public final class VintageAttr implements Serializable {

	private static final long serialVersionUID = -1390858553;

	@JsonDeserialize(using = myicellar.api.admin.jackson.IdLongDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdLongSerializer.class)
	private final Long    wineId;
	private final Short   vintageTag;
	@JsonDeserialize(using = myicellar.api.admin.jackson.IdLongDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdLongSerializer.class)
	private final Long    attrId;
	private final Short   attrAssocVal;
	private final Integer lastUpdMictime;


	@JsonCreator
	public VintageAttr(
		@JsonProperty("wineId")         Long    wineId,
		@JsonProperty("vintageTag")     Short   vintageTag,
		@JsonProperty("attrId")         Long    attrId,
		@JsonProperty("attrAssocVal")   Short   attrAssocVal,
		@JsonProperty("lastUpdMictime") Integer lastUpdMictime
	) {
		this.wineId = wineId;
		this.vintageTag = vintageTag;
		this.attrId = attrId;
		this.attrAssocVal = attrAssocVal;
		this.lastUpdMictime = lastUpdMictime;
	}

	public Long getWineId() {
		return this.wineId;
	}

	public Short getVintageTag() {
		return this.vintageTag;
	}

	public Long getAttrId() {
		return this.attrId;
	}

	public Short getAttrAssocVal() {
		return this.attrAssocVal;
	}

	public Integer getLastUpdMictime() {
		return this.lastUpdMictime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("VintageAttr (");

		sb.append(wineId);
		sb.append(", ").append(vintageTag);
		sb.append(", ").append(attrId);
		sb.append(", ").append(attrAssocVal);
		sb.append(", ").append(lastUpdMictime);

		sb.append(")");
		return sb.toString();
	}
}
