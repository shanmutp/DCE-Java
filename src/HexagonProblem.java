import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HexagonProblem {
	private static final String A = "a";
	private static final String B = "b";
	private static Map<String, List<String>> aPatterns = null;
	private static Map<String, List<String>> bPatterns = null;
	private static Map<String, Integer> aValues = new HashMap<String, Integer>();
	private static Map<String, Integer> bValues = new HashMap<String, Integer>();
	static int count = 0;
	static Set<String> zeroTiles = new HashSet<String>();

	public static void main(String[] args) {
		int numOfElements;
		String aRow, bRow;
		System.out.println("Enter the no of elements...");
		Scanner in = new Scanner(System.in);
		numOfElements = in.nextInt();
		System.out.println("Enter the A rows elements...");
		aRow = in.next();
		System.out.println("Enter the B rows elements...");
		bRow = in.next();
		loadABBinaryData(aValues, aRow, A);
		loadABBinaryData(bValues, bRow, B);
		preValidateTiling(aRow, bRow);
		loadATilesPattern(numOfElements);
		loadBTilesPattern(numOfElements);
		validateTiling(numOfElements);
	}

	private static void validateTiling(int numOfElements) {
		List aVal = null;
		List bVal = null;
		Set<String> tiles = new HashSet<String>();
		String lastIndexChar = B;
		for (int i = 1; i <= numOfElements; i++) {
			aVal = aPatterns.get(A + i);
			if (aVal == null && i >= 1)
				lastIndexChar = A;
			bVal = bPatterns.get(B + i);
			if (B.equals(lastIndexChar) && aVal != null) {
				if (tiles.contains(A + i)) {// To handle Repeated consecutive
											// black tiles in A
					lastIndexChar = A;
					continue;
				}
				// A row are handled vertically ai,bi followed by horizontally
				// ai and ai+1
				if (aVal.contains(B + i)) {
					tiles.add(A + i);
					tiles.add(B + i);
					lastIndexChar = B;
				} else if (aVal.contains(A + (i + 1))) {
					tiles.add(A + i);
					tiles.add(A + (i + 1));
					lastIndexChar = A;
				}
			} else if (A.equals(lastIndexChar) && bVal != null) {
				if (tiles.contains(B + i)) { // To handle Repeated consecutive
												// black tiles in A
					lastIndexChar = B;
					continue;
				}
				// B row are handled diagonally bi and bi+1 followed by
				// horizontally bi , bi+1
				if (bVal.contains(A + (i + 1))) {
					tiles.add(A + (i + 1));
					tiles.add(B + i);
					lastIndexChar = A;
				} else if (bVal.contains(B + (i + 1))) {
					tiles.add(B + i);
					tiles.add(B + (i + 1));
					lastIndexChar = B;
				}

			} else {
				lastIndexChar = B;
			}
		}
		if (tiles.size() == zeroTiles.size()) {
			System.out.println("Successful Tiling");
		} else {
			System.out.println("Tiling NOT Successful");
		}

	}

	private static void preValidateTiling(String aRow, String bRow) {
		if (aRow.length() != bRow.length()) {
			System.out.println("Wrong input");
			System.exit(1);
		}
		if (count % 2 != 0) {
			System.out.println("CANNOT TILE");
			System.exit(1);
		}

	}

	// method for loading possible A B binary data in a map used by other
	// methods to check if the tile is a black tile
	private static void loadABBinaryData(Map<String, Integer> valueMap, String row, String mapType) {
		char c[] = row.toCharArray();
		String s = null;

		for (int i = 0; i < row.length(); i++) {
			s = "" + c[i];
			valueMap.put(mapType + (i + 1), Integer.parseInt(s));
			if (c[i] == '1')
				count++;
		}

	}

	// method for loading possible A tile patterns ignoring the black tiles
	private static void loadATilesPattern(int numOfElements) {
		aPatterns = new HashMap<String, List<String>>();
		List<String> l = null;
		for (int i = 1; i <= numOfElements; i++) {
			if (aValues.get(A + i) != 1) {
				l = new ArrayList<>();
				zeroTiles.add(A + (i));
				if (numOfElements != i && aValues.get(A + (i + 1)) != 1) {
					l.add(A + (i + 1));

					zeroTiles.add(A + (i + 1));
				}
				if (bValues.get(B + i) != 1) {
					l.add(B + i);

					zeroTiles.add(B + i);
				}
				aPatterns.put(A + i, l);

			}
		}
	}

	// method for loading possible B tile patterns ignoring the black tiles
	private static void loadBTilesPattern(int numOfElements) {
		bPatterns = new HashMap<String, List<String>>();
		List<String> l = null;
		for (int i = 1; i < numOfElements; i++) {
			if (bValues.get(B + i) != 1) {
				l = new ArrayList<>();
				zeroTiles.add(B + i);
				if (aValues.get(A + (i + 1)) != 1) {
					l.add(A + (i + 1));
					zeroTiles.add(A + (i + 1));
				}
				if (bValues.get(B + (i + 1)) != 1) {
					l.add(B + (i + 1));
					zeroTiles.add(B + (i + 1));
				}
				bPatterns.put(B + i, l);

			}
		}
	}

}
