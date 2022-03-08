package pk1.av.gui;
import java.io.FileNotFoundException;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import pk1.av.datenhaltung.PersistenzException;
import pk1.av.fachlogik.Angestellte;
import pk1.av.fachlogik.Angestellteverwaltung;
import pk1.mv.fachlogik.Medium;
public class AngestellteverwaltungView extends Stage{
/*	@SuppressWarnings("unused")
	private Angestellteverwaltung av; 
	public AngestellteverwaltungView(Angestellteverwaltung av,Stage stage) {
		super();
		this.initOwner(stage);
		this.initModality(Modality.WINDOW_MODAL);
		this.av = av;
	}*/
	private Controller ctl;
	public AngestellteverwaltungView(Controller ctl) {
		this.ctl = ctl;
	}
	public void showView() {
		MenuBar mb = new MenuBar();
		Menu mi1 = new Menu("Datei");
		MenuItem mi1_1 = new MenuItem("Laden");
		mi1_1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				try {
					ctl.laden();
				} catch (ClassNotFoundException | PersistenzException e) {
					e.printStackTrace();
				}				
			}		
		});
		MenuItem mi1_2 = new MenuItem("Speichern");
		mi1_2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				try {
					ctl.speichern();
				} catch (PersistenzException e) {
					e.printStackTrace();
				}
			}
		});
		MenuItem mi1_3 = new MenuItem("Medienliste in Datei");
		mi1_3.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				try {
					ctl.writeToFile();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
		MenuItem mi1_4 = new MenuItem("Beenden");
		mi1_4.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
			//	close();
			}
		});
		mi1.getItems().addAll(mi1_1,new SeparatorMenuItem(),mi1_2,new SeparatorMenuItem(),mi1_3,
				new SeparatorMenuItem(),mi1_4);
		
		Menu mi2 = new Menu("Angestellte");
		MenuItem mi2_1 = new MenuItem("Therapeut neu");
		mi2_1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				ctl.therapeutNew();
			}
		});
		MenuItem mi2_2 = new MenuItem("MedAngestellte neu");
		mi2_2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				ctl.medAngestellteNew();
		}
		});
		mi2.getItems().addAll(mi2_1,new SeparatorMenuItem(),mi2_2);
		
		Menu mi3 = new Menu("Anzeige");
		MenuItem mi3_1 = new MenuItem("Durchschnittslohn");
		mi3_1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				ctl.durchschnittsLohnen();
			}
		});
		MenuItem mi3_2 = new MenuItem("Jungste Kollege");
		mi3_2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				ctl.jungsteKollege();
			}
		});
		mi3.getItems().addAll(mi3_1,new SeparatorMenuItem(),mi3_2);
		
		mb.getMenus().addAll(mi1,mi2,mi3);
		ListView<Angestellte> lv = new ListView<Angestellte>(ctl.getObservableList());//***********
		
		BorderPane bp = new BorderPane();
		bp.setTop(mb);
		bp.setCenter(lv);
		
		Scene scene = new Scene(bp,500.0,400.0);
		setTitle("Angestellteverwaltung");
		setScene(scene);
		show();
		
	}
}
