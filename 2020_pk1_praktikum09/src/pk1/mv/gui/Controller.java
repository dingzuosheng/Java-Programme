package pk1.mv.gui;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import pk1.mv.datenhaltung.PersistenzException;
import pk1.mv.fachlogik.Audio;
import pk1.mv.fachlogik.Bild;
import pk1.mv.fachlogik.EmptyFilenameException;
import pk1.mv.fachlogik.Medienverwaltung;
import pk1.mv.fachlogik.Medium;

public class Controller {
	private Medienverwaltung mv;
	private MedienverwaltungView mvv;
	private Stage stage;
	private ObservableList<Medium> ol;
	public Controller(Medienverwaltung mv,Stage stage) {
		this.mv=mv;
		this.mvv=new MedienverwaltungView(this);
		this.stage=stage;
		this.ol=FXCollections.<Medium>observableArrayList();
	}
	public void zeigeMedienverwaltungView() {
		mvv.showView();
	}
	public void aufnehmen(Medium m) {
		mv.aufnehmen(m);
		ol.add(m);
	}
	public void AudioNew() {
		new AudioErfassungView(new Audio(),this,stage).showView();
	}
	public void BildNew() {
		new BildErfassungView(new Bild(),this,stage).showView();
	}
	public void writeToFile() throws EmptyFilenameException, FileNotFoundException{
		String fileName = null; 
		File file = null;
		boolean ok = false;
		while(!ok) {
			fileName = InputView.create(stage,"Dateiname ","Bitte Dateiname eingeben :","Meidienlist").showView();
			if(fileName == null){return;}
			try {
				if(fileName.isEmpty()) {
					throw new EmptyFilenameException();
				}
				file = new File(fileName+".txt");
				ok = true;
			}catch(EmptyFilenameException e) {
				MessageView.create(stage,"Fehler","Dateiname ist leer !").show();
			}
			try (FileOutputStream fos = new FileOutputStream(file)) {
				mv.zeigeMedien(fos);
			} catch (IOException e) {
				writeToFile();
				MessageView.create(stage,"Fehler","Datei kann nicht geschrieben werden !").show();
			}
		}
	}
	public void erscheinungsjahr() {
		MessageView.create(stage, "Erscheinungsjahr", mv.berechneErscheinungsjahr()+"").showView();
	}
	public void neuesMedium() {
		MessageView.create(stage, "NeuesMedium", mv.sucheNeuesMedium().toString()).showView();
	}
	public void laden() throws PersistenzException{
		mv.laden();
		
		zeigeMedien();
	}
	public void speichern() throws PersistenzException {
		mv.speichern();
	}
	public void zeigeMedien() {
		Iterator<Medium> it = mv.iterator();
		ol.clear();
		while(it.hasNext()) {
			ol.add(it.next());
		}
	}
	public ObservableList<Medium> getObservableList(){
		return ol;
	}
	
}
