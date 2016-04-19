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
public final class WineryRegionCountryJoin implements Serializable {
    private static final long serialVersionUID = -1042812346;
    @JsonDeserialize(using = myicellar.api.admin.jackson.IdLongDeserializer.class)
    @JsonSerialize(using = myicellar.api.admin.jackson.IdLongSerializer.class)
    private final Long wineryId;
    private final Boolean isValid;
    private final String wineryNameUsr;
    private final String wineryNameEng;
    private final String wineryNameChs;
    private final String wineryNameCht;
    private final String regionNameEng;
    private final String countryNameEng;



    @JsonCreator
    public WineryRegionCountryJoin(
            @JsonProperty("wineryId") Long wineryId,
            @JsonProperty("isValid") Boolean isValid,
            @JsonProperty("wineryNameUsr") String wineryNameUsr,
            @JsonProperty("wineryNameEng") String wineryNameEng,
            @JsonProperty("wineryNameChs") String wineryNameChs,
            @JsonProperty("wineryNameCht") String wineryNameCht,
            @JsonProperty("regionNameEng") String regionNameEng,
            @JsonProperty("countryNameEng") String countryNameEng
    ) {
        this.wineryId = wineryId;
        this.isValid = isValid;
        this.wineryNameUsr = wineryNameUsr;
        this.wineryNameEng = wineryNameEng;
        this.wineryNameChs = wineryNameChs;
        this.wineryNameCht = wineryNameCht;
        this.regionNameEng = regionNameEng;
        this.countryNameEng = countryNameEng;



        }

    public Long getWineryId() {
            return this.wineryId;
        }

    public Boolean getIsValid() {return this.isValid;}

    public String getWineryNameUsr() {
            return this.wineryNameUsr;
        }

    public String getWineryNameEng() {
            return this.wineryNameEng;
        }

    public String getWineryNameChs() {
            return this.wineryNameChs;
        }

    public String getWineryNameCht() {
            return this.wineryNameCht;
        }

    public String getRegionNameEng(){ return this.regionNameEng; }

    public String getCountryNameEng() {
        return this.countryNameEng;
    }

    @Override
    public String toString() {
        return "WineryRegionCountryJoin{" +
                "wineryId=" + wineryId +
                ", isValid=" + isValid +
                ", wineryNameUsr='" + wineryNameUsr + '\'' +
                ", wineryNameEng='" + wineryNameEng + '\'' +
                ", wineryNameChs='" + wineryNameChs + '\'' +
                ", wineryNameCht='" + wineryNameCht + '\'' +
                ", regionNameEng='" + regionNameEng + '\'' +
                ", countryNameEng='" + countryNameEng + '\'' +
                '}';
    }
}
