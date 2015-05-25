package table;

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
	private Long newsId;
	private String content;
	
	@ManyToOne
	@JoinColumn(name = "userId")
	private User user;
	
	public News(String content, User user) {
		this.content = content;
		this.user = user;
	}
	
	public Long getNewsId() {
		return newsId;
	}

	public void setNewsId(Long newsId) {
		this.newsId = newsId;
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



	
	
	
	
	
	
}
