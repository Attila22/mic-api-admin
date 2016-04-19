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
public final class UserNotification implements Serializable {

	private static final long serialVersionUID = 272215212;

	private final UUID    userId;
	@JsonDeserialize(using = myicellar.api.admin.jackson.IdLongDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdLongSerializer.class)
	private final Long    entityId;
	private final String  enittyType;
	private final String  msgBody;
	private final Integer eventMictime;


	@JsonCreator
	public UserNotification(
		@JsonProperty("userId")       UUID    userId,
		@JsonProperty("entityId")     Long    entityId,
		@JsonProperty("enittyType")   String  enittyType,
		@JsonProperty("msgBody")      String  msgBody,
		@JsonProperty("eventMictime") Integer eventMictime
	) {
		this.userId = userId;
		this.entityId = entityId;
		this.enittyType = enittyType;
		this.msgBody = msgBody;
		this.eventMictime = eventMictime;
	}

	public UUID getUserId() {
		return this.userId;
	}

	public Long getEntityId() {
		return this.entityId;
	}

	public String getEnittyType() {
		return this.enittyType;
	}

	public String getMsgBody() {
		return this.msgBody;
	}

	public Integer getEventMictime() {
		return this.eventMictime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("UserNotification (");

		sb.append(userId);
		sb.append(", ").append(entityId);
		sb.append(", ").append(enittyType);
		sb.append(", ").append(msgBody);
		sb.append(", ").append(eventMictime);

		sb.append(")");
		return sb.toString();
	}
}
