package Edip_VL12;

public class MitarbeiterTest {

	public static void main(String[] args) {
		Abteilung eineAbteilung1=new Abteilung("Vertrieb Abteilung");
		Abteilung eineAbteilung2=new Abteilung("Produkt  Abteilung");
		Manager   einManager1 = new Manager("Karl Max",1000.0,200.0);
		Manager   einManager2 = new Manager("Friderich Eggs",2000.0,50.0);
		Geschaeftsfuehrer derGeschaeftsfuehrer=new Geschaeftsfuehrer("Lincon",2000.0,300.0,20);
		Angestellter derAngestellter =new Angestellter("Claudius ",450.0,50.0,100.0);
		eineAbteilung1.addMitarbeiter(einManager1);
		eineAbteilung1.addMitarbeiter(derGeschaeftsfuehrer);
		eineAbteilung1.addMitarbeiter(derAngestellter);
		eineAbteilung2.addMitarbeiter(einManager2);
		eineAbteilung2.addMitarbeiter(derAngestellter);
		System.out.println(eineAbteilung1.getAnzahlMitarbeiter());
		System.out.println(eineAbteilung1.getAnzahlAngestellter());
		System.out.println(eineAbteilung1.berechneGehaltskosten());
		System.out.println(eineAbteilung2.getAnzahlMitarbeiter());
		System.out.println(eineAbteilung2.getAnzahlAngestellter());
		System.out.println(eineAbteilung2.berechneGehaltskosten());
		
		
		

	}

}
