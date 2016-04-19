package myicellar.jooq.pojos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;

/**
 * Created by charlie on 14/3/16.
 */

@SuppressWarnings({"all", "unchecked", "rawtypes"})
public final class VintageJoin implements Serializable {

        private static final long serialVersionUID = -1390858560;
        @JsonDeserialize(using = myicellar.api.admin.jackson.IdLongDeserializer.class)
        @JsonSerialize(using = myicellar.api.admin.jackson.IdLongSerializer.class)
        private final Long    wineId;
        @JsonDeserialize(using = myicellar.api.admin.jackson.IdShortDeserializer.class)
        @JsonSerialize(using = myicellar.api.admin.jackson.IdShortSerializer.class)
        private final Short   vintageTag;
        private final String  vintageName;
        private final Boolean isValid;
        @JsonDeserialize(using = myicellar.api.admin.jackson.IdShortDeserializer.class)
        @JsonSerialize(using = myicellar.api.admin.jackson.IdShortSerializer.class)
        private final Short   attrAssocVal;
        @JsonDeserialize(using = myicellar.api.admin.jackson.IdLongDeserializer.class)
        @JsonSerialize(using = myicellar.api.admin.jackson.IdLongSerializer.class)
        private final Long    attrId;
        @JsonDeserialize(using = myicellar.api.admin.jackson.IdShortDeserializer.class)
        @JsonSerialize(using = myicellar.api.admin.jackson.IdShortSerializer.class)
        private final Short   attrNameId;
        private final String  attrValEng;
        private final String  attrValChs;
        private final String  attrValCht;
        private final Integer lastUpdMictime;
        private final String  attrNameEng;

    @JsonCreator
    public VintageJoin(
            @JsonProperty("wineId")         Long    wineId,
            @JsonProperty("vintageTag")     Short   vintageTag,
            @JsonProperty("vintageName")    String  vintageName,
            @JsonProperty("isValid")        Boolean isValid,
            @JsonProperty("attrAssocVal")   Short   attrAssocVal,
            @JsonProperty("attrId")         Long    attrId,
            @JsonProperty("attrNameId")     Short   attrNameId,
            @JsonProperty("attrValEng")     String  attrValEng,
            @JsonProperty("attrValChs")     String  attrValChs,
            @JsonProperty("attrValCht")     String  attrValCht,
            @JsonProperty("lastUpdMictime") Integer lastUpdMictime,
            @JsonProperty("attrNameEng")    String  attrNameEng
    ) {
        this.wineId = wineId;
        this.vintageTag = vintageTag;
        this.vintageName = vintageName;
        this.isValid = isValid;
        this.attrAssocVal = attrAssocVal;
        this.attrId = attrId;
        this.attrNameId = attrNameId;
        this.attrValEng = attrValEng;
        this.attrValChs = attrValChs;
        this.attrValCht = attrValCht;
        this.lastUpdMictime = lastUpdMictime;
        this.attrNameEng = attrNameEng;
    }

    public Long getWineId(){return this.wineId;}

    public Short getVintageTag(){return this.vintageTag;}

    public String getVintageName(){return this.vintageName;}

    public Boolean getIsValid() {return this.isValid;}

    public Short getAttrAssocVal() {return this.attrAssocVal;}

    public Long getAttrId() {return this.attrId;}

    public Short getAttrNameId() {return this.attrNameId;}

    public String getAttrValEng() {return this.attrValEng;}

    public String getAttrValChs() {return this.attrValChs;}

    public String getAttrValCht() {return this.attrValCht;}

    public Integer getLastUpdMictime() {return this.lastUpdMictime;}

    public String getAttrNameEng() {return this.attrNameEng;}

    @Override
    public String toString() {
        return "VintageJoin{" +
                "wineId=" + wineId +
                ", vintageTag=" + vintageTag +
                ", vintageName='" + vintageName + '\'' +
                ", isValid=" + isValid +
                ", attrAssocVal=" + attrAssocVal +
                ", attrId=" + attrId +
                ", attrNameId=" + attrNameId +
                ", attrValEng='" + attrValEng + '\'' +
                ", attrValChs='" + attrValChs + '\'' +
                ", attrValCht='" + attrValCht + '\'' +
                ", lastUpdMictime=" + lastUpdMictime +
                ", attrNameEng='" + attrNameEng + '\'' +
                '}';
    }
}

