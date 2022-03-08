package praktikum4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Medienverwaltung  {
	int n;
	private List<Medium> m;
	
	private int anzMedien = 0;

	public Medienverwaltung() {
		m = new LinkedList<Medium>();
	}

	public void aufnehmen(Medium einMedium) {
		m.add(einMedium);
        anzMedien++;
	}

	public void zeigeMedien(OutputStream stream) {
	 Collections.sort(m);
		for (Medium a : m) {
			//((Medium) a).druckeDaten();
			a.druckeDaten(stream);
		}
		
	}
	public void sucheNeuesMedium() {

		int min;
		Iterator<Medium> it = m.iterator();
		Medium neu;
		if (it.hasNext()) {
			Medium medium =  it.next();
			neu = medium;
			min = medium.alter();
			while (it.hasNext()) {
                 medium = it.next();
                 if(medium.alter()<min) {
                	 min=medium.alter();
                	 neu=medium;
                 }
			}
			neu.druckeDaten(System.out);
		}

	}

	public double berechneErscheinungsjahr() {
		double durchschnitt = 0.0;
		int summe = 0;
		if(anzMedien != 0) {
			for (Object o:m) {
				summe += ((Medium)o).alter();
			}
			durchschnitt = summe / anzMedien;
		} else {
			durchschnitt = 0.0;
		}
		return durchschnitt;
	}
	public void speichern() {
		File f=new File("C:/safeFile");
		try(FileOutputStream fos=new FileOutputStream(f);ObjectOutputStream oos=new ObjectOutputStream(fos)){
			oos.writeObject(m);
		}catch(IOException e){
			System.out.println("Dateizugriff Fehler");
		}
		
	}
	public void laden() {
		File f=new File("C:/safeFile");
		try(FileInputStream fis=new FileInputStream(f);ObjectInputStream ois=new ObjectInputStream(fis)){
			m = (List<Medium>)ois.readObject();
			Medium.anzahlMedien=m.size();
		}catch(IOException e) {
			System.out.println("Dateilesen Fehler");
		}catch(ClassNotFoundException e) {
			System.out.println("ClassDatei nicht gefunden");
		}
	}

}
