package Aufgabe3;

public class Laptop extends Computer implements BildschirmI{
	private float bildschirmdiagonale;
	public Laptop(String cpu,int speicherkapazitaet,float bildschirmdiagonale){
		super(cpu,speicherkapazitaet);
		this.bildschirmdiagonale=bildschirmdiagonale;
	}
	
    public  float getBildschirmdiagonale() {
    	return this.bildschirmdiagonale;
    }
}

