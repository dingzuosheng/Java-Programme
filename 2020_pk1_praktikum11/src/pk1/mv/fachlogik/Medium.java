package pk1.mv.fachlogik;
import java.io.OutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public abstract class Medium implements Comparable<Medium>, Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String titel;
	private int jahr;
	protected static int counter = 0;
	public Medium(String titel, int jahr) {
		id = counter++;
		this.titel = titel;
		this.jahr = jahr;
	}

	public String getTitel() {
		return this.titel;
	}

	public int getId() {
		return this.id;
	}

	public int getJahr() {
		return this.jahr;
	}

	public void setJahr(int jahr) {
		this.jahr = jahr;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public int alter() {
		return LocalDate.now().getYear() - this.jahr;
	}

	public abstract void druckeDaten(OutputStream stream);

	public boolean equals(Object o) {
		if (this != o)
			return false;
		if (o == null)
			return false;
		if (this.getClass() != o.getClass())
			return false;
		Medium m = (Medium) o;
		if (this.titel != m.titel)
			return false;
		if (this.jahr != m.jahr)
			return false;
		return true;
	};

	public int hashCode() {
		return Objects.hash(titel, jahr);
	}

	public int compareTo(Medium m) {
		if (this.getJahr() > m.getJahr()) {
			return 1;
		} else if (this.getJahr() < m.getJahr()) {
			return -1;
		} else {
			return 0;
		}
	}
}
