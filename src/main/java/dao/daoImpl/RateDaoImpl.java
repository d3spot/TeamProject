package dao.daoImpl;

import dao.MainDao;
import table.Rate;

public class RateDaoImpl extends MainDaoImpl<Rate> implements MainDao<Rate>{

	public RateDaoImpl() {
		super(Rate.class);
	}

}
