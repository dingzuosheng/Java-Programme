package pk1.av.gui;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import pk1.av.datenhaltung.SerialisierungDao;
import pk1.av.fachlogik.Angestellteverwaltung;
import pk1.av.fachlogik.Therapeut;
import pk1.av.fachlogik.MedAngestellte;

public class Haupt extends Application{

	public static void main(String[] args) {
		launch();

	}

	@Override
	public void start(Stage stage) throws Exception {
	/*	Label label = new Label("Angestellten Erfassung!");
		label.setFont(new Font(50.0));
		
		Scene scene = new Scene(label);
		stage.setScene(scene);
		stage.show();
		TherapeutErfassungView tf = new TherapeutErfassungView(new Therapeut("a","b",
				1999,5,6000.0,"c",30000.0),stage);
		tf.showView();
		MedAngestelltenErfassungView mv = new MedAngestelltenErfassungView(new MedAngestellte(
				"d","e",2000,3,10000.0,"All."),stage);
		mv.showView();
		AngestellteverwaltungView av = new AngestellteverwaltungView(new Angestellteverwaltung(),stage);
		av.showView();*/
		
		SerialisierungDao dao = new SerialisierungDao("A9.ser");
		Angestellteverwaltung av = new Angestellteverwaltung(dao);
		Controller ctl = new Controller(av,stage);
		ctl.zeigeAngestelltenVerwaltungView();
	}

}
