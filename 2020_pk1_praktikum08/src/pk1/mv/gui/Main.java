package pk1.mv.gui;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import pk1.mv.fachlogik.Medienverwaltung;
import pk1.mv.fachlogik.Audio;
import pk1.mv.fachlogik.Bild;

public class Main extends Application{
	
	public static void main(String[] arg){
		launch();
	}
	@Override
	public void start(Stage stage) throws Exception {
		Label nachricht = new Label("Medium Erfassung !");
		nachricht.setFont(new Font(50));
		Scene szene = new Scene(nachricht);
		stage.setScene(szene);
		stage.show();
		BildErfassungView bv= new BildErfassungView(new Bild("hhslj",2020,"jsovn"),stage);
		bv.showView();
		AudioErfassungView av = new AudioErfassungView(new Audio("hik",2020,"hhib",29),stage);
		av.showView();	
		MedienverwaltungView mv = new MedienverwaltungView(new Medienverwaltung(),stage);
		mv.showView();
		

		
	}
}