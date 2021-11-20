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
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
public class AdminVaccinatedDetailsController {
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
	    private DatePicker FirstDosePicker;

	    @FXML
	    private Button LogOutbtn;

	    @FXML
	    private DatePicker SecondDosePicker;

	    @FXML
	    private Button SubmitVaccinatedbtn;

	    @FXML
	    private TextField VaccinatedDrivertxt;
	    
	    @FXML
	    private RadioButton S;

	    @FXML
	    private ToggleGroup group;

	    @FXML
	    private RadioButton P;

	    @FXML
	    private RadioButton V;

	    @FXML
	    private RadioButton A;

	    @FXML
	    private RadioButton M;
	    
	    @FXML
	    private CheckBox first;

	    @FXML
	    private CheckBox second;
	    
	    @FXML
	    private TextField VaccinatedDatetxt1;

	    @FXML
	    private TextField VaccinatedDatetxt2;
	    
	    private PreparedStatement pst;
	     
	    
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
	    void SubmitVaccinatedbtnAction(ActionEvent event) throws ClassNotFoundException, SQLException, IOException{
	    	
	    	Connection con ;
		    connection conClass = new connection();
		    
	    	con =conClass.getConnection();
	    	
	    	try {
	    	String str = "Insert into driver(DrivingLiNO,TypeOfVaccine,firstTaken,secondTaken,FirstDoseDate,SecondDoseDate) values(?,?,?,?,?,?)";
	    	pst=con.prepareStatement(str);
	    	int i = 0;
	    	String type="";
	    	if(S.isSelected()) {
	    		type="Synopharm";
	    	}else if(P.isSelected()) {
	    		type="Pfyzer";
	    	}else if(V.isSelected()) {
	    		type="Sputnik V";
	    	}else if(A.isSelected()) {
	    		type="AstraZeneca";
	    	}else if(M.isSelected()) {
	    		type="Moderna";
	    	}else {
				i=1;
	    	}
	    	
	    	String f="",s="";
	    	
	    	if(first.isSelected()) {
	    		f="Done";
	    	}
	    	if(second.isSelected()) {
	    		s="Done";
	    	}
	    	
	    	if(i==0) {
	    	pst.setString(1, VaccinatedDrivertxt.getText());
	    	pst.setString(2, type);
	    	pst.setString(3, f);
	    	pst.setString(4, s);
	    	pst.setString(5, VaccinatedDatetxt1.getText());
	    	pst.setString(6, VaccinatedDatetxt2.getText());
	    	
	    	
	    	System.out.println(pst);
	    	pst.executeUpdate();
	    	
	    	Stage Success = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/MessageSuccess.fxml"));
			Scene scene = new Scene(root);
			Success.setResizable(false);
			Success.setScene(scene);
			Success.initStyle(StageStyle.UNDECORATED);
			Success.showAndWait();
	    	}else {
	    		Stage Error = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/MessageError.fxml"));
				Scene scene = new Scene(root);
				Error.setResizable(false);
				Error.setScene(scene);
				Error.initStyle(StageStyle.UNDECORATED);
				Error.showAndWait();
	    	}
			
	    	}
	    	catch(SQLException e) {
	    		System.out.println(e);
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
