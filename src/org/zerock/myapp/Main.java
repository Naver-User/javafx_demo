package org.zerock.myapp;
	
import java.util.Arrays;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import lombok.extern.log4j.Log4j2;


@Log4j2
public class Main extends Application {
	
	
	@Override
	public void start(Stage primaryStage) {
		log.trace("start({}) invoked.", primaryStage);
		
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		} // try-catch
	} // start
	
	public static void main(String[] args) {
		log.trace("main({}) invoked.", Arrays.toString(args));
		Application.launch(args);
	} // main
	
} // end class
