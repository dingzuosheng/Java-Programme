package praktikum10_Aufgabe2;

import Praktikum10_A2.Label;

public class Bottle {
	private Label l;
	
	public Bottle(Label label) {
		this.l=label;
	}
	
	public void printLable() {
		System.out.println("Etikettiermaschine: "+l.getType()+" mindestens haltbar bis "+l.getBestBefore());
	}
}
