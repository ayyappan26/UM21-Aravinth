package um21;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		
		BusinessObj bo=new BusinessObj();
		try {
			bo.viewAll();
			bo.view();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
