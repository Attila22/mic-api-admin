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
public final class UauthSimple implements Serializable {

	private static final long serialVersionUID = 273979134;

	private final UUID      userId;
	private final String    loginEmail;
	private final String    pwdHash;
	private final String    tlas;
	@JsonDeserialize(using = myicellar.api.admin.jackson.SqlTimestampDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.SqlTimestampSerializer.class)
	private final Timestamp lastUpdTime;


	@JsonCreator
	public UauthSimple(
		@JsonProperty("userId")      UUID      userId,
		@JsonProperty("loginEmail")  String    loginEmail,
		@JsonProperty("pwdHash")     String    pwdHash,
		@JsonProperty("tlas")        String    tlas,
		@JsonProperty("lastUpdTime") Timestamp lastUpdTime
	) {
		this.userId = userId;
		this.loginEmail = loginEmail;
		this.pwdHash = pwdHash;
		this.tlas = tlas;
		this.lastUpdTime = lastUpdTime;
	}

	public UUID getUserId() {
		return this.userId;
	}

	public String getLoginEmail() {
		return this.loginEmail;
	}

	public String getPwdHash() {
		return this.pwdHash;
	}

	public String getTlas() {
		return this.tlas;
	}

	public Timestamp getLastUpdTime() {
		return this.lastUpdTime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("UauthSimple (");

		sb.append(userId);
		sb.append(", ").append(loginEmail);
		sb.append(", ").append(pwdHash);
		sb.append(", ").append(tlas);
		sb.append(", ").append(lastUpdTime);

		sb.append(")");
		return sb.toString();
	}
}
