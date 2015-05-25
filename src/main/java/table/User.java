package table;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;
	private String firstName;
	private String lastName;
	private Integer age;
	@Column(length = 30, unique = true, nullable = false)
	private String email;
	@Column(length = 25, nullable = false)
	private String password;
	
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "UserRole",joinColumns={ 
			@JoinColumn(name = "userId",nullable = false)},
			inverseJoinColumns = {@JoinColumn(name = "roleId", nullable = false)})
	private List<Role> roles;
	
	
	@ManyToMany
	@JoinTable(name = "EventUser", joinColumns = {
			@JoinColumn(name = "userId", nullable = false)},
			inverseJoinColumns = {@JoinColumn(name = "eventId", nullable = false)})
	private List<Event> events;
	
	
	@OneToMany(mappedBy = "user")
	private List<News> news;
	
	
	@OneToMany(mappedBy = "user")
	private List<Salary> salaries;
	
	
	
	@OneToMany(mappedBy = "sender")
	private List<Message> sendedMessages;
	
	
	@OneToMany(mappedBy = "receiver")
	private List<Message> receivedMessages;


	public User(String firstName, String lastName, Integer age, String email,
			String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.email = email;
		this.password = password;
	}
	
	public Long getUserId() {
		return userId;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public List<Role> getRoles() {
		return roles;
	}


	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}


	public List<Event> getEvents() {
		return events;
	}


	public void setEvents(List<Event> events) {
		this.events = events;
	}


	public List<News> getNews() {
		return news;
	}


	public void setNews(List<News> news) {
		this.news = news;
	}


	public List<Salary> getSalaries() {
		return salaries;
	}


	public void setSalaries(List<Salary> salaries) {
		this.salaries = salaries;
	}


	public List<Message> getSendedMessages() {
		return sendedMessages;
	}


	public void setSendedMessages(List<Message> sendedMessages) {
		this.sendedMessages = sendedMessages;
	}


	public List<Message> getReceivedMessages() {
		return receivedMessages;
	}


	public void setReceivedMessages(List<Message> receivedMessages) {
		this.receivedMessages = receivedMessages;
	}


	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
}




