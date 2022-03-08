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
import praktikum07.Audio;

public class AudioGUI extends Stage{
	public AudioGUI(Audio a ,Stage primaryStage) {
		super();
		this.initOwner(primaryStage);
		this.initModality(Modality.WINDOW_MODAL);
	}
	
	public void showView() {
		GridPane gp = new GridPane();
		gp.setPadding(new Insets(10.0));
		gp.setHgap(5.0);
		gp.setVgap(5.0);
		Label titel = new Label("Titel:");
		Label jahr = new Label("Jahr:");
		Label interpret = new Label("Interpret:");
		Label dauer = new Label("Dauer");
		
		TextField tf1 = new TextField("");
		TextField tf2 = new TextField("");
		TextField tf3 = new TextField("");
		TextField tf4 = new TextField("");
		
		GridPane.setHalignment(titel,HPos.RIGHT);
		GridPane.setHalignment(jahr,HPos.RIGHT);
		GridPane.setHalignment(interpret,HPos.RIGHT);
		GridPane.setHalignment(dauer,HPos.RIGHT);
		
		gp.addRow(1,titel,tf1);
		gp.addRow(2,jahr,tf2);
		gp.addRow(3,interpret,tf3);
		gp.addRow(4,dauer,tf4);
		
		HBox hb = new HBox();
		hb.setPadding(new Insets(10.0));
		hb.setSpacing(10.0);
		hb.setAlignment(Pos.CENTER);
		Button neu = new Button("Neu");
		Button abbrechen = new Button("Abbrechen");
		hb.getChildren().addAll(neu,abbrechen);
		
		BorderPane bp = new BorderPane();
		bp.setCenter(gp);
		bp.setBottom(hb);
		
		Scene scene = new Scene(bp,300.0,250.0);
		setTitle("AudioErfassung");
		setScene(scene);
		show();
		
		
	}

	
}
