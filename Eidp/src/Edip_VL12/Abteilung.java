package Edip_VL12;

public class Abteilung {
   private String bezeichnung;
   int anzahlMitarbeiter=0;
   public Abteilung(String bezeichnung) {
	   this.bezeichnung=bezeichnung;
   }
   
   Mitarbeiter [] derMitarbeiter=new Mitarbeiter[15];
   
   public String getBezeichnung() {
	   return this.bezeichnung;
   }
   public int getAnzahlMitarbeiter() {
	   return anzahlMitarbeiter;
   }
   public void addMitarbeiter(Mitarbeiter mit) {
	  if(anzahlMitarbeiter<derMitarbeiter.length) {
		  derMitarbeiter[anzahlMitarbeiter]=mit;
		  anzahlMitarbeiter++;
	  }
   }
   public Mitarbeiter getMitarbeiter(int i) {
	   if(0<=i&&i<15) {
	      if(derMitarbeiter[i]!=null) {
		   return derMitarbeiter[i];
	      } else {
	    	  return null;
	      }
	   }
	   return null;
   }
   public int getAnzahlAngestellter() {
	   int Anzahl=0;
	   for(int i=0;i<derMitarbeiter.length;i++) {
		   if(derMitarbeiter[i] instanceof Angestellter) {
			   Anzahl++;
		   }
	   }
	   return Anzahl;
   }
   public double berechneGehaltskosten() {
	   double Gehalt=0.0;
	   for(int i=0;i<derMitarbeiter.length;i++) {
		   if(derMitarbeiter[i]!=null) {
			   Gehalt+=derMitarbeiter[i].berechneGehalt();
		   }
	   }
	   return Gehalt;
   }

}
