import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Medienverwaltung {
	private Collection m=new LinkedList<Medium>();
	private int anzMedien=0;
	public Medienverwaltung() {
		m=new LinkedList();
	}
	public void aufnehmen(Medium einMedium) {
		m.add(einMedium);
		anzMedien++;
	}
	public void zeigeMedien() {	
		for(Object a : m ) {
			((Medium) a).druckDaten();
		}
	}
	public void sucheNeuesMedium() {
		int min;
		Iterator<Medium> it= m.iterator();
		Medium neu;
		if(it.hasNext()) {
			Medium medium=it.next();
			min=medium.alter();
			neu=medium;
			while(it.hasNext()) {
				medium=it.next();
				if(medium.alter()<min)
					min=it.next().alter();
					neu=it.next();
			}
			neu.druckDaten();
		}
		
	}
	public double berechneErscheinungsjahr() {
		double summe=0.0;
		if(m!=null) {
			for(Object o : m) {
				if((Medium)o!=null) {
				   summe+=((Medium)o).alter();
				}
			}
			return summe/anzMedien;
		}else {
			return 0.0;
		}
		
	}

}
