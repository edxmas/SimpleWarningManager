package utils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import models.Warning;

import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;

/**
 * Created by Eduard Natale on 21/10/15
 */

public class WarningSerializer extends JsonSerializer<Warning> {

    private final Format dateFormatter = new SimpleDateFormat("dd/MM/yyyy - HH:mm");
    private final GeometryFactory geometryFactory = new GeometryFactory();

    @Override
    public void serialize(Warning warning, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
            throws IOException {
        Coordinate coordinate = geometryFactory.createGeometry(warning.theGeom).getCoordinate();

        jsonGenerator.writeStartObject();
            jsonGenerator.writeStringField("title", warning.title);
            jsonGenerator.writeStringField("description", warning.description);
            jsonGenerator.writeStringField("author", warning.author);
            jsonGenerator.writeStringField("location", warning.location);
            jsonGenerator.writeStringField("timestamp", dateFormatter.format(warning.timestamp));
            jsonGenerator.writeNumberField("latitude", coordinate.getOrdinate(0));
            jsonGenerator.writeNumberField("longitude", coordinate.getOrdinate(1));
        jsonGenerator.writeEndObject();
    }
}
