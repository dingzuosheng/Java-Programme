package praktikum4;

import java.io.OutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public abstract class Medium implements Comparable<Medium>, Serializable {
	private static final long serialVersionUID = -4450086809291555085L;
	protected static int anzahlMedien;// private ->protected;
	private int id;
	private String titel;
	private int jahr;

	public Medium(String titel, int jahr) {
		id = anzahlMedien;
		anzahlMedien++;
		this.titel = titel;
		this.jahr = jahr;
	}

	public int getId() {
		return id;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public String getTitel() {
		return titel;
	}

	public void setJahr(int jahr) {
		this.jahr = jahr;
	}

	public int getJahr() {
		return jahr;
	}

	public int alter() {

		return LocalDate.now().getYear() - getJahr();
	}

	public abstract void druckeDaten(OutputStream stream);

	public boolean equals(Object o) {

		if (this == o) {
			return true;
		}
		if (o == null) {
			return false;
		}
		if (o.getClass() != this.getClass()) {
			return false;
		}
		/*
		 * if(o instanceof Medium ) {
		 * 
		 * }
		 */
		Medium m;
		m = (Medium) o;
		if (m.titel != this.titel) {
			return false;
		}
		if (m.jahr != this.jahr) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		return Objects.hash(titel, jahr);

	}

	@Override
	public int compareTo(Medium m) {
		if (this.alter() < m.alter()) {
			return -1;
		} else if (this.alter() > m.alter()) {
			return 1;
		} else {
			return 0;
		}
	}

}
