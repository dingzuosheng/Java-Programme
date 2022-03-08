package pk1.mv.gui;

import java.io.FileNotFoundException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import datenhaltung.PersistenzException;
import pk1.mv.fachlogik.EmptyFilenameException;
import pk1.mv.fachlogik.Medium;

public class MedienverwaltungView extends Stage {
	private Controller ctl;

	public MedienverwaltungView(Controller ctl) {
		this.ctl = ctl;
	}

	public void showView() {
		MenuBar mb = new MenuBar();

		Menu m1 = new Menu("Datei");
		MenuItem m1_item1 = new MenuItem("Laden");
		m1_item1.setOnAction(ActionEvent -> {
			try {
				ctl.laden();

			} catch (PersistenzException e) {
				e.printStackTrace();
			}
		});
		MenuItem m1_item2 = new MenuItem("Speichern");
		m1_item2.setOnAction(ActionEvent -> {
			try {
				ctl.speichern();
			} catch (PersistenzException e) {
				e.printStackTrace();
			}
		});
		MenuItem m1_item3 = new MenuItem("Medienliste in Datei");
		m1_item3.setOnAction(ActionEvent -> {
			try {
				ctl.writeToFile();
			} catch (FileNotFoundException e) {

				e.printStackTrace();
			} catch (EmptyFilenameException e) {

				e.printStackTrace();
			}
		});
		MenuItem m1_item4 = new MenuItem("Beenden");
		m1.getItems().addAll(m1_item1, new SeparatorMenuItem(), m1_item2, new SeparatorMenuItem(), m1_item3,
				new SeparatorMenuItem(), m1_item4);
		m1_item4.setOnAction(ActionEvent -> { });

		Menu m2 = new Menu("Medium");
		MenuItem m2_item1 = new MenuItem("Audio neu");
		m2_item1.setOnAction(ActionEvent -> {
				ctl.AudioNew();
			}
		);
		MenuItem m2_item2 = new MenuItem("Bild neu");
		m2_item2.setOnAction(ActionEvent -> {
				ctl.BildNew();
			}
		);
		m2.getItems().addAll(m2_item1, new SeparatorMenuItem(), m2_item2);

		Menu m3 = new Menu("Anzeige");
		MenuItem m3_item1 = new MenuItem("Erscheinungsjahr");
		m3_item1.setOnAction(ActionEvent -> {
				ctl.erscheinungsjahr();
			}
		);
		MenuItem m3_item2 = new MenuItem("Neuestes Medium");
		m3_item2.setOnAction(ActionEvent -> {
				ctl.neuesMedium();
			}
		);
		m3.getItems().addAll(m3_item1, new SeparatorMenuItem(), m3_item2);

		mb.getMenus().addAll(m1, m2, m3);
		BorderPane bp = new BorderPane();
		ListView<Medium> lv = new ListView<Medium>(ctl.getObservableList());
		bp.setTop(mb);
		bp.setCenter(lv);

		Scene scene = new Scene(bp, 500.0, 400.0);
		setTitle("Medienverwaltung");
		setScene(scene);
		show();
	}
}
