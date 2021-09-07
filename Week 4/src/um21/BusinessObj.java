package um21;

import java.sql.SQLException;
import java.util.Map;

import com.ultramain.dao.IDao;
import com.ultramain.factory.AbstractFactory;

public class BusinessObj {
	public void viewAll() throws SQLException {
		AbstractFactory factory=AbstractFactory.getFactory(1);
		IDao dao=factory.getDao();
		//Dao emp = new Dao();
		Map<Integer, EmployeeDTO> view = dao.view();
		System.out.println(view.values());
	}
	public void view() throws SQLException{
		AbstractFactory factory=AbstractFactory.getFactory(1);
		IDao dao=factory.getDao();
		//Dao emp = new Dao();
		Map<Integer, EmployeeDTO> map = dao.view();
		System.out.println(map.get(100));
	}
}
