package dao.daoImpl;

import java.util.List;

import table.News;
import table.User;
import dao.MainDao;
import dao.NewsDao;

public class NewsDaoImpl extends MainDaoImpl<News> implements NewsDao{

	public NewsDaoImpl(Class<News> elementClass) {
		super(elementClass);
		// TODO Auto-generated constructor stub
	}


	public void add(News element) {
		// TODO Auto-generated method stub
		super.add(element);
	}

	
	public void update(News element) {
		// TODO Auto-generated method stub
		super.update(element);
	}

	
	public News getByID(Long elementId) {
		// TODO Auto-generated method stub
		return super.getByID(elementId);
	}

	public List<News> getAll() {
		// TODO Auto-generated method stub
		return super.getAll();
	}

	
	public void delete(News element) {
		// TODO Auto-generated method stub
		super.delete(element);
	}


	public News getNewsById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public News getNewsByUserId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getContentById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public User getUserByNewsId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
