package table;

import java.time.Month;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Salary {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(nullable = false)
	private Month month;
	@Column(nullable = false)
	private Double amount;
	@ManyToOne
	@JoinColumn(name = "userId")
	private User user;

	public Salary() {
	}

	public Salary(Month month, Double amount) {
		this.month = month;
		this.amount = amount;
	}

	public Salary(Month month, Double amount, User user) {
		this.month = month;
		this.amount = amount;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Month getMonth() {
		return month;
	}

	public void setMonth(Month month) {
		this.month = month;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Salary in month " + month + ", amount=" + amount + ", user "
				+ user.getFirstName() + " "+user.getLastName();
	}

}
