package um21.ems;

public class EmployeeDTO {
	private String First_Name;
	private String Last_Name;
	private float Salary;
	private int empId;

	public EmployeeDTO(Object object, Object object2, Object object3, Object object4) {
		super();
		First_Name = (String) object;
		Last_Name = (String) object2;
		Salary = (float) object3;
		this.empId = (int) object4;
	}

	public EmployeeDTO() {

	}

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
