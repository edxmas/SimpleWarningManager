import play.Application;
import play.GlobalSettings;
import play.Logger;
import play.libs.F.Promise;
import play.mvc.Http;
import play.mvc.Result;

import static play.mvc.Results.internalServerError;
import static play.mvc.Results.notFound;

public class Global extends GlobalSettings {

    @Override
    public void onStart(Application app) {
        Logger.info("Global...on start");
    }
}
