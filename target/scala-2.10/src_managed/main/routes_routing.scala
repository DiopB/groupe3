// @SOURCE:C:/Users/ighachane/applications/twitternew/conf/routes
// @HASH:46d585e928454093099bd356045b098a3ac34216
// @DATE:Wed Oct 30 12:45:57 CET 2013


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:10
private[this] lazy val controllers_Utilisateurs_add1 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("user/add"))))
        

// @LINE:11
private[this] lazy val controllers_Tweets_add2 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tweet/add"))))
        

// @LINE:14
private[this] lazy val controllers_Authentication_login3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:15
private[this] lazy val controllers_Authentication_authenticate4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:16
private[this] lazy val controllers_Authentication_logout5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:18
private[this] lazy val controllers_Inscription_index6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("inscription"))))
        

// @LINE:20
private[this] lazy val controllers_Pageperso_index7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("perso/"),DynamicPart("email", """[^/]+""",true))))
        

// @LINE:22
private[this] lazy val controllers_Profil_index8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("search/"),DynamicPart("recherche", """[^/]+""",true))))
        

// @LINE:24
private[this] lazy val controllers_Perso_index9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Profil/"),DynamicPart("email", """[^/]+""",true))))
        

// @LINE:26
private[this] lazy val controllers_Assets_at10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """user/add""","""controllers.Utilisateurs.add()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tweet/add""","""controllers.Tweets.add()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Authentication.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Authentication.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Authentication.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """inscription""","""controllers.Inscription.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """perso/$email<[^/]+>""","""controllers.Pageperso.index(email:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """search/$recherche<[^/]+>""","""controllers.Profil.index(recherche:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Profil/$email<[^/]+>""","""controllers.Perso.index(email:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:10
case controllers_Utilisateurs_add1(params) => {
   call { 
        invokeHandler(controllers.Utilisateurs.add(), HandlerDef(this, "controllers.Utilisateurs", "add", Nil,"POST", """ Models routes""", Routes.prefix + """user/add"""))
   }
}
        

// @LINE:11
case controllers_Tweets_add2(params) => {
   call { 
        invokeHandler(controllers.Tweets.add(), HandlerDef(this, "controllers.Tweets", "add", Nil,"POST", """""", Routes.prefix + """tweet/add"""))
   }
}
        

// @LINE:14
case controllers_Authentication_login3(params) => {
   call { 
        invokeHandler(controllers.Authentication.login(), HandlerDef(this, "controllers.Authentication", "login", Nil,"GET", """ Authentication""", Routes.prefix + """login"""))
   }
}
        

// @LINE:15
case controllers_Authentication_authenticate4(params) => {
   call { 
        invokeHandler(controllers.Authentication.authenticate(), HandlerDef(this, "controllers.Authentication", "authenticate", Nil,"POST", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:16
case controllers_Authentication_logout5(params) => {
   call { 
        invokeHandler(controllers.Authentication.logout(), HandlerDef(this, "controllers.Authentication", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:18
case controllers_Inscription_index6(params) => {
   call { 
        invokeHandler(controllers.Inscription.index(), HandlerDef(this, "controllers.Inscription", "index", Nil,"GET", """formulaire d'inscription""", Routes.prefix + """inscription"""))
   }
}
        

// @LINE:20
case controllers_Pageperso_index7(params) => {
   call(params.fromPath[String]("email", None)) { (email) =>
        invokeHandler(controllers.Pageperso.index(email), HandlerDef(this, "controllers.Pageperso", "index", Seq(classOf[String]),"GET", """""", Routes.prefix + """perso/$email<[^/]+>"""))
   }
}
        

// @LINE:22
case controllers_Profil_index8(params) => {
   call(params.fromPath[String]("recherche", None)) { (recherche) =>
        invokeHandler(controllers.Profil.index(recherche), HandlerDef(this, "controllers.Profil", "index", Seq(classOf[String]),"GET", """""", Routes.prefix + """search/$recherche<[^/]+>"""))
   }
}
        

// @LINE:24
case controllers_Perso_index9(params) => {
   call(params.fromPath[String]("email", None)) { (email) =>
        invokeHandler(controllers.Perso.index(email), HandlerDef(this, "controllers.Perso", "index", Seq(classOf[String]),"GET", """""", Routes.prefix + """Profil/$email<[^/]+>"""))
   }
}
        

// @LINE:26
case controllers_Assets_at10(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     