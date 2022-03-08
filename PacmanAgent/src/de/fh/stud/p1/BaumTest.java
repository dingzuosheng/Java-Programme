package de.fh.stud.p1;

import java.util.List;

import de.fh.pacman.enums.PacmanAction;
import de.fh.pacman.enums.PacmanTileType;

public class BaumTest {

	public static void main(String[] args) {
		//Anfangszustand nach Aufgabe
		PacmanTileType[][] view = {
				{PacmanTileType.WALL,PacmanTileType.WALL,PacmanTileType.WALL,PacmanTileType.WALL},
				{PacmanTileType.WALL,PacmanTileType.EMPTY,PacmanTileType.DOT,PacmanTileType.WALL},
				{PacmanTileType.WALL,PacmanTileType.DOT,PacmanTileType.WALL,PacmanTileType.WALL},
				{PacmanTileType.WALL,PacmanTileType.WALL,PacmanTileType.WALL,PacmanTileType.WALL}
		};
		//Startposition des Pacman
		int posX = 1, posY = 1;
		/*
		 * TODO Praktikum 1 [3]: Baut hier basierend auf dem gegebenen 
		 * Anfangszustand (siehe view, posX und posY) den Suchbaum auf.
		 */
		Knoten parent = new Knoten(posX,posY,view,null,PacmanAction.WAIT);
		System.out.println(parent.toString());
		List<Knoten> kinder=parent.expand();
		for(Knoten k:kinder) {
			System.out.println(k.toString());
		}
		
	}
}
