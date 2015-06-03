package table;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class News {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String content;
	private Date timeOfPublishing;
	
	
	@ManyToOne
	@JoinColumn(name = "userId")
	private User user;
	
	
	public News(){
	}
	public News(String content, User user, Date timeOfPublishing) {
		this.content = content;
		this.user = user;
		this.timeOfPublishing = timeOfPublishing;
	}
	
	public Long getid() {
		return id;
	}

	public void setid(Long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	public Date getTimeOfPublishing() {
		return timeOfPublishing;
	}
	public void setTimeOfPublishing(Date timeOfPublishing) {
		this.timeOfPublishing = timeOfPublishing;
	}



	
	
	
	
	
	
}
