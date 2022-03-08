
public class MitarbeiterTest {

	public static void main(String[] args) {
		Manager derManager=new Manager("Hans Diether",2000,300);
		derManager.setUmsatz(1);
		Geschaeftsfuehrer einGeschaeftsfuehrer=new Geschaeftsfuehrer("Zhang Sanfeng",3000,600,20);
        einGeschaeftsfuehrer.setUmsatz(1);
        System.out.println("Name: "+derManager.getName()+"  Personalnummer: "+derManager.getPersonalnummer()+" Gehalt: "
        		     +derManager.berechneGehalt());
        System.out.println("Name: "+einGeschaeftsfuehrer.getName()+"  Personalnummer: "+einGeschaeftsfuehrer.getPersonalnummer()+" Gehalt: "
   		     +einGeschaeftsfuehrer.berechneGehalt());
        
	}

}
