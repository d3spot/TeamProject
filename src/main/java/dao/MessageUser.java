package dao;

import java.sql.Date;
import java.util.List;

import table.Message;
import table.User;

public interface MessageUser {
	public List<Message> getMessageFromDate(Date date);

	public List<Message> getAllSenderMessage(User user);

	public List<Message> getAllReceiverMessage(User user);

}
