package dao.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;
import dao.MainDao;

public class MainDaoImpl<E, N extends Number> implements MainDao<E, N> {

	private Class<E> elementClass;

	public MainDaoImpl(Class<E> elementClass) {
		this.elementClass = elementClass;
	}

	public void add(E element) {
		Session session = null;

		try {
			session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			session.save(element);
			transaction.commit();
		} finally {
			if ((session != null) && (session.isOpen())) {
			}
		}
	}

	public void update(E element) {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			session.update(element);
			transaction.commit();
		} finally {
			if ((session != null) && (session.isOpen())) {
				session.close();
			}
		}
	}

	public E getByID(N elementId) {
		Session session = null;
		E element = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			element = (E) session.get(elementClass, elementId);
		} finally {
			if ((session != null) && (session.isOpen())) {
				session.close();
			}
		}
		return element;
	}

	public List<E> getAll() {
		Session session = null;
		List<E> elements = new ArrayList<E>();
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			elements = session.createCriteria(elementClass).list();
		} finally {
			if ((session != null) && (session.isOpen())) {
				session.close();
			}
		}
		return elements;
	}

	public void delete(E element) {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			session.delete(element);
			transaction.commit();
		} finally {
			if ((session != null) && (session.isOpen())) {
				session.close();
			}
		}
	}

	
}
