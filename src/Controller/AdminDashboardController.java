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
public class AdminDashboardController {
	@FXML
    private Label Admin;

    @FXML
    private Label Admin1;

    @FXML
    private Line AdminDashLine1;

    @FXML
    private Line AdminDashLine2;

    @FXML
    private Line AdminDashLine3;

    @FXML
    private Line AdminDashLine4;

    @FXML
    private Pane AdminDashPane1;

    @FXML
    private Pane AdminDashPane2;

    @FXML
    private Button AdminDashbtn1;

    @FXML
    private Button AdminDashbtn10;

    @FXML
    private Button AdminDashbtn2;

    @FXML
    private Button AdminDashbtn3;

    @FXML
    private Button AdminDashbtn4;

    @FXML
    private Button AdminDashbtn5;

    @FXML
    private Button AdminDashbtn6;

    @FXML
    private Button AdminDashbtn7;

    @FXML
    private Button AdminDashbtn8;

    @FXML
    private Button AdminDashbtn9;

    @FXML
    private Button Backbtn;

    @FXML
    private Button LogOutbtn;
    
    @FXML
    public void AdminDashAction1(ActionEvent event) throws IOException  {
    	
    	AdminDashbtn1.getScene().getWindow().hide();
    	Stage addUser = new Stage();
    	
			Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/AdminAdduser.fxml"));
			Scene scene = new Scene(root);
			addUser.setResizable(false);
			addUser.setScene(scene);
			addUser.show();
			addUser.setTitle("Add User");
			addUser.getIcons().add(new Image(Main.class.getResourceAsStream("/Images/ProLogoN.png")));
    }
    @FXML
    public void AdminDashAction6(ActionEvent event) throws IOException  {
    	
    	AdminDashbtn6.getScene().getWindow().hide();
    	Stage addUser = new Stage();
    	
			Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/AdminAdduser.fxml"));
			Scene scene = new Scene(root);
			addUser.setResizable(false);
			addUser.setScene(scene);
			addUser.show();
			addUser.setTitle("Add User");
			addUser.getIcons().add(new Image(Main.class.getResourceAsStream("/Images/ProLogoN.png")));
    }
   
    @FXML
    public void AdminDashAction2(ActionEvent event) throws IOException  {
    	
    	AdminDashbtn2.getScene().getWindow().hide();
    	Stage deleteUser = new Stage();
    	
			Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/AdminDeleteUser.fxml"));
			Scene scene = new Scene(root);
			deleteUser.setResizable(false);
			deleteUser.setScene(scene);
			deleteUser.show();
			deleteUser.setTitle("Delete User");
			deleteUser.getIcons().add(new Image(Main.class.getResourceAsStream("/Images/ProLogoN.png")));
    }
    @FXML
    public void AdminDashAction7(ActionEvent event) throws IOException  {
    	
    	AdminDashbtn7.getScene().getWindow().hide();
    	Stage deleteUser = new Stage();
    	
			Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/AdminDeleteUser.fxml"));
			Scene scene = new Scene(root);
			deleteUser.setResizable(false);
			deleteUser.setScene(scene);
			deleteUser.show();
			deleteUser.setTitle("Delete User");
			deleteUser.getIcons().add(new Image(Main.class.getResourceAsStream("/Images/ProLogoN.png")));
    }

    @FXML
    public void AdminDashAction3(ActionEvent event) throws IOException  {
    	
    	AdminDashbtn3.getScene().getWindow().hide();
    	Stage addVehicle = new Stage();
    	
			Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/AdminAddVehicleDetails.fxml"));
			Scene scene = new Scene(root);
			addVehicle.setResizable(false);
			addVehicle.setScene(scene);
			addVehicle.show();
			addVehicle.setTitle("Add Vehicle Details");
			addVehicle.getIcons().add(new Image(Main.class.getResourceAsStream("/Images/ProLogoN.png")));
    }
    @FXML
    public void AdminDashAction8(ActionEvent event) throws IOException  {
    	
    	AdminDashbtn8.getScene().getWindow().hide();
    	Stage addVehicle = new Stage();
    	
			Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/AdminAddVehicleDetails.fxml"));
			Scene scene = new Scene(root);
			addVehicle.setResizable(false);
			addVehicle.setScene(scene);
			addVehicle.show();
			addVehicle.setTitle("Add Vehicle Details");
			addVehicle.getIcons().add(new Image(Main.class.getResourceAsStream("/Images/ProLogoN.png")));
    }
    
    @FXML
    public void AdminDashAction4(ActionEvent event) throws IOException  {
    	
    	AdminDashbtn4.getScene().getWindow().hide();
    	Stage deleteVehicle = new Stage();
    	
			Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/AdminDeleteVehicleDetails.fxml"));
			Scene scene = new Scene(root);
			deleteVehicle.setResizable(false);
			deleteVehicle.setScene(scene);
			deleteVehicle.show();
			deleteVehicle.setTitle("Delete Vehicle Details");
			deleteVehicle.getIcons().add(new Image(Main.class.getResourceAsStream("/Images/ProLogoN.png")));
    }
    
    @FXML
    public void AdminDashAction9(ActionEvent event) throws IOException  {
    	
    	AdminDashbtn9.getScene().getWindow().hide();
    	Stage deleteVehicle = new Stage();
    	
			Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/AdminDeleteVehicleDetails.fxml"));
			Scene scene = new Scene(root);
			deleteVehicle.setResizable(false);
			deleteVehicle.setScene(scene);
			deleteVehicle.show();
			deleteVehicle.setTitle("Delete Vehicle Details");
			deleteVehicle.getIcons().add(new Image(Main.class.getResourceAsStream("/Images/ProLogoN.png")));
    }

    @FXML
    public void AdminDashAction5(ActionEvent event) throws IOException  {
    	
    	AdminDashbtn5.getScene().getWindow().hide();
    	Stage addVaccination = new Stage();
    	
			Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/AdminVaccinatedDetails.fxml"));
			Scene scene = new Scene(root);
			addVaccination.setResizable(false);
			addVaccination.setScene(scene);
			addVaccination.show();
			addVaccination.setTitle("Add Vaccination Details");
			addVaccination.getIcons().add(new Image(Main.class.getResourceAsStream("/Images/ProLogoN.png")));
    }
    @FXML
    public void AdminDashAction10(ActionEvent event) throws IOException  {
    	
    	AdminDashbtn10.getScene().getWindow().hide();
    	Stage addVaccination = new Stage();
    	
			Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/AdminVaccinatedDetails.fxml"));
			Scene scene = new Scene(root);
			addVaccination.setResizable(false);
			addVaccination.setScene(scene);
			addVaccination.show();
			addVaccination.setTitle("Add Vaccination Details");
			addVaccination.getIcons().add(new Image(Main.class.getResourceAsStream("/Images/ProLogoN.png")));
    }

    @FXML
    public void LogOutbtnAction(ActionEvent event) throws IOException  {
    	
    	LogOutbtn.getScene().getWindow().hide();
    	Stage logOut = new Stage();
    	
			Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/Login.fxml"));
			Scene scene = new Scene(root);
			logOut.setResizable(false);
			logOut.setScene(scene);
			logOut.show();
			logOut.setTitle("Login");
			logOut.getIcons().add(new Image(Main.class.getResourceAsStream("/Images/ProLogoN.png")));
    }
}
