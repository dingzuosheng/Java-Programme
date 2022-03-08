package de.fh.stud.p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import de.fh.pacman.enums.PacmanAction;
import de.fh.pacman.enums.PacmanTileType;

public class Knoten implements Iterable<Knoten> {
	int PosX, PosY;
	PacmanTileType[][] welt;
	PacmanAction prevAction;// mit welcher Action ist Pacman im Baum von Parent zu aktuellen Knoten gelangt
							// welchen Weg hat man vom Vorgaengerknoten genommen .
	Knoten parent;

	public Knoten(int x, int y, PacmanTileType[][] elternWelt, Knoten parent, PacmanAction prevAction) {
		this.PosX = x;
		this.PosY = y;
		welt = copyArray(elternWelt);
		welt[x][y] = PacmanTileType.PACMAN;
		/*if (prevAction != null) { 			// vorige Pacman-Position auf Empty setzen;
			switch (prevAction) {
			case GO_EAST:
				welt[x + 1][y] = PacmanTileType.EMPTY;
			case GO_WEST:
				welt[x - 1][y] = PacmanTileType.EMPTY;
			case GO_NORTH:
				welt[x][y + 1] = PacmanTileType.EMPTY;
			case GO_SOUTH:
				welt[x][y - 1] = PacmanTileType.EMPTY;
			case WAIT:
				welt[x][y] = PacmanTileType.PACMAN;
			default:
				break;
			}
		}*/
		
		this.parent = parent;
		this.prevAction = prevAction;
	}
	
	

	private PacmanTileType[][] copyArray(PacmanTileType[][] oldView) {
		PacmanTileType[][] newView = new PacmanTileType[oldView.length][oldView[0].length];
		for(int i=0;i<oldView.length;i++) {
			for(int j=0;j<oldView[0].length;j++) {
				newView[i][j]=oldView[i][j];
			}
		}
		return newView;
	}

	public Knoten getKnoten() { //hier sollte noch bearbeitet werden !
		return this.parent;
	}

	public PacmanAction getAction() { //hier sollte noch bearbeitet werden !
		return this.prevAction;
	}

	public PacmanTileType[][] getWelt() {//hier sollte noch bearbeitet werden !
		return this.welt;
	}

	public String toString() {
		return "X:" + this.PosX + " Y:" + this.PosY+"\n"+
				"Mit Aktion zum Feld:"+getAction()+"\n"+
				"Feldbelegung:"+" \n"+
				"Aktuelle WeltView :\n"+
				viewWelt();
		
	}

	public String viewWelt() {
		String zustand = "";
		for (int i = 0; i < welt.length; i++) {
			for (int j = 0; j < welt[0].length; j++) {
				zustand += welt[i][j]+" ";
			}
			zustand += "\n";
		}
		return zustand;
	}
	/*
	 * TODO Praktikum 1 [1]: Erweitert diese Klasse um die notwendigen Attribute,
	 * Methoden und Konstruktoren um die möglichen verschiedenen Weltzustände
	 * darstellen und einen Suchbaum aufspannen zu können.
	 */

	public List<Knoten> expand() {
		/*
		 * TODO Praktikum 1 [2]: Implementiert in dieser Methode das Expandieren des
		 * Knotens. Die Methode soll die neu erzeugten Knoten (die Kinder des Knoten)
		 * zurückgeben.
		 */
		List<Knoten> liste = new ArrayList<Knoten>();
		if (welt[PosX - 1][PosY] != PacmanTileType.WALL)
			liste.add(new Knoten(PosX - 1, PosY, getWelt(), this, PacmanAction.GO_WEST));
		if (welt[PosX + 1][PosY] != PacmanTileType.WALL)
			liste.add(new Knoten(PosX + 1, PosY, getWelt(), this, PacmanAction.GO_EAST));
		if (welt[PosX][PosY + 1] != PacmanTileType.WALL)
			liste.add(new Knoten(PosX, PosY + 1, getWelt(), this, PacmanAction.GO_SOUTH));
		if (welt[PosX][PosY - 1] != PacmanTileType.WALL)
			liste.add(new Knoten(PosX, PosY - 1, getWelt(), this, PacmanAction.GO_NORTH));
		return liste;
	}
	
	public int hashCode() {
		return Objects.hash(PosX,PosY,welt,this,prevAction);
	}
	
	public boolean equals(Object o) {
		if(this!=o)
			return false;
		if(o==null)
			return false;
		if(this.getClass()!=o.getClass())
			return false;
		Knoten other = (Knoten) o;
		if(PosX!=other.PosX)
			return false;
		if(PosY!=other.PosY)
			return false;
		if(!Arrays.deepEquals(welt,other.welt)) 
			return false;
		return false;		
	}

	@Override
	public Iterator<Knoten> iterator() {
		return null;
	}

}
