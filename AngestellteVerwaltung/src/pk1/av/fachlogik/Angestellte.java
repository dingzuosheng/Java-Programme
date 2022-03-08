package pk1.av.fachlogik;

import java.io.OutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
public abstract class Angestellte implements Comparable<Angestellte>,Serializable{
	private static final long serialVersionUID = 1L;
	private int id;
	private String nachname;
	private String vorname;
	private int geburtsjahr;
	private int ausbildungszeit;
	private double gehalt;
	private static int counter = 0;
	
	public Angestellte(String nachname,String vorname,int geburtsjahr,int ausbildungszeit,double gehalt) {
		id=counter++;
		this.nachname=nachname;
		this.vorname=vorname;
		this.geburtsjahr=geburtsjahr;
		this.ausbildungszeit=ausbildungszeit;
		this.gehalt=gehalt;
	}
	public int getId() {
		return this.id;
	}
	public void setAusbildungszeit(int ausbildungszeit) {
		this.ausbildungszeit=ausbildungszeit;
	}
	public int getAusbildungszeit() {
		return this.ausbildungszeit;
	}
	public int getAlter() {
		return LocalDate.now().getYear()-getGeburtsjahr();
	}
	public void setGeburtsjahr(int geburtsjahr) {
		this.geburtsjahr = geburtsjahr;
	}
	public int getGeburtsjahr() {
		return this.geburtsjahr;
	}
	public void setNachname(String nachname) {
		this.nachname=nachname;
	}
	public String getNachname() {
		return this.nachname;
	}
	public void setVorname(String vorname) {
		this.vorname=vorname;
	}
	public String getVorname() {
		return this.vorname;
	}
	public void setGehalt(double gehalt) {
		this.gehalt=gehalt;
	}
	public double getGehalt() {
		return this.gehalt;
	}
	public abstract boolean mitUniAbschluss(int ausbildungszeit);
	public abstract double einkommen();
	public abstract void druckeDaten(OutputStream stream);
	public abstract String toString();
	public boolean equals(Object o) {
		if(this!=o)return false;
		if(o==null)return false;
		if(this.getClass()!=o.getClass())return false;
		Angestellte a = (Angestellte) o;
		if(this.nachname!=a.nachname) return false;
		if(this.vorname!=a.vorname) return false;
		if(this.geburtsjahr!=a.geburtsjahr) return false;
		if(this.ausbildungszeit!=a.ausbildungszeit) return false;
		if(this.gehalt!=a.gehalt)return false;
		return true;
	}
	public int hashCode() {
		return Objects.hash(nachname,vorname,geburtsjahr,ausbildungszeit,gehalt);
	}
	public int compareTo(Angestellte a) { // die Angestellten werden nach Einkommen sortiert
		if(this.einkommen()>a.einkommen()) { 
			return 1;
		}else if(this.einkommen()<a.einkommen()) {
			return -1;
		}else { 
			return 0;
		}
	}	
}
