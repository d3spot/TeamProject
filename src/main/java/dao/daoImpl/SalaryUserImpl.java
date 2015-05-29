package dao.daoImpl;

import java.util.Date;
import java.util.List;

import dao.MainDao;
import dao.SalaryUser;
import table.Salary;
import table.User;

public class SalaryUserImpl extends MainDaoImpl<Salary> implements
		MainDao<Salary>, SalaryUser {

	public SalaryUserImpl(Class<Salary> elementClass) {
		super(Salary.class);
	}

	public List<Salary> getAllByMonth(Date month) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Salary> getAllByUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public Salary getSalaryByUserForMonth(User user, Date month) {
		// TODO Auto-generated method stub
		return null;
	}

}
