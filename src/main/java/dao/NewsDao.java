package dao;

import table.News;
import table.User;

public interface NewsDao{
		public News getNewsById(Long id);
		
		public News getNewsByUserId(Long id);
		
		public String getContentById(Long id);
		
		public User getUserByNewsId(Long id);
}
