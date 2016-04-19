package myicellar.jooq.pojos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;

/**
 * Created by charlie on 25/2/16.
 */

@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public final class WinesTypeNameRegionCountry implements Serializable {

    private static final long serialVersionUID = -1042812358;
    @JsonDeserialize(using = myicellar.api.admin.jackson.IdLongDeserializer.class)
    @JsonSerialize(using = myicellar.api.admin.jackson.IdLongSerializer.class)
    private final Long wineId;
    private final Boolean isValid;
    private final String wineNameUsr;
    private final String wineNameEng;
    private final String wineNameChs;
    private final String wineNameCht;
    private final String wineryNameEng;
    private final String regionNameEng;
    private final String countryNameEng;

    @JsonCreator
    public WinesTypeNameRegionCountry(
            @JsonProperty("wineId") Long wineId,
            @JsonProperty("isValid") Boolean isValid,
            @JsonProperty("wineNameUsr") String wineNameUsr,
            @JsonProperty("wineNameEng") String wineNameEng,
            @JsonProperty("wineNameChs") String wineNameChs,
            @JsonProperty("wineNameCht") String wineNameCht,
            @JsonProperty("wineryNameEng") String wineryNameEng,
            @JsonProperty("regionNameEng") String regionNameEng,
            @JsonProperty("countryNameEng") String countryNameEng
    ) {
        this.wineId = wineId;
        this.isValid = isValid;
        this.wineNameUsr = wineNameUsr;
        this.wineNameEng = wineNameEng;
        this.wineNameChs = wineNameChs;
        this.wineNameCht = wineNameCht;
        this.wineryNameEng = wineryNameEng;
        this.regionNameEng = regionNameEng;
        this.countryNameEng = countryNameEng;
    }

    public Long getWineId() {
            return this.wineId;
        }

    public Boolean getIsValid() {return this.isValid;}

    public String getWineNameUsr() {return this.wineNameUsr;}

    public String getWineNameEng() {
            return this.wineNameEng;
        }

    public String getWineNameChs() {
            return this.wineNameChs;
        }

    public String getWineNameCht() {return this.wineNameCht;}

    public String getWineryNameEng(){return this.wineryNameEng;}

    public String getRegionNameEng(){return this.regionNameEng;}

    public String getCountryNameEng() {
            return this.countryNameEng;
        }

    @Override
    public String toString() {
        return "WinesTypeNameRegionCountry{" +
                "wineId=" + wineId +
                ", isValid=" + isValid +
                ", wineNameUsr='" + wineNameUsr + '\'' +
                ", wineNameEng='" + wineNameEng + '\'' +
                ", wineNameChs='" + wineNameChs + '\'' +
                ", wineNameCht='" + wineNameCht + '\'' +
                ", wineryNameEng='" + wineryNameEng + '\'' +
                ", regionNameEng='" + regionNameEng + '\'' +
                ", countryNameEng='" + countryNameEng + '\'' +
                '}';
    }
}
