package pk1.mv.datenhaltung;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

import pk1.mv.fachlogik.Medium;

public class SerialisierungDao implements IDao{
	private String pfad;
	
	public SerialisierungDao(String pfad) {
		this.pfad = pfad;
	}
	
//	@Override
/*	public void speichern(List<Medium> liste) throws PersistenzException {
		File sfile = new File(pfad);
		try (FileOutputStream fos = new FileOutputStream(sfile);
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(liste);
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
	}*/
	

	@SuppressWarnings("unchecked")
/*	@Override
	public List<Medium> laden() throws PersistenzException {
		File sfile = new File(pfad);
		LinkedList<Medium> medien =null;
    	try (FileInputStream fis = new FileInputStream(sfile); 
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			medien= (LinkedList<Medium>) ois.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
    	return medien;
		
	}*/

	@Override
	public void speichern(List<Medium> liste) throws PersistenzException {
		File sfile = new File(pfad);
		try(FileOutputStream fos = new FileOutputStream(sfile);
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(liste);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

@SuppressWarnings("unchecked")
@Override
public List<Medium> laden() throws PersistenzException {
	File sfile = new File(pfad);
	LinkedList<Medium> medien = null;
	try(FileInputStream fis = new FileInputStream(sfile);
			ObjectInputStream ois = new ObjectInputStream(fis)){
		medien = (LinkedList<Medium>) ois.readObject();
	}catch(IOException e) {
		e.printStackTrace();
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
	}
	return medien;
}

	

}
