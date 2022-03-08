package javaFX;



import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import praktikum07.Bild;

public class BildGUI extends Stage {
	public BildGUI(Bild b, Stage primaryStage) {
		super();
		this.initOwner(primaryStage);
		this.initModality(Modality.WINDOW_MODAL);
	}
	public void showView() {
		GridPane gb = new GridPane();
		gb.setPadding(new Insets(10.0));
		gb.setHgap(5.0);
		gb.setVgap(5.0);
		
		Label titel = new Label("Titel:");
		Label ort = new Label("Ort:");
		Label jahr = new Label("Aufnahmejahr:");
		TextField tf1 = new TextField("");
		TextField tf2 = new TextField("");
		TextField tf3 = new TextField("");
		
		GridPane.setHalignment(titel,HPos.RIGHT);
		GridPane.setHalignment(ort,HPos.RIGHT);
		GridPane.setHalignment(jahr,HPos.RIGHT);
		gb.addRow(1,titel,tf1);
		gb.addRow(2,ort,tf2);
		gb.addRow(3,jahr,tf3);
		
		HBox hb = new HBox();
		hb.setPadding(new Insets(10.0));
		hb.setSpacing(5.0);
		Button neu = new Button("Neu");
		Button abbrechen = new Button("Abbrechen");
		hb.getChildren().addAll(neu,abbrechen);
		
		BorderPane bp = new BorderPane();
		bp.setCenter(gb);
		bp.setBottom(hb);
		
		Scene scene = new Scene(bp,300.0,250.0);
		setTitle("BildErfassung");
		setScene(scene);
		show();
		}
}
