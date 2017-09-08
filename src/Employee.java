
public class Employee {

	int empId;
	String empName;

	public Employee() {
		System.out.println("Hello Employee");

	}

	public Employee(int empId, String empName) {
		System.out.println("Employee overloaded constructor");
		this.empId = empId;
		this.empName = empName;

	}

	public String toString() {
		return "Employee [empId=" + empId + ",";
	}

	public static void main(String[] args) {
		Employee e1 = new Employee();
		
		Employee e3 = new Employee(100, "Tom");
		Employee e4 = new Employee(101, "Jerry");
		System.out.println(e3);
		System.out.println(e4);

	}

}
