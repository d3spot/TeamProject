package dao.daoImpl;

import dao.MainDao;
import table.Rate;

public class RateRoleImpl extends MainDaoImpl<Rate> implements MainDao<Rate>{

	public RateRoleImpl(Class<Rate> elementClass) {
		super(Rate.class);
	}

}
