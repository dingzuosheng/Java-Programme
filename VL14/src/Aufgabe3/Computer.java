package Aufgabe3;

public class Computer {
  Datei [] einDatei= new Datei[1000];
  private String cpu;
  private int speicherkapazitaet;
  private int anzahlDateien=0;
 
  public Computer(String cpu,int speicherkapazitaet) {
	  this.cpu=cpu;
	  this.speicherkapazitaet=speicherkapazitaet;
  }
  public String getCpu() {
	  return this.cpu;
  }
  public int getSpeicherkapazitaet() {
	  return this.speicherkapazitaet;
  }
  public int getAnzahlDateien() {
	  return anzahlDateien;
  }
  public boolean addDatei(Datei datei) {
	  boolean eingft;
	  if(anzahlDateien<einDatei.length&&speicherkapazitaet>datei.berechneGroesse()) {
		  einDatei[anzahlDateien]=datei;
		  speicherkapazitaet-=datei.berechneGroesse();
		  anzahlDateien++;
		  eingft=true;
	  }else {
		  eingft=false;
	  }
	  return eingft; 
  } 
 
  public void ausgebenDateiliste() {
	  for(int i=0;i<einDatei.length;i++) {
		  
		  if(einDatei[i] != null)
		  {
			  
			  System.out.println(einDatei[i]); 
		  }
	  }
  }
}
