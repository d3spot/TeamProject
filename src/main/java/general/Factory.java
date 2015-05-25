package general;

import dao.MessageUser;
import dao.daoImpl.MessageEmployeeImpl;

public class Factory {

	private static Factory instatce = new Factory();
	private MessageUser messageEmployee;

	private Factory() {
	}

	public static Factory getFactory() {
		return Factory.instatce;
	}

	public MessageUser getMessageEmployee() {
		if (messageEmployee == null) {
			messageEmployee = new MessageEmployeeImpl();
		}
		return messageEmployee;
	}

}
