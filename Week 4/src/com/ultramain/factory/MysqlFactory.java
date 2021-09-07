package com.ultramain.factory;

import com.ultramain.dao.IDao;
import com.ultramain.dao.MysqlDao;

public class MysqlFactory extends AbstractFactory {

	/* (non-Javadoc)
	 * @see com.ultramain.factory.AbstractFactory#getDao()
	 */
	public IDao getDao() {
	
		return new MysqlDao();
	}

}
