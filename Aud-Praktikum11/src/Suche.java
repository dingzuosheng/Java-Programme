
public class Suche {
	public static boolean binaereSuche(final String[] worte, final String begriff) {
		int links = 0;
		int rechts = worte.length - 1;
		while (rechts >= links) {
			int mitte = (int)(links + rechts)/2;
			System.out.println(worte[mitte]);
			if (worte[mitte].equals(begriff)) {
				return true;
			} else if (worte[mitte].compareTo(begriff) > 0) {
				rechts = mitte - 1;
			} else {
				links = mitte + 1;
			}
		}
		return false;

	}

	public static void main(String[] args) {
		String[] feld= {"a","b","c","d","e","f","g","h","i","k","l","m","n","o"};
		System.out.println(binaereSuche(feld,"i"));
		}

}
