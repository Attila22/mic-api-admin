package myicellar.api.admin.jackson;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.ParseException;

/**
 * Created by lwbu on 15-10-30.
 */
public final class SqlTimestampDeserializer extends JsonDeserializer<Timestamp> {

    @Override
    public Timestamp deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        try {
            return SqlDateTimeUtil.getSqlTimestampFromString(p.getText());
        } catch (ParseException e) {
            throw new IOException(e);
        }
    }
}
