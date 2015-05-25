package table;

import java.util.Date;

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
	@Column
	private Date month;
	@Column
	private Double amount;
	@ManyToOne
	@JoinColumn(name = "emloyee_id")
	private Employee eployee;

	public Salary() {
	}

	public Salary(Date month, Double amount) {
		this.month = month;
		this.amount = amount;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMonth() {
		return month;
	}

	public void setMonth(Date month) {
		this.month = month;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Employee getEployee() {
		return eployee;
	}

	public void setEployee(Employee eployee) {
		this.eployee = eployee;
	}

}
