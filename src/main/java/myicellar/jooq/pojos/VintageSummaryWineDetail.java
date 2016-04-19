package myicellar.jooq.pojos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;

/**
 * Created by charlie on 29/2/16.
 */

@SuppressWarnings({"all", "unchecked", "rawtypes"})
public final class VintageSummaryWineDetail implements Serializable{

    private static final long serialVersionUID = -750330645;

    @JsonDeserialize(using = myicellar.api.admin.jackson.IdLongDeserializer.class)
    @JsonSerialize(using = myicellar.api.admin.jackson.IdLongSerializer.class)
    private final Long    wineId;
    @JsonDeserialize(using = myicellar.api.admin.jackson.IdShortDeserializer.class)
    @JsonSerialize(using = myicellar.api.admin.jackson.IdShortSerializer.class)
    private final Short   vintageTag;
    private final String  vintageName;
    private final Boolean isValid;


    @JsonCreator
    public VintageSummaryWineDetail(
            @JsonProperty("wineId")      Long    wineId,
            @JsonProperty("vintageTag")  Short   vintageTag,
            @JsonProperty("vintageName") String  vintageName,
            @JsonProperty("isValid")     Boolean isValid
    ) {
        this.wineId = wineId;
        this.vintageTag = vintageTag;
        this.vintageName = vintageName;
        this.isValid = isValid;
    }

    public Long getWineId() {
        return this.wineId;
    }

    public Short getVintageTag() {
        return this.vintageTag;
    }

    public String getVintageName() {
        return this.vintageName;
    }


    public Boolean getIsValid() {
        return this.isValid;
    }

    @Override
    public String toString() {
        return "VintageSummaryWineDetail{" +
                "wineId=" + wineId +
                ", vintageTag=" + vintageTag +
                ", vintageName='" + vintageName + '\'' +
                ", isValid=" + isValid +
                '}';
    }
}

