package firsttsest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class usemysql {
	
	public static int index(String juese ,String dengluming ,String mima) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "123456");
		String sql="select * from 2023firsttest";
		Statement stmt= conn.createStatement();
		ResultSet find=stmt.executeQuery(sql);
		int temp=0;
		while(find.next()) {
            String mjuese=find.getString(1);
            String mdengluming=find.getString(2);
            String mmima=find.getString(3);
            mmima=mmima+mjuese;
               if(mjuese.equals(juese)&&mdengluming.equals(dengluming)&&mmima.equals(mima)){   	   
            	   temp=1;     
                       }
		}
		
		
		return temp;
	}
	
	public static int enroll(String juese,String dengluming,String mima) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "123456");
		String sql = "insert into 2023firsttest value(?,?,?)";
		PreparedStatement pst = connection.prepareStatement(sql);
		pst.setString(1,juese);
		pst.setString(2,dengluming);
		pst.setString(3,mima);
		int temp=pst.executeUpdate();
		pst.close();
		connection.close();
		return temp;
	}
	
	

}
