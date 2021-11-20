package Controller;

import java.io.IOException;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import DBConnection.connection;
import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class AdminAddVehicleDetailsController {
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
    private Button LogOutbtn;

    @FXML
    private Button SubmitVehiclebtn;

    @FXML
    private TextField VehicleLiNotxt;

    @FXML
    private TextField VehicleMaketxt;

    @FXML
    private TextField VehicleNotxt;

    @FXML
    private TextField VehiclePermittxt;

    @FXML
    private TextField VehicleTypetxt;

    @FXML
    private TextField Vehiclecolortxt;
    
    @FXML
    private TextField startDate;

    @FXML
    private TextField EndDate;
    
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
    void SubmitVehiclebtnAction(ActionEvent event) throws ClassNotFoundException, SQLException, IOException {
    	
    	
    	
    	Connection con ;
	    connection conClass = new connection();
	    
	    try {
    	con =conClass.getConnection();
    	String str = "Insert into vehicle(VehicleNumber,VehicleType,color,make,DrivingLiNo,PermitNo,state) values(?,?,?,?,?,?,?)";
    	String str2 = "Insert into permit(PermitNo,VehicleNo,DrivingLiNo,StartDate,EndDate) values(?,?,?,?,?)";
    	
    	pst=con.prepareStatement(str);
    	pst2=con.prepareStatement(str2);
    	
    	
    	pst.setString(1, VehicleNotxt.getText());
    	pst.setString(2, VehicleTypetxt.getText());
    	pst.setString(3, Vehiclecolortxt.getText());
    	pst.setString(4, VehicleMaketxt.getText());
    	pst.setString(5, VehicleLiNotxt.getText());
    	pst.setString(6, VehiclePermittxt.getText());
    	pst.setString(7,"Essential Service");
    	
    	pst2.setString(1, VehiclePermittxt.getText());
    	pst2.setString(2, VehicleNotxt.getText());
    	pst2.setString(3, VehicleLiNotxt.getText());
    	pst2.setString(4, startDate.getText());
    	pst2.setString(5, EndDate.getText());
    	
    	System.out.println(pst);
    	pst.executeUpdate();
    	pst2.executeUpdate();

	    Stage Success = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/MessageSuccess.fxml"));
		Scene scene = new Scene(root);
		Success.setResizable(false);
		Success.setScene(scene);
		Success.initStyle(StageStyle.UNDECORATED);
		Success.showAndWait();
		
		
	    }catch(SQLException e) {
	    	Stage Error = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/MessageError.fxml"));
			Scene scene = new Scene(root);
			Error.setResizable(false);
			Error.setScene(scene);
			Error.initStyle(StageStyle.UNDECORATED);
			Error.showAndWait();
	    }
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
