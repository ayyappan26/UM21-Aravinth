package com.ultramain.factory;

import com.ultramain.dao.FileSystemDao;
import com.ultramain.dao.IDao;

public class FileSystemFactory extends AbstractFactory{

	/* (non-Javadoc)
	 * @see com.ultramain.factory.AbstractFactory#getDao()
	 */
	public IDao getDao() {
		
		return new FileSystemDao();
	}

}
