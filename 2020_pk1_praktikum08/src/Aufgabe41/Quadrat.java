package Aufgabe41;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Quadrat extends Application{

	public static void main(String[] args) {
		
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Rectangle rec =new Rectangle(50.0,50.0,50.0,50.0);
		rec.setFill(Color.BLUE);
		Pane pane = new Pane();
		pane.getChildren().add(rec);
		pane.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				rec.setX(e.getSceneX()-25.0);
				rec.setY(e.getSceneY()-25.0);
			}			
		});
		Scene scene = new Scene (pane,500.0,500.0);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Quadrat");
		primaryStage.show();
	}

}
