
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object Login_Scope0 {
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

class Login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,Boolean,UserInfo,Form[views.formdata.LoginFormData],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(page: String, isLoggedIn: Boolean, userInfo: UserInfo, loginForm: Form[views.formdata.LoginFormData]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import bootstrap3._

Seq[Any](format.raw/*1.104*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/MainPage(page, isLoggedIn, userInfo)/*5.38*/ {_display_(Seq[Any](format.raw/*5.40*/("""
    """),format.raw/*6.5*/("""<div class="container">
    """),_display_(/*7.6*/loginform(routes.Application.postLogin(), loginForm("email"), loginForm("password"))),format.raw/*7.90*/("""
    """),format.raw/*8.5*/("""</div>

    <div>
        <a href=""""),_display_(/*11.19*/routes/*11.25*/.Application.businessSignup()),format.raw/*11.54*/("""">No account yet?</a>
    </div>
""")))}),format.raw/*13.2*/("""
"""))
      }
    }
  }

  def render(page:String,isLoggedIn:Boolean,userInfo:UserInfo,loginForm:Form[views.formdata.LoginFormData]): play.twirl.api.HtmlFormat.Appendable = apply(page,isLoggedIn,userInfo,loginForm)

  def f:((String,Boolean,UserInfo,Form[views.formdata.LoginFormData]) => play.twirl.api.HtmlFormat.Appendable) = (page,isLoggedIn,userInfo,loginForm) => apply(page,isLoggedIn,userInfo,loginForm)

  def ref: this.type = this

}


}

/**/
object Login extends Login_Scope0.Login
              /*
                  -- GENERATED --
                  DATE: Wed Nov 30 21:28:42 EST 2016
                  SOURCE: /Users/Valentin/git/Coupon/Coupon/app/views/Login.scala.html
                  HASH: 2c773aa6b264e1a6ad14aa9593a16e469d8f9205
                  MATRIX: 797->1|1014->103|1042->126|1069->128|1113->164|1152->166|1183->171|1237->200|1341->284|1372->289|1435->325|1450->331|1500->360|1564->394
                  LINES: 27->1|32->1|34->4|35->5|35->5|35->5|36->6|37->7|37->7|38->8|41->11|41->11|41->11|43->13
                  -- GENERATED --
              */
          