
public class RaumTest {

	public static void main(String[] args) {
		Raum raum1=new Raum('C','2',"30");
		Raum raum2=new Raum('C','2',"40");
		Raum raum3=new Raum('C','2',"41");
		Raum raum4=new Raum('A','2',"02");
		Raum raum5=new Raum('A','2',"03");
		Professor prof2=new Professor("Konstantin Koll");
		Professor prof3=new Professor("Michael Stark");
		raum2.setNutzer(prof2);
		raum3.setNutzer(prof3);
		Raumverwaltung raumverwaltung=new Raumverwaltung();
		raumverwaltung.addRaum(raum1);
        raumverwaltung.addRaum(raum2);
        raumverwaltung.addRaum(raum3);
        raumverwaltung.addRaum(raum4);
        raumverwaltung.addRaum(raum5);
        raumverwaltung.ausgabeRaumliste();
	}

}
