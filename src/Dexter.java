import java.util.Scanner;

public class Dexter {

	public static void main(String[] args) {
		 
		int a[] = { 3, 5, 3, 6, 3, 4, 10, 4, 5,2,2};
		int count=0;
		for (int i = 0; i < a.length-2; i++) {
			for (int j = i+1; j < a.length; j++) {
				int res1= a[j]-a[i];
				for (int k = j+1; k < a.length; k++) {
					
					int res2 = a[k]-a[j];
					if(res2==res1)
					{
						count++;
					}
				}

			}
		}
	System.out.println("Combinations-->"+count);
	}
}
