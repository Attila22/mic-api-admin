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
public final class UserOccasWith implements Serializable {

	private static final long serialVersionUID = -524417062;

	@JsonDeserialize(using = myicellar.api.admin.jackson.IdLongDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdLongSerializer.class)
	private final Long occasId;
	private final UUID userId;


	@JsonCreator
	public UserOccasWith(
		@JsonProperty("occasId") Long occasId,
		@JsonProperty("userId")  UUID userId
	) {
		this.occasId = occasId;
		this.userId = userId;
	}

	public Long getOccasId() {
		return this.occasId;
	}

	public UUID getUserId() {
		return this.userId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("UserOccasWith (");

		sb.append(occasId);
		sb.append(", ").append(userId);

		sb.append(")");
		return sb.toString();
	}
}
