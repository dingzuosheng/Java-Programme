package pk1.mv.gui;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import pk1.mv.fachlogik.Medienverwaltung;

public class MedienverwaltungView extends Stage{
	 private Medienverwaltung mv;
	 public MedienverwaltungView(Medienverwaltung mv,Stage primaryStage) {
		 super();
		 this.initOwner(primaryStage);
		 this.initModality(Modality.WINDOW_MODAL);
		 this.mv=mv;
	 }
	 public void showView() {
		 MenuBar mb = new MenuBar();
		 
		 Menu m1 = new Menu("Datei");
		 MenuItem m1_item1 = new MenuItem("Laden");
		 MenuItem m1_item2 = new MenuItem("Speichern");
		 MenuItem m1_item3 = new MenuItem("Medienliste in Datei");
		 MenuItem m1_item4 = new MenuItem("Beenden");
		 m1.getItems().addAll(m1_item1,new SeparatorMenuItem(),m1_item2,new SeparatorMenuItem(),
				 m1_item3,new SeparatorMenuItem(),m1_item4);
		 
		 Menu m2 = new Menu("Medium");
		 MenuItem m2_item1 = new MenuItem("Audio neu");
		 MenuItem m2_item2 = new MenuItem("Bild neu");
		 m2.getItems().addAll(m2_item1,new SeparatorMenuItem(),m2_item2);
		 
		 Menu m3 = new Menu("Anzeige");
		 MenuItem m3_item1 = new MenuItem("Erscheinungsjahr");
		 MenuItem m3_item2 = new MenuItem("Neuestes Medium");
		 m3.getItems().addAll(m3_item1,new SeparatorMenuItem(),m3_item2);
		 
		 mb.getMenus().addAll(m1,m2,m3);
		 BorderPane bp = new BorderPane();
		 bp.setTop(mb);
		 
		 Scene scene = new Scene(bp,500.0,400.0);
		 setTitle("Medienverwaltung");
		 setScene(scene);
		 show();
	 }
}
