package dao.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dao.UserDao;
import table.User;
import util.HibernateUtil;

@Repository
public class UserDaoImpl extends MainDaoImpl<User, Long> implements UserDao{
	
	public UserDaoImpl() {
		super(User.class);
	}
	
	
	@Transactional
	public String getFirstNameById(long id) {
		Session session = null;
		String fname = "";
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			fname = (String)session.createSQLQuery("Select u.firstName from User as u Where u.id=:id").setParameter("id",id).uniqueResult();
			transaction.commit();
			
		}finally{
			if ((session != null) && (session.isOpen())) {
				
			}
		}
		return fname;
	}
	
	
	@Transactional
	public String getLastNameById(long id) {
		Session session = null;
		String lname = "";
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			lname = (String)session.createSQLQuery("Select u.lastName from User as u Where u.id=:id").setParameter("id",id).uniqueResult();
			transaction.commit();
			
		}finally{
			if ((session != null) && (session.isOpen())) {
				
			}
		}
		return lname;
	}

	
	@Transactional
	public int getAgeById(long id) {
		Session session = null;
		int age;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			age = (Integer)session.createSQLQuery("Select u.age from User as u Where u.id=:id").setParameter("id",id).uniqueResult();
			transaction.commit();
			
		}finally{
			if ((session != null) && (session.isOpen())) {
				
			}
		}
		return age;
	}
	
	
	@Transactional
	public String getEmailById(long id) {
		Session session = null;
		String email = "";
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			email = (String)session.createSQLQuery("Select u.email from User as u Where u.id=:id").setParameter("id",id).uniqueResult();
			transaction.commit();
			
		}finally{
			if ((session != null) && (session.isOpen())) {
				
			}
		}
		return email;
	}

	
	@Transactional
	public String getPasswordById(long id) {
		Session session = null;
		String password = "";
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			password = (String)session.createSQLQuery("Select u.password from User as u Where u.id=:id").setParameter("id",id).uniqueResult();
			transaction.commit();
			
		}finally{
			if ((session != null) && (session.isOpen())) {
				
			}
		}
		return password;
	}

	
	@Transactional
	public String getEmailByFirstLastName(String firstName, String lastName) {
		Session session = null;
		String email = "";
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			email = (String)session.createSQLQuery("Select u.firstName from User as u Where u.lname=:lname And u.fname = fname").setParameter("fname", firstName).setParameter("lname", lastName).uniqueResult();
			transaction.commit();
			
		}finally{
			if ((session != null) && (session.isOpen())) {
				
			}
		}
		return email;
	}

	
	@Transactional
	public String getPasswordByFirstLastName(String firstName, String lastName) {
		Session session = null;
		String password = "";
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			password = (String)session.createSQLQuery("Select u.password from User as u Where u.lname=:lname And u.fname = fname").setParameter("fname", firstName).setParameter("lname", lastName).uniqueResult();
			transaction.commit();
			
		}finally{
			if ((session != null) && (session.isOpen())) {
				
			}
		}
		return password;
	}

	
	@Transactional
	public User getUserByEmailPassword(String email, String password) {
		Session session = null;
		User user = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			user = (User)session.createSQLQuery("Select * from User as u Where u.email=:email And u.password = :password").setParameter("email",email).setParameter("password", password).uniqueResult();
			transaction.commit();
			
		}finally{
			if ((session != null) && (session.isOpen())) {
				
			}
		}
		return user;
	}

	
	
	
	
	
	

}
