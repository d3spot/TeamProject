package dao.daoImpl;

import java.sql.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import table.Message;
import table.User;
import util.HibernateUtil;
import dao.MainDao;
import dao.MessageUser;

public class MessageUserImpl extends MainDaoImpl<Message> implements  MainDao<Message>{
	public MessageUserImpl(Class<Message> elementClass) {
		super(Message.class);
		}
	
	public List<Message> getMessageFromDate(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Message> getAllSenderMessage(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Message> getAllReceiverMessage(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
