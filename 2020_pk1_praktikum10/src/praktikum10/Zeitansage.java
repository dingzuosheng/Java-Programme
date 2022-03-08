package praktikum10;

import javafx.application.Application;
import javafx.stage.Stage;

public class Zeitansage extends Application{
	
	public static void main(String[] args) {
		launch();
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public void start(Stage primaryStage) throws Exception {
		Counter c = new Counter();
		Thread timer = new Thread(new Timer(c,100));
		timer.start();	
	
		MessageView.create(primaryStage, "Message", "Zeitansage stoppen").showView();
		timer.stop();
		
	}

}
