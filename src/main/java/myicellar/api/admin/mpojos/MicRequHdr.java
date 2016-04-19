package myicellar.api.admin.mpojos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

/**
 * Created by lwbu on 15-12-3.
 */
public final class MicRequHdr {

    private final UUID userId;
    private final String userToken;
    private final String appToken;
    private final String nextBatchParams;


    @JsonCreator
    public MicRequHdr(
            @JsonProperty("userId")    UUID   userId,
            @JsonProperty("userToken") String   userToken,
            @JsonProperty("appToken")  String   appToken,
            @JsonProperty("nextBatchParams") String nextBatchParams
    ) {
        this.userId = userId;
        this.userToken = userToken;
        this.appToken = appToken;
        this.nextBatchParams = nextBatchParams;
    }

    public UUID getUserId() {
        return userId;
    }

    public String getUserToken() {
        return userToken;
    }

    public String getAppToken() {
        return appToken;
    }

    public String getNextBatchParams() {
        return nextBatchParams;
    }
}
