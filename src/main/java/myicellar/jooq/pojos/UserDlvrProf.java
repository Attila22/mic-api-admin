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
public final class UserDlvrProf implements Serializable {

	private static final long serialVersionUID = 1660298772;

	@JsonDeserialize(using = myicellar.api.admin.jackson.IdLongDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdLongSerializer.class)
	private final Long    dlvrId;
	private final UUID    userId;
	private final String  isDefault;
	private final String  firstname;
	private final String  lastname;
	private final String  address;
	private final String  country;
	private final String  contactTel;
	private final Integer lastUpdMictime;


	@JsonCreator
	public UserDlvrProf(
		@JsonProperty("dlvrId")         Long    dlvrId,
		@JsonProperty("userId")         UUID    userId,
		@JsonProperty("isDefault")      String  isDefault,
		@JsonProperty("firstname")      String  firstname,
		@JsonProperty("lastname")       String  lastname,
		@JsonProperty("address")        String  address,
		@JsonProperty("country")        String  country,
		@JsonProperty("contactTel")     String  contactTel,
		@JsonProperty("lastUpdMictime") Integer lastUpdMictime
	) {
		this.dlvrId = dlvrId;
		this.userId = userId;
		this.isDefault = isDefault;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.country = country;
		this.contactTel = contactTel;
		this.lastUpdMictime = lastUpdMictime;
	}

	public Long getDlvrId() {
		return this.dlvrId;
	}

	public UUID getUserId() {
		return this.userId;
	}

	public String getIsDefault() {
		return this.isDefault;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public String getAddress() {
		return this.address;
	}

	public String getCountry() {
		return this.country;
	}

	public String getContactTel() {
		return this.contactTel;
	}

	public Integer getLastUpdMictime() {
		return this.lastUpdMictime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("UserDlvrProf (");

		sb.append(dlvrId);
		sb.append(", ").append(userId);
		sb.append(", ").append(isDefault);
		sb.append(", ").append(firstname);
		sb.append(", ").append(lastname);
		sb.append(", ").append(address);
		sb.append(", ").append(country);
		sb.append(", ").append(contactTel);
		sb.append(", ").append(lastUpdMictime);

		sb.append(")");
		return sb.toString();
	}
}
