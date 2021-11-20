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
import javafx.stage.Stage;
public class UserDashboardController {
	@FXML
    private Button Backbtn;

    @FXML
    private Button CheckVehiclesbtn;

    @FXML
    private Button CheckVehiclesbtn1;

    @FXML
    private Button Complainsbtn;

    @FXML
    private Button Complainsbtn1;

    @FXML
    private Button LogOutbtn;

    @FXML
    private Label Us;

    @FXML
    private Label Us1;

    @FXML
    private Pane UserDashPane1;

    @FXML
    private Pane UserDashPane2;

    @FXML
    private Button VaccinatedDetailsbtn;

    @FXML
    private Button VaccinatedDetailsbtn1;
    
    @FXML
    public void CheckVehiclesAction(ActionEvent event) throws IOException  {
    	
    	CheckVehiclesbtn.getScene().getWindow().hide();
    	Stage UserCheckVehicles = new Stage();
    	
			Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/UserCheckVehicles.fxml"));
			Scene scene = new Scene(root);
			UserCheckVehicles.setResizable(false);
			UserCheckVehicles.setScene(scene);
			UserCheckVehicles.show();
			UserCheckVehicles.setTitle("Check Vehicles");
			UserCheckVehicles.getIcons().add(new Image(Main.class.getResourceAsStream("/Images/ProLogoN.png")));
    }
    
    @FXML
    public void CheckVehiclesAction1(ActionEvent event) throws IOException  {
    	
    	CheckVehiclesbtn.getScene().getWindow().hide();
    	Stage UserCheckVehicles = new Stage();
    	
			Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/UserCheckVehicles.fxml"));
			Scene scene = new Scene(root);
			UserCheckVehicles.setResizable(false);
			UserCheckVehicles.setScene(scene);
			UserCheckVehicles.show();
			UserCheckVehicles.setTitle("Check Vehicles");
			UserCheckVehicles.getIcons().add(new Image(Main.class.getResourceAsStream("/Images/ProLogoN.png")));
    }
    
    @FXML
    public void VaccinatedDetailsAction(ActionEvent event) throws IOException  {
    	
    	VaccinatedDetailsbtn.getScene().getWindow().hide();
    	Stage UserCheckVaccination = new Stage();
    	
			Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/UserCheckVaccination.fxml"));
			Scene scene = new Scene(root);
			UserCheckVaccination.setResizable(false);
			UserCheckVaccination.setScene(scene);
			UserCheckVaccination.show();
			UserCheckVaccination.setTitle("Check Vaccination");
			UserCheckVaccination.getIcons().add(new Image(Main.class.getResourceAsStream("/Images/ProLogoN.png")));
    }
    
    @FXML
    public void VaccinatedDetailsAction1(ActionEvent event) throws IOException  {
    	
    	VaccinatedDetailsbtn.getScene().getWindow().hide();
    	Stage UserCheckVaccination = new Stage();
    	
			Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/UserCheckVaccination.fxml"));
			Scene scene = new Scene(root);
			UserCheckVaccination.setResizable(false);
			UserCheckVaccination.setScene(scene);
			UserCheckVaccination.show();
			UserCheckVaccination.setTitle("Check Vaccination");
			UserCheckVaccination.getIcons().add(new Image(Main.class.getResourceAsStream("/Images/ProLogoN.png")));
    }
    
    @FXML
    public void ComplainsAction(ActionEvent event) throws IOException  {
    	
    	Complainsbtn.getScene().getWindow().hide();
    	Stage UserComplains = new Stage();
    	
			Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/UserComplains.fxml"));
			Scene scene = new Scene(root);
			UserComplains.setResizable(false);
			UserComplains.setScene(scene);
			UserComplains.show();
			UserComplains.setTitle("Complains ");
			UserComplains.getIcons().add(new Image(Main.class.getResourceAsStream("/Images/ProLogoN.png")));
    }
    
    @FXML
    public void ComplainsAction1(ActionEvent event) throws IOException  {
    	
    	Complainsbtn.getScene().getWindow().hide();
    	Stage UserComplains = new Stage();
    	
			Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/UserComplains.fxml"));
			Scene scene = new Scene(root);
			UserComplains.setResizable(false);
			UserComplains.setScene(scene);
			UserComplains.show();
			UserComplains.setTitle("Check Vaccination");
			UserComplains.getIcons().add(new Image(Main.class.getResourceAsStream("/Images/ProLogoN.png")));
    }
    
    @FXML
    public void LogoutAction(ActionEvent event) throws IOException  {
    	
    	LogOutbtn.getScene().getWindow().hide();
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
