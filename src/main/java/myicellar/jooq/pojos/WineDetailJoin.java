package myicellar.jooq.pojos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;


/**
 * Created by charlie on 27/2/16.
 */

@SuppressWarnings({"all", "unchecked", "rawtypes"})
public final class WineDetailJoin implements Serializable{

    private static final long serialVersionUID = 1516557555;

    @JsonDeserialize(using = myicellar.api.admin.jackson.IdLongDeserializer.class)
    @JsonSerialize(using = myicellar.api.admin.jackson.IdLongSerializer.class)
    private final Long    wineId;
    private final Boolean isValid;
    private final String  wineNameUsr;
    private final String  wineNameEng;
    private final String  wineNameChs;
    private final String  wineNameCht;
    @JsonDeserialize(using = myicellar.api.admin.jackson.IdShortDeserializer.class)
    @JsonSerialize(using = myicellar.api.admin.jackson.IdShortSerializer.class)
    private final Short   wineTypeId;
    @JsonDeserialize(using = myicellar.api.admin.jackson.IdLongDeserializer.class)
    @JsonSerialize(using = myicellar.api.admin.jackson.IdLongSerializer.class)
    private final Long    wineryId;

    @JsonCreator
    public WineDetailJoin(
            @JsonProperty("wineId")         Long    wineId,
            @JsonProperty("isValid")        Boolean isValid,
            @JsonProperty("wineNameUsr")    String  wineNameUsr,
            @JsonProperty("wineNameEng")    String  wineNameEng,
            @JsonProperty("wineNameChs")    String  wineNameChs,
            @JsonProperty("wineNameCht")    String  wineNameCht,
            @JsonProperty("wineTypeId")     Short   wineTypeId,
            @JsonProperty("wineryId")       Long    wineryId
    ) {

        this.wineId = wineId;
        this.isValid = isValid;
        this.wineNameUsr = wineNameUsr;
        this.wineNameEng = wineNameEng;
        this.wineNameChs = wineNameChs;
        this.wineNameCht = wineNameCht;
        this.wineTypeId = wineTypeId;
        this.wineryId = wineryId;
    }


    public Long getWineId() {return this.wineId;}

    public Boolean getIsValid() {return this.isValid;}

    public String getWineNameUsr(){return this.wineNameUsr;}

    public String getWineNameEng(){return this.wineNameEng;}

    public String getWineNameChs(){return this.wineNameChs;}

    public String getWineNameCht(){return this.wineNameCht;}

    public Short getWineTypeId() {return this.wineTypeId;}

    public Long getWineryId() {return this.wineryId;}


    @Override
    public String toString() {
        return "WineDetailJoin{" +
                "wineId=" + wineId +
                ", isValid=" + isValid +
                ", wineTypeUsr='" + wineNameUsr + '\'' +
                ", wineNameEng='" + wineNameEng + '\'' +
                ", wineNameChs='" + wineNameChs + '\'' +
                ", wineNameCht='" + wineNameCht + '\'' +
                ", wineTypeId=" + wineTypeId +
                ", wineryId=" + wineryId +
                '}';
    }
}

