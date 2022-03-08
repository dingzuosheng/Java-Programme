public class Angestellter {
	private String name;
	private double gehalt;
	public Angestellter(String name,double gehalt) {
		this.name=name;
		this.gehalt=gehalt;
	}
	public String getName() {
		return this.name;
	}
	public double getMonatsgehalt() {
		return this.gehalt;
	}
	public void setGehalt(double g) {
		this.gehalt= 12*g;
	}
	public void setName(String n) {
		this.name=n;
	}
}
