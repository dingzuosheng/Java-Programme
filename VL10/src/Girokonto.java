
public class Girokonto {
 private String kontonummer;
 private double kontostand;
 private double dispokredit;
 private static int anzahlKonten;
 
 
 public Girokonto(){
	 anzahlKonten++;
	 int t=822000000+anzahlKonten;
	 this.kontonummer="0"+t;
 }
 public String getKontonummer() {
	 return this.kontonummer;
 }
 public double getKontostand() {
	 return this.kontostand;
 }
 public double getDispokredit() {
	 return this.dispokredit;
 }
 public void setDispokredit(double kredit) {
	 this.dispokredit=kredit;
 }
 public void einzahlen(double betrag) {
	 this.kontostand+=betrag;
 }
 public boolean auszahlen(double betrag) {
	 boolean ausgezahlt=false;
	 if(kontostand+dispokredit>=betrag) {
		 this.kontostand-=betrag;
		 ausgezahlt=true;
	 }
	 return ausgezahlt;
 }
 public boolean ueberweisung(Girokonto zweitesKonto,double betrag) {
	 boolean ueberwiesen=false;
	 if(this.auszahlen(betrag)==true) {
	 zweitesKonto.einzahlen(betrag);
	 ueberwiesen=true;
	 }else {
		 ueberwiesen=false;
	 }
	 return ueberwiesen;
 }
 public String toString() {
	 return this.kontonummer+","+this.kontostand+","+this.dispokredit;
 }
 
 
}
