package dao.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import table.News;
import table.User;
import util.HibernateUtil;
import dao.MainDao;
import dao.NewsDao;

public class NewsDaoImpl extends MainDaoImpl<News> implements NewsDao{

	public NewsDaoImpl() {
		super(News.class);
	}

	public List<News> getNewsByUserId(long id) {
		Session session = null;
		List<News> news;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			news = (List<News>)session.createSQLQuery("Select * from News as n Where n.user.userId=:id").setParameter("id",id).list();
			transaction.commit();
		}finally{
			if ((session != null) && (session.isOpen())) {
			}
		}
		return news;
	}
	
	
	
	

}
