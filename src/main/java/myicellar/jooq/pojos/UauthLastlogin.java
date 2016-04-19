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
public final class UauthLastlogin implements Serializable {

	private static final long serialVersionUID = 786506176;

	private final UUID      userId;
	@JsonDeserialize(using = myicellar.api.admin.jackson.SqlTimestampDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.SqlTimestampSerializer.class)
	private final Timestamp loginDate;


	@JsonCreator
	public UauthLastlogin(
		@JsonProperty("userId")    UUID      userId,
		@JsonProperty("loginDate") Timestamp loginDate
	) {
		this.userId = userId;
		this.loginDate = loginDate;
	}

	public UUID getUserId() {
		return this.userId;
	}

	public Timestamp getLoginDate() {
		return this.loginDate;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("UauthLastlogin (");

		sb.append(userId);
		sb.append(", ").append(loginDate);

		sb.append(")");
		return sb.toString();
	}
}
