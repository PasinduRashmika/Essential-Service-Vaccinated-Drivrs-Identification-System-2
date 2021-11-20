package Controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DBConnection.connection;
import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
public class UserCheckVaccinationController {
	 @FXML
	    private Button Backbtn2;

	    @FXML
	    private TextField Booster;

	    @FXML
	    private Button CheckVehiclesbtn;

	    @FXML
	    private Button Complainsbtn;

	    @FXML
	    private TextField DrivingLiNo;

	    @FXML
	    private TextField FirstDose;

	    @FXML
	    private Button LogOutbtn;

	    @FXML
	    private TextField Name;

	    @FXML
	    private TextField SecondDose;

	    @FXML
	    private Label Us;

	    @FXML
	    private Label Us1;

	    @FXML
	    private Pane UserDashPane1;

	    @FXML
	    private Pane UserDashPane2;

	    @FXML
	    private Button VaccinatedDetailsbtn2;

	    @FXML
	    private Button VaccinationSearchbtn;

	    @FXML
	    private TextField VaccineType;
	    
	    @FXML
	    private Button backbtn;
	    
	    private PreparedStatement pst;

	    @FXML
	    public void Backbtn2Action(ActionEvent event) throws IOException  {
	    	
	    	Backbtn2.getScene().getWindow().hide();
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
	    public void backbtnAction(ActionEvent event) throws IOException  {
	    	
	    	backbtn.getScene().getWindow().hide();
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
	    	Stage Login = new Stage();
	    	
				Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/Login.fxml"));
				Scene scene = new Scene(root);
				Login.setResizable(false);
				Login.setScene(scene);
				Login.show();
				Login.setTitle("Login");
				Login.getIcons().add(new Image(Main.class.getResourceAsStream("/Images/ProLogoN.png")));
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
	    public void ComplainsAction(ActionEvent event) throws IOException  {
	    	
	    	Complainsbtn.getScene().getWindow().hide();
	    	Stage UserComplains = new Stage();
	    	
				Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/UserComplains.fxml"));
				Scene scene = new Scene(root);
				UserComplains.setResizable(false);
				UserComplains.setScene(scene);
				UserComplains.show();
				UserComplains.setTitle("Complains");
				UserComplains.getIcons().add(new Image(Main.class.getResourceAsStream("/Images/ProLogoN.png")));
	    }
	    @FXML
	    void VaccinationSearchbtnAction(ActionEvent event) throws SQLException, ClassNotFoundException, IOException {
	    	Connection con ;
		    connection conClass = new connection();
		    
	    	con =conClass.getConnection();
	    	String str = "select TypeOfVaccine,FirstDoseDate,SecondDoseDate from Driver ";
	    	
	    	pst=con.prepareStatement(str);
	    	
	    	ResultSet rs = pst.executeQuery();
	    	
	    	String s1="",s2="",s3="",s4="",s5="";
	    	
	    	int count=0;
	    	
	    	while(rs.next()) {
	    		
	    		//s1 = rs.getString("Name");
	    		s2 = rs.getString("TypeOfVaccine");
	    		s3 = rs.getString("FirstDoseDate");
	    		s4 = rs.getString("SecondDoseDate");
	    		//s5 = rs.getString("vehicleType");
	    		count=count+1;	    		
	    	}
//	    	if(s2==NULL) {
//	    		Stage Error = new Stage();
//				Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/MessageError.fxml"));
//				Scene scene = new Scene(root);
//				Error.setResizable(false);
//				Error.setScene(scene);
//				Error.initStyle(StageStyle.UNDECORATED);
//				Error.showAndWait();
//	    	}
	    	//Name.setText(s1);
	    	VaccineType.setText(s2);
	    	FirstDose.setText(s3);
	    	SecondDose.setText(s4);
	    	//Booster.setText(s5);
	    	
	    }

}
