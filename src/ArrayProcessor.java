import java.util.Scanner;

public class ArrayProcessor {
	int b[];

	public void loadArray() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of the Number");
		int n = s.nextInt();
		b = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter " + i + " Value");
			b[i] = s.nextInt();

		}
	}

	public void displayArray() {
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);

		}
	}

	public void sortArray() {
		int temp = 0;
		for (int i = 0; i < b.length; i++) {
			for (int j = i; j < b.length; j++) {
				if (b[i] < b[j]) {
					temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
	}

	public void twinElements() {
		int temp[] = new int[b.length];
		int count = 0;
		int kIndex = 0;
		boolean flag = false;
		for (int i = 0; i < b.length-1; i++) {
			for (int j = i+1; j < b.length; j++) {
				if (b[i] == b[j]) {
					flag = false;
					for (int k = 0; k < temp.length; k++) {

						if (b[i] == temp[k]) {
							flag = true;
							break;
						}

					}
					if (flag != true) {
						temp[kIndex] = b[i];
						kIndex++;
						count++;
					}
					
				}
			}
		}
		System.out.println("Twins -->" + count);
	}

	public static void main(String[] args) {

		ArrayProcessor p = new ArrayProcessor();
		p.loadArray();
		p.displayArray();
		// p.sortArray();
		// p.displayArray();
		p.twinElements();

	}

}
