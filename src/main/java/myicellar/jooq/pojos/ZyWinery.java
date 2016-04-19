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
public final class ZyWinery implements Serializable {

	private static final long serialVersionUID = -2025463365;

	@JsonDeserialize(using = myicellar.api.admin.jackson.IdLongDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdLongSerializer.class)
	private final Long      wineryId;
	private final Short     actionType;
	@JsonDeserialize(using = myicellar.api.admin.jackson.SqlTimestampDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.SqlTimestampSerializer.class)
	private final Timestamp actionTime;
	private final UUID      actionBy;


	@JsonCreator
	public ZyWinery(
		@JsonProperty("wineryId")   Long      wineryId,
		@JsonProperty("actionType") Short     actionType,
		@JsonProperty("actionTime") Timestamp actionTime,
		@JsonProperty("actionBy")   UUID      actionBy
	) {
		this.wineryId = wineryId;
		this.actionType = actionType;
		this.actionTime = actionTime;
		this.actionBy = actionBy;
	}

	public Long getWineryId() {
		return this.wineryId;
	}

	public Short getActionType() {
		return this.actionType;
	}

	public Timestamp getActionTime() {
		return this.actionTime;
	}

	public UUID getActionBy() {
		return this.actionBy;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("ZyWinery (");

		sb.append(wineryId);
		sb.append(", ").append(actionType);
		sb.append(", ").append(actionTime);
		sb.append(", ").append(actionBy);

		sb.append(")");
		return sb.toString();
	}
}
