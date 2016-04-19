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
public final class ZyWineryRegion implements Serializable {

	private static final long serialVersionUID = 149802917;

	@JsonDeserialize(using = myicellar.api.admin.jackson.IdIntegerDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdIntegerSerializer.class)
	private final Integer   regionId;
	private final Short     actionType;
	@JsonDeserialize(using = myicellar.api.admin.jackson.SqlTimestampDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.SqlTimestampSerializer.class)
	private final Timestamp actionTime;
	private final UUID      actionBy;


	@JsonCreator
	public ZyWineryRegion(
		@JsonProperty("regionId")   Integer   regionId,
		@JsonProperty("actionType") Short     actionType,
		@JsonProperty("actionTime") Timestamp actionTime,
		@JsonProperty("actionBy")   UUID      actionBy
	) {
		this.regionId = regionId;
		this.actionType = actionType;
		this.actionTime = actionTime;
		this.actionBy = actionBy;
	}

	public Integer getRegionId() {
		return this.regionId;
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
		StringBuilder sb = new StringBuilder("ZyWineryRegion (");

		sb.append(regionId);
		sb.append(", ").append(actionType);
		sb.append(", ").append(actionTime);
		sb.append(", ").append(actionBy);

		sb.append(")");
		return sb.toString();
	}
}
