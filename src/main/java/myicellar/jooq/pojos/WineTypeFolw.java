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
public final class WineTypeFolw implements Serializable {

	private static final long serialVersionUID = 2040656019;

	private final UUID    userId;
	@JsonDeserialize(using = myicellar.api.admin.jackson.IdShortDeserializer.class)
	@JsonSerialize(using = myicellar.api.admin.jackson.IdShortSerializer.class)
	private final Short   wineTypeId;
	private final Integer lastUpdMictime;


	@JsonCreator
	public WineTypeFolw(
		@JsonProperty("userId")         UUID    userId,
		@JsonProperty("wineTypeId")     Short   wineTypeId,
		@JsonProperty("lastUpdMictime") Integer lastUpdMictime
	) {
		this.userId = userId;
		this.wineTypeId = wineTypeId;
		this.lastUpdMictime = lastUpdMictime;
	}

	public UUID getUserId() {
		return this.userId;
	}

	public Short getWineTypeId() {
		return this.wineTypeId;
	}

	public Integer getLastUpdMictime() {
		return this.lastUpdMictime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("WineTypeFolw (");

		sb.append(userId);
		sb.append(", ").append(wineTypeId);
		sb.append(", ").append(lastUpdMictime);

		sb.append(")");
		return sb.toString();
	}
}
