package pk1.av.datenhaltung;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

import pk1.av.fachlogik.Angestellte;

public class SerialisierungDao implements IDao{
	private String pfad;
	public SerialisierungDao(String pfad) {
		this.pfad = pfad;
	}
	@Override
	public void speichern(List<Angestellte> liste) throws PersistenzException {
			File sfile = new File(pfad);
			try(FileOutputStream fos = new FileOutputStream(sfile);
					ObjectOutputStream oos = new ObjectOutputStream(fos)){
				oos.writeObject(liste);
				System.out.println("speichern"+liste.size());
			}catch(IOException e) {
				e.printStackTrace();
			}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public LinkedList<Angestellte> laden() throws PersistenzException {
		File sfile = new File(pfad);
		LinkedList<Angestellte> liste = null;
		try(FileInputStream fis = new FileInputStream(sfile);
				ObjectInputStream ois = new ObjectInputStream(fis)){
			liste = (LinkedList<Angestellte>) ois.readObject(); 
			System.out.println("Laden"+liste.size());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		return liste;
	}

}
