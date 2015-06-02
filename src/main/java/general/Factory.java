package general;

import table.Message;
import dao.MessageUser;
import dao.daoImpl.MessageUserImpl;
import dao.daoImpl.NewsDaoImpl;
import dao.daoImpl.RoleDaoImpl;
import dao.daoImpl.UserDaoImpl;

public class Factory {

	private static Factory instatce = new Factory();
	
	private MessageUserImpl messageUser;
	private UserDaoImpl userImpl;
	private RoleDaoImpl roleImpl;
	private NewsDaoImpl newsImpl;
	
	

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
	
	
	

}
