
package views.html.components

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object header_Scope0 {
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

class header extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="it">
  <head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Warning Manager - Linux Day 2015</title>
    <meta name="description" content="Il gestore delle segnalazioni si occupa di raccogliere segnalazioni fatte dai cittadini
    e motrarle su una mappa. Il dimostratore è stato realizzato per mettere in evidenzia le potenzialità di software open
    per la gestione di informazioni geospaziali.">

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="author" content="Eduard Natale">

    <!-- Core CSS -->
    <link rel="stylesheet" media="screen" href=""""),_display_(/*19.50*/routes/*19.56*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*19.99*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*20.50*/routes/*20.56*/.Assets.at("leaflet/leaflet.css")),format.raw/*20.89*/("""">

      <style>
          .navbar """),format.raw/*23.19*/("""{"""),format.raw/*23.20*/("""
          """),format.raw/*24.11*/("""margin-bottom: 20px;
          """),format.raw/*25.11*/("""}"""),format.raw/*25.12*/("""

          """),format.raw/*27.11*/("""#map """),format.raw/*27.16*/("""{"""),format.raw/*27.17*/("""
              """),format.raw/*28.15*/("""height: 100%;
              width: 100%;
              position: absolute;
              top: 0;
              bottom: 0;
          """),format.raw/*33.11*/("""}"""),format.raw/*33.12*/("""
          """),format.raw/*34.11*/(""".leaflet-container """),format.raw/*34.30*/("""{"""),format.raw/*34.31*/("""
            """),format.raw/*35.13*/("""cursor: crosshair;
          """),format.raw/*36.11*/("""}"""),format.raw/*36.12*/("""
          """),format.raw/*37.11*/("""#logo """),format.raw/*37.17*/("""{"""),format.raw/*37.18*/("""
              """),format.raw/*38.15*/("""position: absolute;
              top: 10px;
              left: 10px;
              width: 80px;
          """),format.raw/*42.11*/("""}"""),format.raw/*42.12*/("""
      """),format.raw/*43.7*/("""</style>
  </head>
  <body>

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
object header extends header_Scope0.header
              /*
                  -- GENERATED --
                  DATE: Wed Oct 21 17:21:37 CEST 2015
                  SOURCE: /Users/eduardnatale/Sites/LinuxDay2015/app/views/components/header.scala.html
                  HASH: 77c202ba94b3b552964b624178d63f09b3f50f47
                  MATRIX: 840->0|1699->832|1714->838|1778->881|1857->933|1872->939|1926->972|1990->1008|2019->1009|2058->1020|2117->1051|2146->1052|2186->1064|2219->1069|2248->1070|2291->1085|2451->1217|2480->1218|2519->1229|2566->1248|2595->1249|2636->1262|2693->1291|2722->1292|2761->1303|2795->1309|2824->1310|2867->1325|3003->1433|3032->1434|3066->1441
                  LINES: 32->1|50->19|50->19|50->19|51->20|51->20|51->20|54->23|54->23|55->24|56->25|56->25|58->27|58->27|58->27|59->28|64->33|64->33|65->34|65->34|65->34|66->35|67->36|67->36|68->37|68->37|68->37|69->38|73->42|73->42|74->43
                  -- GENERATED --
              */
          