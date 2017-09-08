
public class LPalindrome {

	public static void main(String[] args) {
		
		String s = "4 aababb gaga rotor asddsa";
		long startTime= System.currentTimeMillis();
		String[] words = s.split(" ");
		for (int j = 1; j < words.length; j++) {
			int length = words[j].length();
			boolean flag = false;
			char[] c = words[j].toCharArray();
			int median = length / 2;
			for (int i = 0; i < median; i++) {
				for (int k = (length % 2 == 0 ? median : median + 1); k < length; k++) {
					flag = c[i] == c[k] ? true : false;
					if (flag) {
						c[k] = '-';
						break;
					}
				}
				if (!flag) {
					break;
				}
			}
			if (flag) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			
		}
		long endTime= System.currentTimeMillis();
		System.out.println("Time taken-->"+(endTime-startTime));
	}

}
