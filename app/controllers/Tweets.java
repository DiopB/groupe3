package controllers;


import java.util.Date;

import models.Tweet;
import models.Utilisateur;
import play.mvc.*;
import play.data.DynamicForm;
import play.data.Form;
import views.html.*;

public class Tweets extends Controller {
	
	 public static Result add() {
		 
		 DynamicForm requestfdata = Form.form().bindFromRequest();
         Tweet tweet = new Tweet();
         tweet.label = requestfdata.get("label");
         String email = requestfdata.get("user_email");
         Utilisateur usernew = Utilisateur.findByEmail(email);
         tweet.user = usernew;
         tweet.creationDate = new Date();
		 tweet.save();
		 return redirect(routes.Pageperso.index(email));
     }

}
