// @SOURCE:C:/Users/ighachane/applications/twitternew/conf/routes
// @HASH:46d585e928454093099bd356045b098a3ac34216
// @DATE:Wed Oct 30 12:45:57 CET 2013

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:26
// @LINE:24
// @LINE:22
// @LINE:20
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:6
package controllers {

// @LINE:26
class ReverseAssets {
    

// @LINE:26
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:16
// @LINE:15
// @LINE:14
class ReverseAuthentication {
    

// @LINE:16
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:15
def authenticate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:14
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          

// @LINE:18
class ReverseInscription {
    

// @LINE:18
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "inscription")
}
                                                
    
}
                          

// @LINE:10
class ReverseUtilisateurs {
    

// @LINE:10
def add(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "user/add")
}
                                                
    
}
                          

// @LINE:20
class ReversePageperso {
    

// @LINE:20
def index(email:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "perso/" + implicitly[PathBindable[String]].unbind("email", dynamicString(email)))
}
                                                
    
}
                          

// @LINE:22
class ReverseProfil {
    

// @LINE:22
def index(recherche:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "search/" + implicitly[PathBindable[String]].unbind("recherche", dynamicString(recherche)))
}
                                                
    
}
                          

// @LINE:11
class ReverseTweets {
    

// @LINE:11
def add(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "tweet/add")
}
                                                
    
}
                          

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          

// @LINE:24
class ReversePerso {
    

// @LINE:24
def index(email:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "Profil/" + implicitly[PathBindable[String]].unbind("email", dynamicString(email)))
}
                                                
    
}
                          
}
                  


// @LINE:26
// @LINE:24
// @LINE:22
// @LINE:20
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:6
package controllers.javascript {

// @LINE:26
class ReverseAssets {
    

// @LINE:26
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:16
// @LINE:15
// @LINE:14
class ReverseAuthentication {
    

// @LINE:16
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Authentication.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:15
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Authentication.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:14
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Authentication.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        
    
}
              

// @LINE:18
class ReverseInscription {
    

// @LINE:18
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Inscription.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "inscription"})
      }
   """
)
                        
    
}
              

// @LINE:10
class ReverseUtilisateurs {
    

// @LINE:10
def add : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Utilisateurs.add",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user/add"})
      }
   """
)
                        
    
}
              

// @LINE:20
class ReversePageperso {
    

// @LINE:20
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Pageperso.index",
   """
      function(email) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "perso/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email))})
      }
   """
)
                        
    
}
              

// @LINE:22
class ReverseProfil {
    

// @LINE:22
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Profil.index",
   """
      function(recherche) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("recherche", encodeURIComponent(recherche))})
      }
   """
)
                        
    
}
              

// @LINE:11
class ReverseTweets {
    

// @LINE:11
def add : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Tweets.add",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tweet/add"})
      }
   """
)
                        
    
}
              

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              

// @LINE:24
class ReversePerso {
    

// @LINE:24
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Perso.index",
   """
      function(email) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Profil/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email))})
      }
   """
)
                        
    
}
              
}
        


// @LINE:26
// @LINE:24
// @LINE:22
// @LINE:20
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:6
package controllers.ref {


// @LINE:26
class ReverseAssets {
    

// @LINE:26
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:16
// @LINE:15
// @LINE:14
class ReverseAuthentication {
    

// @LINE:16
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Authentication.logout(), HandlerDef(this, "controllers.Authentication", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:15
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Authentication.authenticate(), HandlerDef(this, "controllers.Authentication", "authenticate", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:14
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Authentication.login(), HandlerDef(this, "controllers.Authentication", "login", Seq(), "GET", """ Authentication""", _prefix + """login""")
)
                      
    
}
                          

// @LINE:18
class ReverseInscription {
    

// @LINE:18
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Inscription.index(), HandlerDef(this, "controllers.Inscription", "index", Seq(), "GET", """formulaire d'inscription""", _prefix + """inscription""")
)
                      
    
}
                          

// @LINE:10
class ReverseUtilisateurs {
    

// @LINE:10
def add(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Utilisateurs.add(), HandlerDef(this, "controllers.Utilisateurs", "add", Seq(), "POST", """ Models routes""", _prefix + """user/add""")
)
                      
    
}
                          

// @LINE:20
class ReversePageperso {
    

// @LINE:20
def index(email:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Pageperso.index(email), HandlerDef(this, "controllers.Pageperso", "index", Seq(classOf[String]), "GET", """""", _prefix + """perso/$email<[^/]+>""")
)
                      
    
}
                          

// @LINE:22
class ReverseProfil {
    

// @LINE:22
def index(recherche:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Profil.index(recherche), HandlerDef(this, "controllers.Profil", "index", Seq(classOf[String]), "GET", """""", _prefix + """search/$recherche<[^/]+>""")
)
                      
    
}
                          

// @LINE:11
class ReverseTweets {
    

// @LINE:11
def add(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Tweets.add(), HandlerDef(this, "controllers.Tweets", "add", Seq(), "POST", """""", _prefix + """tweet/add""")
)
                      
    
}
                          

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          

// @LINE:24
class ReversePerso {
    

// @LINE:24
def index(email:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Perso.index(email), HandlerDef(this, "controllers.Perso", "index", Seq(classOf[String]), "GET", """""", _prefix + """Profil/$email<[^/]+>""")
)
                      
    
}
                          
}
        
    