import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Aufgabe47 {
	
	public static void sortierteAusgabe(List<Angestellter> liste) {
		Collections.sort(liste,(l,r)->Double.compare(l.getMonatsgehalt(),r.getMonatsgehalt()));
		for(Angestellter a: liste) {
			System.out.println(a.getName()+" erhaelt "+a.getMonatsgehalt());
		}
	}
	
	public static void main(String[] args) {
		Angestellter a1 = new Angestellter("James Gosling",7000);
		Angestellter a2 = new Angestellter("Bill Gates",6000);
		List<Angestellter> l = new LinkedList<Angestellter>();
		l.add(a1);
		l.add(a2);
		Aufgabe47.sortierteAusgabe(l);

	}

}
