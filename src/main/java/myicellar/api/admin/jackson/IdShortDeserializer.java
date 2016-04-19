package myicellar.api.admin.jackson;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

/**
 * Created by lwbu on 15-10-30.
 */
public final class IdShortDeserializer extends JsonDeserializer<Short> {

    @Override
    public Short deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        try{
            return Short.parseShort(p.getText());
        }catch(NumberFormatException e){
            throw new IOException(e);
        }
    }

}