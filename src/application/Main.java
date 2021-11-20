package application;

import DBConnection.connection;	
import java.io.IOException;
import java.sql.SQLException;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.image.Image;
import javafx.scene.Parent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException{
		
			//Parent root= FXMLLoader.load(getClass().getResource("/FXML_Files/Loading.fxml"));
			//Parent root= FXMLLoader.load(getClass().getResource("/FXML_Files/Login.fxml"));
			//Parent root= FXMLLoader.load(getClass().getResource("/FXML_Files/MessageSuccess.fxml"));
			Parent root= FXMLLoader.load(getClass().getResource("/FXML_Files/UserDashboard.fxml"));
			Scene scene = new Scene(root,1140,640);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();
			primaryStage.setTitle("Essential Service & Vaccinated Drivers Identification System");
			primaryStage.getIcons().add(new Image(Main.class.getResourceAsStream("/Images/ProLogoN.png")));
			
			
			
			connection con = new connection();
			
			try {
				con.getConnection();
			}catch(ClassNotFoundException | SQLException e1){
				e1.printStackTrace();
			}
			
			
			
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}	

