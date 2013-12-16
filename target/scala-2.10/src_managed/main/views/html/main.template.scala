
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,Utilisateur,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String, utilisateur: Utilisateur)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.58*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*7.17*/title)),format.raw/*7.22*/("""</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("bootstrap/css/bootstrap.css"))),format.raw/*9.101*/("""">
 
		<SCRIPT LANGUAGE="javascript">
		function controle(recherche) """),format.raw/*12.32*/("""{"""),format.raw/*12.33*/("""
		var search = document.recherche.champ.value;
		location.href="/search/"+search;
		"""),format.raw/*15.3*/("""}"""),format.raw/*15.4*/("""
		</SCRIPT>     
 
 
        <style>
                body """),format.raw/*20.22*/("""{"""),format.raw/*20.23*/("""
                    padding-top: 60px;
                    padding-bottom: 40px;
                """),format.raw/*23.17*/("""}"""),format.raw/*23.18*/("""
        </style>
        <link rel="stylesheet" media="screen" 
                href=""""),_display_(Seq[Any](/*26.24*/routes/*26.30*/.Assets.at("bootstrap/css/bootstrap-responsive.css"))),format.raw/*26.82*/("""">
        <link rel="shortcut icon" type="image/png" 
                href=""""),_display_(Seq[Any](/*28.24*/routes/*28.30*/.Assets.at("images/favicon.png"))),format.raw/*28.62*/("""">
        <script src=""""),_display_(Seq[Any](/*29.23*/routes/*29.29*/.Assets.at("javascripts/jquery-1.7.1.min.js"))),format.raw/*29.74*/("""" 
                type="text/javascript"></script>      
    </head>
    <body>
        <div class="navbar navbar-fixed-top">
            <div class="navbar-inner">
                <div class="container">
                    <a class="brand">"""),_display_(Seq[Any](/*36.39*/title)),format.raw/*36.44*/("""</a>
                    """),_display_(Seq[Any](/*37.22*/if(utilisateur != null)/*37.45*/{_display_(Seq[Any](format.raw/*37.46*/("""
                    <u1 class="nav">
                    <li><a>"""),_display_(Seq[Any](/*39.29*/utilisateur/*39.40*/.username)),format.raw/*39.49*/("""<span>("""),_display_(Seq[Any](/*39.57*/utilisateur/*39.68*/.email)),format.raw/*39.74*/(""")</span></a></li>
                    <li><a href=""""),_display_(Seq[Any](/*40.35*/routes/*40.41*/.Pageperso.index(utilisateur.email))),format.raw/*40.76*/("""">Journal</a></li>
                    <li><form name="recherche">
                    	<input type="text" name="champ" placeholder="Recherche">               	
                    	<input type="button" VALUE="Rechercher" onClick="controle(recherche)">
                    	</form>
                    </li>
                    <li><a href=""""),_display_(Seq[Any](/*46.35*/routes/*46.41*/.Perso.index(utilisateur.email))),format.raw/*46.72*/("""">Profil personnel</a></li>
                    <li><a href=""""),_display_(Seq[Any](/*47.35*/routes/*47.41*/.Authentication.logout())),format.raw/*47.65*/("""">Logout</a></li>
                    
                    </u1>
                    """)))})),format.raw/*50.22*/("""
                </div>
            </div>
        </div>
        <div class="container">
            """),_display_(Seq[Any](/*55.14*/content)),format.raw/*55.21*/("""
        </div>
    </body>
</html>
"""))}
    }
    
    def render(title:String,utilisateur:Utilisateur,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title,utilisateur)(content)
    
    def f:((String,Utilisateur) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title,utilisateur) => (content) => apply(title,utilisateur)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Oct 30 12:46:09 CET 2013
                    SOURCE: C:/Users/ighachane/applications/twitternew/app/views/main.scala.html
                    HASH: 98c1614863e2fe4d63d185b7f846d182514d4c16
                    MATRIX: 790->1|940->57|1028->110|1054->115|1227->253|1241->259|1304->300|1401->369|1430->370|1542->455|1570->456|1657->515|1686->516|1812->614|1841->615|1965->703|1980->709|2054->761|2168->839|2183->845|2237->877|2298->902|2313->908|2380->953|2660->1197|2687->1202|2749->1228|2781->1251|2820->1252|2922->1318|2942->1329|2973->1338|3017->1346|3037->1357|3065->1363|3153->1415|3168->1421|3225->1456|3603->1798|3618->1804|3671->1835|3769->1897|3784->1903|3830->1927|3948->2013|4087->2116|4116->2123
                    LINES: 26->1|29->1|35->7|35->7|37->9|37->9|37->9|40->12|40->12|43->15|43->15|48->20|48->20|51->23|51->23|54->26|54->26|54->26|56->28|56->28|56->28|57->29|57->29|57->29|64->36|64->36|65->37|65->37|65->37|67->39|67->39|67->39|67->39|67->39|67->39|68->40|68->40|68->40|74->46|74->46|74->46|75->47|75->47|75->47|78->50|83->55|83->55
                    -- GENERATED --
                */
            