package dao.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.transaction.annotation.Transactional;

import util.HibernateUtil;
import dao.MainDao;

public class MainDaoImpl<E, N extends Number> implements MainDao<E, N> {

	private Class<E> elementClass;
	private Class<E> entityClass;

	public MainDaoImpl(Class<E> elementClass) {
		this.elementClass = elementClass;
	}
	
	
	@PersistenceContext(name = "logos")
	EntityManager entityManager;

	@Transactional
	public void add(E element) {
		entityManager.persist(element);
		entityManager.flush();
	}
	
	
	
	//Не перекидується на EntityManager
	@Transactional
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

	@Transactional
	public E getByID(N elementId) {
		try {
			return (E) entityManager.createQuery("select e from " + entityClass.getSimpleName() + " e where e.id = :id")
					.setParameter("id", elementId).getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}

	@Transactional
	public List<E> getAll() {
		return entityManager.createQuery("from " + entityClass.getSimpleName()).getResultList();
	}

	@Transactional
	public void delete(E element) {
		entityManager.remove(entityManager.merge(element));
	}

	
}
