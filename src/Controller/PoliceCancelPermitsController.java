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

public class PoliceCancelPermitsController {
	 @FXML
	    private Pane PoliceCancelPane1;

	    @FXML
	    private Line PoliceCancelLine1;

	    @FXML
	    private Line PoliceCancelLine2;

	    @FXML
	    private Label PoliceLabel;

	    @FXML
	    private Button LogOutBtn;

	    @FXML
	    private Button CancelPermits;

	    @FXML
	    private Button UserComplains;

	    @FXML
	    private Pane PoliceCancelPane2;

	    @FXML
	    private Line PoliceCancelLine3;

	    @FXML
	    private Line PoliceCancelLine4;

	    @FXML
	    private Button BackBtn2;

	    @FXML
	    private TextField CancelPermitNo;

	    @FXML
	    private TextField CancelVehicleNo;

	    @FXML
	    private TextField CancelDescription;

	    @FXML
	    private Button Backbtn;
	    
	    @FXML
	    private Button Searchbtn2;
	    
	    private PreparedStatement pst;
	    
	    private PreparedStatement pst2;

	    @FXML
	    void BackBtn2Action(ActionEvent event) throws IOException {
	    	BackBtn2.getScene().getWindow().hide();
	    	Stage ViewComplain = new Stage();
	    	
				Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/PoliceDashboard.fxml"));
				Scene scene = new Scene(root);
				ViewComplain.setResizable(false);
				ViewComplain.setScene(scene);
				ViewComplain.show();
				ViewComplain.setTitle("Add User");
				ViewComplain.getIcons().add(new Image(Main.class.getResourceAsStream("/Images/ProLogoN.png")));
	    }

	    @FXML
	    void CancelPermitAction(ActionEvent event) throws ClassNotFoundException, SQLException, IOException {
	    	Connection con ;
		    connection conClass = new connection();
		    try {
	    	con =conClass.getConnection();
	    	String str2 = "delete from permit where VehicleNO=?";
	    	
	    	pst2=con.prepareStatement(str2);
	    	
	    	pst2.setString(1, CancelPermitNo.getText());
	    	
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
	    void CancelPermitsAction(ActionEvent event) throws IOException {
	    	CancelPermits.getScene().getWindow().hide();
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
	    void DescriptionaAction(ActionEvent event) {

	    }

	    @FXML
	    void LogOutBtnAction(ActionEvent event) throws IOException {
	    	LogOutBtn.getScene().getWindow().hide();
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
	    void PermitNoAction(ActionEvent event) {

	    }

	    @FXML
	    void UserComplainsAction(ActionEvent event) throws IOException {
	    	UserComplains.getScene().getWindow().hide();
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
	    void Searchbtn2Action(ActionEvent event) throws ClassNotFoundException, SQLException, IOException {
	    	Connection con ;
		    connection conClass = new connection();
		    
	    	con =conClass.getConnection();
	    	String str = "select complain.VehicleNo,complain.Description from permit,complain where complain.VehicleNo=permit.VehicleNo ";
	    	
	    	pst=con.prepareStatement(str);
	    	
	    	ResultSet rs = pst.executeQuery();
	    	
	    	String s1="",s2="";
	    	
	    	int count=0;
	    	
	    	while(rs.next()) {
	    		
	    		s1 = rs.getString("VehicleNo");
	    		s2 = rs.getString("Description");
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
	    	
	    	CancelVehicleNo.setText(s1);
	    	CancelDescription.setText(s2);
	    	
	    	
	    }

	    @FXML
	    void VehicleNoAction(ActionEvent event) {

	    }
}
