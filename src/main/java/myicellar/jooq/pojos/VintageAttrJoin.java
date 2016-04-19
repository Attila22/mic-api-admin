package myicellar.jooq.pojos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;

/**
 * Created by charlie on 1/3/16.
 */

@SuppressWarnings({"all", "unchecked", "rawtypes"})
public  final class VintageAttrJoin implements Serializable {

        private static final long serialVersionUID = -1390858557;

    @JsonDeserialize(using = myicellar.api.admin.jackson.IdLongDeserializer.class)
    @JsonSerialize(using = myicellar.api.admin.jackson.IdLongSerializer.class)
    private final Long    attrId;
    private final String  attrNameEng;
    private final Short   attrAssocVal;
    @JsonDeserialize(using = myicellar.api.admin.jackson.IdShortDeserializer.class)
    @JsonSerialize(using = myicellar.api.admin.jackson.IdShortSerializer.class)
    private final Short   attrNameId;
    private final String  attrValEng;
    private final String  attrValChs;
    private final String  attrValCht;
    private final Boolean isValid;
    private final Integer lastUpdMictime;


        @JsonCreator
        public VintageAttrJoin(
                @JsonProperty("attrId")         Long    attrId,
                @JsonProperty("attrNameEng")    String  attrNameEng,
                @JsonProperty("attrAssocVal")   Short   attrAssocVal,
                @JsonProperty("attrNameId")     Short   attrNameId,
                @JsonProperty("attrValEng")     String  attrValEng,
                @JsonProperty("attrValChs")     String  attrValChs,
                @JsonProperty("attrValCht")     String  attrValCht,
                @JsonProperty("isValid")        Boolean isValid,
                @JsonProperty("lastUpdMictime") Integer lastUpdMictime
        ) {
            this.attrId = attrId;
            this.attrNameEng = attrNameEng;
            this.attrAssocVal = attrAssocVal;
            this.attrNameId = attrNameId;
            this.attrValEng = attrValEng;
            this.attrValChs = attrValChs;
            this.attrValCht = attrValCht;
            this.isValid = isValid;
            this.lastUpdMictime = lastUpdMictime;
        }

    public Long getAttrId() {return this.attrId;}

    public String getAttrNameEng() {return this.attrNameEng;}

    public Short getAttrAssocVal() {return this.attrAssocVal;}

    public Short getAttrNameId() {return this.attrNameId;}

    public String getAttrValEng() {return this.attrValEng;}

    public String getAttrValChs() {return this.attrValChs;}

    public String getAttrValCht() {return this.attrValCht;}

    public Boolean getIsValid() {return this.isValid;}

    public Integer getLastUpdMictime() {return this.lastUpdMictime;}

    @Override
    public java.lang.String toString() {
        return "VintageAttrJoin{" +
                "attrId=" + attrId +
                ", attrNameEng=" + attrNameEng +
                ", attrAssocVal=" + attrAssocVal +
                ", attrNameId=" + attrNameId +
                ", attrValEng=" + attrValEng +
                ", attrValChs=" + attrValChs +
                ", attrValCht=" + attrValCht +
                ", isValid=" + isValid +
                ", lastUpdMictime=" + lastUpdMictime +
                '}';
    }
}

