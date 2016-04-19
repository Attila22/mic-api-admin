package myicellar.jooq.pojos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;

/**
 * Created by charlie on 17/3/16.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public final class AttrQuery implements Serializable{

        private static final long serialVersionUID = -1390858555;

        @JsonDeserialize(using = myicellar.api.admin.jackson.IdLongDeserializer.class)
        @JsonSerialize(using = myicellar.api.admin.jackson.IdLongSerializer.class)
        private final Long    attrId;
        private final Short   attrNameId;
        private final String  attrNameEng;
        private final Short   attrAssocVal;


        @JsonCreator
        public AttrQuery(
                @JsonProperty("attrId")         Long    attrId,
                @JsonProperty("attrNameId")     Short   attrNameId,
                @JsonProperty("attrNameEng")       String  attrNameEng,
                @JsonProperty("attrAssocVal")   Short   attrAssocVal
        ) {
            this.attrId = attrId;
            this.attrNameId = attrNameId;
            this.attrNameEng = attrNameEng;
            this.attrAssocVal = attrAssocVal;
        }

        public Long getAttrId() {
            return this.attrId;
        }

        public Short getAttrNameId(){return this.attrNameId;}

        public String getAttrNameEng(){ return this.attrNameEng;}

        public Short getAttrAssocVal() {return this.attrAssocVal;}

    @Override
    public String toString() {
        return "AttrQuery{" +
                "attrId=" + attrId +
                ", attrNameId=" + attrNameId +
                ", attrNameEng='" + attrNameEng + '\'' +
                ", attrAssocVal=" + attrAssocVal +
                '}';
    }
}
