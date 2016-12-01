
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Valentin/git/Coupon/Coupon/conf/routes
// @DATE:Wed Nov 30 21:05:42 EST 2016


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
