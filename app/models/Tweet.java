package models;


import java.util.Date;
import java.util.List;

import javax.persistence.*;
import play.db.ebean.Model;
import play.db.ebean.Model.Finder;

@Entity
public class Tweet extends Model {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long id;
	public int num;
	public Date creationDate;
	public String label;
	@ManyToOne(cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH })
	@JoinColumn(name="Tweet_userID")
	public Utilisateur user;
	

	 public Tweet() {
		super();
	}

	public Tweet(Long id, int num, String label) {
		super();
		this.id = id;
		this.num = num;
		this.label = label;
	}

	public static Finder<Long, Tweet> find = 
             new Finder<Long, Tweet>(Long.class, Tweet.class);
	
	public static List<Tweet> findall(){
		return find.all();
	}
	public static List<Tweet> findByEmail(String email) {
        return find.where().eq("Tweet_userID", email).findList();
    }

}
