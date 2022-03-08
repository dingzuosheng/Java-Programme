package javaFX;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
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

public class BildErfassungView extends Stage {

	public BildErfassungView(Bild b,Stage primaryStage) {
		super();
		this.initOwner(primaryStage);
		this.initModality(Modality.WINDOW_MODAL);
	}
	
	public void showView() {
		GridPane gp = new GridPane();
		gp.setPadding(new Insets(10.0));
		gp.setHgap(5.0);
		gp.setVgap(5.0);
		Label lv1 = new Label("Titel:");
		Label lv2 = new Label("Ort:");
		Label lv3 = new Label("Aufnahmejahr:");

		TextField tf1 = new TextField("");
		TextField tf2 = new TextField("");
		TextField tf3 = new TextField("");
		
		GridPane.setHalignment(lv1,HPos.RIGHT);
		GridPane.setHalignment(lv2,HPos.RIGHT);
		GridPane.setHalignment(lv3,HPos.RIGHT);
		
		gp.addRow(1, lv1, tf1);
		gp.addRow(2, lv2, tf2);
		gp.addRow(3, lv3, tf3);

		Button neu = new Button("Neu");
		Button abb = new Button("Abbrechen");

		HBox hb = new HBox();
		hb.setPadding(new Insets(10.0));
		hb.setSpacing(10.0);
		hb.setAlignment(Pos.CENTER);
		hb.getChildren().addAll(neu, abb);

		BorderPane bp = new BorderPane();
		bp.setBottom(hb);
		bp.setCenter(gp);

		Scene scene = new Scene(bp, 300.0, 250.0);
		setTitle("Bilderfassung");
		setScene(scene);
		show();
	}
	
}
