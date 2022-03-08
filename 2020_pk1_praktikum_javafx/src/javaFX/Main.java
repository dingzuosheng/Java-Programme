package javaFX;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import praktikum07.Audio;
import praktikum07.Bild;

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
	}

	
}