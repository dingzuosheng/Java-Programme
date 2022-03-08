package praktikum4;

public class MediumTest {

	public static void main(String[] args) {
		Audio a = new Audio(" \" It Means Nothing\" ",2007," Stereophonics",229);
        Bild b = new Bild("  Gebaeude FB Informatik ",2018," Dortmund");
        a.druckeDaten(System.out);
        b.druckeDaten(System.out);
        System.out.println(a.getTitel()+" ist "+a.alter()+" Jahre alt");      
        Audio a2 = new Audio(" \" It Means Nothing\" ",2007," Stereophonics",229);    
        if(a.hashCode()==a2.hashCode()) {  // hier gibt noch Problem !!
        	System.out.println("Die Objekte mit Id "+a.getId()+" und Id "+a2.getId()+ " sind (fachlich) gleich\n"+
        	     "Die gleiche Objekte haben den HashCode -"+a.hashCode());
        }
        if(a.equals(b)==false) {
        	System.out.println("Die Objekte mit Id "+a.getId()+" und Id "+b.getId()+" sind nicht gleich");
        }
        System.out.println("Die unterschiedlichen Objekte haben die Hashcodes -"+a.hashCode()+" und  -"+b.hashCode());
        Menu mv=new Menu(new Medienverwaltung());
        mv.menu();
	}

}
