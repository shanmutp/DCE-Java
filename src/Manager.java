
public class Manager extends Employee{

	public Manager() {
		
		System.out.println("Hi Manager");
	}
	public Manager(int id,String empName) {
		this();
		System.out.println("Hi Manager Overloaded");
		
	}
	
	public static void main(String[] args) {
		Manager m = new Manager(100,"shanmu");
		System.out.println(m);
	}
	@Override
	public String toString() {
		return "Manager [empId=" + empId + ", empName=" + empName + "]";
	}

}
