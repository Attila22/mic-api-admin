package myicellar.api.admin.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ratpack.http.Request;

/**
 * Created by lwbu on 15-10-13.
 */


public final class LoggerUtil {

    public final static Logger LOGGER = LoggerFactory.getLogger("MyiCellar");

    public final static String constructRequestLogMsg(Request req, String tag, boolean isHeaderRequired, boolean isBodyRequired){
        StringBuilder str = new StringBuilder(tag).append(" REQUEST Received = ")
                .append("(" + req.getLocalAddress().getHostText() + ")")
                .append("("  + req.getRawUri() + ") ")
                .append("[" + req.getProtocol() + "][" + req.getMethod().getName() + "] {")
                .append(req.getRemoteAddress().getHostText() + "}");

        if(isHeaderRequired)
            return str.append("<<<HEADER>>>").append(req.getHeaders().asMultiValueMap().getAll().toString()).toString();
        else if(isBodyRequired)
            return str.append("<<<BODY>>>").append(req.getBody().toString()).toString();
        else
            return str.toString();
    }

}