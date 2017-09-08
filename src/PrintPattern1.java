import java.util.Scanner;

public class PrintPattern1 {
	// for the given input C1B5X10 should print the value in the frmat
	// CBBBBBXXXXXXXXXX
	public static void main(String[] args) {
		String s = null;
		System.out.println("Enter the String to be processed");
		Scanner in = new Scanner(System.in);
		s = in.next();
		char a[] = s.toCharArray();
		int value;
		char c = '0';
		StringBuffer b = null;
		for (int i = 0; i < a.length; i++) {
			value = (int) a[i];

			if ((value > 64 && value <= 90) || (value > 96 && value <= 122)) {
				if (b != null && !b.toString().isEmpty())
					display(c, b);
				c = a[i];
				b = new StringBuffer();
			} else if (value >= 48 && value <= 57) {
				b.append(a[i]);
			}

		}
		if (b != null && !b.toString().isEmpty())
			display(c, b);
	}

	private static void display(char c, StringBuffer b) {
		int count = Integer.parseInt(b.toString());
		for (int i = 0; i < count; i++) {
			System.out.print(c);
		}
	}

}
