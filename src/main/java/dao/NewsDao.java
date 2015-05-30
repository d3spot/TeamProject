package dao;

import java.util.Date;
import java.util.List;

import table.News;
import table.User;

public interface NewsDao extends MainDao<News>{
		
		public List<News> getNewsByUserId(long id);
		
		public List<News> getNewsFromTo(Date a, Date b);
}
