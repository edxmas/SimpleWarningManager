
package views.html.components

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object body_Scope0 {
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

class body extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<div id="map"></div>

<div class="container">
    <img id="logo" src=""""),_display_(/*4.26*/routes/*4.32*/.Assets.at("images/logo.png")),format.raw/*4.61*/("""">
    <div class="modal fade">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title">Fai una segnalazione</h4>
                </div>
                <div class="modal-body">
                    <form action="/save" method="post">
                        <div class="form-group">
                            <label for="title">Titolo</label>
                            <input type="text" class="form-control" id="title" name="title" placeholder="Discarica abusiva">
                        </div>
                        <div class="form-group">
                            <label for="description">Descrizione</label>
                            <textarea class="form-control" id="description" name="description" rows="3" placeholder="Discarica nei pressi di una sorgente, con percolato"></textarea>
                        </div>
                        <div class="form-group">
                            <label for="severity">Gravità</label>
                            <input type="number" class="form-control" id="severity" name="severity" placeholder="1-5" max="5" min="1">
                        </div>
                        <div class="form-group">
                            <label for="author">Il tuo nome</label>
                            <input type="text" class="form-control" id="author" name="author" placeholder="Eduard">
                        </div>
                        <div class="form-group">
                            <label for="location">Luogo</label>
                            <input type="text" class="form-control" id="location" name="location" placeholder="Via Caracciolo, Napoli">
                        </div>
                        <div class="form-group">
                            <label for="position">Posizione geografica</label>
                            <input type="text" class="form-control" id="position" name="position" placeholder="0, 0" readonly>
                        </div>
                        <button type="submit" class="btn btn-warning">Segnala</button>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Chiudi</button>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div><!-- /.modal -->

</div> <!-- /container -->"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object body extends body_Scope0.body
              /*
                  -- GENERATED --
                  DATE: Thu Oct 22 12:10:08 CEST 2015
                  SOURCE: /Users/eduardnatale/Sites/LinuxDay2015/app/views/components/body.scala.html
                  HASH: 18637f845e23f949379d149adda74cbe87700854
                  MATRIX: 836->0|933->71|947->77|996->106
                  LINES: 32->1|35->4|35->4|35->4
                  -- GENERATED --
              */
          