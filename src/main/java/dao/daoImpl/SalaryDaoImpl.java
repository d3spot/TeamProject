package dao.daoImpl;

import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;

import dao.MainDao;
import dao.SalaryDao;
import table.Salary;
import table.User;
import util.HibernateUtil;

public class SalaryDaoImpl extends MainDaoImpl<Salary, Long> implements
		MainDao<Salary, Long>, SalaryDao {

	public SalaryDaoImpl() {
		super(Salary.class);
	}

	public List<Salary> getAllByMonth(Month month) {
		Session session = null;
		List<Salary> salary = new ArrayList<Salary>();
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			salary = session.createSQLQuery("Select* From Salary as u Where u.month =:month").addEntity(Salary.class).setParameter("month", month).list();
		} finally {
			if ((session != null) && (session.isOpen())) {
				session.close();
			}
		}
		return salary;
	}

	public List<Salary> getAllByUser(User user) {
		Session session = null;
		List<Salary> salary = new ArrayList<Salary>();
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			salary = session.createQuery("Select From Salary as s Where s.user =:user").setParameter("user", user).list();
		} finally {
			if ((session != null) && (session.isOpen())) {
				session.close();
			}
		}
		return salary;

	}

	public Salary getSalaryByUserForMonth(User user, Month month) {
		Session session = null;
		Salary salary = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			salary = (Salary)session.createQuery("From Salary Where userId=:user And month =:month").setParameter("user", user).setParameter("month", month).uniqueResult();
		} finally {
			if ((session != null) && (session.isOpen())) {
				session.close();
			}
		}
		return salary;
	}

}
