package dao.daoImpl;

import dao.MainDao;
import table.Rate;

public class RateDaoImpl extends MainDaoImpl<Rate, Integer> implements MainDao<Rate, Integer>{

	public RateDaoImpl() {
		super(Rate.class);
	}

}
