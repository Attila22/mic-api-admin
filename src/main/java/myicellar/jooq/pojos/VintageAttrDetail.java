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
public class VintageAttrDetail implements Serializable {

    private static final long serialVersionUID = -1390858555;

    private final Short   vintageTag;
    private final String  vintageName;
    private final Boolean isValid;


    @JsonCreator
    public VintageAttrDetail(
            @JsonProperty("vintageTag")     Short   vintageTag,
            @JsonProperty("vintageName")    String  vintageName,
            @JsonProperty("isValid")        Boolean isValid
    ) {
        this.vintageTag = vintageTag;
        this.vintageName = vintageName;
        this.isValid   =  isValid;
    }

    public Short getVintageTag() {
            return this.vintageTag;
        }

    public String getVintageName() {
            return this.vintageName;
        }

    public Boolean getIsValid() {return this.isValid;}

    @Override
    public String toString() {
        return "VintageAttrDetail{" +
                "vintageTag=" + vintageTag +
                ", vintageName='" + vintageName + '\'' +
                ", isValid=" + isValid +
                '}';
    }
}

