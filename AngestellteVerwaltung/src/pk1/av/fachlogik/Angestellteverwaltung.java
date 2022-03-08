package pk1.av.fachlogik;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import pk1.av.datenhaltung.PersistenzException;
import pk1.av.datenhaltung.SerialisierungDao;

public class Angestellteverwaltung {
	private LinkedList<Angestellte> liste;
	private SerialisierungDao dao;

	public Angestellteverwaltung(SerialisierungDao dao) {
		liste = new LinkedList<Angestellte>();
		this.dao = dao;
	}

	public void anstellen(Angestellte an) {
		liste.add(an);
	}

	public void zeigeAngestellte(OutputStream stream) {
		Collections.sort(liste);
		Iterator<Angestellte> it = liste.iterator();
		if (liste.size() != 0) {
			while (it.hasNext()) {
				it.next().druckeDaten(stream);
			}
		} else {
			System.out.println("Die list ist leer !");
		}
	}

	public Angestellte sucheJungsteKollege(OutputStream stream) {
		int min = liste.get(0).getAlter();
		Angestellte jungste = liste.get(0);
		for (Angestellte a : liste) {
			if (a.getAlter() < min) {
				min = a.getAlter();
				jungste = a;
			}
		}
		return jungste;
	//	jungste.druckeDaten(stream);
	}
	public Iterator<Angestellte> iterator(){
		if(liste!=null) return liste.iterator();
		return null;		
	}

	public double berechneDurchschnittLohnen() {
		double summe = 0.0;
		Iterator<Angestellte> it = liste.iterator();
		if (liste.size() != 0) {
			while (it.hasNext()) {
				summe += it.next().einkommen();
			}
		}
		return summe / liste.size();
	}
	
	public void speichern() throws PersistenzException {
		dao.speichern(liste);
	}
	public void laden() throws ClassNotFoundException, PersistenzException {
		 liste = dao.laden();		
	}

}
