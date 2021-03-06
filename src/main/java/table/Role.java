package table;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String roleTitle;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "UserRole",joinColumns={ 
			@JoinColumn(name = "id",nullable = false)},
			inverseJoinColumns = {@JoinColumn(name = "userId", nullable = false)})
	private List<User> users;
	
	
	
	public Role(){
	}
	public Role(Integer id, String roleTtile) {
		this.id = id;
		this.roleTitle = roleTtile;
	}
	
	
	public Integer getid() {
		return id;
	}
	public void setid(Integer id) {
		this.id = id;
	}
	public String getRoleTtile() {
		return roleTitle;
	}
	public void setRoleTtile(String roleTtile) {
		this.roleTitle = roleTtile;
	}

	
	
}
