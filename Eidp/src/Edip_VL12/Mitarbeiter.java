package Edip_VL12;

public abstract class Mitarbeiter {
     private String name;
     private int personalnummer;
     private static int anzahlMitarbeiter;
     
     public Mitarbeiter(String name) {
    	 this.name=name;
    	 anzahlMitarbeiter++;
    	 personalnummer=anzahlMitarbeiter;
     }
     public String getName() {
    	 return this.name;
     }
     public void setName(String name) {
    	 this.name=name;
     }
     public int getPersonalnummer() {
    	 return this.personalnummer;
     }
     public abstract double berechneGehalt();   
}
