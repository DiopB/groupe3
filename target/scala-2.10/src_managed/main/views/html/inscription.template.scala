
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
object inscription extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,List[models.Utilisateur],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(
message: String,
Utilisateurs: List[models.Utilisateur]
):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*4.2*/("""
"""),_display_(Seq[Any](/*5.2*/main("Gestion des comptes",null)/*5.34*/ {_display_(Seq[Any](format.raw/*5.36*/("""
	<h1>Nouveau sur Twitter ? Inscrivez-vous</h1>
	<h6>"""),_display_(Seq[Any](/*7.7*/message)),format.raw/*7.14*/("""</h6>
	<!--  Formulaire d'inscription-->
	<fieldset>
		<h2> Nouveau Utilisateur <h2> 
		<form method="post" action="/user/add">
			<input type="text" name="username" placeholder="username"><br>
			<select name ="sexe">
			<option value="male">Male</option>
			<option value="female">Female</option></select><br>
			<input type="email" name="email" placeholder="Email"><br>
			<input type="password" name="password" placeholder="password"><br>
			<button type="submit" class="btn">S'inscrire sur Twitter</button>
		</form>
	</fieldset>
	<ul>
	"""),_display_(Seq[Any](/*22.3*/for(utilisateur <- Utilisateurs) yield /*22.35*/ {_display_(Seq[Any](format.raw/*22.37*/("""
                <li>"""),_display_(Seq[Any](/*23.22*/utilisateur/*23.33*/.email)),format.raw/*23.39*/("""  """),_display_(Seq[Any](/*23.42*/utilisateur/*23.53*/.username)),format.raw/*23.62*/(""" """),_display_(Seq[Any](/*23.64*/utilisateur/*23.75*/.password)),format.raw/*23.84*/(""" """),_display_(Seq[Any](/*23.86*/utilisateur/*23.97*/.date_inscription)),format.raw/*23.114*/("""  </li>
            """)))})),format.raw/*24.14*/("""
            </ul>
	""")))})),format.raw/*26.3*/("""
"""))}
    }
    
    def render(message:String,Utilisateurs:List[models.Utilisateur]): play.api.templates.HtmlFormat.Appendable = apply(message,Utilisateurs)
    
    def f:((String,List[models.Utilisateur]) => play.api.templates.HtmlFormat.Appendable) = (message,Utilisateurs) => apply(message,Utilisateurs)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Oct 30 12:46:09 CET 2013
                    SOURCE: C:/Users/ighachane/applications/twitternew/app/views/inscription.scala.html
                    HASH: 700ef11e07c23061421c0434f79d7b2bcf32b118
                    MATRIX: 805->1|960->63|997->66|1037->98|1076->100|1166->156|1194->163|1787->721|1835->753|1875->755|1934->778|1954->789|1982->795|2021->798|2041->809|2072->818|2110->820|2130->831|2161->840|2199->842|2219->853|2259->870|2313->892|2367->915
                    LINES: 26->1|32->4|33->5|33->5|33->5|35->7|35->7|50->22|50->22|50->22|51->23|51->23|51->23|51->23|51->23|51->23|51->23|51->23|51->23|51->23|51->23|51->23|52->24|54->26
                    -- GENERATED --
                */
            