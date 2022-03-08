package Aufgabe3;

public abstract class Datei {
  private String name;
  
  public Datei(String name) {
	  this.name=name;
  }
  public String toString() {
	  return this.name;
  }
  public abstract int berechneGroesse();
}
