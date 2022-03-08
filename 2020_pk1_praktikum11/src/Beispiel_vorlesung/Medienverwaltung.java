package Beispiel_vorlesung;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Medienverwaltung{
	private LinkedList<Medium> medien;
	

	public Medienverwaltung() {
		medien = new LinkedList<Medium>();
	}

	public void aufnehmen(Medium m) {
		medien.add(m);
	}

	public void zeigeMedien() {
		Iterator<Medium> it = medien.iterator();
		Collections.sort(medien);
		while (it.hasNext()) {
			it.next().druckeDaten();
		}
	}

	public void sucheNeuesMedium() {
		Stream<Medium> stream = medien.stream();
		System.out.println(stream.max(Medium::compareTo));
	}

	public double berechneErscheinungsjahr() {
		Stream<Medium> stream = medien.stream();
		//double jahr= stream.map(m->m.getJahr())
		//		      .reduce(0,(a,b)->a+b);
		//if(medien.size()> 0) return jahr/medien.size();
		//return 0.0;
		return stream.collect(Collectors.averagingDouble(Medium::getJahr));
	}
}
