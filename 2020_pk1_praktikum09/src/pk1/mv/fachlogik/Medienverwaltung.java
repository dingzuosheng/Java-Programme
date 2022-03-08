package pk1.mv.fachlogik;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
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
		Iterator<Medium> it = medien.iterator();
		Collections.sort(medien);
		while (it.hasNext()) {
			it.next().druckeDaten(stream);
		}
	}

	public Medium sucheNeuesMedium() {
		Medium neuste = medien.get(0);
		int min = neuste.alter();
		for (Medium m : medien) {
			if (m.alter() < min) {
				neuste = m;
			}
		}
		return neuste;
	}

	public double berechneErscheinungsjahr() {
		if (medien.size() != 0) {
			double summe = 0.0;
			for (Medium m : medien) {
				summe += m.getJahr();
			}
			return summe / medien.size();
		} else {
			return 0.0;
		}
	}
	public Iterator<Medium> iterator(){
		if (medien!=null)	return medien.iterator();
		else return null;
	}

	public void speichern() throws PersistenzException {		
		dao.speichern(medien);
	}
	
    public void laden() throws  PersistenzException {
    		medien=(LinkedList<Medium>) dao.laden();
	}

}
