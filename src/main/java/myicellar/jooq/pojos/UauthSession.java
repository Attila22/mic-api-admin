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
public final class UauthSession implements Serializable {

	private static final long serialVersionUID = -103877798;

	private final UUID      userId;
	private final String    secureToken;
	private final Short     accState;
	@JsonDeserialize(using = myicellar.api.admin.jackson.SqlTimestampDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.SqlTimestampSerializer.class)
	private final Timestamp expiryDate;


	@JsonCreator
	public UauthSession(
		@JsonProperty("userId")      UUID      userId,
		@JsonProperty("secureToken") String    secureToken,
		@JsonProperty("accState")    Short     accState,
		@JsonProperty("expiryDate")  Timestamp expiryDate
	) {
		this.userId = userId;
		this.secureToken = secureToken;
		this.accState = accState;
		this.expiryDate = expiryDate;
	}

	public UUID getUserId() {
		return this.userId;
	}

	public String getSecureToken() {
		return this.secureToken;
	}

	public Short getAccState() {
		return this.accState;
	}

	public Timestamp getExpiryDate() {
		return this.expiryDate;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("UauthSession (");

		sb.append(userId);
		sb.append(", ").append(secureToken);
		sb.append(", ").append(accState);
		sb.append(", ").append(expiryDate);

		sb.append(")");
		return sb.toString();
	}
}
