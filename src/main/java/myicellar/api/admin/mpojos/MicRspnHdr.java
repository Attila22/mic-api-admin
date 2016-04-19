package myicellar.api.admin.mpojos;

/**
 * Created by lwbu on 15-11-26.
 */
public final class MicRspnHdr {

    private final Boolean isSuccess;
    private final Integer errorCode;
    private final String errorMsg;
    //private final Long totalAll;
    private final Boolean isAnyNextBatch;
    private final String nextBatchParams;

    public MicRspnHdr(Boolean isSuccess,
                      Integer errorCode,
                      String errorMsg,
                      //Long totalAll,
                      Boolean isAnyNextBatch,
                      String nextBatchParams){
        this.isSuccess = isSuccess;
        if(!isSuccess) {
            this.errorCode = errorCode;
            this.errorMsg = errorMsg;
        }else{
            this.errorCode = null;
            this.errorMsg = null;
        }

        //this.totalAll = totalAll;
        this.isAnyNextBatch = isAnyNextBatch;
        this.nextBatchParams = nextBatchParams;
    }

    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    //public Long getTotalAll() {
    //    return totalAll;
    //}

    public Boolean getIsAnyNextBatch() {
        return isAnyNextBatch;
    }

    public String getNextBatchParams() {
        return nextBatchParams;
    }
}
