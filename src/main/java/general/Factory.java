package general;

import table.Message;
import dao.MessageUser;
import dao.daoImpl.MessageUserImpl;
import dao.daoImpl.NewsDaoImpl;
import dao.daoImpl.RateDaoImpl;
import dao.daoImpl.RoleDaoImpl;
import dao.daoImpl.SalaryDaoImpl;
import dao.daoImpl.UserDaoImpl;

public class Factory {

	private static Factory instatce = new Factory();
	
	private MessageUserImpl messageUser;
	private UserDaoImpl userImpl;
	private RoleDaoImpl roleImpl;
	private NewsDaoImpl newsImpl;
	private SalaryDaoImpl salaryImpl;
	private RateDaoImpl rateImpl;
	

	private Factory() {
	}

	public static Factory getFactory() {
		return Factory.instatce;
	}

	public MessageUserImpl getMessageUser() {
		if (messageUser == null) {
			messageUser = new MessageUserImpl();
		}
		return  messageUser;
	}
	
	public UserDaoImpl getUserImpl(){
		if (userImpl == null) {
			userImpl = new UserDaoImpl();
		}
		return  userImpl;
	}
	
	public NewsDaoImpl getNewsImpl(){
		if (newsImpl == null) {
			newsImpl = new NewsDaoImpl();
		}
		return  newsImpl;
	}
	
	public RoleDaoImpl getRoleImpl(){
		if (roleImpl == null) {
			roleImpl = new RoleDaoImpl();
		}
		return  roleImpl;
	}
	
	public SalaryDaoImpl getSalaryImpl(){
		if (salaryImpl == null) {
			salaryImpl = new SalaryDaoImpl();
		}
		return  salaryImpl;
	}
	
	public RateDaoImpl getRateImpl(){
		if (rateImpl == null) {
			rateImpl = new RateDaoImpl();
		}
		return  rateImpl;
	}

}
