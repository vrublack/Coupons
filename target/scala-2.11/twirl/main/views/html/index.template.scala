
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object Index_Scope0 {
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

class Index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Boolean,UserInfo,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(page: String, isLoggedIn: Boolean, userInfo: UserInfo):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.57*/("""

    """),_display_(/*3.6*/MainPage(page, isLoggedIn, userInfo)/*3.42*/ {_display_(Seq[Any](format.raw/*3.44*/("""

        """),format.raw/*5.9*/("""<script type="text/javascript" src=""""),_display_(/*5.46*/routes/*5.52*/.Assets.at("/javascripts/jquery-1.9.0.min.js")),format.raw/*5.98*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*6.46*/routes/*6.52*/.Assets.at("/javascripts/js.cookie-2.1.3.min.js")),format.raw/*6.101*/(""""></script>

        <div class="container">
            <div class="row">
                <div class="col-sm-10 col-sm-offset-1">
                    <h2>Welcome to play-example-login.</h2>
                    <p>The purpose of this system is to illustrate simple authorization and authentication in Play.</p>
                    <p><em>Authorization</em>
                        is the process by which an application decides whether or not a user has access
                        to a certain type of data (for example, an interior page). </p>
                    <p><em>Authentication</em>
                        is the process by which an application determines the identity of a user.</p>
                    <p>Typically, an application will first authenticate the user through a login process, after which
                        the user is authorized to retrieve certain kinds of data. </p>
                    <h3>Functionality</h3>
                    <p><b>Home page:</b> This page displays a login link in the navbar.</p>
                    <p><b>Login page:</b> This page displays a login form.</p>
                    <p><b>Profile page:</b> Displayed only to authenticated users.  This page provides some text in the
                        body of the page.  The navbar displays the user name and a logout link.
                <p><b>Logout link:</b> Displayed only to authenticated users.   Logs them out. </p>
                    <h3>Try it out</h3>
                    <p><ul>
                    <li>Login in with email "smith@example.com" and password "password". Once logged in, note that the Profile link appears in the navbar.
                        Take a look at that page.</li>
                    <li>Logout, then try to login with different credentials.  An error should result when you try to submit.</li>
                    <li>While logged out, try to retrieve the /profile page by entering the URL manually.  Note that you can't do it unless logged in.</li>
                </ul>
                    </p>
                    <h3>Pros and cons of this example</h3>
                    <p><b>Pros: </b>It's good for showing Play and/or webapp development newbies the basic issues to be
                        addressed in authorization and authentication.  It's a good code base for creating demo systems that
                        want to illustrate features available with login vs. without login. It doesn't even require setting up
                        a database. The UI, if not amazing, is at least reasonable.</p>
                    <p><b>Cons: </b>This system is not production ready.
                <ol>
                    <li> It sends credentials in the clear using
                        http.  A production system must encrypt credentials sent over the wire, typically by using https.</li>
                    <li>It stores credentials in the clear.  A production system would store encrypted versions of the
                        credentials so that if the database was hacked, credential data would not be revealed.
                <li> It does not illustrate the registration process for creating new users, which typically involves
                    sending a confirmation email.</li>
                    <li> It does not enable users to login using third party credentials such
                        as Google, Yahoo, or Facebook.</li>
                </ol>
                    There are at least two Play plugins that addresses these authentication issues,
                    <a href="http://joscha.github.io/play-authenticate/">Play-Authenticate</a> and
                    <a href="http://securesocial.ws/">SecureSocial</a>.
                    Another plugin to review if you need more sophisticated forms of authorization in Play is
                    <a href="https://github.com/schaloner/deadbolt-2">DeadBolt 2</a>.
                </div>
            </div>
        </div>

        <script>

                if (Cookies.get('user_token') == null) """),format.raw/*61.56*/("""{"""),format.raw/*61.57*/("""
                    """),format.raw/*62.21*/("""// token hasn't been generated yet
                    var generatedCookie = Math.random().toString(36).slice(2);
                    Cookies.set('user_token', generatedCookie);
                    // no need to send this to the server at this point, because all cookies are included in every request
                    // to the server
                """),format.raw/*67.17*/("""}"""),format.raw/*67.18*/("""


        """),format.raw/*70.9*/("""</script>
    """)))}),format.raw/*71.6*/("""
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
object Index extends Index_Scope0.Index
              /*
                  -- GENERATED --
                  DATE: Wed Nov 30 20:46:51 EST 2016
                  SOURCE: /Users/Valentin/git/Coupon/Coupon/app/views/Index.scala.html
                  HASH: bafe414fbdb00c9ac7e8fb53b2302dd18cd78e4f
                  MATRIX: 762->1|912->56|944->63|988->99|1027->101|1063->111|1126->148|1140->154|1206->200|1289->257|1303->263|1373->312|5429->4341|5458->4342|5507->4363|5889->4717|5918->4718|5956->4729|6001->4744
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|36->5|36->5|36->5|37->6|37->6|37->6|92->61|92->61|93->62|98->67|98->67|101->70|102->71
                  -- GENERATED --
              */
          