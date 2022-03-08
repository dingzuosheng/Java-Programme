package pk1.av.gui;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
import pk1.av.fachlogik.MedAngestellte;

public class MedAngestelltenErfassungView extends Stage{
		private MedAngestellte m;
		private Controller ctl;
		public MedAngestelltenErfassungView(MedAngestellte m,Controller ctl,Stage stage) {
			super();
			this.initOwner(stage);
			this.initModality(Modality.WINDOW_MODAL);
			this.m = m;
			this.ctl = ctl;
		}
		
		public void showView() {
			GridPane gp = new GridPane();
			gp.setPadding(new Insets(10.0));
			gp.setHgap(5.0);
			gp.setVgap(10.0);
			
			Label la1 = new Label("Nachname:");
			Label la2 = new Label("Vorname:");
			Label la3 = new Label("Geburtsjahr:");
			Label la4 = new Label("Ausbildungszeit:");
			Label la5 = new Label("Gehalt:");
			Label la6 = new Label("Fachbereich:");
			
			TextField tf1 = new TextField("");
			TextField tf2 = new TextField("");
			TextField tf3 = new TextField("");
			TextField tf4 = new TextField("");
			TextField tf5 = new TextField("");
			TextField tf6 = new TextField("");
			
			gp.addRow(1,la1,tf1);
			gp.addRow(2,la2,tf2);
			gp.addRow(3,la3,tf3);
			gp.addRow(4,la4,tf4);
			gp.addRow(5,la5,tf5);
			gp.addRow(6,la6,tf6);
			
			GridPane.setHalignment(la1,HPos.RIGHT);
			GridPane.setHalignment(la2,HPos.RIGHT);
			GridPane.setHalignment(la3,HPos.RIGHT);
			GridPane.setHalignment(la4,HPos.RIGHT);
			GridPane.setHalignment(la5,HPos.RIGHT);
			GridPane.setHalignment(la6,HPos.RIGHT);
			
			Button bt1 = new Button("Neu");
			bt1.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					m.setNachname(tf1.getText());
					m.setVorname(tf2.getText());
					m.setGeburtsjahr(Integer.parseInt(tf3.getText()));
					m.setAusbildungszeit(Integer.parseInt(tf4.getText()));
					m.setGehalt(Double.parseDouble(tf5.getText()));
					m.setFachbereich(tf6.getText());
					ctl.anstellen(m);
				}
			});
			Button bt2 = new Button("Abbrechen");
			bt2.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					close();
				}		
			});
			HBox hb = new HBox();
			hb.setPadding(new Insets(10.0));
			hb.setSpacing(10.0);
			hb.setAlignment(Pos.CENTER);
			hb.getChildren().addAll(bt1,bt2);
			
			BorderPane bp = new BorderPane();
			bp.setBottom(hb);
			bp.setCenter(gp);
			
			Scene scene = new Scene(bp,500.0,400.0);
			setTitle("MedAngestelltenerfassung");
			setScene(scene);
			show();
			
			
		}
}
