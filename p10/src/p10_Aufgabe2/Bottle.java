package p10_Aufgabe2;

public class Bottle {
	private Lable lable;
	
	public Bottle(Lable lable) {
		this.lable = lable;
	}
	
	public void printLable() {
		System.out.println("Etikettiermaschine: "+lable.getType()+" mindestens haltbar bis "+lable.getBestBefore());
	}
}
