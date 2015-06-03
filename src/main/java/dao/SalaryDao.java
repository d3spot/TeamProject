package dao;

import java.time.Month;
import java.util.Date;
import java.util.List;

import table.Salary;
import table.User;

public interface SalaryDao {

	public List<Salary> getAllByMonth(Month month);

	public List<Salary> getAllByUser(User user);
	
	public Salary getSalaryByUserForMonth(User user,Month month);

}
