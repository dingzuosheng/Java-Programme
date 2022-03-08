

public class MediumTest {

	public static void main(String[] args) {
		Medium m1 = new Audio("It means Nothing",2007,"Stereophonics",229);
		Medium m2 = new Bild("Gebaeude FB Informatik",2018,"Dortmund");
		
		m1.druckDaten();
		m2.druckDaten();
		
		System.out.println(m1.getTitel()+" ist "+m1.alter()+" Jahre alt");
		System.out.println(m2.getTitel()+" ist "+m2.alter()+" Jahre alt");
	
		
		Medium m3 = new Audio("It means Nothing",2007,"Stereophonics",229);
		if(m1.equals(m3)) {
			System.out.println("Die Objekte mit Id "+m1.getId()+" und Id "+m3.getId()+ 
								" sind (fachlich) gleich");
			System.out.println("Die gleichen Objekte haben den Hashcode -"+m1.hashCode());
		}
		if(!m1.equals(m2)) {
			System.out.println("Die Objekte mit Id "+m1.getId()+" und Id "+m2.getId()+
								" sind nicht gleich");
			System.out.println("Die unterschiedlichen Objekte haben die Hashcodes -"+
								m1.hashCode()+" und -"+m2.hashCode());
		}
		Menu menu = new Menu(new Medienverwaltung());
		menu.menu();
	}

}
