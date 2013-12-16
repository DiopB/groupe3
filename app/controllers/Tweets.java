package controllers;


import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
         String textfield = requestfdata.get("label");
         String username = requestfdata.get("username");
         System.out.println(username);
         tweet.sujet=requestfdata.get("sujet");
         
         if(!textfield.contains("@")){
				if(!textfield.contains("#") ){
					tweet.label=textfield;
					tweet.sujet="";
			}	
				else{
					tweet.label=textfield;
					tweet.sujet="null";
				}
			}
         
         Pattern p1 = Pattern.compile("(.*) @(.*) #(.*)");
		 Matcher m1 = p1.matcher(textfield);
		 while(m1.find()){
			 tweet.label=m1.group(1);
			 tweet.sujet=m1.group(3);
			 tweet.Taguser=m1.group(2);
			}
		 Pattern p2 = Pattern.compile("(.*) #(.*) @(.*)");
		 Matcher m2 = p2.matcher(textfield);
			while(m2.find()){
				tweet.label=m2.group(1);
				tweet.sujet=m2.group(2);
				tweet.Taguser=m2.group(3);
					}
		Pattern p3 = Pattern.compile("@(.*) (.*) #(.*)");
		Matcher m3 = p3.matcher(textfield);
			while(m3.find()){
				tweet.label=m3.group(2);
				tweet.sujet=m3.group(3);
				tweet.Taguser=m3.group(1);
				}
		Pattern p4 = Pattern.compile("@(.*) #(.*) (.*)");
		Matcher m4 = p4.matcher(textfield);
			while(m4.find()){
					tweet.label=m4.group(3);
					tweet.sujet=m4.group(2);
					tweet.Taguser=m4.group(1);
					}
		Pattern p5 = Pattern.compile("#(.*) @(.*) (.*)");
		Matcher m5 = p5.matcher(textfield);
			while(m4.find()){
					tweet.label=m5.group(3);
					tweet.sujet=m5.group(1);
					tweet.Taguser=m5.group(2);
					}
	   Pattern p6 = Pattern.compile("#(.*) (.*) @(.*)");
	   Matcher m6 = p6.matcher(textfield);
			while(m6.find()){
				tweet.label=m6.group(2);
				tweet.sujet=m6.group(1);
				tweet.Taguser=m6.group(3);
				}
		Pattern p7 = Pattern.compile("#(.*) (.*)");
		Matcher m7 = p7.matcher(textfield);
			while(m6.find()){
						tweet.label=m7.group(2);
						tweet.sujet=m7.group(1);
				}
		Pattern p8 = Pattern.compile("(.*) #(.*)");
		Matcher m8 = p8.matcher(textfield);
			while(m6.find()){
							tweet.label=m8.group(1);
							tweet.sujet=m8.group(2);
					}
		Pattern p9 = Pattern.compile("(.*) @(.*)");
		Matcher m9 = p9.matcher(textfield);
			while(m9.find()){
						tweet.label=m9.group(1);
						tweet.Taguser=m9.group(2);
						tweet.sujet="";
					}
		Pattern p10 = Pattern.compile("@(.*) (.*)");
		Matcher m10 = p10.matcher(textfield);
			while(m10.find()){
					tweet.label=m10.group(2);
					tweet.Taguser=m10.group(1);
					tweet.sujet="";
						}
//		Pattern p11 = Pattern.compile("(.*)");
//		Matcher m11 = p11.matcher(textfield);
//				while(m11.find()){
//						tweet.label=textfield;
//						tweet.sujet="";
//						}
		
			
 
 
         Utilisateur usernew = Utilisateur.findByusername(username);
         tweet.user = usernew;
         tweet.creationDate = new Date();
		 tweet.save();
		 return redirect(routes.Pageperso.index(username));
     }

}
