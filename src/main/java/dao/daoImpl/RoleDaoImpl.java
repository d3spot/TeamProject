package dao.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import table.Role;
import table.User;
import util.HibernateUtil;
import dao.MainDao;
import dao.RoleDao;

public class RoleDaoImpl extends MainDaoImpl<Role, Integer> implements RoleDao{

	public RoleDaoImpl() {
		super(Role.class);
	}

	public List<Role> getRolesOfUser(Integer userId) {
		Session session = null;
		List<Role> roles;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			roles = (List<Role>)session.createSQLQuery("Select * from Role as r Where r.users.id=:id").setParameter("id",userId).list();
			transaction.commit();
			
		}finally{
			if ((session != null) && (session.isOpen())) {
				
			}
		}
		return roles;
	}

	public List<User> getUsersByRole(String roleTitle) {
		Session session = null;
		List<User> users;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			users = (List<User>)session.createSQLQuery("Select * from User as u Join Role as r ON u.id=r.users.id Where r.roleTitle=:roleTitle").setParameter("roleTitle",roleTitle).list();
			transaction.commit();
			
		}finally{
			if ((session != null) && (session.isOpen())) {
				
			}
		}
		return users;
	}
	

	
	
	
}
