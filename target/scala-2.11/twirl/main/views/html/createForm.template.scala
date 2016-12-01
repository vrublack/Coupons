
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object createForm_Scope0 {
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

class createForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Coupon],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(couponForm: Form[Coupon]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import b3.vertical.fieldConstructor

Seq[Any](format.raw/*1.28*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*6.1*/("""
"""),_display_(/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""

"""),format.raw/*9.1*/("""<h1>Add a computer</h1>

"""),_display_(/*11.2*/b3/*11.4*/.form(routes.HomeController.save())/*11.39*/ {_display_(Seq[Any](format.raw/*11.41*/("""

"""),format.raw/*13.1*/("""<fieldset>
    """),_display_(/*14.6*/b3/*14.8*/.text(couponForm("name"), '_label -> "Coupon name", '_help -> "")),format.raw/*14.73*/("""
    """),_display_(/*15.6*/b3/*15.8*/.text(couponForm("description"), '_label -> "Description", '_help -> "")),format.raw/*15.80*/("""
    """),_display_(/*16.6*/b3/*16.8*/.text(couponForm("promocode"), '_label -> "Promocode", '_help -> "")),format.raw/*16.76*/("""
    """),_display_(/*17.6*/b3/*17.8*/.number(couponForm("discountRate"), '_label -> "Discount rate", '_help -> "")),format.raw/*17.85*/("""
    """),_display_(/*18.6*/b3/*18.8*/.text(couponForm("expirationDate"), '_label -> "Expiration date", '_help -> "")),format.raw/*18.87*/("""
    """),_display_(/*19.6*/b3/*19.8*/.text(couponForm("bemail"), '_label -> "Business email", '_help -> "")),format.raw/*19.78*/("""
"""),format.raw/*20.1*/("""</fieldset>

<div class="actions">
    <input type="submit" value="Create this coupon" class="btn primary"> or
    <a href=""""),_display_(/*24.15*/routes/*24.21*/.HomeController.list()),format.raw/*24.43*/("""" class="btn">Cancel</a>
</div>

""")))}),format.raw/*27.2*/("""

""")))}))
      }
    }
  }

  def render(couponForm:Form[Coupon]): play.twirl.api.HtmlFormat.Appendable = apply(couponForm)

  def f:((Form[Coupon]) => play.twirl.api.HtmlFormat.Appendable) = (couponForm) => apply(couponForm)

  def ref: this.type = this

}


}

/**/
object createForm extends createForm_Scope0.createForm
              /*
                  -- GENERATED --
                  DATE: Thu Dec 01 00:30:29 EST 2016
                  SOURCE: /Users/Valentin/git/Coupon/Coupon/app/views/createForm.scala.html
                  HASH: b9f550c6c46181729ccb8ac79cbe895310f9dadf
                  MATRIX: 761->1|933->27|961->46|988->84|1015->86|1026->90|1064->92|1092->94|1144->120|1154->122|1198->157|1238->159|1267->161|1309->177|1319->179|1405->244|1437->250|1447->252|1540->324|1572->330|1582->332|1671->400|1703->406|1713->408|1811->485|1843->491|1853->493|1953->572|1985->578|1995->580|2086->650|2114->651|2266->776|2281->782|2324->804|2388->838
                  LINES: 27->1|33->1|35->4|36->6|37->7|37->7|37->7|39->9|41->11|41->11|41->11|41->11|43->13|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|49->19|49->19|49->19|50->20|54->24|54->24|54->24|57->27
                  -- GENERATED --
              */
          