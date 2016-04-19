package myicellar.api.admin.util;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
//import myicellar.api.admin.handler.JSONParamsFormatException;
import myicellar.api.admin.mpojos.MicRequHdr;
import ratpack.func.Pair;
import ratpack.handling.Context;

import java.util.ArrayList;

/**
 * Created by lwbu on 15-12-4.
 */
public class MicRequUtil {

    private final static String JSON_HEADER_INDEX = "header";
    private final static String JSON_CONTENT_INDEX = "content";
    private final static String JSON_PHRASE_INDEX = "phrase";
    private final static String JSON_KEYID_INDEX = "keyId";

    public final static boolean isValidRequHdr(ObjectMapper mapper, JsonNode root) throws RuntimeException {
        MicRequHdr hdr = parseRequHdr(mapper, root);
        // do sth here
        return true;
    }

    public final static MicRequHdr parseRequHdr(ObjectMapper mapper, JsonNode root) throws RuntimeException {
        try {
            JsonNode header = root.get(JSON_HEADER_INDEX);
            if (header == null || header.isNull())
                throw new NullPointerException();
            else
                return mapper.reader().forType(MicRequHdr.class).readValue(header);
        }catch (Exception e){
            throw new RuntimeException("Expect {" + JSON_HEADER_INDEX + " : ... }", e);
        }
    }

    public final static <M> M parseRequCntnObj(ObjectMapper mapper, Class<M> c, JsonNode root) throws RuntimeException {
        try {
            JsonNode content = root.get(JSON_CONTENT_INDEX);
            if (content == null || content.isNull())
                throw new NullPointerException();
            else
                return mapper.reader().forType(c).readValue(content);
        }catch (Exception e){
            throw new RuntimeException("Expect {" + JSON_CONTENT_INDEX + " : " + c.getSimpleName() + "}", e);
        }
    }

    public final static String parseRequPhrs(ObjectMapper mapper, JsonNode root) throws RuntimeException {
        try {
            JsonNode content = root.get(JSON_CONTENT_INDEX).get(JSON_PHRASE_INDEX);
            if (content == null || content.isNull())
                throw new NullPointerException();
            else
                return content.textValue();
        }catch (Exception e){
            throw new RuntimeException("Expect {" + JSON_CONTENT_INDEX + " : {" +JSON_PHRASE_INDEX +" : String} }", e);
        }
    }

    public final static String parseRequKeyId(ObjectMapper mapper, JsonNode root) throws RuntimeException {
        try {
            JsonNode content = root.get(JSON_CONTENT_INDEX).get(JSON_KEYID_INDEX);
            if (content == null || content.isNull())
                throw new NullPointerException();
            else {
                String val = content.textValue();
                if (val == null && content.numberValue() != null)
                    throw new RuntimeException("Missing double quotes around " + JSON_KEYID_INDEX + " value");
                else
                    return val;
            }
        }catch (RuntimeException jpe){
            throw jpe;
        }catch (Exception e){
            throw new RuntimeException("Expect {" + JSON_CONTENT_INDEX + " : {" +JSON_KEYID_INDEX +" : String-of-Integer} }", e);
        }
    }

    public final static <M> ArrayList<M> parseRequCntnList(ObjectMapper mapper, Class<M> c, JsonNode root) throws RuntimeException {
        try {
            ArrayList<M> arrList = new ArrayList<>();
            if (root != null && root.size() > 0) {
                ObjectReader obr = mapper.reader().forType(c);
                JsonNode contentList = root.get(JSON_CONTENT_INDEX);
                if(contentList == null || contentList.isNull())
                    throw new NullPointerException();
                else if(!contentList.isArray() || contentList.size()<1)
                    throw new IllegalArgumentException("Invalid JSON array format or Empty Json array");
                else {
                    for (JsonNode item : contentList)
                        arrList.add(obr.readValue(item));
                }
            }
            return arrList;
        }catch (Exception e){
            throw new RuntimeException("Expect {" + JSON_CONTENT_INDEX + " : [array of " + c.getSimpleName() + "] }", e);
        }
    }

    public final static boolean isValidRequ(Pair<MicRequHdr, ?> p){
        return isValidRequHdr(p) && p.right != null;
    }

    public final static boolean isValidRequObjList(Pair<MicRequHdr, ? extends ArrayList<?>> p){
        return isValidRequHdr(p) && p.right != null && p.right.size()>0;
    }

    public final static boolean isValidRequHdr(Pair<MicRequHdr, ?> p){
        return p.left != null & p.left.getUserId() != null;
    }

    public final static void renderForInvalidRequ(Context ctx, Pair<MicRequHdr, ?> p){
        if (!isValidRequHdr(p))
            ctx.render(MicRspnUtil.jsonFailure(MicRspnUtil.HTTP_CODE_FAIL_AUTH));
        else
            ctx.render(MicRspnUtil.jsonFailure(MicRspnUtil.HTTP_CODE_BAD_REQUEST, "Empty Request Content Data"));
    }


}
