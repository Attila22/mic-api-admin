package myicellar.jooq.pojos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;



import java.io.Serializable;

/**
 * Created by charlie on 23/2/16.
 */


@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public final class RegionCountryJoin implements Serializable {

    private static final long serialVersionUID = -1042812345;

    @JsonDeserialize(using = myicellar.api.admin.jackson.IdIntegerDeserializer.class)
    @JsonSerialize(using = myicellar.api.admin.jackson.IdIntegerSerializer.class)
    private final Integer regionId;
    private final Boolean isValid;
    private final String countryNameEng;
    @JsonDeserialize(using = myicellar.api.admin.jackson.IdIntegerDeserializer.class)
    @JsonSerialize(using = myicellar.api.admin.jackson.IdIntegerSerializer.class)
    private final Integer regionAltId;
    private final String regionNameEng;
    private final String regionNameChs;
    private final String regionNameCht;


    @JsonCreator
    public RegionCountryJoin(
            @JsonProperty("regionId") Integer regionId,
            @JsonProperty("isValid") Boolean isValid,
            @JsonProperty("countryNameEng") String countryNameEng,
            @JsonProperty("regionAltId") Integer regionAltId,
            @JsonProperty("regionNameEng") String regionNameEng,
            @JsonProperty("regionNameChs") String regionNameChs,
            @JsonProperty("regionNameCht") String regionNameCht
    ) {
        this.regionId = regionId;
        this.isValid = isValid;
        this.countryNameEng = countryNameEng;
        this.regionAltId = regionAltId;
        this.regionNameEng = regionNameEng;
        this.regionNameChs = regionNameChs;
        this.regionNameCht = regionNameCht;

    }

    public Integer getRegionId() {
        return this.regionId;
    }

    public Boolean getIsValid() {
        return this.isValid;
    }

    public String getCountryNameEng() {
        return this.countryNameEng;
    }

    public Integer getRegionAltId() {
        return this.regionAltId;
    }

    public String getRegionNameEng() {
        return this.regionNameEng;
    }

    public String getRegionNameChs() {
        return this.regionNameChs;
    }

    public String getRegionNameCht() {
        return this.regionNameCht;
    }


    @Override
    public java.lang.String toString() {
        return "RegionCountryJoin{" +
                "regionId=" + regionId +
                ", isValid=" + isValid +
                ", countryNameEng=" + countryNameEng +
                ", regionAltId=" + regionAltId +
                ", regionNameEng=" + regionNameEng +
                ", regionNameChs=" + regionNameChs +
                ", regionNameCht=" + regionNameCht +
                '}';
    }
}