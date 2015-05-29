package dao;

import table.User;

public interface UserDao{
	public User getUserById(Long Id);
	public String getFirstNameById(Long id);
	public String getLastNameById(Long id);
	public Integer getAgeById(Long id);
	public String getEmailById(Long id);
	public String getPasswordById(Long id);
	public String getEmailByFirstLastName(String firstName, String lastName);
	public String getPasswordByFirstLastName(String firstName, String lastName);
}

