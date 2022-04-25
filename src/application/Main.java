package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
//import javafx.scene.layout.BorderPane;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
public class Main extends Application {
	/*@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}*/
	/*
	 * when program starts, 
	 * ide prvo main , odnosno lunch(args) pa onda ide start metoda
	 * */
	Button button;
	
	
	@Override
	public void start(Stage primaryStage) throws Exception{
		//ovo je ustvari main za javafx
		
		
		primaryStage.setTitle("Bojan Janjic");
		button = new Button();
		button.setText("Click meee");
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		
		Scene scene = new Scene(layout, 300, 250);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
