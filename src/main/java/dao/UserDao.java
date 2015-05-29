package dao;

import table.User;

public interface UserDao extends MainDao<User>{
	
	public String getFirstNameById(long  id);
	
	public String getLastNameById(long id);
	
	public int  getAgeById(long id);
	
	public String getEmailById(long id);
	
	public String getPasswordById(long id);
	
	public String getEmailByFirstLastName(String firstName, String lastName);
	
	public String getPasswordByFirstLastName(String firstName, String lastName);
	
	public User getUserByEmailPassword(String email,String password);
	
}

