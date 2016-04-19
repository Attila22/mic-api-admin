package myicellar.api.admin.jackson;

import myicellar.api.admin.util.ConfigUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by lwbu on 15-10-30.
 */
public final class SqlDateTimeUtil {

    private final static SimpleDateFormat FORMATTER = new SimpleDateFormat(ConfigUtil.JSON_DATETIME_FORMAT);

    public final static java.sql.Date getSqlDateFromString(String value) throws ParseException {
        return new java.sql.Date(FORMATTER.parse(value).getTime());
    }

    public final static java.sql.Timestamp getSqlTimestampFromString(String value) throws ParseException {
        return new java.sql.Timestamp(FORMATTER.parse(value).getTime());
    }

    public final static String getStringFromSqlDate(java.sql.Date value){
        return FORMATTER.format(value);
    }

    public final static String getStringFromSqlTimestamp(java.sql.Timestamp value){
        return FORMATTER.format(value);
    }

}
