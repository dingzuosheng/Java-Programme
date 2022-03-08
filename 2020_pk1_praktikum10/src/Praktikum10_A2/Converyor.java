package Praktikum10_A2;

import java.util.LinkedList;
import java.util.List;

public class Converyor {
	private List<Bottle> liste;
	private int kapazitaet;
	
	public Converyor() {
		this.liste = new LinkedList<Bottle>();
		kapazitaet = 5;
	}
	
	public void load(Bottle b) {
		if(liste.size()<kapazitaet) {
			liste.add(b);
		}
	}
	public Bottle withdraw() {
		return liste.remove(0);
	}
	
	public boolean isEmpty() {
		return liste.size()==0;
	}
	
	public boolean isOverloaded() {
		return liste.size()>kapazitaet;
	}
}
