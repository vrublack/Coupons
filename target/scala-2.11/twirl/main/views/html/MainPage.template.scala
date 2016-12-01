
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object MainPage_Scope0 {
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

class MainPage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,Boolean,UserInfo,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(page: String, isLoggedIn: Boolean, userInfo: UserInfo)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.72*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(/*7.17*/page),format.raw/*7.21*/(""" """),format.raw/*7.22*/("""(play-example-login)</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">

            <!--  Load site-specific customizations after bootstrap. -->
        <link rel="stylesheet" media="screen" href=""""),_display_(/*12.54*/routes/*12.60*/.Assets.at("stylesheets/main.css")),format.raw/*12.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*13.59*/routes/*13.65*/.Assets.at("images/favicon.png")),format.raw/*13.97*/("""">

            <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
            <!--[if lt IE 9]>
          <script src="http://cdnjs.cloudflare.com/ajax/libs/html5shiv/3.6.2/html5shiv.js"></script>
          <script src="http://cdnjs.cloudflare.com/ajax/libs/respond.js/1.2.0/respond.js"></script>
        <![endif]-->
    </head>
    <body>

            <!-- Responsive navbar -->
        <div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                            <!--  Display three horizontal lines when navbar collapsed. -->
                        <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="/">play-example-login</a>
                </div>
                <div class="collapse navbar-collapse">
                    <ul class="nav navbar-nav navbar-left">
                    """),_display_(/*35.22*/if(isLoggedIn)/*35.36*/ {_display_(Seq[Any](format.raw/*35.38*/("""
                        """),format.raw/*36.25*/("""<li class=""""),_display_(/*36.37*/("active".when(page == "Profile"))),format.raw/*36.71*/(""""><a href=""""),_display_(/*36.83*/routes/*36.89*/.Application.profile()),format.raw/*36.111*/("""">Profile</a></li>
                    """)))}),format.raw/*37.22*/("""
                    """),format.raw/*38.21*/("""</ul>
                    <ul class="nav navbar-nav navbar-right">
                    """),_display_(/*40.22*/if(isLoggedIn)/*40.36*/ {_display_(Seq[Any](format.raw/*40.38*/("""
                        """),format.raw/*41.25*/("""<li><p class="navbar-text">"""),_display_(/*41.53*/userInfo/*41.61*/.getEmail()),format.raw/*41.72*/("""</p></li>
                        <li><a href=""""),_display_(/*42.39*/routes/*42.45*/.Application.logout()),format.raw/*42.66*/("""">Logout</a></li>
                    """)))}/*43.23*/else/*43.28*/{_display_(Seq[Any](format.raw/*43.29*/("""
                        """),format.raw/*44.25*/("""<li><a href=""""),_display_(/*44.39*/routes/*44.45*/.Application.login()),format.raw/*44.65*/("""">Login</a></li>
                    """)))}),format.raw/*45.22*/("""

                    """),format.raw/*47.21*/("""</ul>
                </div>
            </div>
        </div>
        """),_display_(/*51.10*/content),format.raw/*51.17*/("""
            """),format.raw/*52.13*/("""<!-- Load Bootstrap JavaScript components. HTMLUnit (used in testing) requires JQuery 1.8.3 or below). -->
        <script src="http://code.jquery.com/jquery-1.8.3.min.js"></script>
        <script src="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(page:String,isLoggedIn:Boolean,userInfo:UserInfo,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(page,isLoggedIn,userInfo)(content)

  def f:((String,Boolean,UserInfo) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (page,isLoggedIn,userInfo) => (content) => apply(page,isLoggedIn,userInfo)(content)

  def ref: this.type = this

}


}

/**/
object MainPage extends MainPage_Scope0.MainPage
              /*
                  -- GENERATED --
                  DATE: Wed Nov 30 20:46:51 EST 2016
                  SOURCE: /Users/Valentin/git/Coupon/Coupon/app/views/MainPage.scala.html
                  HASH: 3f415cef10ca9e77c8cedd2a8a82980d1cbdca4f
                  MATRIX: 773->1|938->71|966->73|1043->124|1067->128|1095->129|1465->472|1480->478|1535->512|1623->573|1638->579|1691->611|2884->1777|2907->1791|2947->1793|3000->1818|3039->1830|3094->1864|3133->1876|3148->1882|3192->1904|3263->1944|3312->1965|3427->2053|3450->2067|3490->2069|3543->2094|3598->2122|3615->2130|3647->2141|3722->2189|3737->2195|3779->2216|3837->2256|3850->2261|3889->2262|3942->2287|3983->2301|3998->2307|4039->2327|4108->2365|4158->2387|4257->2459|4285->2466|4326->2479
                  LINES: 27->1|32->1|34->3|38->7|38->7|38->7|43->12|43->12|43->12|44->13|44->13|44->13|66->35|66->35|66->35|67->36|67->36|67->36|67->36|67->36|67->36|68->37|69->38|71->40|71->40|71->40|72->41|72->41|72->41|72->41|73->42|73->42|73->42|74->43|74->43|74->43|75->44|75->44|75->44|75->44|76->45|78->47|82->51|82->51|83->52
                  -- GENERATED --
              */
          