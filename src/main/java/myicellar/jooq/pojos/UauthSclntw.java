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
public final class UauthSclntw implements Serializable {

	private static final long serialVersionUID = 1786560459;

	private final UUID      userId;
	private final Short     snType;
	private final String    snUserid;
	private final String    snToken;
	private final String    snName;
	private final String    snFirstname;
	private final String    snLastname;
	private final String    snGender;
	private final Short     snTimezone;
	private final String    snLocale;
	private final String    snLink;
	private final String    snEmail;
	private final String    snBirthday;
	private final String    snAbout;
	@JsonDeserialize(using = myicellar.api.admin.jackson.SqlTimestampDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.SqlTimestampSerializer.class)
	private final Timestamp lastUpdTime;


	@JsonCreator
	public UauthSclntw(
		@JsonProperty("userId")      UUID      userId,
		@JsonProperty("snType")      Short     snType,
		@JsonProperty("snUserid")    String    snUserid,
		@JsonProperty("snToken")     String    snToken,
		@JsonProperty("snName")      String    snName,
		@JsonProperty("snFirstname") String    snFirstname,
		@JsonProperty("snLastname")  String    snLastname,
		@JsonProperty("snGender")    String    snGender,
		@JsonProperty("snTimezone")  Short     snTimezone,
		@JsonProperty("snLocale")    String    snLocale,
		@JsonProperty("snLink")      String    snLink,
		@JsonProperty("snEmail")     String    snEmail,
		@JsonProperty("snBirthday")  String    snBirthday,
		@JsonProperty("snAbout")     String    snAbout,
		@JsonProperty("lastUpdTime") Timestamp lastUpdTime
	) {
		this.userId = userId;
		this.snType = snType;
		this.snUserid = snUserid;
		this.snToken = snToken;
		this.snName = snName;
		this.snFirstname = snFirstname;
		this.snLastname = snLastname;
		this.snGender = snGender;
		this.snTimezone = snTimezone;
		this.snLocale = snLocale;
		this.snLink = snLink;
		this.snEmail = snEmail;
		this.snBirthday = snBirthday;
		this.snAbout = snAbout;
		this.lastUpdTime = lastUpdTime;
	}

	public UUID getUserId() {
		return this.userId;
	}

	public Short getSnType() {
		return this.snType;
	}

	public String getSnUserid() {
		return this.snUserid;
	}

	public String getSnToken() {
		return this.snToken;
	}

	public String getSnName() {
		return this.snName;
	}

	public String getSnFirstname() {
		return this.snFirstname;
	}

	public String getSnLastname() {
		return this.snLastname;
	}

	public String getSnGender() {
		return this.snGender;
	}

	public Short getSnTimezone() {
		return this.snTimezone;
	}

	public String getSnLocale() {
		return this.snLocale;
	}

	public String getSnLink() {
		return this.snLink;
	}

	public String getSnEmail() {
		return this.snEmail;
	}

	public String getSnBirthday() {
		return this.snBirthday;
	}

	public String getSnAbout() {
		return this.snAbout;
	}

	public Timestamp getLastUpdTime() {
		return this.lastUpdTime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("UauthSclntw (");

		sb.append(userId);
		sb.append(", ").append(snType);
		sb.append(", ").append(snUserid);
		sb.append(", ").append(snToken);
		sb.append(", ").append(snName);
		sb.append(", ").append(snFirstname);
		sb.append(", ").append(snLastname);
		sb.append(", ").append(snGender);
		sb.append(", ").append(snTimezone);
		sb.append(", ").append(snLocale);
		sb.append(", ").append(snLink);
		sb.append(", ").append(snEmail);
		sb.append(", ").append(snBirthday);
		sb.append(", ").append(snAbout);
		sb.append(", ").append(lastUpdTime);

		sb.append(")");
		return sb.toString();
	}
}
