package praktikum2;

public class Medienverwaltung {
	static int maxanzahl = 10;
	private static Medium[] medien;
	int anzahl = 0;

	public Medienverwaltung() {
		medien = new Medium[maxanzahl];
	}

	public void aufnehmen(Medium m) {
		if (anzahl < medien.length) {
			medien[anzahl++] = m;
		} else {
			System.out.println("keinen Platz mehr !");
		}
	}

	public void zeigeMedien() {
		if (anzahl != 0) {
			for (int i = 0; i < anzahl; i++) {
				if (medien[i] != null) {
					medien[i].druckeDaten();
				}
			}
		}
	}

	public void sucheNeuesMedium() {
		if (anzahl != 0) {
			int min = medien[0].alter();
			Medium neuest = medien[0];
			for (int i = 1; i < anzahl; i++) {
				if (medien[i].alter() < min) {
					min = medien[i].alter();
					neuest = medien[i];
				}
			}
			neuest.druckeDaten();
		}
	}

	public double berechneErscheinungsjahr() {
		double summe = 0.0;
		if (anzahl != 0) {
			for (int i = 0; i < anzahl; i++) {
				if(medien[i]!=null)
				summe += medien[i].getJahr();
			}
			return summe / anzahl;
		} else {
			return 0.0;
		}
	}

}
