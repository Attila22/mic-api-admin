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
public final class UauthPwdreset implements Serializable {

	private static final long serialVersionUID = -1874771790;

	private final UUID      userId;
	private final String    pwdresetToken;
	@JsonDeserialize(using = myicellar.api.admin.jackson.SqlTimestampDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.SqlTimestampSerializer.class)
	private final Timestamp expiryDate;


	@JsonCreator
	public UauthPwdreset(
		@JsonProperty("userId")        UUID      userId,
		@JsonProperty("pwdresetToken") String    pwdresetToken,
		@JsonProperty("expiryDate")    Timestamp expiryDate
	) {
		this.userId = userId;
		this.pwdresetToken = pwdresetToken;
		this.expiryDate = expiryDate;
	}

	public UUID getUserId() {
		return this.userId;
	}

	public String getPwdresetToken() {
		return this.pwdresetToken;
	}

	public Timestamp getExpiryDate() {
		return this.expiryDate;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("UauthPwdreset (");

		sb.append(userId);
		sb.append(", ").append(pwdresetToken);
		sb.append(", ").append(expiryDate);

		sb.append(")");
		return sb.toString();
	}
}
