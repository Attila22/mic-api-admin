package myicellar.jooq.pojos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.UUID;


/**
 * This class is auto-generated.
 * Please DO NOT modify unless you know exactly what you are doing.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public final class ZyAttrAbvintage implements Serializable {

	private static final long serialVersionUID = 1615655435;

	@JsonDeserialize(using = myicellar.api.admin.jackson.IdLongDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdLongSerializer.class)
	private final Long      attrId;
	@JsonDeserialize(using = myicellar.api.admin.jackson.IdShortDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdShortSerializer.class)
	private final Short     actionNameId;
	@JsonDeserialize(using = myicellar.api.admin.jackson.SqlTimestampDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.SqlTimestampSerializer.class)
	private final Timestamp actionTime;
	private final UUID      actionBy;


	@JsonCreator
	public ZyAttrAbvintage(
		@JsonProperty("attrId")       Long      attrId,
		@JsonProperty("actionNameId") Short     actionNameId,
		@JsonProperty("actionTime")   Timestamp actionTime,
		@JsonProperty("actionBy")     UUID      actionBy
	) {
		this.attrId = attrId;
		this.actionNameId = actionNameId;
		this.actionTime = actionTime;
		this.actionBy = actionBy;
	}

	public Long getAttrId() {
		return this.attrId;
	}

	public Short getActionNameId() {
		return this.actionNameId;
	}

	public Timestamp getActionTime() {
		return this.actionTime;
	}

	public UUID getActionBy() {
		return this.actionBy;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("ZyAttrAbvintage (");

		sb.append(attrId);
		sb.append(", ").append(actionNameId);
		sb.append(", ").append(actionTime);
		sb.append(", ").append(actionBy);

		sb.append(")");
		return sb.toString();
	}
}
