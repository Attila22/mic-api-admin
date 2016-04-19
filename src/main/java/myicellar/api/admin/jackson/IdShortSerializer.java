package myicellar.api.admin.jackson;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

/**
 * Created by lwbu on 15-10-30.
 */
public final class IdShortSerializer extends JsonSerializer<Short> {

    @Override
    public void serialize(Short value, JsonGenerator gen, SerializerProvider serializers) throws IOException, JsonProcessingException {
        gen.writeString(String.valueOf(value));
    }
}

