package controllers;

import models.*;
import models.Utilisateur;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

public class Perso extends Controller{
	
	public static Result index(String email){
	return ok(perso.render("Profil",
    		Utilisateur.find.byId(email),
    		Tweet.findByEmail(email),
    		Utilisateur.findByEmail(session("email"))
    		));
}


}
