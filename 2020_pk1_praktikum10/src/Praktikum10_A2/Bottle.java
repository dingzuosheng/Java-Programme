package Praktikum10_A2;

public class Bottle {
	private Label label;
	
	public Bottle(Label label) {
		this.label = label;
	}
	
	public void printLable() {
		System.out.println("Etikettiermaschine: "+label.getType()+" mindenstens haltbar bis "+label.getBestBefore());
	}
}
