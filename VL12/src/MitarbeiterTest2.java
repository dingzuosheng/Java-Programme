
public class MitarbeiterTest2 {

	public static void main(String[] args) {
		Abteilung eineAbteilung1=new Abteilung("Alibaba Group");
		Abteilung eineAbteilung2=new Abteilung("Google Group");
		Manager derManager1	=new Manager("Bill Gates",10000.0,200.0);
		Manager derManager2=new Manager("Obama",1000.0,300.0);
		Geschaeftsfuehrer derGeschaeftsfuehrer1=new Geschaeftsfuehrer("Jack Ma",5000.0,1000.0,3000);
		Angestellter einAngestellter=new Angestellter("Thomas Maus",1000.0,100.0,400.0);
		eineAbteilung1.addMitarbeiter(derGeschaeftsfuehrer1);
		eineAbteilung1.addMitarbeiter(derManager2);
		eineAbteilung1.addMitarbeiter(einAngestellter);
		eineAbteilung2.addMitarbeiter(derManager1);
		
		
		
		System.out.println(eineAbteilung1.getAnzahlMitarbeiter());
		System.out.println(eineAbteilung1.getAnzahlAngestellte());
		System.out.println(eineAbteilung1.berechneGehaltskosten());
		
		System.out.println(eineAbteilung2.getAnzahlMitarbeiter());
		System.out.println(eineAbteilung2.getAnzahlAngestellte());
		System.out.println(eineAbteilung2.berechneGehaltskosten());
		
		
		
		
		
		

	}

}
