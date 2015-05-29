package dao;

import java.util.List;

import table.News;
import table.User;

public interface NewsDao extends MainDao<News>{
		
		public List<News> getNewsByUserId(long id);
		
}
