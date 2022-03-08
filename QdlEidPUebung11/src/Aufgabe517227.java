
public class Aufgabe517227 {

	public static void main(String[] args) {
		// System.out.println(binomialkoeffizient(4,2));
		System.out.println(quersumme(4717));
		System.out.println(laengeDezimaldarstellung(4717));
	}

	public static int binomialkoeffizient(int n, int k) {
		int erg = 1;
		if (k == 0) {
			erg = 1;
		} else if (0 < k && k <= n) {
			int f=1;
			while (k > 0) {
				erg =erg*n/f;
				f++;
				k--;
				n--;
			}
		} else {
			erg = 0;
		}
		return erg;
	}

	public static int quersumme(int n) {
		int s = 1;
		int m = n;
		while (m > 9) {
			m /= 10;
			s++;
		}
		int[] feld = new int[s];
		int summe = 0;
		for (int i = s - 1; i >= 0; i--) {
				feld[i] = n % 10;
				n /= 10;
				summe += feld[i];
		}
		return summe;
	}
	public static int laengeDezimaldarstellung(int n) {
		int laenge=1;
		while(n>9) {
			laenge++;
			n/=10;
		}
		return laenge;
	}

}
