package general;

import dao.MessageEmployee;
import dao.daoImpl.MessageEmployeeImpl;

public class Factory {

	private static Factory instatce = new Factory();
	private MessageEmployee messageEmployee;

	private Factory() {
	}

	public static Factory getFactory() {
		return Factory.instatce;
	}

	public MessageEmployee getMessageEmployee() {
		if (messageEmployee == null) {
			messageEmployee = new MessageEmployeeImpl();
		}
		return messageEmployee;
	}

}
