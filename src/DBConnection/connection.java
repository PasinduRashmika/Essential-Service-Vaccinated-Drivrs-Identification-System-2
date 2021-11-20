package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class connection{

	Connection con=null;
	
	public Connection getConnection() throws ClassNotFoundException, SQLException{
		
		//Class.forName("com.mysql.jdbc.Driver");
		
		con=DriverManager.getConnection("jdbc:mysql://localhost/essentialservice2","root","");
		System.out.println("Connected to Database");
		
		return con;
	}
}
