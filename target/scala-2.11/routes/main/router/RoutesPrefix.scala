
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/johnrock/Desktop/Coupons/conf/routes
// @DATE:Wed Nov 30 22:12:57 EST 2016


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
