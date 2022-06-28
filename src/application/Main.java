package application;
	
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(this.getClass().getResource("Main.fxml"));
			HBox root = loader.load();
			Image image = new Image(new FileInputStream("src/application/ikonka.png"));
			Scene scene = new Scene(root,466,347);
			
			Controller kontroler = loader.getController();
			primaryStage.setTitle("Tw\u00F3j Dietetyk");
			primaryStage.getIcons().add(image);
			primaryStage.setResizable(false);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());


			primaryStage.setScene(scene);
			primaryStage.show();
			
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
	
		ServiceDb.loadProteinProducts();
		ServiceDb.loadProteinProductsOther();
		ServiceDb.loadCarbohydratesProducts();
		ServiceDb.loadFatsProducts();
		ServiceDb.loadVegetablesBigPortionProducts();
		ServiceDb.loadVegetablesMediumPortionProducts();
		ServiceDb.loadVegetablesSmallPortionProducts();
		launch(args);
		
	        
	}
	
   

}