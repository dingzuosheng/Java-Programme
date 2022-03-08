package Aufgabe23;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		FileTree ft = new FileTree(new DirPrinter());
		ft.traverse(new File("F:/FH Dortmund/2020-Programmierkurs1"));

	}

}
