package table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Type {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "type_id")
	private Integer id;
	private String name;
	private Boolean isPersonal;
	
	public Type() {
		
	}
	
	public Type(String name, Boolean isPersonal) {
		this.name = name;
		this.isPersonal = isPersonal;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getIsPersonal() {
		return isPersonal;
	}

	public void setIsPersonal(Boolean isPersonal) {
		this.isPersonal = isPersonal;
	}
	
	
	
	
	
	
}
