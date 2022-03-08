package praktikum10_Aufgabe2;

import java.util.LinkedList;
import java.util.List;

public class Conveyor {
	private List<Bottle> liste;
	private int kapazitaet;
	public Conveyor() {
		this.liste=new LinkedList<Bottle>();
		 kapazitaet = 5;
	}
	
	public void load(Bottle bottle) {
		liste.add(bottle);
	}
	
	public Bottle withdraw() {
		return liste.remove(0);
	}
	
	public boolean isEmpty() {
		return liste.size()==0 ;		
	}
	
	public boolean isOverloaded() {
		return liste.size()>kapazitaet ;
	}
}
