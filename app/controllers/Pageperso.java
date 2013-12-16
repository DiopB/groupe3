package controllers;

import models.*;
import models.Utilisateur;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

public class Pageperso extends Controller{
	
	public static Result index(String email){
		return ok(index.render("Accueil",
            		Utilisateur.find.byId(email),
            		Tweet.find.orderBy("label").findList()
            		));
		
	}

}
