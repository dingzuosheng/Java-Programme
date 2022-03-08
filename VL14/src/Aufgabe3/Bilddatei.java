package Aufgabe3;

public  class Bilddatei extends Datei{
   private int anzahlZeilen;
   private int anzahlSpalten;
   public Bilddatei(String name,int anzahlZeilen,int anzahlSpalten) {
	   super(name);
	   this.anzahlZeilen=anzahlZeilen;
	   this.anzahlSpalten=anzahlSpalten;
   }
   public String toString() {
	   return "der Name ist: "+super.toString()+"  die Anzahl der Zeilen: "+anzahlZeilen+"  die Anzahl der Spalten: "+anzahlSpalten;
   }
   public int berechneGroesse() {
	   int erg;
	   erg=anzahlZeilen*anzahlSpalten*4;
	   return erg;
   }
}
