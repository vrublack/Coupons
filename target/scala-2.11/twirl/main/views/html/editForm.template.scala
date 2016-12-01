
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object editForm_Scope0 {
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

class editForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Long,Form[Coupon],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, couponForm: Form[Coupon]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import b3.vertical.fieldConstructor  // Declares a vertical field constructor as default

Seq[Any](format.raw/*1.38*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*6.1*/("""
"""),_display_(/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""

"""),format.raw/*9.1*/("""<h1>Edit coupon</h1>

"""),_display_(/*11.2*/b3/*11.4*/.form(routes.HomeController.update(id))/*11.43*/ {_display_(Seq[Any](format.raw/*11.45*/("""

"""),format.raw/*13.1*/("""<fieldset>
    """),_display_(/*14.6*/b3/*14.8*/.text(couponForm("name"), '_label -> "Coupon name", '_help -> "")),format.raw/*14.73*/("""
    """),_display_(/*15.6*/b3/*15.8*/.text(couponForm("description"), '_label -> "Description", '_help -> "")),format.raw/*15.80*/("""
    """),_display_(/*16.6*/b3/*16.8*/.text(couponForm("promocode"), '_label -> "Promocode", '_help -> "")),format.raw/*16.76*/("""
    """),_display_(/*17.6*/b3/*17.8*/.number(couponForm("discountRate"), '_label -> "Discount rate", '_help -> "")),format.raw/*17.85*/("""
    """),_display_(/*18.6*/b3/*18.8*/.text(couponForm("expirationDate"), '_label -> "Expiration date", '_help -> "")),format.raw/*18.87*/("""
    """),_display_(/*19.6*/b3/*19.8*/.text(couponForm("bemail"), '_label -> "Business email", '_help -> "")),format.raw/*19.78*/("""
"""),format.raw/*20.1*/("""</fieldset>

<div class="actions">
    <input type="submit" value="Save this coupon" class="btn primary"> or
    <a href=""""),_display_(/*24.15*/routes/*24.21*/.HomeController.list()),format.raw/*24.43*/("""" class="btn">Cancel</a>
</div>

""")))}),format.raw/*27.2*/("""

"""),_display_(/*29.2*/b3/*29.4*/.form(routes.HomeController.delete(id), 'class -> "topRight")/*29.65*/ {_display_(Seq[Any](format.raw/*29.67*/("""
"""),format.raw/*30.1*/("""<input type="submit" value="Delete this coupon" class="btn danger">
""")))}),format.raw/*31.2*/("""

""")))}),format.raw/*33.2*/("""
"""))
      }
    }
  }

  def render(id:Long,couponForm:Form[Coupon]): play.twirl.api.HtmlFormat.Appendable = apply(id,couponForm)

  def f:((Long,Form[Coupon]) => play.twirl.api.HtmlFormat.Appendable) = (id,couponForm) => apply(id,couponForm)

  def ref: this.type = this

}


}

/**/
object editForm extends editForm_Scope0.editForm
              /*
                  -- GENERATED --
                  DATE: Wed Nov 30 21:55:39 EST 2016
                  SOURCE: /Users/johnrock/Desktop/Coupons/app/views/editForm.scala.html
                  HASH: e174fab0f3e0b1c9ca146c8384df458849edd051
                  MATRIX: 762->1|997->37|1025->56|1052->147|1079->149|1090->153|1128->155|1156->157|1205->180|1215->182|1263->221|1303->223|1332->225|1374->241|1384->243|1470->308|1502->314|1512->316|1605->388|1637->394|1647->396|1736->464|1768->470|1778->472|1876->549|1908->555|1918->557|2018->636|2050->642|2060->644|2151->714|2179->715|2329->838|2344->844|2387->866|2451->900|2480->903|2490->905|2560->966|2600->968|2628->969|2727->1038|2760->1041
                  LINES: 27->1|33->1|35->4|36->6|37->7|37->7|37->7|39->9|41->11|41->11|41->11|41->11|43->13|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|49->19|49->19|49->19|50->20|54->24|54->24|54->24|57->27|59->29|59->29|59->29|59->29|60->30|61->31|63->33
                  -- GENERATED --
              */
          