package Aufgabe7;

public class Verwaltung {
	public static void druckeDaten(int[] liste) {
		if (liste != null) {
			for (int i = 0; i < liste.length; i++) {
				System.out.println(liste[i++]);
			}
		}

	}
}
