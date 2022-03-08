package p10;

import javafx.application.Application;
import javafx.stage.Stage;

public class Zeitansage extends Application{

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Counter c = new Counter();
		Thread timer = new Thread(new Timer(100,c));
		timer.start();
		MessageView.create(primaryStage,"Message","Zeitansage stoppen").showView();
		timer.stop();
		
	}

}
