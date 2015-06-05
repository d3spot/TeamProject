package dao.daoImpl;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import table.News;
import table.User;
import util.HibernateUtil;
import dao.MainDao;
import dao.NewsDao;


@Repository
public class NewsDaoImpl extends MainDaoImpl<News, Long> implements NewsDao{

	public NewsDaoImpl() {
		super(News.class);
	}

	
	@Transactional
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

	
	@Transactional
	public List<News> getNewsFromTo(Date a, Date b) {
		Session session = null;
		List<News> news;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			news = (List<News>)session.createSQLQuery("Select * from News as n Where n.dateOfPublishing<:b And n.dateOfPublishing>:a").setParameter("fromTine",a).setParameter("toTime", b).list();
			transaction.commit();
		}finally{
			if ((session != null) && (session.isOpen())) {
			}
		}
		return news;
	}
	
	
	
	

}
