package p10_Aufgabe2;

import java.util.LinkedList;
import java.util.List;

public class Conveyor {
	private List<Bottle> liste;
	private int kapazitaet;
	public Conveyor() {
		liste = new LinkedList<Bottle>();
		kapazitaet = 5;
	}
	public void load(Bottle b) {
		liste.add(b);
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
