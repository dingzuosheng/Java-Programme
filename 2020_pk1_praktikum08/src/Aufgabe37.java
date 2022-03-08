import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Aufgabe37 extends Application{

	public static void main(String[] args) {
		launch();

	}

	@Override
	public void start(Stage stage) throws Exception {
		GridPane gp = new GridPane();
		gp.setPadding(new Insets(10.0));
		gp.setHgap(5.0);
		gp.setVgap(5.0);
		ListView<String> lv = new ListView<String>();
		for(int i = 0;i<100;i++) {
			lv.getItems().add("This is item "+i);
		}
		Label l1 = new Label("Label1");
		Label l2 = new Label("Label2");
		TextField tf0 = new TextField("TextField 0");
		TextField tf1 = new TextField("TextField 1");
		TextField tf2 = new TextField("TextField 2");
		gp.add(lv,0,0,1,3);
		gp.add(l1,1,0);
		gp.add(l2,1,1);
		gp.add(tf0,2,0);
		gp.add(tf1,2,1);
		gp.add(tf2,2,2);
		Button start = new Button("Start");
		gp.add(start,2,3);
		GridPane.setHalignment(start,HPos.CENTER);
		GridPane.setValignment(tf2,VPos.TOP);
		
		Scene scene = new Scene(gp,500.0,400.0);
		stage.setScene(scene);
		stage.setTitle("GridPane-Layout");
		stage.show();
	}

}
