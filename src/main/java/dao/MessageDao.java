package dao;

import java.sql.Date;
import java.util.List;

import table.Message;
import table.User;

public interface MessageDao extends MainDao<Message, Long> {
	
	public List<Message> getMessageFromDate(Date date);

	public List<Message> getAllSenderMessage(User user);

	public List<Message> getAllReceiverMessage(User user);

}
