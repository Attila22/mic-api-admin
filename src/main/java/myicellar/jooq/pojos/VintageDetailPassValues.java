package myicellar.jooq.pojos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;

/**
 * Created by charlie on 1/3/16.
 */
@SuppressWarnings({"all", "uncheck", "rawtypes"})
public class VintageDetailPassValues implements Serializable{


    private static final long serialVersionUID = -1390858555;

    @JsonDeserialize(using = myicellar.api.admin.jackson.IdLongDeserializer.class)
    @JsonSerialize(using = myicellar.api.admin.jackson.IdLongSerializer.class)
    private final Long  wineId;
    private final Short vintageTag;
    @JsonDeserialize(using = myicellar.api.admin.jackson.IdLongDeserializer.class)
    @JsonSerialize(using = myicellar.api.admin.jackson.IdLongSerializer.class)
    private final Long    attrId;
    @JsonDeserialize(using = myicellar.api.admin.jackson.IdShortDeserializer.class)
    @JsonSerialize(using = myicellar.api.admin.jackson.IdShortSerializer.class)
    private final Short   attrNameId;
    private final String attrNameEng;
    private final Short  attrAssocVal;



        @JsonCreator
        public VintageDetailPassValues(
                @JsonProperty("wineId")         Long wineId,
                @JsonProperty("vintageTag")     Short   vintageTag,
                @JsonProperty("attrId")         Long    attrId,
                @JsonProperty("attrNameId")     Short   attrNameId,
                @JsonProperty("attrNameEng")    String  attrNameEng,
                @JsonProperty("attrAssocVal")   Short   attrAssocVal
        ) {
            this.wineId   = wineId;
            this.vintageTag = vintageTag;
            this.attrId  =  attrId;
            this.attrNameId = attrNameId;
            this.attrNameEng = attrNameEng;
            this.attrAssocVal = attrAssocVal;
        }

    public Long getWineId() { return this.wineId;}

    public Short getVintageTag() {return this.vintageTag;}

    public Long getAttrId() {return this.attrId;}

    public Short getAttrNameId() {return this.attrNameId;}

    public String getAttrNameEng() {return this.attrNameEng;}

    public Short getAttrAssocVal() {return this.attrAssocVal;}

    @Override
    public String toString() {
        return "VintageDetailPassValues{" +
                "wineId=" + wineId +
                ", vintageTag=" + vintageTag +
                ", attrId=" + attrId +
                ", attrNameId=" + attrNameId +
                ", attrNameEng='" + attrNameEng + '\'' +
                ", attrAssocVal=" + attrAssocVal +
                '}';
    }
}
