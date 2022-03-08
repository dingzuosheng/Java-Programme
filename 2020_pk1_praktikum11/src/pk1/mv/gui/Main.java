package pk1.mv.gui;
import javafx.application.Application;
import javafx.stage.Stage;
import pk1.mv.fachlogik.Medienverwaltung;
import pk1.mv.datenhaltung.SerialisierungDao;


public class Main extends Application{
	
	public static void main(String[] arg){
		launch();
	}
	@Override
	public void start(Stage stage) throws Exception {
		SerialisierungDao dao = new SerialisierungDao("p9");
		Medienverwaltung mv = new Medienverwaltung(dao);
		
		Controller ctl = new Controller(mv,stage);
		ctl.zeigeMedienverwaltungView();
		
	}
}