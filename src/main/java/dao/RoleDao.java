package dao;

import java.util.List;

import table.Role;
import table.User;

public interface RoleDao extends MainDao<Role, Integer>{
		public List<Role> getRolesOfUser(Integer userId);
		
		public List<User> getUsersByRole(String roleTitle);
		
		
}
