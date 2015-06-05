package dao.daoImpl;

import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dao.MainDao;
import dao.SalaryDao;
import table.Salary;
import table.User;
import util.HibernateUtil;

@Repository
public class SalaryDaoImpl extends MainDaoImpl<Salary, Integer> implements
		SalaryDao {

	public SalaryDaoImpl() {
		super(Salary.class);
	}

	@Transactional
	public List<Salary> getAllByMonth(Month month) {
		Session session = null;
		List<Salary> salary = new ArrayList<Salary>();
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			salary = session.createQuery("From Salary Where month =:month")
					.setParameter("month", month).list();
		} finally {
			if ((session != null) && (session.isOpen())) {
				session.close();
			}
		}
		return salary;
	}

	@Transactional
	public List<Salary> getAllByUser(User user) {
		Session session = null;
		List<Salary> salary = new ArrayList<Salary>();
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			salary = session.createQuery("From Salary Where user =:user")
					.setParameter("user", user).list();
		} finally {
			if ((session != null) && (session.isOpen())) {
				session.close();
			}
		}
		return salary;

	}

	@Transactional
	public Salary getSalaryByUserForMonth(User user, Month month) {
		Session session = null;
		Salary salary = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			salary = (Salary) session
					.createQuery(
							"From Salary Where user=:user And month =:month")
					.setParameter("user", user).setParameter("month", month)
					.uniqueResult();
		} finally {
			if ((session != null) && (session.isOpen())) {
				session.close();
			}
		}
		return salary;
	}

}
