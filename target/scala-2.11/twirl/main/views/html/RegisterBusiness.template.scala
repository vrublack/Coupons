
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object RegisterBusiness_Scope0 {
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

class RegisterBusiness extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Register Business</title>
    </head>
    <body>

    """),_display_(/*9.6*/helper/*9.12*/.form(action = routes.Application.postBusinessSignup())/*9.67*/ {_display_(Seq[Any](format.raw/*9.69*/("""
        """),format.raw/*10.9*/("""Name:<input type="text" name="name"> <br>
        Password: <input type="password" name="password"> <br>
        Email: <input type="email" name="email"> <br>
        <input type="submit">
        """)))}),format.raw/*14.10*/("""

    """),format.raw/*16.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object RegisterBusiness extends RegisterBusiness_Scope0.RegisterBusiness
              /*
                  -- GENERATED --
                  DATE: Wed Nov 30 21:05:43 EST 2016
                  SOURCE: /Users/Valentin/git/Coupon/Coupon/app/views/RegisterBusiness.scala.html
                  HASH: 75823b4c8340ce583574737194e2a9f582ec0cba
                  MATRIX: 849->0|1019->145|1033->151|1096->206|1135->208|1171->217|1400->415|1433->421
                  LINES: 32->1|40->9|40->9|40->9|40->9|41->10|45->14|47->16
                  -- GENERATED --
              */
          