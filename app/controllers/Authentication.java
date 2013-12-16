package controllers;


import play.*;
import play.mvc.*;
import play.api.Routes;
import play.data.*;

import models.*;
import views.html.*;


public class Authentication extends Controller {

    public static class AuthenticatedUser {

        public String email;
        public String password;

        public String validate() {
            if(Utilisateur.authenticate(email, password) == null) {
                return "oups! râté! Essaye encore une fois";
            }
            return null;
        }
    }

    public static Result login() {
        return ok(
            login.render(Form.form(AuthenticatedUser.class))
        );
    }

    //On récupère les informations de login (quand le user se "signe")
    public static Result authenticate() {
        Form<AuthenticatedUser> loginForm = 
            Form.form(AuthenticatedUser.class).bindFromRequest();
        if(loginForm.hasErrors()) {
            return badRequest(login.render(loginForm));
        } else {
            session("email", loginForm.get().email);
            return redirect(routes.Pageperso.index(loginForm.get().email));
        }
    }

    //Fermer la session
    public static Result logout() {
        session().clear();
        flash("success", "Vous êtes déconnecté(e)");
        return redirect(
            routes.Authentication.login()
        );
    }

}