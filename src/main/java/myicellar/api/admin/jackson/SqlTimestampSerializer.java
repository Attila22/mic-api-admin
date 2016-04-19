package myicellar.api.admin.jackson;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.sql.Timestamp;

/**
 * Created by lwbu on 15-10-30.
 */
public class SqlTimestampSerializer extends JsonSerializer<java.sql.Timestamp> {

    @Override
    public void serialize(Timestamp value, JsonGenerator gen, SerializerProvider serializers) throws IOException, JsonProcessingException {
        gen.writeString(SqlDateTimeUtil.getStringFromSqlTimestamp(value));
    }
}
