package Controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;

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
import DBConnection.connection;	
//import AlertMessage.Message;


//Message msg = new Message();

public class LoginController {

	 @FXML
	    private Pane loginpane1;

	    @FXML
	    private Label loginwelcome;

	    @FXML
	    private Button AboutUsbtn;

	    @FXML
	    private Line line23;

	    @FXML
	    private Line line22;

	    @FXML
	    private Pane loginpane2;

	    @FXML
	    private Line line2;

	    @FXML
	    private Line line21;

	    @FXML
	    private TextField inputNIC;

	    @FXML
	    private TextField inputPass;

	    @FXML
	    private Label ForgotPass;

	    @FXML
	    private Button loginbtn;
	   
	    private PreparedStatement pst;
	   // private PreparedStatement pst2;
	    
	    Connection con ;
	    connection conClass = new connection();

	    @FXML
	    void loginbtnAction(ActionEvent event) throws IOException,ClassNotFoundException,SQLException{
	    	
	    	con =conClass.getConnection();
	    	String str1 = "SELECT NIC,password,status FROM login WHERE NIC=? and password=? ";
	    	String str2 = "SELECT Status FROM login WHERE NIC=? and password=?";
	    	
	    	pst=con.prepareStatement(str1);
	    	//pst2=con.prepareStatement(str2);
	    	
	    	pst.setString(1, inputNIC.getText());
	    	pst.setString(2, inputPass.getText());
	    	
	    	
	    	
	    	ResultSet rs = pst.executeQuery();
	    	
	    	String s1="";
	    	int count=0;
	    	
	    	while(rs.next()) {
	    		count=count+1;
	    		s1 = rs.getString("status");
	    		System.out.println(s1);
	    	}
	    	if(count==1) {
	    		System.out.println("Login Successfull");
	    	}else {
	    		System.out.println("Login Faild");
	    		
	    		Stage Error = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/MessageError.fxml"));
				Scene scene = new Scene(root);
				Error.setResizable(false);
				Error.setScene(scene);
				Error.initStyle(StageStyle.UNDECORATED);
				Error.showAndWait();
	    	}
	    	try {
	    		switch(s1) {
	    			case "ADMIN" :
	    				System.out.println("This is admin");
	    				loginbtn.getScene().getWindow().hide();
	    		    	Stage AdminDashboard = new Stage();
	    		    	
	    					Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/AdminDashboard.fxml"));
	    					Scene scene = new Scene(root);
	    					AdminDashboard.setResizable(false);
	    					AdminDashboard.setScene(scene);
	    					AdminDashboard.show();
	    					AdminDashboard.setTitle("Add User");
	    					AdminDashboard.getIcons().add(new Image(Main.class.getResourceAsStream("/Images/ProLogoN.png")));
	    				break;
	    			case "USER" :
	    				System.out.println("This is admin");
	    				loginbtn.getScene().getWindow().hide();
	    		    	Stage UserDashboard = new Stage();
	    		    	
	    					Parent root2 = FXMLLoader.load(getClass().getResource("/FXML_Files/UserDashboard.fxml"));
	    					Scene scene2 = new Scene(root2);
	    					UserDashboard.setResizable(false);
	    					UserDashboard.setScene(scene2);
	    					UserDashboard.show();
	    					UserDashboard.setTitle("Add User");
	    					UserDashboard.getIcons().add(new Image(Main.class.getResourceAsStream("/Images/ProLogoN.png")));
	    				break;
	    			case "POLICE" :
	    				System.out.println("This is admin");
	    				loginbtn.getScene().getWindow().hide();
	    		    	Stage PoliceDashboardDashboard = new Stage();
	    		    	
	    					Parent root3 = FXMLLoader.load(getClass().getResource("/FXML_Files/PoliceDashboard.fxml"));
	    					Scene scene3 = new Scene(root3);
	    					PoliceDashboardDashboard.setResizable(false);
	    					PoliceDashboardDashboard.setScene(scene3);
	    					PoliceDashboardDashboard.show();
	    					PoliceDashboardDashboard.setTitle("Add User");
	    					PoliceDashboardDashboard.getIcons().add(new Image(Main.class.getResourceAsStream("/Images/ProLogoN.png")));
	    				break;		
	    		}
	    	}catch(InputMismatchException e) {
	    		System.out.println("Invalid User Input. Please enter a value from 0 to 4.");   		
	    	}
	    }	

		@FXML
	    void AboutUsAction(ActionEvent event) throws IOException{

	    		AboutUsbtn.getScene().getWindow().hide();
	    		Stage aboutUs = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/AboutUs.fxml"));
				Scene scene = new Scene(root);
				aboutUs.setResizable(false);
				aboutUs.setScene(scene);
				aboutUs.show();
				aboutUs.setTitle("About Us");
				aboutUs.getIcons().add(new Image(Main.class.getResourceAsStream("/Images/ProLogoN.png")));
				
	    }

}
