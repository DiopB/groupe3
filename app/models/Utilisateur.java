package models;

import java.util.Date;
import java.util.List;
import play.data.format.*;
import javax.persistence.*;

import controllers.MD5Password;
import play.data.validation.Constraints;
import play.data.validation.Constraints.Email;
import play.db.ebean.Model;

@Entity
public class Utilisateur extends Model {
	
	@Id
	@Constraints.Required
	@Email
	public String email;
	
	public String sexe;
	
	@Formats.DateTime(pattern="MM/dd/yy")
	public Date date_inscription;
	
	@Constraints.Required
    @Constraints.MaxLength(10)
	public String username;
	
	@Constraints.MinLength(5)
	@Constraints.Required
	public String password;
	
	@OneToMany(mappedBy="user")  //un User pour plusieurs tweet, "mappedBy" qui référence le nom de l'attribut User dans la classe Event
	private List<Tweet> TweetList;
	
	public Utilisateur(){		
	}
	
	  public Utilisateur(String username, String password, String sexe,
			String adresseemail, Date date_inscription) {
		super();
		this.username = username;
		this.password = password;
		this.sexe = sexe;
		this.email = adresseemail;
		this.date_inscription = date_inscription;
	}
	  
	public static Finder<String, Utilisateur> find = new Finder<String, Utilisateur>(String.class, Utilisateur.class);
	
	public static List<Utilisateur> findall(){
		return find.all();
	}
	public static Utilisateur findByEmail(String email) {
        return find.where().eq("email", email).findUnique();
    }
	
	public static List<Utilisateur> findByusername(String username){
		return find.where().eq("username", username).findList();
	}
	
	public static Utilisateur authenticate(String email, String password) {
		 String passwordhashe = MD5Password.getEncodedPassword(password);
          return find.where()
              .eq("email", email)
              .eq("password", passwordhashe)
              .findUnique();
      }

}
