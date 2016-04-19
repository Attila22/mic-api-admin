package myicellar.api.admin.jackson;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

/**
 * Created by lwbu on 15-10-30.
 */
public final class SqlDateDeserializer extends JsonDeserializer<java.sql.Date> {

    @Override
    public java.sql.Date deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        try{
            return SqlDateTimeUtil.getSqlDateFromString(p.getText());
        }catch(java.text.ParseException e){
            throw new IOException(e);
        }
    }

}