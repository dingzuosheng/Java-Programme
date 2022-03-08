

import Aufgabe3.Datei;

public class Computer {
	Datei[] einDatei=new Datei[1000];
  private String cpu;
  private int speicherkapazitaet;
  private int anzahlDatei=0;
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
	  int Anzahl=0;
	  for(int i=0;i<einDatei.length;i++) {
		  if(einDatei[i]!=null) {
			  Anzahl++;
		  }
	  }
	  return Anzahl;
  }
  public boolean addDatei(Datei datei) {
	  int belegteDateigroesse=0;
	  for(int i=0;i<einDatei.length;i++) {
		  if(einDatei[i]!=null) {
			  belegteDateigroesse=belegteDateigroesse+einDatei[i].berechneGroesse();
		  }
	  }
	  if(anzahlDatei<einDatei.length&&this.speicherkapazitaet-belegteDateigroesse>=datei.berechneGroesse()) {
		  einDatei[anzahlDatei]=datei;
		  return true;
	  }else {
		  return false;
	  }	  
  }
  public void ausgebenDateiliste() {
	  for(int i=0;i<einDatei.length;i++) {
		  if(einDatei[i]!=null) {
			  System.out.println(einDatei[i]);
		  }
	  }
  }
}
