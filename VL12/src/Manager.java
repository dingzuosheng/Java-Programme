
public class Manager extends Mitarbeiter {
    private double festgehalt;
    private double provision;
    private double umsatz;
    
    public Manager(String name,double fgehalt,double provision) {
    	super(name);
    	this.festgehalt=fgehalt;
    	this.provision=provision;  	
    }
    public void setUmsatz(double umsatz) {
    	this.umsatz=umsatz;
    }
    public double berechneGehalt() {
    	double erg=festgehalt+provision*umsatz;
    	return erg;
    }   	
}
