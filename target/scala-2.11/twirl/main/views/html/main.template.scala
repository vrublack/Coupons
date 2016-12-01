
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
<head>
    <title>Coupons database</title>
    """),format.raw/*13.43*/("""
    """),format.raw/*14.5*/("""<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*14.66*/routes/*14.72*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*14.115*/("""">

    <link rel="stylesheet" media="screen" href=""""),_display_(/*16.50*/routes/*16.56*/.Assets.at("stylesheets/main.css")),format.raw/*16.90*/(""""/>
</head>
<body>

<header class="topbar">
    <h1 class="fill">
        <a href=""""),_display_(/*22.19*/routes/*22.25*/.HomeController.index()),format.raw/*22.48*/("""">
            Coupon database
        </a>
    </h1>
</header>

<section id="main">
    """),_display_(/*29.6*/content),format.raw/*29.13*/("""
"""),format.raw/*30.1*/("""</section>

</body>
</html>"""))
      }
    }
  }

  def render(content:Html): play.twirl.api.HtmlFormat.Appendable = apply(content)

  def f:((Html) => play.twirl.api.HtmlFormat.Appendable) = (content) => apply(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Thu Dec 01 00:30:29 EST 2016
                  SOURCE: /Users/Valentin/git/Coupon/Coupon/app/views/main.scala.html
                  HASH: 8943dcf6300fb2d5cec31f6046b605ec30a6d103
                  MATRIX: 741->1|851->16|879->18|977->563|1009->568|1097->629|1112->635|1177->678|1257->731|1272->737|1327->771|1438->855|1453->861|1497->884|1613->974|1641->981|1669->982
                  LINES: 27->1|32->1|34->3|38->13|39->14|39->14|39->14|39->14|41->16|41->16|41->16|47->22|47->22|47->22|54->29|54->29|55->30
                  -- GENERATED --
              */
          