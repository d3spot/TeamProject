package general;

import java.time.Month;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import dao.daoImpl.SalaryDaoImpl;
import table.Message;
import table.Salary;
import table.User;

public class Program {
	public static void main(String[] args) {

		// Factory factory =Factory.getFactory();

		// TESTING SALARY
		// SalaryDaoImpl salaryDao = new SalaryDaoImpl();
		// UserDaoImpl userDao = new UserDaoImpl();
		// User user =new User("sbdvv","afsafa",23,"fa","df");
		// User user1 =new User("sbdvv","afsafa",23,"fagfg","dfssdhgf");
		// Salary salary = new Salary(Month.DECEMBER, 20000.0,user);
		// Salary salary1 = new Salary(Month.AUGUST, 5000.0,user1);
		// Salary salary2 = new Salary(Month.DECEMBER, 1000.0,user);
		// Salary salary3 = new Salary(Month.JANUARY, 20000.0,user1);
		// userDao.add(user);
		// userDao.add(user1);
		// salaryDao.add(salary);
		// salaryDao.add(salary1);
		// salaryDao.add(salary2);
		// salaryDao.add(salary3);

		// System.out.println(salaryDao.getByID(4));
		// List<Salary> a = salaryDao.getAll();
		// List<Salary> a = salaryDao.getAllByMonth(Month.DECEMBER);
		// List<Salary> a = salaryDao.getAllByUser(userDao.getByID(5L));
		// Iterator<Salary> iter = a.iterator();
		// while (iter.hasNext()) {
		// Salary g = iter.next();
		// System.out.println(g);
		// }
		// System.out.println(salaryDao.getSalaryByUserForMonth(
		// userDao.getByID(5L), Month.DECEMBER).getAmount());

		// TESTING MESSAGE
		// Message message = new Message();
		// message.setContent("test");
		// Date date = new Date();
		// date.setYear(2015);
		// date.setDate(25);
		// date.setMonth(3);
		// User user = new User();
		// user.setFirstName("Taras");
		// user.setAge(24);
		// message.setMessageTime(date);
		// message.setReceiver(user);
		// factory.getMessageUser().add(message);
		//
		// factory.getMessageUser().getAllReceiverMessage(user);
		//

		System.out.println("good");
		// SOmething

	}
}
