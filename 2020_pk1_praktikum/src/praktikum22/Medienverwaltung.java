package praktikum22;

import java.util.Iterator;
import java.util.LinkedList;

public class Medienverwaltung {
	private LinkedList<Medium> medien;
	int anzMedien = 0;

	public Medienverwaltung() {
		medien = new LinkedList<Medium>();
	}

	public void aufnehmen(Medium m) {
		medien.add(m);
		anzMedien++;
	}

	public void zeigeMedien() {
		Iterator<Medium> it = medien.iterator();
		while (it.hasNext()) {
			it.next().druckeDaten();
		}
	}

	public void sucheNeuesMedium() {
		Medium neuste = medien.get(0);
		int min = neuste.alter();
		for (Medium m : medien) {
			if (m.alter() < min) {
				neuste = m;
			}
		}
		neuste.druckeDaten();
	}

	public double berechneErscheinungsjahr() {
		if (anzMedien != 0) {
			double summe = 0.0;
			for (Medium m : medien) {
				summe += m.getJahr();
			}
			return summe / anzMedien;
		} else {
			return 0.0;
		}
	}

}
