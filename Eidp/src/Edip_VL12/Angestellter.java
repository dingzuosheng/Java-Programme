package Edip_VL12;

  public class Angestellter extends Mitarbeiter {
  private double grundgehalt;
  private double ortszuschlag;
  private double zulage;
  public Angestellter(String name,double gGehalt,double ortszus,double zulage) {
	  super(name);
	  this.grundgehalt=gGehalt;
	  this.ortszuschlag=ortszus;
	  this.zulage=zulage;
  }
  public double berechneGehalt() {
	  double Gehalt;
	  Gehalt=this.grundgehalt+this.ortszuschlag+this.zulage;
	  return Gehalt;
  }
  
}