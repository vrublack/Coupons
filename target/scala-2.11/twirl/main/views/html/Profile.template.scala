
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object Profile_Scope0 {
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

class Profile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Boolean,UserInfo,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(page: String, isLoggedIn: Boolean, userInfo: UserInfo):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.57*/("""

"""),_display_(/*3.2*/MainPage(page, isLoggedIn, userInfo)/*3.38*/ {_display_(Seq[Any](format.raw/*3.40*/("""
   """),format.raw/*4.4*/("""<div class="container">
     <p>In the profile page.</p> 
     <p>Only authenticated users can visit this page.  Try logging out and then attempting to retrieve /profile.</p>
   </div>
""")))}),format.raw/*8.2*/("""
"""))
      }
    }
  }

  def render(page:String,isLoggedIn:Boolean,userInfo:UserInfo): play.twirl.api.HtmlFormat.Appendable = apply(page,isLoggedIn,userInfo)

  def f:((String,Boolean,UserInfo) => play.twirl.api.HtmlFormat.Appendable) = (page,isLoggedIn,userInfo) => apply(page,isLoggedIn,userInfo)

  def ref: this.type = this

}


}

/**/
object Profile extends Profile_Scope0.Profile
              /*
                  -- GENERATED --
                  DATE: Wed Nov 30 16:49:31 EST 2016
                  SOURCE: /Users/johnrock/Desktop/Coupons/app/views/Profile.scala.html
                  HASH: 43a3a9f19339546736ca2aaf293fd976fd6078da
                  MATRIX: 766->1|916->56|944->59|988->95|1027->97|1057->101|1272->287
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|39->8
                  -- GENERATED --
              */
          