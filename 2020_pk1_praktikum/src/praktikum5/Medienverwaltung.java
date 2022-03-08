package praktikum5;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Medienverwaltung{
	private LinkedList<Medium> medien;

	public Medienverwaltung() {
		medien = new LinkedList<Medium>();
	}

	public void aufnehmen(Medium m) {
		medien.add(m);
	}

	public void zeigeMedien(OutputStream stream) throws IOException{
		Iterator<Medium> it = medien.iterator();
		Collections.sort(medien);
		while (it.hasNext()) {
			it.next().druckeDaten(stream);
		}
	}

	public void sucheNeuesMedium(OutputStream stream) throws IOException {
		Medium neuste = medien.get(0);
		int min = neuste.alter();
		for (Medium m : medien) {
			if (m.alter() < min) {
				neuste = m;
			}
		}
		neuste.druckeDaten(stream);
	}

	public double berechneErscheinungsjahr() {
		if (medien.size()!= 0) {
			double summe = 0.0;
			for (Medium m : medien) {
				summe += m.alter();
			}
			return summe / medien.size();
		} else {
			return 0.0;
		}
	}
	


}
