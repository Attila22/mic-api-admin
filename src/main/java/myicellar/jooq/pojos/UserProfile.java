package myicellar.jooq.pojos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.UUID;


/**
 * This class is auto-generated.
 * Please DO NOT modify unless you know exactly what you are doing.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public final class UserProfile implements Serializable {

	private static final long serialVersionUID = 403512198;

	private final UUID      userId;
	@JsonDeserialize(using = myicellar.api.admin.jackson.SqlDateDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.SqlDateSerializer.class)
	private final Date      dob;
	private final Short     decadob;
	private final Short     gender;
	private final String    toastLine;
	private final String    aboutMe;
	private final String    emailMe;
	private final String    urlMe;
	private final UUID      profileBanner;
	@JsonDeserialize(using = myicellar.api.admin.jackson.IdIntegerDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdIntegerSerializer.class)
	private final Integer   cityId;
	private final String    languageCode;
	@JsonDeserialize(using = myicellar.api.admin.jackson.SqlTimestampDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.SqlTimestampSerializer.class)
	private final Timestamp signupDate;
	private final Integer   signupMictime;
	private final Integer   lastUpdMictime;
	private final Short     accState;


	@JsonCreator
	public UserProfile(
		@JsonProperty("userId")         UUID      userId,
		@JsonProperty("dob")            Date      dob,
		@JsonProperty("decadob")        Short     decadob,
		@JsonProperty("gender")         Short     gender,
		@JsonProperty("toastLine")      String    toastLine,
		@JsonProperty("aboutMe")        String    aboutMe,
		@JsonProperty("emailMe")        String    emailMe,
		@JsonProperty("urlMe")          String    urlMe,
		@JsonProperty("profileBanner")  UUID      profileBanner,
		@JsonProperty("cityId")         Integer   cityId,
		@JsonProperty("languageCode")   String    languageCode,
		@JsonProperty("signupDate")     Timestamp signupDate,
		@JsonProperty("signupMictime")  Integer   signupMictime,
		@JsonProperty("lastUpdMictime") Integer   lastUpdMictime,
		@JsonProperty("accState")       Short     accState
	) {
		this.userId = userId;
		this.dob = dob;
		this.decadob = decadob;
		this.gender = gender;
		this.toastLine = toastLine;
		this.aboutMe = aboutMe;
		this.emailMe = emailMe;
		this.urlMe = urlMe;
		this.profileBanner = profileBanner;
		this.cityId = cityId;
		this.languageCode = languageCode;
		this.signupDate = signupDate;
		this.signupMictime = signupMictime;
		this.lastUpdMictime = lastUpdMictime;
		this.accState = accState;
	}

	public UUID getUserId() {
		return this.userId;
	}

	public Date getDob() {
		return this.dob;
	}

	public Short getDecadob() {
		return this.decadob;
	}

	public Short getGender() {
		return this.gender;
	}

	public String getToastLine() {
		return this.toastLine;
	}

	public String getAboutMe() {
		return this.aboutMe;
	}

	public String getEmailMe() {
		return this.emailMe;
	}

	public String getUrlMe() {
		return this.urlMe;
	}

	public UUID getProfileBanner() {
		return this.profileBanner;
	}

	public Integer getCityId() {
		return this.cityId;
	}

	public String getLanguageCode() {
		return this.languageCode;
	}

	public Timestamp getSignupDate() {
		return this.signupDate;
	}

	public Integer getSignupMictime() {
		return this.signupMictime;
	}

	public Integer getLastUpdMictime() {
		return this.lastUpdMictime;
	}

	public Short getAccState() {
		return this.accState;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("UserProfile (");

		sb.append(userId);
		sb.append(", ").append(dob);
		sb.append(", ").append(decadob);
		sb.append(", ").append(gender);
		sb.append(", ").append(toastLine);
		sb.append(", ").append(aboutMe);
		sb.append(", ").append(emailMe);
		sb.append(", ").append(urlMe);
		sb.append(", ").append(profileBanner);
		sb.append(", ").append(cityId);
		sb.append(", ").append(languageCode);
		sb.append(", ").append(signupDate);
		sb.append(", ").append(signupMictime);
		sb.append(", ").append(lastUpdMictime);
		sb.append(", ").append(accState);

		sb.append(")");
		return sb.toString();
	}
}
