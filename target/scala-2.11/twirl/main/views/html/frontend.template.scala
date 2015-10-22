
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object frontend_Scope0 {
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

class frontend extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/views/*1.7*/.html.components.header()),format.raw/*1.32*/("""
"""),_display_(/*2.2*/views/*2.7*/.html.components.body()),format.raw/*2.30*/("""
"""),_display_(/*3.2*/views/*3.7*/.html.components.footer()))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object frontend extends frontend_Scope0.frontend
              /*
                  -- GENERATED --
                  DATE: Wed Oct 21 12:01:57 CEST 2015
                  SOURCE: /Users/eduardnatale/Sites/LinuxDay2015/app/views/frontend.scala.html
                  HASH: f91fc558aa6e318e856196fbcd240dd52bf66c40
                  MATRIX: 833->1|845->6|890->31|917->33|929->38|972->61|999->63|1011->68
                  LINES: 32->1|32->1|32->1|33->2|33->2|33->2|34->3|34->3
                  -- GENERATED --
              */
          