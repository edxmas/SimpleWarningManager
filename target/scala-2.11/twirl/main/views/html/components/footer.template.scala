
package views.html.components

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object footer_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class footer extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!-- Core Scripts -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<script src='"""),_display_(/*3.15*/routes/*3.21*/.Assets.at("javascripts/bootstrap.min.js")),format.raw/*3.63*/("""' type="text/javascript"></script>
<script src='"""),_display_(/*4.15*/routes/*4.21*/.Assets.at("leaflet/leaflet.js")),format.raw/*4.53*/("""' type="text/javascript"></script>

<script>

        var serverAddress = "http://localhost:9000/";

		var layer = L.tileLayer('http://"""),format.raw/*10.35*/("""{"""),format.raw/*10.36*/("""s"""),format.raw/*10.37*/("""}"""),format.raw/*10.38*/(""".tile.openstreetmap.fr/hot/"""),format.raw/*10.65*/("""{"""),format.raw/*10.66*/("""z"""),format.raw/*10.67*/("""}"""),format.raw/*10.68*/("""/"""),format.raw/*10.69*/("""{"""),format.raw/*10.70*/("""x"""),format.raw/*10.71*/("""}"""),format.raw/*10.72*/("""/"""),format.raw/*10.73*/("""{"""),format.raw/*10.74*/("""y"""),format.raw/*10.75*/("""}"""),format.raw/*10.76*/(""".png', """),format.raw/*10.83*/("""{"""),format.raw/*10.84*/("""
		    """),format.raw/*11.7*/("""attribution: '&copy; <a href="http://www.openstreetmap.org/copyright">OpenStreetMap</a> '
		"""),format.raw/*12.3*/("""}"""),format.raw/*12.4*/(""");

		var map = L.map('map', """),format.raw/*14.26*/("""{"""),format.raw/*14.27*/("""
            """),format.raw/*15.13*/("""scrollWheelZoom: false,
            center: [40.83563, 14.45938],
            zoom: 10
        """),format.raw/*18.9*/("""}"""),format.raw/*18.10*/(""");

        map.zoomControl.setPosition('bottomleft');
        map.addLayer(layer);

        var warnings; //= $.get(serverAddress+"read");
        $.ajax("""),format.raw/*24.16*/("""{"""),format.raw/*24.17*/("""
            """),format.raw/*25.13*/("""url: serverAddress+"read"
        """),format.raw/*26.9*/("""}"""),format.raw/*26.10*/(""").done(function(markers) """),format.raw/*26.35*/("""{"""),format.raw/*26.36*/("""

            """),format.raw/*28.13*/("""for (var i=0; i < markers.length; i++) """),format.raw/*28.52*/("""{"""),format.raw/*28.53*/("""
                """),format.raw/*29.17*/("""var marker = markers[i];
                L.marker( [marker.latitude, marker.longitude] )
                    .bindPopup(
                        '<h4>' + marker.title + '</h4>'+
                        '<p><i>' + marker.author + '</i>: "' + marker.description + '"</p>'+
                        '<p>' + marker.timestamp + ', ' + marker.location + "</p>")
                    .addTo(map)
            """),format.raw/*36.13*/("""}"""),format.raw/*36.14*/("""
        """),format.raw/*37.9*/("""}"""),format.raw/*37.10*/(""");

        var latitude;
        var longitude;
        var city;
        map.on('click', function(e) """),format.raw/*42.37*/("""{"""),format.raw/*42.38*/("""
            """),format.raw/*43.13*/("""latitude = e.latlng.lat.toFixed(5);
            longitude = e.latlng.lng.toFixed(5);
            $("#position").val(latitude + ", " + longitude);
            $('.modal').modal('toggle');
            $.ajax("""),format.raw/*47.20*/("""{"""),format.raw/*47.21*/("""
                """),format.raw/*48.17*/("""url: 'http://nominatim.openstreetmap.org/reverse',
                data: """),format.raw/*49.23*/("""{"""),format.raw/*49.24*/("""lat: latitude, lon: longitude, format: "json""""),format.raw/*49.69*/("""}"""),format.raw/*49.70*/("""
            """),format.raw/*50.13*/("""}"""),format.raw/*50.14*/(""").done(
                function(data) """),format.raw/*51.32*/("""{"""),format.raw/*51.33*/("""
                    """),format.raw/*52.21*/("""$("#location").val(data.display_name);
             """),format.raw/*53.14*/("""}"""),format.raw/*53.15*/(""");
        """),format.raw/*54.9*/("""}"""),format.raw/*54.10*/(""");
    </script>

</body>
</html>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object footer extends footer_Scope0.footer
              /*
                  -- GENERATED --
                  DATE: Thu Oct 22 12:37:03 CEST 2015
                  SOURCE: /Users/eduardnatale/Sites/LinuxDay2015/app/views/components/footer.scala.html
                  HASH: 009ba17afe6ff883d90981177a58325312dda4f1
                  MATRIX: 840->0|991->125|1005->131|1067->173|1142->222|1156->228|1208->260|1371->395|1400->396|1429->397|1458->398|1513->425|1542->426|1571->427|1600->428|1629->429|1658->430|1687->431|1716->432|1745->433|1774->434|1803->435|1832->436|1867->443|1896->444|1930->451|2049->543|2077->544|2134->573|2163->574|2204->587|2326->682|2355->683|2538->838|2567->839|2608->852|2669->886|2698->887|2751->912|2780->913|2822->927|2889->966|2918->967|2963->984|3390->1383|3419->1384|3455->1393|3484->1394|3615->1497|3644->1498|3685->1511|3919->1717|3948->1718|3993->1735|4094->1808|4123->1809|4196->1854|4225->1855|4266->1868|4295->1869|4362->1908|4391->1909|4440->1930|4520->1982|4549->1983|4587->1994|4616->1995
                  LINES: 32->1|34->3|34->3|34->3|35->4|35->4|35->4|41->10|41->10|41->10|41->10|41->10|41->10|41->10|41->10|41->10|41->10|41->10|41->10|41->10|41->10|41->10|41->10|41->10|41->10|42->11|43->12|43->12|45->14|45->14|46->15|49->18|49->18|55->24|55->24|56->25|57->26|57->26|57->26|57->26|59->28|59->28|59->28|60->29|67->36|67->36|68->37|68->37|73->42|73->42|74->43|78->47|78->47|79->48|80->49|80->49|80->49|80->49|81->50|81->50|82->51|82->51|83->52|84->53|84->53|85->54|85->54
                  -- GENERATED --
              */
          