
public class GirokontoTest {

	public static void main(String[] args) {
		Girokonto einkonto1=new Girokonto();
		Girokonto einkonto2=new Girokonto();
		

		einkonto1.setDispokredit(10000.0);
		einkonto1.einzahlen(0.0);
	System.out.println(	einkonto1.auszahlen(15000.0));
	System.out.println(einkonto1.auszahlen(8000.0));
	System.out.println(einkonto1.ueberweisung(einkonto2, 2000.0));
	System.out.println(einkonto1.ueberweisung(einkonto2, 3000.0));
		
		einkonto2.setDispokredit(10000.0);
		einkonto2.einzahlen(100.0);
		System.out.println(einkonto2.auszahlen(0.0));
		System.out.println(einkonto2.ueberweisung(einkonto1, 0.0));
		
		System.out.println(einkonto1.toString());
		System.out.println(einkonto2.toString());

	}

}
