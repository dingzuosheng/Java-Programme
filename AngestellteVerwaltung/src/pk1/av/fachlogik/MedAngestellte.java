package pk1.av.fachlogik;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Objects;

public class MedAngestellte extends Angestellte{
	private static final long serialVersionUID = 1L;
	private String fachbereich;
	public MedAngestellte(String nachname, String vorname, int geburtsjahr, int ausbildungszeit, double gehalt,String fachbereich ) {
		super(nachname, vorname, geburtsjahr, ausbildungszeit, gehalt);
		this.fachbereich=fachbereich;
	}
	public MedAngestellte() {
		this("","",0,0,0.0,"");
	}
	public void setFachbereich(String fachbereich) {
		this.fachbereich=fachbereich;
	}
	public String getFachbereich() {
		return this.fachbereich;
	}
	@Override
	public boolean mitUniAbschluss(int ausbildungszeit) {
		return (ausbildungszeit>3);
	}

	@Override
	public double einkommen() {
		return getGehalt()*12;
	}

	@Override
	public void druckeDaten(OutputStream stream) {
		String ausgabe = "ID = "+getId()+"\""+getNachname()+" "+getVorname()+" ist "+getAlter()+" Jahre alt "
				+ "und hat "+ super.getAusbildungszeit()+" Jahre im Fachbereich "+getFachbereich()+ " eine Ausbildung"
						+ " gemacht und verdient damit jedes Jahr "+einkommen()+" Euro.\"";
		PrintWriter pw = new PrintWriter(stream);
		pw.printf("%s%n",ausgabe);
		pw.flush();
		
	}
	@Override
	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		MedAngestellte m = (MedAngestellte) o;
		if(this.fachbereich!=m.fachbereich)return false;
		return true;
	}
	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(),fachbereich);
	}
	@Override
	public String toString() {
		return "ID = "+getId()+"\""+getNachname()+" "+getVorname()+" ist "+getAlter()+" Jahre alt "
				+ "und hat "+ super.getAusbildungszeit()+" Jahre im Fachbereich "+getFachbereich()+ " eine Ausbildung"
				+ " gemacht und verdient damit jedes Jahr "+einkommen()+" Euro.\"";
	}

}
