
public class MediumTest {

	public static void main(String[] args) {
		Audio a=new Audio("\"It means nothing\"",2007,"Stereophonics",229);
		Bild b=new Bild("\"Gebaeude FB Informatik\"",2018,"Dortmund");
		a.druckDaten();
		b.druckDaten();
		System.out.println(a.getTitel()+" ist "+a.alter()+" Jahre alt");
		Audio a2= new Audio("It means nothing",2007,"Stereophonics",229);
		if(a.equals(a2)) {
			System.out.println("Die Objecte mit Id "+a.getId()+" und Id "+b.getId()+
					"sind (fachlich) gleich");
			if(a.hashCode()==a2.hashCode()) {
				System.out.println("Die gleichen Objecte haben den Hashcode  -"+a.hashCode());
			}
		}
		if(!a.equals(b)) {
			System.out.println("Die Objecte mit Id "+" "+a.getId()+" und Id "+b.getId()+" "+
					 "sind nicht gleich\nDie untnerschiedlichen Objekte haben die Hashcodes -"
					     +a.hashCode()+" und  -"+b.hashCode());
		}
		Medienverwaltung mv=new Medienverwaltung();
		mv.aufnehmen(a);
		mv.aufnehmen(b);
		mv.zeigeMedien();
		mv.sucheNeuesMedium();
		System.out.println("Das durschnittliche Jahr ist: "+mv.berechneErscheinungsjahr());

	}

}
