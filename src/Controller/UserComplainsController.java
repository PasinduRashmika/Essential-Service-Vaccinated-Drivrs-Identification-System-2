package Controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import DBConnection.connection;
import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
public class UserComplainsController {
	@FXML
    private Button Backbtn3;

    @FXML
    private Button CheckVehiclesbtn;

    @FXML
    private Button Complainsbtn2;

    @FXML
    private TextField Description;

    @FXML
    private Button LogOutbtn;

    @FXML
    private TextField PerNo;

    @FXML
    private Button Submitbtn;

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
    private TextField VehicleNo;
    
    private PreparedStatement pst;
    
    @FXML
    public void Backbtn3Action(ActionEvent event) throws IOException  {
    	
    	Backbtn3.getScene().getWindow().hide();
    	Stage UserDashboard = new Stage();
    	
			Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/UserDashboard.fxml"));
			Scene scene = new Scene(root);
			UserDashboard.setResizable(false);
			UserDashboard.setScene(scene);
			UserDashboard.show();
			UserDashboard.setTitle("Dashboard");
			UserDashboard.getIcons().add(new Image(Main.class.getResourceAsStream("/Images/ProLogoN.png")));
    }
    
    @FXML
    public void LogoutAction(ActionEvent event) throws IOException  {
    	
    	LogOutbtn.getScene().getWindow().hide();
    	Stage addUser = new Stage();
    	
			Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/Login.fxml"));
			Scene scene = new Scene(root);
			addUser.setResizable(false);
			addUser.setScene(scene);
			addUser.show();
    }
    
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
    void SubmitbtnAction(ActionEvent event) throws ClassNotFoundException, SQLException, IOException {
    	Connection con ;
	    connection conClass = new connection();
	    try {
    	con =conClass.getConnection();
    	String str = "Insert into complain(ComplainId,VehicleNo,Description) values(?,?,?)";
    	
    	
    	pst=con.prepareStatement(str);
    	
    	
    	pst.setString(1, PerNo.getText());
    	pst.setString(2, VehicleNo.getText());
    	pst.setString(3, Description.getText());
    	
    	pst.executeUpdate();
    	
    	Stage Success = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/MessageSuccess.fxml"));
		Scene scene = new Scene(root);
		Success.setResizable(false);
		Success.setScene(scene);
		Success.initStyle(StageStyle.UNDECORATED);
		Success.showAndWait();
		
	    }catch(IOException e){
	    	Stage Error = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/MessageError.fxml"));
			Scene scene = new Scene(root);
			Error.setResizable(false);
			Error.setScene(scene);
			Error.initStyle(StageStyle.UNDECORATED);
			Error.showAndWait();
	    }
    	
    }
}
