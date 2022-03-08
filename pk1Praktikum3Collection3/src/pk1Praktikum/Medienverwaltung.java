package pk1Praktikum;

import java.awt.List;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Medienverwaltung{
	private Collection m=new LinkedList<Medium>();
	private int anzMedien = 0;

	public Medienverwaltung() {
		m = new LinkedList();
	}

	public void aufnehmen(Medium einMedium) {
		m.add(einMedium);
        anzMedien++;
	}

	public void zeigeMedein() {
		//wie kann man zuerst die Medien nach Erscheinungsjahr sortieren ?
		for (Object a : m) {

			((Medium) a).druckeDaten();
		}
	}

	public void sucheNeuesMedium() {
		int min;
		Iterator it = m.iterator();
	/*	Medium neu;
		if (it.hasNext()) {
			Medium medium = (Medium) it.next();
			neu = medium;
			min = medium.alter();
			while (it.hasNext()) {
                 medium = (Medium)it.next();
                 if(medium.alter()<min) {
                	 min=medium.alter();
                	 neu=medium;
                 }
			}
			neu.druckeDaten();
		}*/
		if(it.hasNext()) {
			Medium medium = (Medium) it.next();
			min=medium.alter();
			//Medium neu =medium;
			while(it.hasNext()) {
				if(((Medium) it.next()).alter()<min) {
					min=((Medium) it.next()).alter();   	
				}
			}
			((Medium) it.next()).druckeDaten();
		}

	}

	public double berechneErscheinungsjahr() {
		double durchschnitt = 0.0;
		int summe = 0;
		if(anzMedien != 0) {
			for (Object o:m) {
				summe += ((Medium)o).alter();
			}
			durchschnitt = summe / anzMedien;
		} else {
			durchschnitt = 0.0;
		}
		return durchschnitt;
	}


}
