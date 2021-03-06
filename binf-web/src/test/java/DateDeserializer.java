import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;

import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by wangbin on 2015/1/25.
 */
public class DateDeserializer implements JsonDeserializer<Date> {

    public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        Date date = null;
        try {
            date = sdf.parse(json.getAsJsonPrimitive().getAsString());
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}