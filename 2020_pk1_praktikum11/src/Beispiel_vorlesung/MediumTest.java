package Beispiel_vorlesung;

public class MediumTest {

	public static void main(String[] args) {
		Medium a = new Audio("It Means Nothing",2007,"Stereophonics",229);
		Medium b = new Bild("Gebaeude FB Informatik",2018,"Dortmund");
			a.druckeDaten();
			b.druckeDaten();
		System.out.println("\""+a.getTitel()+"\""+" ist "+a.alter()+" Jahre alt");
		System.out.println("\""+b.getTitel()+"\""+" ist "+b.alter()+" Jahre alt");
		Medium c = new Audio("It Means Nothing",2007,"Stereophonics",229);
		if(a.equals(c)) {
			System.out.println("Die Objekte mit Id "+a.getId()+" und Id "+c.getId()+" sind (fachlich) gleich");
			System.out.println("Die gleiche Objekte haben den Hashcode -"+a.hashCode());
		}
		if(!a.equals(b)) {
			System.out.println("Die Objekte mit Id "+a.getId()+" und Id "+b.getId()+" sind nicht gleich");
			System.out.println("Die unterschiedliche Objekte haben die Hashcodes -"+a.hashCode()+" und -"+b.hashCode());
		}
		
		Medienverwaltung m = new Medienverwaltung();
		m.aufnehmen(a);
		m.aufnehmen(b);
		m.zeigeMedien();
		m.sucheNeuesMedium();
		System.out.println(m.berechneErscheinungsjahr());
			

	}

}
