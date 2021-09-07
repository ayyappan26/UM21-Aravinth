package um21;

public class EmployeeDTO {
	private String First_Name;
	private String Last_Name;
	private float Salary;
	private int empId;
	
	

	/*public EmployeeDTO(int empId,String first_Name, String last_Name, float salary) {
		super();
		First_Name = first_Name;
		Last_Name = last_Name;
		Salary = salary;
		this.empId = empId;
	}*/

	public String getFirst_Name() {
		return First_Name;
	}

	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}

	public String getLast_Name() {
		return Last_Name;
	}

	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}

	public float getSalary() {
		return Salary;
	}

	public void setSalary(float salary) {
		Salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
}
