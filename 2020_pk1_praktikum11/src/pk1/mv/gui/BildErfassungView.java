package pk1.mv.gui;
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
import pk1.mv.fachlogik.Bild;

public class BildErfassungView extends Stage {
	private Bild b;
	private Controller ctl;

	public BildErfassungView(Bild b, Controller ctl, Stage primaryStage) {
		super();
		this.initOwner(primaryStage);
		this.initModality(Modality.WINDOW_MODAL);
		this.b = b;
		this.ctl = ctl;
	}

	public void showView() {
		GridPane gp = new GridPane();
		gp.setPadding(new Insets(10.0));
		gp.setHgap(5.0);
		gp.setVgap(5.0);
		Label lv1 = new Label("Titel:");
		Label lv2 = new Label("Ort:");
		Label lv3 = new Label("Aufnahmejahr:");

		TextField tf1 = new TextField(b.getTitel());
		TextField tf2 = new TextField(b.getJahr() + "");
		TextField tf3 = new TextField(b.getOrt());

		GridPane.setHalignment(lv1, HPos.RIGHT);
		GridPane.setHalignment(lv2, HPos.RIGHT);
		GridPane.setHalignment(lv3, HPos.RIGHT);

		gp.addRow(1, lv1, tf1);
		gp.addRow(2, lv2, tf2);
		gp.addRow(3, lv3, tf3);

		Button neu = new Button("Neu");
		Button abb = new Button("Abbrechen");
		neu.setOnAction(ActionEvent -> {
			b.setTitel(tf1.getText());
			b.setOrt(tf2.getText());
			b.setJahr(Integer.parseInt(tf3.getText()));
			ctl.aufnehmen(b);
		});
		abb.setOnAction(ActionEvent -> close());

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
