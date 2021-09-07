package um21;

import java.sql.SQLException;
import java.util.Map;

import com.ultramain.dao.IDao;
import com.ultramain.factory.AbstractFactory;

public class BusinessObj {
	
	/**
	 *
	 * To view all the data in the DataBase.
	 */
	public void viewAll(){
		AbstractFactory factory=AbstractFactory.getFactory(1);
		IDao dao=factory.getDao();
		//Dao emp = new Dao();
		Map<Integer, EmployeeDTO> view;
		try {
			view = dao.view();
			System.out.println(view.values());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 
	 * To view specific data in the DataBase using EmployeeID.
	 */
	public void view(){
		AbstractFactory factory=AbstractFactory.getFactory(1);
		IDao dao=factory.getDao();
		//Dao emp = new Dao();
		Map<Integer, EmployeeDTO> map;
		try {
			map = dao.view();
			System.out.println(map.get(100));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
