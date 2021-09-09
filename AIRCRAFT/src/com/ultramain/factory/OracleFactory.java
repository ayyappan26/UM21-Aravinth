package com.ultramain.factory;

import com.ultramain.dao.IDao;
import com.ultramain.dao.OracleDao;

public class OracleFactory extends AbstractFactory{

	public IDao getDao() {
		return new OracleDao();
	}

}
