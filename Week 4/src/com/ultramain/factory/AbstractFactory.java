package com.ultramain.factory;

import com.ultramain.dao.IDao;

public abstract class AbstractFactory {
	public abstract IDao getDao();
	/**
	 * @param choice
	 * @return the Dao Object
	 */
	public static AbstractFactory getFactory(int choice){
		AbstractFactory factory=null;
		switch(choice){
		case 1:
			factory=new OracleFactory();
			break;
		case 2:
			factory=new MysqlFactory();
			break;
		case 3:
			factory=new FileSystemFactory();
			break;
		}
		return factory;
		
	}
}
