package um21.ems;

import java.sql.SQLException;

public class EmployeeBO {
	EmployeeDTO empDTO=new EmployeeDTO();
	EmployeeDAO empDAO=new EmployeeDAO();
	Utility scan=new Utility();
	public void empSystem() throws SQLException{
		int choice = 0;
		EmployeeDAO dao = new EmployeeDAO();
		do{
			System.out.println("1. View Employee                     >");
			System.out.println("\n2. Register Employee                 >");
			System.out.println("\n3. Update Existing Employee Details  >");
			System.out.println("\n4. Delete Existing Employee Details  >\n Note: Delete option ll permanently delete the details from the Employee table");
			System.out.println("\n5. Exit ");
			System.out.println("\nEnter your choice: ");
			choice = scan.getScannerInstance().nextInt();
		}while(choice ==0);
		
		switch(choice){
		case 1:
			empDAO.viewEmployees();
			break;
		case 2:
			empDAO.registerEmployee(empDTO);
			break;
		case 3:
			empDAO.updateEmployee(empDTO);
			break;
		case 4:
			return;
			
		}
	}
	

	public void viewEmployees(EmployeeDAO dao){
		try {
			dao.viewEmployees();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	public void registerEmployee(EmployeeDAO dao){
		EmployeeDTO empDto = getEmpDetails();
		try {
			dao.registerEmployee(empDto);
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	public void updateEmployee(EmployeeDAO dao)
	{
		EmployeeDTO empDto = getEmpDetails();
		try {
			dao.updateEmployee(empDto);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
	public EmployeeDTO getEmpDetails(){
		EmployeeDTO empDto = new EmployeeDTO();
		System.out.println("Enter Employee Id: ");
		empDto.setEmpId(scan.getScannerInstance().nextInt());
		System.out.println("Enter First Name : ");
		empDto.setFirst_Name(scan.getScannerInstance().next());
		System.out.println("Enter Last Name : ");
		empDto.setLast_Name(scan.getScannerInstance().next());
		System.out.println("Enter Salary : ");
		empDto.setSalary(scan.getScannerInstance().nextFloat());
		return empDto;
		
	}
}
