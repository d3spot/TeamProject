package dao.daoImpl;

import java.util.List;

import dao.UserDao;
import table.User;

public class UserDaoImpl extends MainDaoImpl<User> implements UserDao{

	public UserDaoImpl(Class<User> elementClass) {
		super(elementClass);
		// TODO Auto-generated constructor stub
	}
	
	
	

	@Override
	public void add(User element) {
		// TODO Auto-generated method stub
		super.add(element);
	}




	@Override
	public void update(User element) {
		// TODO Auto-generated method stub
		super.update(element);
	}




	@Override
	public User getByID(Long elementId) {
		// TODO Auto-generated method stub
		return super.getByID(elementId);
	}




	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return super.getAll();
	}




	@Override
	public void delete(User element) {
		// TODO Auto-generated method stub
		super.delete(element);
	}




	public User getUserById(Long Id) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getFirstNameById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getLastNameById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer getAgeById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getEmailById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getPasswordById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getEmailByFirstLastName(String firstName, String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getPasswordByFirstLastName(String firstName, String lastName) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
