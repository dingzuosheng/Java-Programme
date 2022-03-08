
public class Geschaeftsfuehrer extends Manager {
     private double zulage;
     public Geschaeftsfuehrer(String name,double fgehalt,double provision,double zulage) {
    	 super(name,fgehalt,provision);
    	 this.zulage=zulage;
     }
     public double berechneGehalt() {
    	 double erg=super.berechneGehalt()+zulage;
    	 return erg;
     }
}