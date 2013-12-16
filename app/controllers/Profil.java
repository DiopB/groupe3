 package controllers;

import play.*;
import play.mvc.*;
import play.data.*;
import models.*;
import views.html.*;

public class Profil extends Controller {
	
	
	public static Result index(String recherche){
		String search = validate(recherche);
		if( search.equals("ByEmail")){
		
			return ok(profile.render(
					"Résultats de la recherche",
					null,
					Utilisateur.findByEmail(recherche),
					Utilisateur.findByEmail(session("email"))
					));
		}
		else{
		if(search == "ByUsername"){
			return ok(profile.render(
					"Résultats de la recherche",
					Utilisateur.findByusername(recherche),
					null,
					Utilisateur.findByEmail(session("email"))
					));
		}
			else{
				return badRequest(search);
			}
		}
		
	}
	//}
	
	 public static String validate(String recherche) {
    
        	 if(Utilisateur.findByEmail(recherche) != null){
        		 return "ByEmail";
        		 }
        	 else{
        		 if(!Utilisateur.findByusername(recherche).isEmpty()){
        		 return "ByUsername";
        	 }
        	 else{
        		  return "aucun résultat ne correspond à votre recherche";
        	 }
         }
     }

}
