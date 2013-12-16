
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object profile extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,List[models.Utilisateur],Utilisateur,Utilisateur,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(
message: String,
utilisateurs: List[models.Utilisateur],
utilisa : Utilisateur,
userconnect :Utilisateur
):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*6.2*/("""
<!-- index "appelle" main en lui passant en paramètre le titre de la page et le contenu HTML -->

"""),_display_(Seq[Any](/*9.2*/main("Gestion des comptes", userconnect)/*9.42*/ {_display_(Seq[Any](format.raw/*9.44*/("""


<h2> """),_display_(Seq[Any](/*12.7*/message)),format.raw/*12.14*/(""" </h2>

	 <table class="table table-striped">
        
                <tr>
                        <td>Adresse Email</td>
                        <td>Username</td>
                </tr>
                """),_display_(Seq[Any](/*20.18*/if(utilisa != null)/*20.37*/{_display_(Seq[Any](format.raw/*20.38*/("""
                		<tr>
		                        <td>"""),_display_(Seq[Any](/*22.32*/utilisa/*22.39*/.email)),format.raw/*22.45*/("""</td>
		                        <td>"""),_display_(Seq[Any](/*23.32*/utilisa/*23.39*/.username)),format.raw/*23.48*/("""</td>
		
		                </tr>
	</table>   		 		
   """)))}/*27.6*/else/*27.11*/{_display_(Seq[Any](format.raw/*27.12*/("""
   
	                """),_display_(Seq[Any](/*29.19*/for((user, i) <- utilisateurs.zipWithIndex.reverse) yield /*29.70*/ {_display_(Seq[Any](format.raw/*29.72*/("""
						<tr>
			                        <td>"""),_display_(Seq[Any](/*31.33*/user/*31.37*/.email)),format.raw/*31.43*/("""</td>
			                        <td>"""),_display_(Seq[Any](/*32.33*/user/*32.37*/.username)),format.raw/*32.46*/("""</td>
			
			    		</tr>
			    """)))})),format.raw/*35.9*/("""
			    
	</table>
	             	 
		  """)))})),format.raw/*39.6*/("""
                            
 """)))})),format.raw/*41.3*/("""
 
"""))}
    }
    
    def render(message:String,utilisateurs:List[models.Utilisateur],utilisa:Utilisateur,userconnect:Utilisateur): play.api.templates.HtmlFormat.Appendable = apply(message,utilisateurs,utilisa,userconnect)
    
    def f:((String,List[models.Utilisateur],Utilisateur,Utilisateur) => play.api.templates.HtmlFormat.Appendable) = (message,utilisateurs,utilisa,userconnect) => apply(message,utilisateurs,utilisa,userconnect)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Oct 30 12:46:09 CET 2013
                    SOURCE: C:/Users/ighachane/applications/twitternew/app/views/profile.scala.html
                    HASH: 1afc868809768bd5ebe94cf9af26678c425a8b8b
                    MATRIX: 825->1|1031->114|1168->217|1216->257|1255->259|1302->271|1331->278|1579->490|1607->509|1646->510|1739->567|1755->574|1783->580|1857->618|1873->625|1904->634|1981->694|1994->699|2033->700|2094->725|2161->776|2201->778|2283->824|2296->828|2324->834|2399->873|2412->877|2443->886|2510->922|2586->967|2651->1001
                    LINES: 26->1|34->6|37->9|37->9|37->9|40->12|40->12|48->20|48->20|48->20|50->22|50->22|50->22|51->23|51->23|51->23|55->27|55->27|55->27|57->29|57->29|57->29|59->31|59->31|59->31|60->32|60->32|60->32|63->35|67->39|69->41
                    -- GENERATED --
                */
            