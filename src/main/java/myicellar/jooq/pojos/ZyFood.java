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
public final class ZyFood implements Serializable {

	private static final long serialVersionUID = 844516233;

	@JsonDeserialize(using = myicellar.api.admin.jackson.IdLongDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdLongSerializer.class)
	private final Long      foodId;
	private final Short     actionType;
	@JsonDeserialize(using = myicellar.api.admin.jackson.SqlTimestampDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.SqlTimestampSerializer.class)
	private final Timestamp actionTime;
	private final UUID      actionBy;


	@JsonCreator
	public ZyFood(
		@JsonProperty("foodId")     Long      foodId,
		@JsonProperty("actionType") Short     actionType,
		@JsonProperty("actionTime") Timestamp actionTime,
		@JsonProperty("actionBy")   UUID      actionBy
	) {
		this.foodId = foodId;
		this.actionType = actionType;
		this.actionTime = actionTime;
		this.actionBy = actionBy;
	}

	public Long getFoodId() {
		return this.foodId;
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
		StringBuilder sb = new StringBuilder("ZyFood (");

		sb.append(foodId);
		sb.append(", ").append(actionType);
		sb.append(", ").append(actionTime);
		sb.append(", ").append(actionBy);

		sb.append(")");
		return sb.toString();
	}
}