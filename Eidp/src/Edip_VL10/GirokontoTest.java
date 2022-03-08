package Edip_VL10;

public class GirokontoTest {

	public static void main(String[] args) {
		Girokonto erstesKonto=new Girokonto(); 
        Girokonto zweitesKonto=new Girokonto();  
      
        System.out.println("Bitte geben Sie erstesKonto ein ");         
        System.out.println(erstesKonto.getKontonummer());
        System.out.println(erstesKonto.getKontostand());
        System.out.println(erstesKonto.getDispokredit());
        erstesKonto.setDispokredit(10000);	
        erstesKonto.einzahlen(0);
        System.out.println(erstesKonto.auszahlen(500));
        System.out.println(erstesKonto.ueberweisung(zweitesKonto, 500));
        System.out.println(erstesKonto.toString());
        System.out.println("Bitte geben Sie zweitesKonto ein ");
        System.out.println(zweitesKonto.getKontonummer());
        System.out.println(zweitesKonto.getKontostand());
        System.out.println(zweitesKonto.getDispokredit());
        zweitesKonto.setDispokredit(10000);
        zweitesKonto.einzahlen(500);
        System.out.println(zweitesKonto.auszahlen(0));
        System.out.println(zweitesKonto.ueberweisung(zweitesKonto, 0));
        System.out.println(zweitesKonto.auszahlen(500));
        System.out.println(zweitesKonto.ueberweisung(zweitesKonto, 500));
        System.out.println(zweitesKonto.toString());
                
	}

}
