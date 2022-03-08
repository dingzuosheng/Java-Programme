package pk1.av.fachlogik;

public class AngestellteTest {

	public static void main(String[] args) {
		Angestellteverwaltung aw = new Angestellteverwaltung();
		
		Angestellte t1 = new Therapeut("Alexander","Miguel",1982,5,4000.0,"Chiropraktikor",3000);
		Angestellte t2 = new Therapeut("Chen","Yang",1978,3,2000.0,"Badmeister",100);
		MedAngestellte m1 = new MedAngestellte("Waschkowitz","Vera",1960,3,3000.0,"Allgemeinmedizin-Fachangestellte");
		MedAngestellte m2 = new MedAngestellte("Sonde","Sofia",1998,3,1500.0,"Allgemeinmedizin-Fachangestellte");
		aw.anstellen(t1);
		aw.anstellen(t2);
		aw.anstellen(m1);
		aw.anstellen(m2);
		Menu menu = new Menu(aw);
		menu.menu();
	}

}
