import java.util.Objects;
public class Audio extends Medium{
	private String interpret;
	private int dauer;
	public Audio(String titel, int jahr,String interpret,int dauer) {
		super(titel, jahr);
		this.interpret=interpret;
		this.dauer=dauer;
	}
	public String getInterpret() {
		return this.interpret;
	}
	public int getDauer() {
		return this.dauer;
	}
	public void setInterpret(String interpret) {
		this.interpret=interpret;
	}
	public void setDauer(int dauer) {
		this.dauer=dauer;
	}
	public void druckeDaten() {
		System.out.println("ID = "+this.getId()+" \""+this.getTitel()+"\""+" von "+this.getInterpret()
				+ "aus "+ this.getJahr()+" Spieldauer: "+this.getDauer()+" s");
	}
	@Override
	public boolean equals(Object o) {
		if(!super.equals(o))
			return false;
		Audio a = (Audio) o;
		if(a.interpret!=this.interpret)
			return false;
		if(a.dauer!=this.dauer)
			return false;
		return true;
	}
	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(),interpret,dauer);
	}
}
