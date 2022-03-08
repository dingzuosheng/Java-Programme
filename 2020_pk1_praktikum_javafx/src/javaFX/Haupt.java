package javaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Haupt extends Application{

	public static void main(String[] args) {
		launch();

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label nachricht = new Label("Medium Erfassung!");
		nachricht.setFont(new Font(50));
		
		Scene scene = new Scene(nachricht);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
