package pk1.mv.fachlogik;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Optional;
import java.util.stream.Stream;

import pk1.mv.datenhaltung.PersistenzException;
import pk1.mv.datenhaltung.SerialisierungDao;

public class Medienverwaltung {
	private LinkedList<Medium> medien;
	private SerialisierungDao dao;

	public Medienverwaltung(SerialisierungDao dao) {
		medien = new LinkedList<Medium>();
		this.dao = dao;
	}

	public void aufnehmen(Medium m) {
		medien.add(m);
	}

	public void zeigeMedien(OutputStream stream) throws IOException {
		
		Collections.sort(medien);
		medien.forEach(m-> m.druckeDaten(stream));	
						 
	}

	public Medium sucheNeuesMedium() {
	/*	Medium neuste = medien.get(0);
		int min = neuste.alter();
		for (Medium m : medien) {
			if (m.alter() < min) {
				neuste = m;
			}
		}
		return neuste;*/
		Optional<Medium> neues = medien.stream().max(Medium::compareTo);
		return neues.get();
	
				     
	}

	public double berechneErscheinungsjahr() {
	/*	if (medien.size() != 0) {
			double summe = 0.0;
			for (Medium m : medien) {
				summe += m.alter();
			}
			return summe / medien.size();
		} else {
			return 0.0;
		}*/
		Stream<Medium> stream = medien.stream();
		double jahr = stream.map(m->m.getJahr())
		      .reduce(0,(a,b)->a+b);
		return jahr /medien.size();
	}

	public Iterator<Medium> iterator() {
		if (medien != null)
			return medien.iterator();
		else
			return null;
	}

	public void speichern() throws PersistenzException {

		dao.speichern(medien);

	}

	@SuppressWarnings("unchecked")
	public void laden() throws PersistenzException {
		medien = (LinkedList<Medium>) dao.laden();
	}

}
