
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object list_Scope0 {
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

class list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[com.avaje.ebean.PagedList[Coupon],String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentPage: com.avaje.ebean.PagedList[Coupon], currentSortBy: String, currentOrder: String, currentFilter: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*32.2*/header/*32.8*/(key:String, title:String):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*32.38*/("""
"""),format.raw/*33.1*/("""<th class=""""),_display_(/*33.13*/key/*33.16*/.replace(".","_")),format.raw/*33.33*/(""" """),format.raw/*33.34*/("""header """),_display_(/*33.42*/if(currentSortBy == key){/*33.68*/{if(currentOrder == "asc") "headerSortDown" else "headerSortUp"}}),format.raw/*33.132*/("""">
<a href=""""),_display_(/*34.11*/link(0, key)),format.raw/*34.23*/("""">"""),_display_(/*34.26*/title),format.raw/*34.31*/("""</a>
</th>
""")))};def /*6.2*/link/*6.6*/(newPage:Int, newSortBy:String) = {{

var sortBy = currentSortBy
var order = currentOrder

if(newSortBy != null) {
sortBy = newSortBy
if(currentSortBy == newSortBy) {
if(currentOrder == "asc") {
order = "desc"
} else {
order = "asc"
}
} else {
order = "asc"
}
}

// Generate the link
routes.HomeController.list(newPage, sortBy, order, currentFilter)

}};
Seq[Any](format.raw/*1.118*/("""

"""),format.raw/*5.42*/("""
"""),format.raw/*27.2*/("""

"""),format.raw/*31.37*/("""
"""),format.raw/*36.2*/("""

"""),_display_(/*38.2*/main/*38.6*/ {_display_(Seq[Any](format.raw/*38.8*/("""

"""),format.raw/*40.1*/("""<h1 id="homeTitle">"""),_display_(/*40.21*/Messages("coupons.list.title", currentPage.getTotalRowCount)),format.raw/*40.81*/("""</h1>

"""),_display_(/*42.2*/if(flash.containsKey("success"))/*42.34*/ {_display_(Seq[Any](format.raw/*42.36*/("""
"""),format.raw/*43.1*/("""<div class="alert-message warning">
    <strong>Done!</strong> """),_display_(/*44.29*/flash/*44.34*/.get("success")),format.raw/*44.49*/("""
"""),format.raw/*45.1*/("""</div>
""")))}),format.raw/*46.2*/("""

"""),format.raw/*48.1*/("""<div id="actions">

    <form action=""""),_display_(/*50.20*/link(0, "name")),format.raw/*50.35*/("""" method="GET">
    <input type="search" id="searchbox" name="f" value=""""),_display_(/*51.58*/currentFilter),format.raw/*51.71*/("""" placeholder="Filter by coupon name...">
    <input type="submit" id="searchsubmit" value="Filter by name" class="btn primary">
    </form>

    <a class="btn success" id="add" href=""""),_display_(/*55.44*/routes/*55.50*/.HomeController.create()),format.raw/*55.74*/("""">Add a new coupon</a>

</div>

"""),_display_(/*59.2*/if(currentPage.getTotalRowCount == 0)/*59.39*/ {_display_(Seq[Any](format.raw/*59.41*/("""

"""),format.raw/*61.1*/("""<div class="well">
    <em>Nothing to display</em>
</div>

""")))}/*65.3*/else/*65.8*/{_display_(Seq[Any](format.raw/*65.9*/("""

"""),format.raw/*67.1*/("""<table class="computers zebra-striped">
    <thead>
    <tr>
        """),_display_(/*70.10*/header("name", "Coupon name")),format.raw/*70.39*/("""
        """),_display_(/*71.10*/header("description", "Description")),format.raw/*71.46*/("""
        """),_display_(/*72.10*/header("promocode", "Promocode")),format.raw/*72.42*/("""
        """),_display_(/*73.10*/header("discountRate", "Discount rate")),format.raw/*73.49*/("""
        """),_display_(/*74.10*/header("expirationDate", "Expiration date")),format.raw/*74.53*/("""
        """),_display_(/*75.10*/header("bemail", "Business email")),format.raw/*75.44*/("""
    """),format.raw/*76.5*/("""</tr>
    </thead>
    <tbody>

    """),_display_(/*80.6*/for(coupon <- currentPage.getList) yield /*80.40*/ {_display_(Seq[Any](format.raw/*80.42*/("""
    """),format.raw/*81.5*/("""<tr>
        <td><a href=""""),_display_(/*82.23*/routes/*82.29*/.HomeController.edit(coupon.id)),format.raw/*82.60*/("""">"""),_display_(/*82.63*/coupon/*82.69*/.name),format.raw/*82.74*/("""</a></td>
        <td>
            """),_display_(/*84.14*/if(coupon.description == null)/*84.44*/ {_display_(Seq[Any](format.raw/*84.46*/("""
            """),format.raw/*85.13*/("""<em>-</em>
            """)))}/*86.15*/else/*86.20*/{_display_(Seq[Any](format.raw/*86.21*/("""
            """),_display_(/*87.14*/coupon/*87.20*/.description),format.raw/*87.32*/("""
            """)))}),format.raw/*88.14*/("""
        """),format.raw/*89.9*/("""</td>
        <td>
            """),_display_(/*91.14*/if(coupon.promocode == null)/*91.42*/ {_display_(Seq[Any](format.raw/*91.44*/("""
            """),format.raw/*92.13*/("""<em>-</em>
            """)))}/*93.15*/else/*93.20*/{_display_(Seq[Any](format.raw/*93.21*/("""
            """),_display_(/*94.14*/coupon/*94.20*/.promocode),format.raw/*94.30*/("""
            """)))}),format.raw/*95.14*/("""
        """),format.raw/*96.9*/("""</td>
        <td>
            """),_display_(/*98.14*/if(coupon.discountRate == null)/*98.45*/ {_display_(Seq[Any](format.raw/*98.47*/("""
            """),format.raw/*99.13*/("""<em>-</em>
            """)))}/*100.15*/else/*100.20*/{_display_(Seq[Any](format.raw/*100.21*/("""
            """),_display_(/*101.14*/coupon/*101.20*/.discountRate),format.raw/*101.33*/("""
            """)))}),format.raw/*102.14*/("""
        """),format.raw/*103.9*/("""</td>
        <td>
            """),_display_(/*105.14*/if(coupon.expirationDate == null)/*105.47*/ {_display_(Seq[Any](format.raw/*105.49*/("""
            """),format.raw/*106.13*/("""<em>-</em>
            """)))}/*107.15*/else/*107.20*/{_display_(Seq[Any](format.raw/*107.21*/("""
            """),_display_(/*108.14*/coupon/*108.20*/.expirationDate),format.raw/*108.35*/("""
            """)))}),format.raw/*109.14*/("""
        """),format.raw/*110.9*/("""</td>
        <td>
            """),_display_(/*112.14*/if(coupon.bemail == null)/*112.39*/ {_display_(Seq[Any](format.raw/*112.41*/("""
            """),format.raw/*113.13*/("""<em>-</em>
            """)))}/*114.15*/else/*114.20*/{_display_(Seq[Any](format.raw/*114.21*/("""
            """),_display_(/*115.14*/coupon/*115.20*/.bemail),format.raw/*115.27*/("""
            """)))}),format.raw/*116.14*/("""
        """),format.raw/*117.9*/("""</td>
    </tr>
    """)))}),format.raw/*119.6*/("""

    """),format.raw/*121.5*/("""</tbody>
</table>

<div id="pagination" class="pagination">
    <ul>
        """),_display_(/*126.10*/if(currentPage.hasPrev)/*126.33*/ {_display_(Seq[Any](format.raw/*126.35*/("""
        """),format.raw/*127.9*/("""<li class="prev">
            <a href=""""),_display_(/*128.23*/link(currentPage.getPageIndex - 1, null)),format.raw/*128.63*/("""">&larr; Previous</a>
        </li>
        """)))}/*130.11*/else/*130.16*/{_display_(Seq[Any](format.raw/*130.17*/("""
        """),format.raw/*131.9*/("""<li class="prev disabled">
            <a>&larr; Previous</a>
        </li>
        """)))}),format.raw/*134.10*/("""
        """),format.raw/*135.9*/("""<li class="current">
            <a>Displaying """),_display_(/*136.28*/currentPage/*136.39*/.getDisplayXtoYofZ(" to "," of ")),format.raw/*136.72*/("""</a>
        </li>
        """),_display_(/*138.10*/if(currentPage.hasNext)/*138.33*/ {_display_(Seq[Any](format.raw/*138.35*/("""
        """),format.raw/*139.9*/("""<li class="next">
            <a href=""""),_display_(/*140.23*/link(currentPage.getPageIndex + 1, null)),format.raw/*140.63*/("""">Next &rarr;</a>
        </li>
        """)))}/*142.11*/else/*142.16*/{_display_(Seq[Any](format.raw/*142.17*/("""
        """),format.raw/*143.9*/("""<li class="next disabled">
            <a>Next &rarr;</a>
        </li>
        """)))}),format.raw/*146.10*/("""
    """),format.raw/*147.5*/("""</ul>
</div>

""")))}),format.raw/*150.2*/("""

""")))}))
      }
    }
  }

  def render(currentPage:com.avaje.ebean.PagedList[Coupon],currentSortBy:String,currentOrder:String,currentFilter:String): play.twirl.api.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter)

  def f:((com.avaje.ebean.PagedList[Coupon],String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter) => apply(currentPage,currentSortBy,currentOrder,currentFilter)

  def ref: this.type = this

}


}

