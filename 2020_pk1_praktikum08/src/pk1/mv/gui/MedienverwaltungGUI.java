package pk1.mv.gui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import pk1.mv.fachlogik.Medienverwaltung;

public class MedienverwaltungGUI extends Stage{
	private Medienverwaltung mv;
	public MedienverwaltungGUI(Medienverwaltung mv,Stage primaryStage) {
		super();
		this.initOwner(primaryStage);
		this.initModality(Modality.WINDOW_MODAL);
		this.mv = mv;
	}
	
	public void showView() {
		MenuBar mb = new MenuBar();
		Menu m1 = new Menu("Datei");
		MenuItem m1_mi1 = new MenuItem("Laden");
		MenuItem m1_mi2 = new MenuItem("Speichern");
		MenuItem m1_mi3 = new MenuItem("Medienliste in Datei");
		MenuItem m1_mi4 = new MenuItem("Beenden");
		m1.getItems().addAll(m1_mi1,m1_mi2,m1_mi3,m1_mi4);
		
		Menu m2 = new Menu("Medium");
		MenuItem m2_mi1 = new MenuItem("Audio neu");
		MenuItem m2_mi2 = new MenuItem("Bild neu");
	/*	m2_mi2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				
			}	
		});*/
		m2.getItems().addAll(m2_mi1,m2_mi2);
		
		Menu m3 = new Menu("Anzeige");
		MenuItem m3_mi1 = new MenuItem("Erscheinungsjahr");
		MenuItem m3_mi2 = new MenuItem("Neuestes Mendium");
		m3.getItems().addAll(m3_mi1,m3_mi2);
		
		mb.getMenus().addAll(m1,m2,m3);
		
		BorderPane bp = new BorderPane();
		bp.setTop(mb);
		
		Scene scene = new Scene(bp,500.0,400.0);
		setTitle("Medienverwaltung");
		setScene(scene);
		show();
	}
	
}
