public class Employee {

	private String name;
	private String email;
	private Department department;

	public Employee(String name, String email, Department department) {
		this.name = name;
		this.email = email;
		this.department = department;
	}

	public String getName() {
		return name;

	}

	public String getEmail() {
		return email;

	}

	public Department getDepartment() {
		return department;

	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String toString() {
		return this.name + " (" + this.email + "), " + this.department.getName() + " department";
	}
}