
public class Abteilung {
	Mitarbeiter[] derMitarbeiter=new Mitarbeiter[15];
	   private String bezeichnung;
	   private int anzahlMitarbeiter;
	   
	   public Abteilung(String bezeichnung) {
		   this.bezeichnung=bezeichnung;
	   }
	   public String getBezeichnung() {
		   return this.bezeichnung;
	   }
	   public int getAnzahlMitarbeiter() {		  
		   return anzahlMitarbeiter;
	   }
	   public  void  addMitarbeiter(Mitarbeiter mit) { 
		  if(anzahlMitarbeiter<derMitarbeiter.length) {
			  derMitarbeiter[anzahlMitarbeiter]=mit;
			  anzahlMitarbeiter++;
		  }
	   }
	   public Mitarbeiter getMitarbeiter (int i) {
		   if(0<=i&&i<15) {
		     if(derMitarbeiter[i]!=null){
			   return derMitarbeiter[i];
		     }
		   }
			return null;  
		  }
	   public int getAnzahlAngestellte() {
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
