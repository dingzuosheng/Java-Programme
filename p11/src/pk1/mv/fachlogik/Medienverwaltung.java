package pk1.mv.fachlogik;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Stream;

import datenhaltung.PersistenzException;
import datenhaltung.SerialisierungDao;

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
		medien.forEach(m -> {
			try {
				m.druckeDaten(stream);
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
	}

	public Medium sucheNeuesMedium() {
		Optional<Medium> neues = medien.stream().max(Medium::compareTo);
		return neues.get();
		
		
	}

	public double berechneErscheinungsjahr() {
		Stream<Medium> stream = medien.stream();
		double jahr = stream.map(m->m.getJahr())
							.reduce(0,(a,b)->a+b);
		if(medien.size()>0) return jahr/medien.size();
		return 0.0;
		//return medien.stream().collect(averagingDouble(Medium::getJahr));
		
	}
	public void ausgabe() {
		String[] name = {"Ein","kurzer","Satz"};
		Optional<String> shortname = Stream.of(name)
										   .filter(s->s.length()<4)
										   .findFirst();
		shortname.ifPresent(s->System.out.println(s));
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

	public void laden() throws PersistenzException {
		medien = (LinkedList<Medium>) dao.laden();
	}

}
