package myicellar.api.admin.util;

import myicellar.api.admin.mpojos.MicRspnHdr;
import ratpack.jackson.Jackson;
import ratpack.jackson.JsonRender;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lwbu on 15-10-24.
 */
public final class MicRspnUtil {

    private final static String JSON_HEADER_ATTRNAME = "header";
    private final static String JSON_CONTENT_ATTRNAME = "content";

    public final static int HTTP_CODE_BAD_REQUEST = 4000; // Bad Request
    public final static int HTTP_CODE_FAIL_AUTH = 4030; // Not Authorized
    public final static int HTTP_CODE_ACCT_LOCKED = 4031; // Not Authorized
    public final static int HTTP_CODE_INCOMPLETED_SIGNUP = 4033; // Not Authorized
    public final static int HTTP_CODE_ENDPT_NOTFOUND = 4040; // End Point or Data Not Found
    public final static int HTTP_CODE_ENDPT_GONE = 4100; // End Point No Longer Available

    public final static int HTTP_CODE_ERROR_SERVER = 5000; // Server Error

    private final static Object EMPTY_DATA_SET = null;

    public final static String getErrBodyMsg(int errorKey){
        switch (errorKey){
            case HTTP_CODE_BAD_REQUEST:
                return errorKey + " (Client Bad Request)";
            case HTTP_CODE_FAIL_AUTH:
                return errorKey + " (Client Not Authorized)";
            case HTTP_CODE_ENDPT_NOTFOUND:
                return errorKey + " (Resource Not Found)";
            case HTTP_CODE_ENDPT_GONE:
                return errorKey + " (Version of Resource No Longer Supported)";
            case HTTP_CODE_ERROR_SERVER:
                return errorKey + " (Server Internal Error)";
            default:
                return errorKey + " (Client Request Unknown Error)";
        }
    }

    public final static JsonRender jsonSuccess(String nextPageParams, Object content){
        Map<String, Object> json = new HashMap<>();
        json.put(JSON_HEADER_ATTRNAME,
                new MicRspnHdr(true,null,null,true,nextPageParams));
        json.put(JSON_CONTENT_ATTRNAME,
                content);
        return Jackson.json(json);
    }

    public final static JsonRender jsonSuccess(Object content){
        Map<String, Object> json = new HashMap<>();
        json.put(JSON_HEADER_ATTRNAME,
                new MicRspnHdr(true,null,null,false,null));
        json.put(JSON_CONTENT_ATTRNAME, content);
        return Jackson.json(json);
    }

    public final static JsonRender jsonSuccess(){
        Map<String, Object> json = new HashMap<>();
        json.put(JSON_HEADER_ATTRNAME,
                new MicRspnHdr(true,null,null,false,null));
        json.put(JSON_CONTENT_ATTRNAME, EMPTY_DATA_SET);
        return Jackson.json(json);
    }

    public final static JsonRender jsonFailure(int errorCode){
        return jsonFailure(errorCode, getErrBodyMsg(errorCode));
    }

    public final static JsonRender jsonFailure(int errorCode, String errorMsg){
        Map<String, Object> json = new HashMap<>();
        json.put(JSON_HEADER_ATTRNAME,new MicRspnHdr(false,errorCode,errorMsg,false,null));
        json.put(JSON_CONTENT_ATTRNAME, EMPTY_DATA_SET);
        return Jackson.json(json);
    }

    public final static JsonRender jsonFailure(int errorCode, int rowImpact){
        Map<String, Object> json = new HashMap<>();
        String errorMsg = (rowImpact < 1 ? "No record has" : "More than one records have") + " been processed.";
        json.put(JSON_HEADER_ATTRNAME,new MicRspnHdr(false,errorCode,errorMsg,false,null));
        json.put(JSON_CONTENT_ATTRNAME, EMPTY_DATA_SET);
        return Jackson.json(json);
    }

}
