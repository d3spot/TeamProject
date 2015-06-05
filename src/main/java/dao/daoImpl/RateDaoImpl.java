package dao.daoImpl;

import org.springframework.stereotype.Repository;

import dao.MainDao;
import table.Rate;


@Repository
public class RateDaoImpl extends MainDaoImpl<Rate, Integer> implements MainDao<Rate, Integer>{

	public RateDaoImpl() {
		super(Rate.class);
	}

}
