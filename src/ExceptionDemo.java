
public class ExceptionDemo {

	public void divide(int a, int b) throws ArithmeticException,NullPointerException {
		
			int result = a / b;
			String s = null;
			s.length();
			System.out.println("Result-->" + result);
			
		
	}

	public void calculate() {
		try {
			divide(10, 100);
		} catch (ArithmeticException e) {
			System.out.println("IOE Error =" + e.getMessage());
		} catch (Exception e) {
			System.out.println("General Error =" + e.getMessage());
		}

	}

	public static void main(String[] args) {
		ExceptionDemo d = new ExceptionDemo();
		d.calculate();
	}

}
