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
public class UserCheckVehiclesController {
	 	@FXML
	    private Button Backbtn1;

	    @FXML
	    private Button CheckVehiclesbtn2;

	    @FXML
	    private TextField Colour;

	    @FXML
	    private Button Complainsbtn;

	    @FXML
	    private TextField EssentialServise;

	    @FXML
	    private Button LogOutbtn;

	    @FXML
	    private TextField Make;

	    @FXML
	    private TextField PerDate1;

	    @FXML
	    private TextField PerDate2;

	    @FXML
	    private TextField PerNo;

	    @FXML
	    private TextField Type;

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

	    @FXML
	    private Button VehicleSearchbtn;
	    
	    @FXML
	    private Button backbtn;
	    
	    private PreparedStatement pst;
	    
	    private PreparedStatement pst2;
	    
	    @FXML
	    public void Backbtn1Action(ActionEvent event) throws IOException  {
	    	
	    	Backbtn1.getScene().getWindow().hide();
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
	    void VehicleSearchbtnAction(ActionEvent event) throws ClassNotFoundException, SQLException {
	    	Connection con ;
		    connection conClass = new connection();
		    
	    	con =conClass.getConnection();
	    	String str = "Select vehicle.state,permit.PermitNo,permit.StartDate,permit.EndDate,vehicle.vehicleType,vehicle.Make,vehicle.color from Vehicle,permit where VehicleNO=?  and VehicleNumber=? AND vehicle.VehicleNumber=permit.VehicleNO";
	    	
	    	pst=con.prepareStatement(str);
	    	
	    	pst.setString(1, VehicleNo.getText());
	    	pst.setString(2, VehicleNo.getText());
	    	
	    	ResultSet rs = pst.executeQuery();
	    	
	    	String s1="",s2="",s3="",s4="",s5="",s6="",s7="";
	    	
	    	int count=0;
	    	
	    	while(rs.next()) {
	    		
	    		s1 = rs.getString("state");
	    		s2 = rs.getString("PermitNo");
	    		s3 = rs.getString("StartDate");
	    		s4 = rs.getString("EndDate");
	    		s5 = rs.getString("vehicleType");
	    		s6 = rs.getString("Make");
	    		s7 = rs.getString("color");
	    		count=count+1;	    		
	    	}
	    	if(s1=="") {
	    		EssentialServise.setText("Not a Essential Service");
	    	}
	    	EssentialServise.setText(s1);
	    	PerNo.setText(s2);
	    	PerDate1.setText(s3);
	    	PerDate2.setText(s4);
	    	Type.setText(s5);
	    	Make.setText(s6);
	    	Colour.setText(s7);
	    }
}
