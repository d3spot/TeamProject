package dao.daoImpl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import table.Message;
import table.User;
import util.HibernateUtil;
import dao.MessageDao;

public class MessageDaoImpl extends MainDaoImpl<Message, Long> implements
		MessageDao {
	public MessageDaoImpl() {
		super(Message.class);
	}

	public List<Message> getMessageFromDate(Date date) {
		Session session = null;
		List<Message> elements = new ArrayList();
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			elements = session.createQuery(
					"FROM message WHERE  messageTime=date").list();
		} finally {
			if ((session != null) && (session.isOpen())) {
				session.close();
			}
		}
		return elements;

	}

	public List<Message> getAllSenderMessage(User user) {
		Session session = null;
		List<Message> elements = new ArrayList();
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			elements = session.createQuery("FROM message WHERE  sender=user")
					.list();
		} finally {
			if ((session != null) && (session.isOpen())) {
				session.close();
			}
		}
		return elements;
	}

	public List<Message> getAllReceiverMessage(User user) {
		Session session = null;
		List<Message> elements = new ArrayList();
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			elements = session.createQuery("FROM message WHERE  receiver=user")
					.list();
		} finally {
			if ((session != null) && (session.isOpen())) {
				session.close();
			}
		}
		return elements;
	}

}
