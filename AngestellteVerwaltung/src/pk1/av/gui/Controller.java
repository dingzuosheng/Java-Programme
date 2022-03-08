package pk1.av.gui;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import pk1.av.datenhaltung.PersistenzException;
import pk1.av.fachlogik.Angestellte;
import pk1.av.fachlogik.Angestellteverwaltung;
import pk1.av.fachlogik.EmptyFilenameException;
import pk1.av.fachlogik.MedAngestellte;
import pk1.av.fachlogik.Therapeut;

public class Controller {
	private Angestellteverwaltung av;
	private AngestellteverwaltungView avv;
	private Stage stage;
	private ObservableList<Angestellte> ol;

	public Controller(Angestellteverwaltung av, Stage stage) {
		this.av = av;
		this.avv = new AngestellteverwaltungView(this);
		this.stage = stage;
		this.ol = FXCollections.<Angestellte>observableArrayList();
	}

	public void zeigeAngestelltenVerwaltungView() {
		avv.showView();
	}

	public void anstellen(Angestellte a) {
		av.anstellen(a);
		ol.add(a);
	}

	public void therapeutNew() {
		new TherapeutErfassungView(new Therapeut(), this,stage).showView();
	}

	public void medAngestellteNew() {
		new MedAngestelltenErfassungView(new MedAngestellte(),this, stage).showView();
	}

	public void durchschnittsLohnen() {
		MessageView.create(stage, "DurchschnittLohn", av.berechneDurchschnittLohnen() + "").showView();
	}

	public void jungsteKollege() {
		MessageView.create(stage, "Jungstekollege", av.sucheJungsteKollege(System.out).toString()).showView();
	}

	public void speichern() throws PersistenzException {
		av.speichern();
	}

	public void laden() throws PersistenzException, ClassNotFoundException {
		av.laden();
		zeigeAngestellte();
	}

	public void zeigeAngestellte() {
		Iterator<Angestellte> it = av.iterator();
		ol.clear();
		while (it.hasNext()) {
			ol.add(it.next());
		}
	}

	public ObservableList<Angestellte> getObservableList() {
		return ol;
	}

	public void writeToFile() throws FileNotFoundException, IOException {
		String filename = "";
		File file = null;
		boolean ok = false;
		while (!ok) {
			filename = InputView.create(stage, "Dateiname", "Bitte Dateiname eingeben:", "Angestelltenliste")
					.showView();
			if (filename == null)
				return;
			try {
				if (filename.isEmpty()) {
					throw new EmptyFilenameException();
				}
				file = new File(filename+".txt");
				ok = true;
			} catch (EmptyFilenameException e) {
				MessageView.create(stage, "Fehler", "Dateiname ist leer ").showView();
			}
			try(FileOutputStream fos = new FileOutputStream(file)){
				av.zeigeAngestellte(fos);
			}catch(IOException e) {
				writeToFile();
				MessageView.create(stage,"Fehler","Datei kann nicht geschrieben werden").showView();
			}
		}
	}
}
