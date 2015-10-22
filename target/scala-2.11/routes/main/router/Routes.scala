
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/eduardnatale/Sites/LinuxDay2015/conf/routes
// @DATE:Wed Oct 21 11:29:26 CEST 2015

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:4
  Assets_0: controllers.Assets,
  // @LINE:7
  ApplicationController_1: controllers.ApplicationController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:4
    Assets_0: controllers.Assets,
    // @LINE:7
    ApplicationController_1: controllers.ApplicationController
  ) = this(errorHandler, Assets_0, ApplicationController_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Assets_0, ApplicationController_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    ("""GET""", this.prefix, """controllers.ApplicationController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """read""", """controllers.ApplicationController.read()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """save""", """controllers.ApplicationController.save()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:4
  private[this] lazy val controllers_Assets_at0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at0_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """assets/$file<.+>"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_ApplicationController_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_ApplicationController_index1_invoker = createInvoker(
    ApplicationController_1.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_ApplicationController_read2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("read")))
  )
  private[this] lazy val controllers_ApplicationController_read2_invoker = createInvoker(
    ApplicationController_1.read(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "read",
      Nil,
      "GET",
      """""",
      this.prefix + """read"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_ApplicationController_save3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("save")))
  )
  private[this] lazy val controllers_ApplicationController_save3_invoker = createInvoker(
    ApplicationController_1.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """save"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:4
    case controllers_Assets_at0_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at0_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:7
    case controllers_ApplicationController_index1_route(params) =>
      call { 
        controllers_ApplicationController_index1_invoker.call(ApplicationController_1.index())
      }
  
    // @LINE:8
    case controllers_ApplicationController_read2_route(params) =>
      call { 
        controllers_ApplicationController_read2_invoker.call(ApplicationController_1.read())
      }
  
    // @LINE:9
    case controllers_ApplicationController_save3_route(params) =>
      call { 
        controllers_ApplicationController_save3_invoker.call(ApplicationController_1.save())
      }
  }
}