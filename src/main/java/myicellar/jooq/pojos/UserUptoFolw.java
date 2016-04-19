package myicellar.jooq.pojos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.UUID;


/**
 * This class is auto-generated.
 * Please DO NOT modify unless you know exactly what you are doing.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public final class UserUptoFolw implements Serializable {

	private static final long serialVersionUID = 1790759087;

	private final UUID    followerId;
	private final UUID    followingId;
	private final Integer lastUpdMictime;


	@JsonCreator
	public UserUptoFolw(
		@JsonProperty("followerId")     UUID    followerId,
		@JsonProperty("followingId")    UUID    followingId,
		@JsonProperty("lastUpdMictime") Integer lastUpdMictime
	) {
		this.followerId = followerId;
		this.followingId = followingId;
		this.lastUpdMictime = lastUpdMictime;
	}

	public UUID getFollowerId() {
		return this.followerId;
	}

	public UUID getFollowingId() {
		return this.followingId;
	}

	public Integer getLastUpdMictime() {
		return this.lastUpdMictime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("UserUptoFolw (");

		sb.append(followerId);
		sb.append(", ").append(followingId);
		sb.append(", ").append(lastUpdMictime);

		sb.append(")");
		return sb.toString();
	}
}
