package praktikum21;

import java.util.Iterator;
import java.util.LinkedList;

public class Medienverwaltung {
	private LinkedList medien;
	int anzahl = 0;

	public Medienverwaltung() {
		medien = new LinkedList();
	}

	public void aufnehmen(Medium m) {
		medien.add(m);
		anzahl++;
	}

	/*
	 * public void zeigeMedien() { Iterator it = medien.iterator(); if (anzahl != 0)
	 * { while (it.hasNext()) { ((Medium) it.next()).druckeDaten(); } }
	 * 
	 * }
	 */

	public void zeigeMedien() {
		Iterator it = medien.iterator();
		if (medien.size() != 0) {
			while (it.hasNext()) {
				((Medium) it.next()).druckeDaten();
			}
		}else {
			System.out.println("Liste ist leer !");
		}
	}

	public void sucheNeuesMedium() {
		Medium neuste = (Medium) medien.get(0);
		int min = neuste.alter();
		for (Object m : medien) {
			if (((Medium) m).alter() < min) {
				min = ((Medium) m).alter();
				neuste = (Medium) m;
			}
		}
		neuste.druckeDaten();
	}
	
	public double berechneErscheinungsjahr() {
		double summe = 0.0;
		Iterator it = medien.iterator();
		if (anzahl != 0) {
			while (it.hasNext()) {
				summe += ((Medium) it.next()).getJahr();
			}
			return summe / anzahl;
		} else {
			return 0.0;
		}
	}
}