/**/
object list extends list_Scope0.list
              /*
                  -- GENERATED --
                  DATE: Thu Dec 01 00:30:29 EST 2016
                  SOURCE: /Users/Valentin/git/Coupon/Coupon/app/views/list.scala.html
                  HASH: 51d4deff64ec56b03780c22fe2d2115cbd2014ea
                  MATRIX: 791->1|986->714|1000->720|1107->750|1135->751|1174->763|1186->766|1224->783|1253->784|1288->792|1322->818|1409->882|1449->895|1482->907|1512->910|1538->915|1572->246|1583->250|1966->117|1995->244|2023->602|2053->712|2081->927|2110->930|2122->934|2161->936|2190->938|2237->958|2318->1018|2352->1026|2393->1058|2433->1060|2461->1061|2552->1125|2566->1130|2602->1145|2630->1146|2668->1154|2697->1156|2763->1195|2799->1210|2899->1283|2933->1296|3145->1481|3160->1487|3205->1511|3264->1544|3310->1581|3350->1583|3379->1585|3457->1646|3469->1651|3507->1652|3536->1654|3633->1724|3683->1753|3720->1763|3777->1799|3814->1809|3867->1841|3904->1851|3964->1890|4001->1900|4065->1943|4102->1953|4157->1987|4189->1992|4252->2029|4302->2063|4342->2065|4374->2070|4428->2097|4443->2103|4495->2134|4525->2137|4540->2143|4566->2148|4629->2184|4668->2214|4708->2216|4749->2229|4792->2254|4805->2259|4844->2260|4885->2274|4900->2280|4933->2292|4978->2306|5014->2315|5073->2347|5110->2375|5150->2377|5191->2390|5234->2415|5247->2420|5286->2421|5327->2435|5342->2441|5373->2451|5418->2465|5454->2474|5513->2506|5553->2537|5593->2539|5634->2552|5678->2577|5692->2582|5732->2583|5774->2597|5790->2603|5825->2616|5871->2630|5908->2639|5968->2671|6011->2704|6052->2706|6094->2719|6138->2744|6152->2749|6192->2750|6234->2764|6250->2770|6287->2785|6333->2799|6370->2808|6430->2840|6465->2865|6506->2867|6548->2880|6592->2905|6606->2910|6646->2911|6688->2925|6704->2931|6733->2938|6779->2952|6816->2961|6868->2982|6902->2988|7008->3066|7041->3089|7082->3091|7119->3100|7187->3140|7249->3180|7314->3226|7328->3231|7368->3232|7405->3241|7522->3326|7559->3335|7635->3383|7656->3394|7711->3427|7767->3455|7800->3478|7841->3480|7878->3489|7946->3529|8008->3569|8069->3611|8083->3616|8123->3617|8160->3626|8273->3707|8306->3712|8352->3727
                  LINES: 27->1|31->32|31->32|33->32|34->33|34->33|34->33|34->33|34->33|34->33|34->33|34->33|35->34|35->34|35->34|35->34|37->6|37->6|59->1|61->5|62->27|64->31|65->36|67->38|67->38|67->38|69->40|69->40|69->40|71->42|71->42|71->42|72->43|73->44|73->44|73->44|74->45|75->46|77->48|79->50|79->50|80->51|80->51|84->55|84->55|84->55|88->59|88->59|88->59|90->61|94->65|94->65|94->65|96->67|99->70|99->70|100->71|100->71|101->72|101->72|102->73|102->73|103->74|103->74|104->75|104->75|105->76|109->80|109->80|109->80|110->81|111->82|111->82|111->82|111->82|111->82|111->82|113->84|113->84|113->84|114->85|115->86|115->86|115->86|116->87|116->87|116->87|117->88|118->89|120->91|120->91|120->91|121->92|122->93|122->93|122->93|123->94|123->94|123->94|124->95|125->96|127->98|127->98|127->98|128->99|129->100|129->100|129->100|130->101|130->101|130->101|131->102|132->103|134->105|134->105|134->105|135->106|136->107|136->107|136->107|137->108|137->108|137->108|138->109|139->110|141->112|141->112|141->112|142->113|143->114|143->114|143->114|144->115|144->115|144->115|145->116|146->117|148->119|150->121|155->126|155->126|155->126|156->127|157->128|157->128|159->130|159->130|159->130|160->131|163->134|164->135|165->136|165->136|165->136|167->138|167->138|167->138|168->139|169->140|169->140|171->142|171->142|171->142|172->143|175->146|176->147|179->150
                  -- GENERATED --
              */
          