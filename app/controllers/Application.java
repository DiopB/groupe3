package controllers;

import controllers.Authentication.AuthenticatedUser;
import play.*;
import play.mvc.*;
import play.data.*;
import models.*;
import views.html.*;


@Security.Authenticated(Secured.class)
public class Application extends Controller {

    public static Result index() {
    	
        return ok(login.render(Form.form(AuthenticatedUser.class)
        		));
    }

}
