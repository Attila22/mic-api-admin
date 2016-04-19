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
public final class UserHeader implements Serializable {

	private static final long serialVersionUID = 1708884261;

	private final UUID   userId;
	private final String userName;
	private final UUID   avatarImg;


	@JsonCreator
	public UserHeader(
		@JsonProperty("userId")    UUID   userId,
		@JsonProperty("userName")  String userName,
		@JsonProperty("avatarImg") UUID   avatarImg
	) {
		this.userId = userId;
		this.userName = userName;
		this.avatarImg = avatarImg;
	}

	public UUID getUserId() {
		return this.userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public UUID getAvatarImg() {
		return this.avatarImg;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("UserHeader (");

		sb.append(userId);
		sb.append(", ").append(userName);
		sb.append(", ").append(avatarImg);

		sb.append(")");
		return sb.toString();
	}
}
