package pk1Praktikum;

import java.awt.List;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Medienverwaltung {

	private Collection<Medium> m;
	private int anzMedien = 0;

	public Medienverwaltung() {
		m = new LinkedList<Medium>();
	}

	public void aufnehmen(Medium einMedium) {
		m.add(einMedium);
        anzMedien++;
	}

	public void zeigeMedien() {
		for (Medium a : m) {
			a.druckeDaten();
		}
	}

	public void sucheNeuesMedium() {

		int min;
		Iterator<Medium> it = m.iterator();
		Medium neu;
		if (it.hasNext()) {
			Medium medium =  it.next();
			neu = medium;
			min = medium.alter();
			while (it.hasNext()) {
                 medium = it.next();
                 if(medium.alter()<min) {
                	 min=medium.alter();
                	 neu=medium;
                 }
			}
			neu.druckeDaten();
		}
	}

	public double berechneErscheinungsjahr() {
		double durchschnitt = 0.0;
		int summe = 0;
		if(anzMedien != 0) {
			for (Medium o:m) {
				summe += o.alter();
			}
			durchschnitt = summe / anzMedien;
		} else {
			durchschnitt = 0.0;
		}
		return durchschnitt;
	}

}
