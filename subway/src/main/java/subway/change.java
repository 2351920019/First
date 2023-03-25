package subway;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class change {
	private Connection conn=null;
	
	public change() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/kebiao", "root", "123456");
	}
	public void finalize() throws Exception {
		conn.close();
	}
	
	
	
	
 }
 

