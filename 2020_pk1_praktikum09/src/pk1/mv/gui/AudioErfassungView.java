package pk1.mv.gui;
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
import pk1.mv.fachlogik.Audio;

public class AudioErfassungView extends Stage{	
	private Audio a;
	private Controller ctl;
	public AudioErfassungView(Audio a ,Controller ctl, Stage primaryStage) {
		super();
		this.initOwner(primaryStage);
		this.initModality(Modality.WINDOW_MODAL);
		this.a = a;
		this.ctl=ctl;
	}
	public void showView() {
		GridPane gp = new GridPane();
		gp.setPadding(new Insets(10.0));
		gp.setHgap(5.0);
		gp.setVgap(5.0);
		Label lv1 = new Label("Titel:");
		Label lv2 = new Label("Jahr:");
		Label lv3 = new Label("Interpret:");
		Label lv4 = new Label("Dauer:");
		
		TextField tf1 = new TextField(a.getTitel());
		TextField tf2 = new TextField(a.getJahr()+"");
		TextField tf3 = new TextField(a.getInterpret());
		TextField tf4 = new TextField(a.getDauer()+"");
		
		GridPane.setHalignment(lv1,HPos.RIGHT);
		GridPane.setHalignment(lv2,HPos.RIGHT);
		GridPane.setHalignment(lv3,HPos.RIGHT);
		GridPane.setHalignment(lv4,HPos.RIGHT);
		
		gp.addRow(1,lv1,tf1);
		gp.addRow(2,lv2,tf2);
		gp.addRow(3,lv3,tf3);
		gp.addRow(4,lv4,tf4);
		
		Button neu = new Button("Neu");
		Button abb = new Button("Abbrechen");
		neu.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				a.setTitel(tf1.getText());
				a.setJahr(Integer.parseInt(tf2.getText()));
				a.setInterpret(tf3.getText());
				a.setDauer(Integer.parseInt(tf4.getText()));
				ctl.aufnehmen(a);
			}
		});
		abb.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				close();			
			}		
		});
		
		HBox hb = new HBox();
		hb.setPadding(new Insets(10.0));
		hb.setSpacing(10.0);
		hb.setAlignment(Pos.CENTER);
		hb.getChildren().addAll(neu,abb);
		
		BorderPane bp = new BorderPane();
		bp.setBottom(hb);
    	bp.setCenter(gp);
			
		Scene scene = new Scene(bp,300.0,250.0);
		setTitle("AudioErfassung");
		setScene(scene);
		show();		
	}

}

