package dao;

import java.sql.Date;
import java.util.List;

import table.Event;
import table.Type;
import table.User;

public interface EventDao extends MainDao<Event> {
	
	public List<Event> getEventsByDate(Date date);
	
	public List<Event> getEventsByType(Type type);
	
	public List<Event> getEventsByUser(User user);

}
