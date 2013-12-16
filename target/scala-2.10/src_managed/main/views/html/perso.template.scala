
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
object perso extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,Utilisateur,List[models.Tweet],Utilisateur,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(
message: String,
profutilisateur: Utilisateur,
tweets: List[models.Tweet],
connectuser: Utilisateur
):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*6.2*/("""
"""),_display_(Seq[Any](/*7.2*/main("Gestion des comptes",connectuser)/*7.41*/ {_display_(Seq[Any](format.raw/*7.43*/("""

<h2> """),_display_(Seq[Any](/*9.7*/message)),format.raw/*9.14*/(""" </h2>

<fieldset>
<h3>Mes Tweets</h3>
 <table class="table table-striped">
        
                <tr>                     
                        <td>Date</td>
                        <td>Tweet</td>
                </tr>
                
        """),_display_(Seq[Any](/*20.10*/for((tweet, i) <- tweets.zipWithIndex.reverse) yield /*20.56*/ {_display_(Seq[Any](format.raw/*20.58*/("""
                <tr>
                        <td>"""),_display_(Seq[Any](/*22.30*/tweet/*22.35*/.creationDate)),format.raw/*22.48*/("""</td>
                        <td>"""),_display_(Seq[Any](/*23.30*/tweet/*23.35*/.label)),format.raw/*23.41*/("""</td>
                </tr>
        """)))})),format.raw/*25.10*/("""
        </table>
       </fieldset>




""")))})))}
    }
    
    def render(message:String,profutilisateur:Utilisateur,tweets:List[models.Tweet],connectuser:Utilisateur): play.api.templates.HtmlFormat.Appendable = apply(message,profutilisateur,tweets,connectuser)
    
    def f:((String,Utilisateur,List[models.Tweet],Utilisateur) => play.api.templates.HtmlFormat.Appendable) = (message,profutilisateur,tweets,connectuser) => apply(message,profutilisateur,tweets,connectuser)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Oct 30 12:46:09 CET 2013
                    SOURCE: C:/Users/ighachane/applications/twitternew/app/views/perso.scala.html
                    HASH: 997a856f7c0322424e9467a9a57a6603a8f6d5c2
                    MATRIX: 817->1|1018->109|1055->112|1102->151|1141->153|1185->163|1213->170|1512->433|1574->479|1614->481|1703->534|1717->539|1752->552|1824->588|1838->593|1866->599|1937->638
                    LINES: 26->1|34->6|35->7|35->7|35->7|37->9|37->9|48->20|48->20|48->20|50->22|50->22|50->22|51->23|51->23|51->23|53->25
                    -- GENERATED --
                */
            