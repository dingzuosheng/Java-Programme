package Aufgabe3;

public  class Textdatei extends Datei {
 private int anzahlZeichen;
 public Textdatei(String name,int anzahlZeichen) {
	 super(name);
	 this.anzahlZeichen=anzahlZeichen;
 }
 public String toString() {
	 return "der Name ist: "+super.toString()+"  die Anzahl der Zeichen: "+anzahlZeichen;
 }
 public int berechneGroesse() {
	int erg;
	erg=anzahlZeichen*2;
	return erg;
 }
 
}
