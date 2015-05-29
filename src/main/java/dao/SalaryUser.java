package dao;

import java.util.Date;
import java.util.List;

import table.Salary;
import table.User;

public interface SalaryUser {

	public List<Salary> getAllByMonth(Date month);

	public List<Salary> getAllByUser(User user);
	
	public Salary getSalaryByUserForMonth(User user,Date month);

}
