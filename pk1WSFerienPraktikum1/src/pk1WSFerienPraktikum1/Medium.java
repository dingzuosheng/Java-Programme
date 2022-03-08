package pk1WSFerienPraktikum1;
import java.time.LocalDate;
import java.util.Objects;
public abstract class Medium {
	private static int anzMedien;
	private int id;
	private String titel;
	private int jahr;
	public Medium(String titel,int jahr) {
		id=anzMedien;
		anzMedien++;
		this.titel=titel;
		this.jahr=jahr;
	}
	public int getId() {
		return id;
	}
	public String getTitel() {
		return this.titel;
	}
	public int getJahr() {
		return this.jahr;
	}
	public int alter() {
		return LocalDate.now().getYear()-getJahr();
	}
	public abstract void druckDaten();
	public boolean equals(Object o) {
		if(this==o) {
			return true;
		}      // ob die Objektreferenzen gleich sind;
		if(o==null) {
			return false;
		}      // ob die Objektreferenz gleich null ist;
		if(this.getClass()!=o.getClass()) {
			return false;
		}       // ob die beiden Klassen gleich sind;
	  	/*if(o  instanceof Medium) {
			return true;
		}*/
		Medium m ;
		m=(Medium) o;// Typkonvertierung
		if(m.getTitel()!=this.getTitel()) {
			return false;
		}
		if(m.getJahr()!=this.getJahr()) {
			return false;
		}   // ob die relevanten Attribute der beiden Objekten gleich sind;
		return true;
	}
	public int hashCode() {
		return Objects.hash(titel,jahr);
	}
	
}
