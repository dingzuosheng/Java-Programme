package Aufgabe39;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ColorChange extends Application{	
	public static void main(String[] args) {
		launch();
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane bp = new BorderPane();
		bp.setPadding(new Insets(10.0));
		
		Rectangle rec = new Rectangle(100.0,50.0,100.0,100.0);
		rec.setFill(Color.GREEN);
		Pane pane = new Pane();
		pane.getChildren().add(rec);
		bp.setCenter(pane);		
		
		Button button = new Button("Farbewechel");
		button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				int r = (int) (Math.random()*255.0);
				int g = (int) (Math.random()*255.0);
				int b = (int) (Math.random()*255.0);
				rec.setFill(Color.rgb(r,g,b));
			}			
		});
		bp.setBottom(button);
		BorderPane.setAlignment(button,Pos.CENTER);	
	
		Scene scene = new Scene(bp,300.0,280.0);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Farbe-Test");
		primaryStage.show();		
		
	}

}
