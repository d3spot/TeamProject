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
	private Long roleId;
	private String roleTtile;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "UserRole",joinColumns={ 
			@JoinColumn(name = "roleId",nullable = false)},
			inverseJoinColumns = {@JoinColumn(name = "userId", nullable = false)})
	private List<Role> users;
	
	
	
	
	public Role(Long roleId, String roleTtile) {
		this.roleId = roleId;
		this.roleTtile = roleTtile;
	}
	
	
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public String getRoleTtile() {
		return roleTtile;
	}
	public void setRoleTtile(String roleTtile) {
		this.roleTtile = roleTtile;
	}

	
	
}