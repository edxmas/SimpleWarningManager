package controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.io.ParseException;
import models.Warning;
import play.Logger;
import play.mvc.Result;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Controller;
import java.util.Date;
import java.util.Map;

public class ApplicationController extends Controller {

    public Result index() {
        return ok(views.html.frontend.render());
    }

    @Transactional
    public Result save() throws ParseException {
        Map<String, String[]> form = request().body().asFormUrlEncoded();

        Logger.debug(form.toString());
        String[] position = form.get("position")[0].split(", ");

        Double latitude = Double.parseDouble(position[0]);
        Double longitude = Double.parseDouble(position[1]);

        Warning warning = new Warning();

        /** Cleaner solution to save the point **/
        GeometryFactory factory = new GeometryFactory();
        Coordinate coords = new Coordinate(latitude, longitude);
        warning.theGeom = factory.createPoint(coords);
        warning.theGeom.setSRID(4326);

        /** Simpler solution, but more dangerous **/
        //WKTReader fromText = new WKTReader();
        //warning.theGeom = fromText.read(String.format("POINT(%s %s)", latitude, longitude));

        warning.title = form.get("title")[0];
        warning.description = form.get("description")[0];
        warning.author = form.get("author")[0];
        warning.location = form.get("location")[0];
        warning.timestamp = new Date();
        warning.save();

        return redirect("/");
    }

    /** Using a custom serializer **/
    @Transactional(readOnly = true)
    public Result read() throws JsonProcessingException {
        JsonNode warningsList = Json.toJson(Warning.getAll());
        return ok(warningsList);
    }
}
