package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class LoadingController implements Initializable{
	 @FXML
	    private ProgressBar progressbar;

	    @FXML
	    private Label LoadingLable;

	    @FXML
	    private Button Lbtn;

	    @Override
	    public void initialize(URL arg0, ResourceBundle arg1) {
			
	    	
			Task<Void> task = new Task<Void>() {
				
				@Override
				protected Void call() throws Exception{
						int i=0;
					for(i=0;i<=100;i++) {
						updateProgress(i, 100);
						Thread.sleep(50);
						if(i<10) {
							LoadingLable.setText("Launching Application...");	
						}
						Lbtn.setDisable(true);
					}
					if(i>99) {
						Lbtn.setDisable(false);
					}
					return null;	
				}
				
			};
			
			
			progressbar.progressProperty().unbind();
			progressbar.progressProperty().bind(task.progressProperty());
			
			Thread th = new Thread(task);
			th.setDaemon(true);		
			th.start();
			
			
			
			
		}
	    @FXML
	    void LoadindLunchBtn(ActionEvent event) throws IOException {
	    	Lbtn.getScene().getWindow().hide();
	    	Stage Login = new Stage();
	    	
				Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/Login.fxml"));
				Scene scene = new Scene(root);
				Login.setResizable(false);
				Login.setScene(scene);
				Login.show();
				Login.setTitle("Login");
				Login.getIcons().add(new Image(Main.class.getResourceAsStream("/Images/ProLogoN.png")));
	    }
}
