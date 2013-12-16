
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
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Authentication.AuthenticatedUser],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(form: Form[Authentication.AuthenticatedUser]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.48*/("""

    """),_display_(Seq[Any](/*3.6*/main("Authentification", null)/*3.36*/ {_display_(Seq[Any](format.raw/*3.38*/("""

        """),_display_(Seq[Any](/*5.10*/helper/*5.16*/.form(routes.Authentication.authenticate)/*5.57*/ {_display_(Seq[Any](format.raw/*5.59*/("""

            <h2>Qui êtes vous ?</h2>

            """),_display_(Seq[Any](/*9.14*/if(form.hasGlobalErrors)/*9.38*/ {_display_(Seq[Any](format.raw/*9.40*/(""" 
                <p class="error">"""),_display_(Seq[Any](/*10.35*/form/*10.39*/.globalError.message)),format.raw/*10.59*/("""</p>
            """)))})),format.raw/*11.14*/("""

            """),_display_(Seq[Any](/*13.14*/if(flash.contains("success"))/*13.43*/ {_display_(Seq[Any](format.raw/*13.45*/("""
                <p class="success">"""),_display_(Seq[Any](/*14.37*/flash/*14.42*/.get("success"))),format.raw/*14.57*/("""</p>
            """)))})),format.raw/*15.14*/("""

            <p><input type="email" name="email" placeholder="Email" 
                value=""""),_display_(Seq[Any](/*18.25*/form("email")/*18.38*/.value)),format.raw/*18.44*/(""""></p>
            <p><input type="password" name="password" placeholder="Password"></p>
            <p><button class="btn" type="submit">Login</button></p>
            <a href=""""),_display_(Seq[Any](/*21.23*/routes/*21.29*/.Inscription.index())),format.raw/*21.49*/("""">Nouveau sur Twitter ? Inscrivez-vous</a>
        """)))})),format.raw/*22.10*/("""
        
		
        
    """)))})))}
    }
    
    def render(form:Form[Authentication.AuthenticatedUser]): play.api.templates.HtmlFormat.Appendable = apply(form)
    
    def f:((Form[Authentication.AuthenticatedUser]) => play.api.templates.HtmlFormat.Appendable) = (form) => apply(form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Oct 30 12:46:09 CET 2013
                    SOURCE: C:/Users/ighachane/applications/twitternew/app/views/login.scala.html
                    HASH: 4480b9f6d754229a1005fc62116256da35347e74
                    MATRIX: 806->1|946->47|989->56|1027->86|1066->88|1114->101|1128->107|1177->148|1216->150|1308->207|1340->231|1379->233|1452->270|1465->274|1507->294|1558->313|1611->330|1649->359|1689->361|1763->399|1777->404|1814->419|1865->438|1999->536|2021->549|2049->555|2267->737|2282->743|2324->763|2409->816
                    LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|33->5|37->9|37->9|37->9|38->10|38->10|38->10|39->11|41->13|41->13|41->13|42->14|42->14|42->14|43->15|46->18|46->18|46->18|49->21|49->21|49->21|50->22
                    -- GENERATED --
                */
            