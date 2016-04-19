package myicellar.api.admin.jackson;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

/**
 * Created by lwbu on 15-10-30.
 */
public final class SqlDateSerializer extends JsonSerializer<java.sql.Date> {

    @Override
    public void serialize(java.sql.Date value, JsonGenerator gen, SerializerProvider serializers) throws IOException, JsonProcessingException {
        gen.writeString(SqlDateTimeUtil.getStringFromSqlDate(value));
    }
}

