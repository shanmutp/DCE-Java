
public class LPalindrome2 {

	public static void main(String[] args) {
		String s = "abbslbab";
		StringBuffer s1 = new StringBuffer();
		StringBuffer s2 = new StringBuffer();
		int length = s.length();
		char[] c = s.toCharArray();
		int median = length / 2;
		// creating a string from the first half using a common append method
		appendString(s1, c, median, 0);
		// creating a string from the second half in case of odd length ignore
		// the middle character
		appendString(s2, c, length, (length % 2 == 0 ? median : median + 1));
		char[] c1 = s1.toString().toCharArray();
		char[] c2 = s2.toString().toCharArray();
		boolean flag = false;
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

	private static void appendString(StringBuffer s1, char[] c, int endIndex, int startIndex) {
		for (int i = startIndex; i < endIndex; i++) {
			s1.append(c[i]);
		}
	}

}
