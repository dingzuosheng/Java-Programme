package de.fh.stud.p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import de.fh.pacman.enums.PacmanAction;
import de.fh.pacman.enums.PacmanTileType;

public class Knoten implements Iterable<Knoten> {

	/*
	 * TODO Praktikum 1 [1]: Erweitert diese Klasse um die notwendigen Attribute,
	 * Methoden und Konstruktoren um die mÃ¶glichen verschiedenen WeltzustÃ¤nde
	 * darstellen und einen Suchbaum aufspannen zu kÃ¶nnen.
	 */
	int PosX;
	int PosY;
	PacmanTileType[][] welt;
	PacmanAction prevAction;//mit welcher Action ist man im Baum vom Parent zu aktuellen
	                         //Knoten gelangt/welchen Weg hat man vom VorgaengerKnoten genommen?
	Knoten parent;

	public Knoten(int x, int y, PacmanTileType[][] elternWelt, Knoten parent, PacmanAction prevAction) {
		welt = copyArray(elternWelt);
		this.PosX = x;
		this.PosY = y;
		welt[x][y] = PacmanTileType.PACMAN;//vorige Pacman-Position auf Empty setzen
		if (prevAction != null) {
			switch (prevAction) {
			case GO_EAST:
				welt[x - 1][y] = PacmanTileType.EMPTY;
			case GO_NORTH:
				welt[x][y + 1] = PacmanTileType.EMPTY;
			case GO_WEST:
				welt[x + 1][y] = PacmanTileType.EMPTY;
			case GO_SOUTH:
				welt[x][y - 1] = PacmanTileType.EMPTY;
			default:
				break;
			}
		}
		this.parent = parent;
		this.prevAction = prevAction;
	}

	public Knoten getParent() {
		return this.parent;
	}

	public PacmanAction getAction() {
		return this.prevAction;
	}
	public List<Knoten> expand() {
		/*
		 * TODO Praktikum 1 [2]: Implementiert in dieser Methode das Expandieren des
		 * Knotens. Die Methode soll die neu erzeugten Knoten (die Kinder des Knoten)
		 * zurückgeben.
		 */
		List<Knoten> liste = new ArrayList<Knoten>();
		if (welt[PosX - 1][PosY] != PacmanTileType.WALL) {
			liste.add(new Knoten(PosX - 1, PosY, welt,this, PacmanAction.GO_WEST));
		}
		if (welt[PosX + 1][PosY] != PacmanTileType.WALL) {
			liste.add(new Knoten(PosX + 1, PosY, welt,this, PacmanAction.GO_EAST));
		}
		if (welt[PosX][PosY - 1] != PacmanTileType.WALL) {
			liste.add(new Knoten(PosX, PosY - 1, welt,this, PacmanAction.GO_NORTH));
		}
		if (welt[PosX][PosY + 1] != PacmanTileType.WALL) {
			liste.add(new Knoten(PosX, PosY + 1, welt,this, PacmanAction.GO_SOUTH));
		}
		return liste;
	}

	public String toString() {
		return "X :" + PosX + " Y:" + PosY;
	}
	public String viewWelt() {
		String result="";
		for(int x=0;x<welt.length;x++) {
			for(int y=0;y<welt[0].length;y++) {
				result+="\n";
			}
		}
		return result;
	}
	public PacmanTileType[][] getWelt(){
		return this.welt;
	}
    public int hashCode() {
    	final int prime=31;
    	int result=1;
    	result=prime*result+PosX;
    	result=prime*result+PosY;
    	result=prime*result+Arrays.deepHashCode(welt);
    	return result;
    }
	public boolean equals(Object o) {
		if (this!=o) 
			return false;
		if(o==null)
			return false;
		if(this.getClass()!=o.getClass())
			return false;
        Knoten other =(Knoten) o;
        if(PosX!=other.PosX)
        	return false;
        if(PosY!=other.PosY)
        	return false;
        if(!Arrays.deepEquals(welt, other.welt))
        	return false;
        return false;
	}
	private PacmanTileType[][] copyArray(PacmanTileType[][] oldView){
		PacmanTileType[][] newView=new PacmanTileType[oldView.length][oldView[0].length];
		for(int i=0;i<oldView.length;i++) {
			for(int j=0;j<oldView[0].length;j++) {
				newView[i][j]=oldView[i][j];
			}
		}
		return newView;
	}

	@Override
	public Iterator<Knoten> iterator() {
		
		return null;
	}
}
