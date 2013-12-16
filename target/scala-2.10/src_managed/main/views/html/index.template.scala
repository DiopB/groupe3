
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,Utilisateur,List[models.Tweet],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(
message: String,
utilisateur: Utilisateur,
tweets: List[models.Tweet]
):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*5.2*/("""
<!-- index "appelle" main en lui passant en paramètre le titre de la page et le contenu HTML -->
"""),_display_(Seq[Any](/*7.2*/main("Gestion des comptes",utilisateur)/*7.41*/ {_display_(Seq[Any](format.raw/*7.43*/("""
	    
      <!--  Formulaire des Tweets-->
	<fieldset>
		<h2> Nouveau Tweet </h2>
		<form method="post" action="/tweet/add">
			<input type="text" name="label" placeholder="écrire un nouveau Tweet">
			<input type="hidden" name="user_email" value=""""),_display_(Seq[Any](/*14.51*/utilisateur/*14.62*/.email)),format.raw/*14.68*/(""""> 
			<button type="submit" class="btn">publier</button>
		</form>
	</fieldset>
	<!-- Liste des Tweets -->
	 <table class="table table-striped">
        
                <tr>
                        <td>nb Tweet</td>
                        <td>ID</td>
                        <td>Date</td>
                        <td>Username</td>
                        <td>Tweet</td>
                </tr>
                
        """),_display_(Seq[Any](/*29.10*/for((tweet, i) <- tweets.zipWithIndex.reverse) yield /*29.56*/ {_display_(Seq[Any](format.raw/*29.58*/("""
                <tr>
                        <td>"""),_display_(Seq[Any](/*31.30*/i)),format.raw/*31.31*/("""</td>
                        <td>"""),_display_(Seq[Any](/*32.30*/tweet/*32.35*/.id)),format.raw/*32.38*/("""</td>
                        <td>"""),_display_(Seq[Any](/*33.30*/tweet/*33.35*/.creationDate)),format.raw/*33.48*/("""</td>
                        <td>"""),_display_(Seq[Any](/*34.30*/tweet/*34.35*/.user.username)),format.raw/*34.49*/("""</td>
                        <td>"""),_display_(Seq[Any](/*35.30*/tweet/*35.35*/.label)),format.raw/*35.41*/("""</td>
                </tr>
        """)))})),format.raw/*37.10*/("""
        </table>
        
        Il y a au total """),_display_(Seq[Any](/*40.26*/tweets/*40.32*/.size)),format.raw/*40.37*/(""" tweets.
     <!-- message d'erreur si l'utilisateur ne respecte pas les contraintes faite sur le modele   -->
    </ul> 
     """),_display_(Seq[Any](/*43.7*/if(flash.containsKey("error"))/*43.37*/ {_display_(Seq[Any](format.raw/*43.39*/("""
        <div class="alert alert-error"> <!-- ceci est un style twitter bootstrap -->
            <strong>Oups!</strong> """),_display_(Seq[Any](/*45.37*/flash/*45.42*/.get("error"))),format.raw/*45.55*/("""
        </div>
    """)))})),format.raw/*47.6*/("""
       

""")))})),format.raw/*50.2*/("""
"""))}
    }
    
    def render(message:String,utilisateur:Utilisateur,tweets:List[models.Tweet]): play.api.templates.HtmlFormat.Appendable = apply(message,utilisateur,tweets)
    
    def f:((String,Utilisateur,List[models.Tweet]) => play.api.templates.HtmlFormat.Appendable) = (message,utilisateur,tweets) => apply(message,utilisateur,tweets)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Oct 30 12:46:09 CET 2013
                    SOURCE: C:/Users/ighachane/applications/twitternew/app/views/index.scala.html
                    HASH: 57da9665a8c1f5cc427a2e2b58760cf71e6765f4
                    MATRIX: 805->1|975->78|1110->179|1157->218|1196->220|1489->477|1509->488|1537->494|2009->930|2071->976|2111->978|2200->1031|2223->1032|2295->1068|2309->1073|2334->1076|2406->1112|2420->1117|2455->1130|2527->1166|2541->1171|2577->1185|2649->1221|2663->1226|2691->1232|2762->1271|2853->1326|2868->1332|2895->1337|3061->1468|3100->1498|3140->1500|3300->1624|3314->1629|3349->1642|3403->1665|3448->1679
                    LINES: 26->1|33->5|35->7|35->7|35->7|42->14|42->14|42->14|57->29|57->29|57->29|59->31|59->31|60->32|60->32|60->32|61->33|61->33|61->33|62->34|62->34|62->34|63->35|63->35|63->35|65->37|68->40|68->40|68->40|71->43|71->43|71->43|73->45|73->45|73->45|75->47|78->50
                    -- GENERATED --
                */
            