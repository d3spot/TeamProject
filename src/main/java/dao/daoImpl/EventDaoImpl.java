package dao.daoImpl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dao.EventDao;
import table.Event;
import table.Schedule;
import table.Type;
import table.User;
import util.HibernateUtil;


@Repository
public class EventDaoImpl extends MainDaoImpl<Event, Integer> implements EventDao {

	public EventDaoImpl() {
		super(Event.class);
	}

	
	@Transactional
	public List<Event> getEventsByDate(Date date) {
		Session session = null;
		List<Event> events = new ArrayList<Event>();
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			events = session.createSQLQuery("Select * from Event e join e.schedule s Where s.date = :date").list();
		}finally{
			if((session != null)&&(session.isOpen())) {
				session.close();
			}
		}
		return events;
	}

	
	@Transactional
	public List<Event> getEventsByType(Type type) {
		Session session = null;
		List<Event> events = new ArrayList<Event>();
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			events = session.createSQLQuery("Select * from Event e join e.type t Where t.name = :name").list();
		}finally{
			if((session != null)&&(session.isOpen())) {
				session.close();
			}
		}
		return events;
		
	}

	@Transactional
	public List<Event> getEventsByUser(User user) {
		
		return null;
	}

}
