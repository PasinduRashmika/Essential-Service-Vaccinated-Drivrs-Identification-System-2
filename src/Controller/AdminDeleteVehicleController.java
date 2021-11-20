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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
public class AdminDeleteVehicleController {
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
    private Button AdminDashbtn2;

    @FXML
    private Button AdminDashbtn3;

    @FXML
    private Button AdminDashbtn4;

    @FXML
    private Button AdminDashbtn5;

    @FXML
    private Button Backbtn;

    @FXML
    private TextField DeleteDrivertxt;

    @FXML
    private TextField DeleteVehicleLiNotxt;

    @FXML
    private TextField DeleteVehicleMaketxt;

    @FXML
    private TextField DeleteVehicleNotxt;

    @FXML
    private TextField DeleteVehiclePermittxt;

    @FXML
    private Button DeleteVehicleSearchbtn;

    @FXML
    private TextField DeleteVehicleTypetxt;

    @FXML
    private Button DeleteVehiclebtn;

    @FXML
    private TextField DeleteVehiclecolortxt;
    
    @FXML
    private TextField DeleteVehiclePermittxt2;

    @FXML
    private Button LogOutbtn;
    
    private PreparedStatement pst;
    
    private PreparedStatement pst2;

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
    public void BackbtnAction(ActionEvent event) throws IOException  {
    	
    	Backbtn.getScene().getWindow().hide();
    	Stage dashBoard = new Stage();
    	
			Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/AdminDashboard.fxml"));
			Scene scene = new Scene(root);
			dashBoard.setResizable(false);
			dashBoard.setScene(scene);
			dashBoard.show();
			dashBoard.setTitle("ADMIN");
			dashBoard.getIcons().add(new Image(Main.class.getResourceAsStream("/Images/ProLogoN.png")));
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
    @FXML
    void DeleteVehicleSearchbtnAction(ActionEvent event) throws ClassNotFoundException, SQLException, IOException {
    	Connection con ;
	    connection conClass = new connection();
	    
    	con =conClass.getConnection();
    	String str = "Select vehicle.DrivingLiNo,vehicle.vehicleType,vehicle.color,vehicle.Make,vehicle.PermitNo,permit.StartDate,permit.EndDate from Vehicle,permit where VehicleNO=?  and VehicleNumber=? AND vehicle.VehicleNumber=permit.VehicleNO";
    	
    	
    	
    	pst=con.prepareStatement(str);
    	
    	pst.setString(1, DeleteVehicleNotxt.getText());
    	pst.setString(2, DeleteVehicleNotxt.getText());
    	
    	ResultSet rs = pst.executeQuery();
    	
    	String s1="",s2="",s3="",s4="",s5="",s6="",s7="";
    	int count=0;
    	
    	while(rs.next()) {
    		
    		s1 = rs.getString("DrivingLiNo");
    		s2 = rs.getString("vehicleType");
    		s3 = rs.getString("color");
    		s4 = rs.getString("Make");
    		s5 = rs.getString("PermitNo");
    		s6 = rs.getString("StartDate");
    		s7 = rs.getString("EndDate");
    		count=count+1;	    		
    	}
    	if(s1=="") {
    		Stage Error = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/MessageError.fxml"));
			Scene scene = new Scene(root);
			Error.setResizable(false);
			Error.setScene(scene);
			Error.initStyle(StageStyle.UNDECORATED);
			Error.showAndWait();
    	}
    	DeleteDrivertxt.setText(s1);
    	DeleteVehicleTypetxt.setText(s2);
    	DeleteVehiclecolortxt.setText(s3);
    	DeleteVehicleMaketxt.setText(s4);
    	DeleteVehicleLiNotxt.setText(s5);
    	DeleteVehiclePermittxt.setText(s6);
    	DeleteVehiclePermittxt2.setText(s7);
    }
    @FXML
    void DeleteVehiclebtnAction(ActionEvent event) throws ClassNotFoundException, SQLException, IOException {
    	System.out.println("XFCVS");
    	Connection con ;
	    connection conClass = new connection();
	    
    	con =conClass.getConnection();
    	String str = "delete from vehicle where VehicleNumber=?";
    	String str2 = "delete from permit where VehicleNO=?";
    	
    	pst=con.prepareStatement(str);
    	pst2=con.prepareStatement(str2);
    	
    	pst.setString(1, DeleteVehicleNotxt.getText());
    	pst2.setString(1, DeleteVehicleNotxt.getText());
    	
    	pst.executeUpdate();
    	pst2.executeUpdate();
    	
    	Stage Success = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/MessageSuccess.fxml"));
		Scene scene = new Scene(root);
		Success.setResizable(false);
		Success.setScene(scene);
		Success.initStyle(StageStyle.UNDECORATED);
		Success.showAndWait();
    }
}
