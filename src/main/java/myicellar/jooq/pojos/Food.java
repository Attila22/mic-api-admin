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
public final class Food implements Serializable {

	private static final long serialVersionUID = 159822727;

	@JsonDeserialize(using = myicellar.api.admin.jackson.IdLongDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdLongSerializer.class)
	private final Long    foodId;
	private final String  foodName;
	private final UUID    foodNameHash;
	private final Boolean isArchived;
	private final Integer lastUpdMictime;


	@JsonCreator
	public Food(
		@JsonProperty("foodId")         Long    foodId,
		@JsonProperty("foodName")       String  foodName,
		@JsonProperty("foodNameHash")   UUID    foodNameHash,
		@JsonProperty("isArchived")     Boolean isArchived,
		@JsonProperty("lastUpdMictime") Integer lastUpdMictime
	) {
		this.foodId = foodId;
		this.foodName = foodName;
		this.foodNameHash = foodNameHash;
		this.isArchived = isArchived;
		this.lastUpdMictime = lastUpdMictime;
	}

	public Long getFoodId() {
		return this.foodId;
	}

	public String getFoodName() {
		return this.foodName;
	}

	public UUID getFoodNameHash() {
		return this.foodNameHash;
	}

	public Boolean getIsArchived() {
		return this.isArchived;
	}

	public Integer getLastUpdMictime() {
		return this.lastUpdMictime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Food (");

		sb.append(foodId);
		sb.append(", ").append(foodName);
		sb.append(", ").append(foodNameHash);
		sb.append(", ").append(isArchived);
		sb.append(", ").append(lastUpdMictime);

		sb.append(")");
		return sb.toString();
	}
}
