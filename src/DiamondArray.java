import java.util.Scanner;

public class DiamondArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOfRows;
		System.out.println("Enter the no. of rows...");
		Scanner in = new Scanner(System.in);
		numOfRows = in.nextInt();
		int mRows = (2 * numOfRows - 1);
		int mCols = (2 * numOfRows - 1);
		int midStar = numOfRows - 1;
		char diamondMatrix[][] = new char[mRows][mCols];
		int distance=0;
		for (int i = 0; i <= mRows/2; i++) {
			distance++;
			for (int j = 0; j < mCols; j++) {
				System.out.println(i+"-"+j);
				if (j == midStar || ((j <= (midStar + 1 * i)) && (j >= (midStar - 1 * i)))) {
					diamondMatrix[i][j] = '*';
					if(i!= mRows/2)
					diamondMatrix[mRows-distance][j] = '*';
				} else {
					diamondMatrix[i][j] = ' ';
					if(i!= mRows/2)
					diamondMatrix[mRows-distance][j] = ' ';
				}
			}
		}
		for (int i = 0; i < mRows; i++) {
			for (int j = 0; j < mCols; j++)
			{
				System.out.print(diamondMatrix[i][j]);
				
			}
			System.out.println("");
		}
	
	}

}
