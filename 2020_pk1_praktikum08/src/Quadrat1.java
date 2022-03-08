import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Quadrat1 extends Application{

	public static void main(String[] args) {
		launch();

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Rectangle rec = new Rectangle(50,50,50,50);
		rec.setFill(Color.BLUE);
		rec.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				rec.setX(e.getSceneX()-25.0);
				rec.setY(e.getSceneY()-25.0);
			}
		});
		Pane pane = new Pane();
		pane.getChildren().add(rec);
		
		Scene scene = new Scene(pane,500,400);
		primaryStage.setTitle("Quadrat");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
