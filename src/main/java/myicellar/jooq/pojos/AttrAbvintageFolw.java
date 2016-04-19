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
public final class AttrAbvintageFolw implements Serializable {

	private static final long serialVersionUID = 273451220;

	private final UUID    userId;
	@JsonDeserialize(using = myicellar.api.admin.jackson.IdLongDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdLongSerializer.class)
	private final Long    attrId;
	private final Integer lastUpdMictime;


	@JsonCreator
	public AttrAbvintageFolw(
		@JsonProperty("userId")         UUID    userId,
		@JsonProperty("attrId")         Long    attrId,
		@JsonProperty("lastUpdMictime") Integer lastUpdMictime
	) {
		this.userId = userId;
		this.attrId = attrId;
		this.lastUpdMictime = lastUpdMictime;
	}

	public UUID getUserId() {
		return this.userId;
	}

	public Long getAttrId() {
		return this.attrId;
	}

	public Integer getLastUpdMictime() {
		return this.lastUpdMictime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("AttrAbvintageFolw (");

		sb.append(userId);
		sb.append(", ").append(attrId);
		sb.append(", ").append(lastUpdMictime);

		sb.append(")");
		return sb.toString();
	}
}
