package Controller;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class PoliceDashboardController {
	 @FXML
	    private Pane PoliceDashBoardPane1;

	    @FXML
	    private Line PoliceDBLine1;

	    @FXML
	    private Line PoliceDBLine2;

	    @FXML
	    private Label PoliceDBLabel1;

	    @FXML
	    private Button DBViewBtn1;

	    @FXML
	    private Button DBCancelBtn1;

	    @FXML
	    private Button DBLogOutBtn;

	    @FXML
	    private Pane PoliceDashBoardPane2;

	    @FXML
	    private Line PoliceDBLine4;

	    @FXML
	    private Line PoliceDBLine3;

	    @FXML
	    private Button DBBackBtn;

	    @FXML
	    private Button DBViewBtn2;

	    @FXML
	    private Button DBCancelBtn2;

	    @FXML
	    private Label PoliceDBLabel11;

	    @FXML
	    void DBBackAction(ActionEvent event) {

	    }

	    @FXML
	    void DBCancelAction1(ActionEvent event) throws IOException {
	    	DBCancelBtn1.getScene().getWindow().hide();
	    	Stage ViewComplain = new Stage();
	    	
				Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/PoliceCancelPermit.fxml"));
				Scene scene = new Scene(root);
				ViewComplain.setResizable(false);
				ViewComplain.setScene(scene);
				ViewComplain.show();
				ViewComplain.setTitle("Add User");
				ViewComplain.getIcons().add(new Image(Main.class.getResourceAsStream("/Images/ProLogoN.png")));
	    }

	    @FXML
	    void DBCancelAction2(ActionEvent event) throws IOException {
	    	DBCancelBtn2.getScene().getWindow().hide();
	    	Stage ViewComplain = new Stage();
	    	
				Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/PoliceCancelPermit.fxml"));
				Scene scene = new Scene(root);
				ViewComplain.setResizable(false);
				ViewComplain.setScene(scene);
				ViewComplain.show();
				ViewComplain.setTitle("Add User");
				ViewComplain.getIcons().add(new Image(Main.class.getResourceAsStream("/Images/ProLogoN.png")));
	    }

	    @FXML
	    void DBLogOutAction(ActionEvent event) throws IOException {
	    	DBLogOutBtn.getScene().getWindow().hide();
	    	Stage logOut = new Stage();
	    	
				Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/Login.fxml"));
				Scene scene = new Scene(root);
				logOut.setResizable(false);
				logOut.setScene(scene);
				logOut.show();
				logOut.setTitle("Login");
				logOut.getIcons().add(new Image(Main.class.getResourceAsStream("/Images/ProLogoN.png")));
	    }

	    @FXML
	    void DBViewAction1(ActionEvent event) throws IOException {
	    	DBViewBtn1.getScene().getWindow().hide();
	    	Stage ViewComplain = new Stage();
	    	
				Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/PoliceViewComplains.fxml"));
				Scene scene = new Scene(root);
				ViewComplain.setResizable(false);
				ViewComplain.setScene(scene);
				ViewComplain.show();
				ViewComplain.setTitle("Add User");
				ViewComplain.getIcons().add(new Image(Main.class.getResourceAsStream("/Images/ProLogoN.png")));
	    }

	    @FXML
	    void DBViewAction2(ActionEvent event) throws IOException {
	    	DBViewBtn2.getScene().getWindow().hide();
	    	Stage ViewComplain = new Stage();
	    	
				Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/PoliceViewComplains.fxml"));
				Scene scene = new Scene(root);
				ViewComplain.setResizable(false);
				ViewComplain.setScene(scene);
				ViewComplain.show();
				ViewComplain.setTitle("Add User");
				ViewComplain.getIcons().add(new Image(Main.class.getResourceAsStream("/Images/ProLogoN.png")));
	    }
}
