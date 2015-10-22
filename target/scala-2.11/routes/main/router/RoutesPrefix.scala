
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/eduardnatale/Sites/LinuxDay2015/conf/routes
// @DATE:Wed Oct 21 11:29:26 CEST 2015


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
