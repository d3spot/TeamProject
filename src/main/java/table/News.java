package table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class News {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long newsId;
	private String content;
	@OneToMany
	@JoinColumn(name = "userId")
	private Long userId;
	public News(Long newsId, String content) {
		this.newsId = newsId;
		this.content = content;
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
	
	
	
	
}
