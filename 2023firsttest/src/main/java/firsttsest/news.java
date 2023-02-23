package firsttsest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class news {
	
	public int xinzengnew(String biaoti,String guanjianzi,String zhuangaoren,String riqi,String neirong,String dengluming,String lanmu ) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "123456");
		String sql = "insert into xinwen value(?,?,?,?,?,?,?,?,?)";
		PreparedStatement pst = connection.prepareStatement(sql);
		pst.setString(1,biaoti);
		pst.setString(2,guanjianzi);
		pst.setString(3,zhuangaoren);
		pst.setString(4,riqi);
		pst.setString(5,neirong);
		pst.setString(6,"´ýÉóºË");
		pst.setString(7,dengluming);
		pst.setString(8,lanmu);
		pst.setString(9,null);
		int temp=pst.executeUpdate();
		pst.close();
		connection.close();
		return temp;
		
	}
	
	public String liulannew(String dengluming) throws Exception
	{
		int i=0;
		String news[][]=new String[5][];	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "123456");
		String sql="select * from xinwen";
		Statement stmt= conn.createStatement();
		ResultSet find=stmt.executeQuery(sql);
	    while(find.next()) {
	    	if(dengluming.equals(find.getString(7))) {
	    	news[i]=new String[6];
	    	news[i][0]=find.getString(1);
	    	news[i][1]=find.getString(2);
	    	news[i][2]=find.getString(3);
	    	news[i][3]=find.getString(4);
	    	news[i][4]=find.getString(5);
	    	news[i][5]=find.getString(8);
	    	i++;
	    	}
	    } 
	    news[i]=new String[6];
	    news[i][0]=null;
	    find.close();
		stmt.close();
		conn.close();
		return news[3][6];
	}

}
