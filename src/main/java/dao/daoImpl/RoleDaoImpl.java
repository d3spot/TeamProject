package dao.daoImpl;

import java.util.List;

import table.Role;
import dao.MainDao;
import dao.RoleDao;

public class RoleDaoImpl extends MainDaoImpl<Role> implements RoleDao{

	public RoleDaoImpl(Class<Role> elementClass) {
		super(elementClass);
	}


	public void add(Role element) {
		// TODO Auto-generated method stub
		super.add(element);
	}

	
	public void update(Role element) {
		// TODO Auto-generated method stub
		super.update(element);
	}

	
	public Role getByID(Long elementId) {
		// TODO Auto-generated method stub
		return super.getByID(elementId);
	}

	
	public List<Role> getAll() {
		// TODO Auto-generated method stub
		return super.getAll();
	}


	public void delete(Role element) {
		// TODO Auto-generated method stub
		super.delete(element);
	}


	public Role getRoleById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
