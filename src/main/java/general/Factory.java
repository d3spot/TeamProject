package general;

import table.Message;
import dao.MessageUser;
import dao.daoImpl.MessageUserImpl;

public class Factory {

	private static Factory instatce = new Factory();
	
	private MessageUserImpl messageUser;

	private Factory() {
	}

	public static Factory getFactory() {
		return Factory.instatce;
	}

	public MessageUser getMessageUser() {
		if (messageUser == null) {
			messageUser = new MessageUserImpl();
		}
		return (MessageUser) messageUser;
	}

}
