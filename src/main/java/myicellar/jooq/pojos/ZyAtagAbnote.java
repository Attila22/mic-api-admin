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
public final class ZyAtagAbnote implements Serializable {

	private static final long serialVersionUID = 1003520571;

	@JsonDeserialize(using = myicellar.api.admin.jackson.IdLongDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdLongSerializer.class)
	private final Long      atagId;
	@JsonDeserialize(using = myicellar.api.admin.jackson.IdShortDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdShortSerializer.class)
	private final Short     actionTypeId;
	@JsonDeserialize(using = myicellar.api.admin.jackson.SqlTimestampDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.SqlTimestampSerializer.class)
	private final Timestamp actionTime;
	private final UUID      actionBy;


	@JsonCreator
	public ZyAtagAbnote(
		@JsonProperty("atagId")       Long      atagId,
		@JsonProperty("actionTypeId") Short     actionTypeId,
		@JsonProperty("actionTime")   Timestamp actionTime,
		@JsonProperty("actionBy")     UUID      actionBy
	) {
		this.atagId = atagId;
		this.actionTypeId = actionTypeId;
		this.actionTime = actionTime;
		this.actionBy = actionBy;
	}

	public Long getAtagId() {
		return this.atagId;
	}

	public Short getActionTypeId() {
		return this.actionTypeId;
	}

	public Timestamp getActionTime() {
		return this.actionTime;
	}

	public UUID getActionBy() {
		return this.actionBy;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("ZyAtagAbnote (");

		sb.append(atagId);
		sb.append(", ").append(actionTypeId);
		sb.append(", ").append(actionTime);
		sb.append(", ").append(actionBy);

		sb.append(")");
		return sb.toString();
	}
}
