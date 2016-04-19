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
public final class ZyUserCellar implements Serializable {

	private static final long serialVersionUID = 591947036;

	private final UUID      userId;
	@JsonDeserialize(using = myicellar.api.admin.jackson.IdLongDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdLongSerializer.class)
	private final Long      wineId;
	private final Short     vintageTag;
	private final Short     actionType;
	@JsonDeserialize(using = myicellar.api.admin.jackson.SqlTimestampDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.SqlTimestampSerializer.class)
	private final Timestamp actionTime;
	private final UUID      actionBy;


	@JsonCreator
	public ZyUserCellar(
		@JsonProperty("userId")     UUID      userId,
		@JsonProperty("wineId")     Long      wineId,
		@JsonProperty("vintageTag") Short     vintageTag,
		@JsonProperty("actionType") Short     actionType,
		@JsonProperty("actionTime") Timestamp actionTime,
		@JsonProperty("actionBy")   UUID      actionBy
	) {
		this.userId = userId;
		this.wineId = wineId;
		this.vintageTag = vintageTag;
		this.actionType = actionType;
		this.actionTime = actionTime;
		this.actionBy = actionBy;
	}

	public UUID getUserId() {
		return this.userId;
	}

	public Long getWineId() {
		return this.wineId;
	}

	public Short getVintageTag() {
		return this.vintageTag;
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
		StringBuilder sb = new StringBuilder("ZyUserCellar (");

		sb.append(userId);
		sb.append(", ").append(wineId);
		sb.append(", ").append(vintageTag);
		sb.append(", ").append(actionType);
		sb.append(", ").append(actionTime);
		sb.append(", ").append(actionBy);

		sb.append(")");
		return sb.toString();
	}
}
