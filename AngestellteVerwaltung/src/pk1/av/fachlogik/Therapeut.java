package pk1.av.fachlogik;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Objects;

public class Therapeut extends Angestellte{
	private static final long serialVersionUID = 1L;
	private String berufstitel;
	private double bonus;
	public Therapeut(String nachname, String vorname, int geburtsjahr,int ausbildungszeit, double gehalt,String berufstitel,double bonus) {
		super(nachname, vorname, geburtsjahr,ausbildungszeit, gehalt);
		this.berufstitel=berufstitel;
		this.bonus=bonus;	
	}
	public Therapeut() {
		this("","",0,0,0.0,"",0.0);
	}

	public void setBerufstitel(String berufstitel) {
		this.berufstitel=berufstitel;
	}
	public String getBerufstitel() {
		return this.berufstitel;
	}
	public void setBonus(double bonus) {
		this.bonus=bonus;
	}
	public double getBonus() {
		return this.bonus;
	}

	@Override
	public boolean mitUniAbschluss(int ausbildungszeit) {
		return (ausbildungszeit>=5);
	}

	@Override
	public double einkommen() {
		if(mitUniAbschluss(super.getAusbildungszeit()));
		return getGehalt()*12+getBonus()+2000.0;
	}

	@Override
	public void druckeDaten(OutputStream stream) {
		String ausgabe ="ID = "+ getId()+"\" "+getNachname()+" "+getVorname()+" ist "+getAlter()
		      +" Jahre alt und hat "+super.getAusbildungszeit()+" Jahre Ausbildung gemacht und arbeitet"
		      		+ " gerade als "+getBerufstitel()+" bzw. verdient jedes Jahr "+einkommen()+" Euro.\"";
		PrintWriter pw = new PrintWriter(stream);
		pw.printf("%s%n",ausgabe);
		pw.flush();
	}
	@Override
	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		Therapeut t = (Therapeut) o;
		if(this.berufstitel!=t.berufstitel)return false;
		if(this.bonus!=t.bonus) return false;
		return true;
	}
	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(),berufstitel,bonus);
	}

	@Override
	public String toString() {
		return "ID = "+ getId()+"\" "+getNachname()+" "+getVorname()+" ist "+getAlter()
	      +" Jahre alt und hat "+super.getAusbildungszeit()+" Jahre Ausbildung gemacht und arbeitet"
    		+ " gerade als "+getBerufstitel()+" bzw. verdient jedes Jahr "+einkommen()+" Euro.\"";
	}

}
