package subway;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class useing {
	
	/*public String findbylin[]=new String[100];
	public String findbyname[]=new String[100];
	public String finda[]=new String[100];
	public int i=0,j=0,zhandianshu,xianlu,jieshu=0;
	public String temps="-1";
	
	public String findbylin(String lin) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/kebiao", "root", "123456");
		String sql="select * from station_information";
		Statement stmt= conn.createStatement();
		ResultSet find=stmt.executeQuery(sql);
		while(find.next()) {
			if(find.getString(2).equals(lin)) {
				findbylin[i]=new String();
				findbylin[i]=find.getString(3);
				i++;
			}
		}
		
		if(findbylin[0].equals(null))return "###";
		findbylin[i]="#";
		find.close();
		stmt.close();
		conn.close();
		
		return lin;
	}
	
	public String findbyname(String name) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/kebiao", "root", "123456");
		String sql="select * from station_information";
		Statement stmt= conn.createStatement();
		ResultSet find=stmt.executeQuery(sql);
		while(find.next()) {
			if(find.getString(3).equals(name)) {
				findbyname[j]=new String();
				findbyname[j]=find.getString(2);
				j++;
			}
		}
		
		if(findbyname[0].equals(null))return "###";
		findbyname[j]="#";
		find.close();
		stmt.close();
		conn.close();
		
		
		return name;
	}
	
	public String findbys_s(String sname,String names) throws Exception {
		
		
		int i=0;
		String chaxun[][]=new String[15][2];
		String temp="0";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/kebiao", "root", "123456");
		String sql="select * from station_information";
		Statement stmt= conn.createStatement();
		ResultSet find=stmt.executeQuery(sql);
		while(find.next()) {
			if(find.getString(3).equals(sname)||find.getString(3).equals(names)) {
				chaxun[i][i]=new String();
				chaxun[i][0]=find.getString(2);
				chaxun[i][1]=find.getString(3);
				i++;
			}
		}
		
		int jump=0;
		for(int j=0;j<15;j++) {
			for(int k=0;k<15;k++) {
				if(!chaxun[j][1].equals(chaxun[k][1])&&chaxun[j][0].equals(chaxun[k][0])){
					temp=chaxun[j][0];
					jump=1;
					break;
				}
			}
			if(jump==1)break;
		}
		
		String cun[]=new String[15];
		if(!temp.equals("0")) {
			String sql2="select * from station_information";
			Statement stmt2= conn.createStatement();
			ResultSet find2=stmt2.executeQuery(sql2);
			int l=0;
			while(find2.next()) {
				if(find2.getString(2).equals(temp)) {
					cun[l]=new String();
					cun[l]=find2.getString(3);
					l++;
				}
			}
			find2.close();
			stmt2.close();
		}
		int n=0;
		for(int m=0;m<15;m++) {
			if(temps.equals("1")||(cun[m].equals(sname)||cun[m].equals(names))) {
				finda[n]=new String();
				finda[n]=cun[m];
				n++;
				temps="1";
			}
		}
		
		find.close();
		stmt.close();
		conn.close();
		for(int q=1;q<15;q++) {
			if(finda[q].equals(sname)||finda[q].equals(names)){
				zhandianshu=q+1;
				jieshu=q;
				break;
			}
		}
		
		return temp;
		
	}
	
	
	public String basicfind(String station) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/kebiao", "root", "123456");
		String sql="select * from station_information";
		Statement stmt= conn.createStatement();
		ResultSet find=stmt.executeQuery(sql);
		while(find.next()) {
			if(station.equals(find.getString(3)))
				return find.getString(2);
		}
		
		return "#";
	}
	*/
	
	
	
	

	public String role;
	public String anllrole[]=new String[5];
	public int temp[]=new int[5];
	public String onrolestation[]=new String[30];
	public String onstationatroles[]=new String[5];
	
	
	public int findshortrole(String startname,String stopname) throws Exception {
		int temps=-1;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/kebiao", "root", "123456");
		String sql="WITH RECURSIVE transfer(startname, stopname, stops, paths) AS (\r\n"
				+ "SELECT sname, snext, 1 stops, \r\n"
				+ "       CAST(concat(sline,sname,'->',sline,snext) AS char(1000)) AS paths\r\n"
				+ "FROM biejing_subway\r\n"
				+ "WHERE sname = '"+startname+"'\r\n"
				+ "UNION ALL\r\n"
				+ "SELECT t.startname, s.snext, stops+1, concat(paths, '->', s.sline, s.snext)\r\n"
				+ "FROM transfer t \r\n"
				+ "JOIN biejing_subway s \r\n"
				+ "ON (t.stopname = s.sname AND instr(paths, s.snext)=0)\r\n"
				+ ")\r\n"
				+ "SELECT *\r\n"
				+ "FROM transfer\r\n"
				+ "WHERE stopname = '"+stopname+"';";
		Statement stmt= conn.createStatement();
		ResultSet find=stmt.executeQuery(sql);
		find.next();
		role=find.getString(4);
		temps=find.getInt(3);
		
		find.close();
		stmt.close();
		conn.close();
		
		return temps;
	}
	
	
	public int findfewrole(String startname,String stopname) throws Exception {
		int number=10,location=-1;
		char roles[]=new char[1000];
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/kebiao", "root", "123456");
		String sql="WITH RECURSIVE transfer(startname, stopname, stops, paths) AS ( "
				+ "SELECT sname, snext, 1 stops, "
				+ "       CAST(concat(sline,sname,'->',sline,snext) AS char(1000)) AS paths "
				+ "FROM biejing_subway "
				+ "WHERE sname = '"+startname+"' "
				+ "UNION ALL "
				+ "SELECT t.startname, s.snext, stops+1, concat(paths, '->', s.sline, s.snext) "
				+ "FROM transfer t "
				+ "JOIN biejing_subway s "
				+ "ON (t.stopname = s.sname AND instr(paths, s.snext)=0) "
				+ ") "
				+ "SELECT * "
				+ "FROM transfer "
				+ "WHERE stopname = '"+stopname+"';";
		Statement stmt= conn.createStatement();
		ResultSet find=stmt.executeQuery(sql);
		int s=0;
		while(find.next()) {
			anllrole[s]=new String();
			anllrole[s]=find.getString(4);
			temp[s]=find.getInt(3);
			s++;
		}
		
		find.close();
		stmt.close();
		conn.close();
		

		
		for(int j=0;anllrole[j]!=null;j++) {
			int change=0;
			char station='#';
			 roles=anllrole[j].toCharArray();
			 int lengths=roles.length;
			
			 
			 for(int k=0;k<lengths-1;k++) {
				 System.out.print(roles[k]);
				 if(k==0)station=roles[0];
				 if(roles[k]=='>') {
					 if(!(roles[k+1]==station)) {
						 change=change+1;
						 station=roles[k+1];
					 }
				 }
			 }
			 if(change<number) {
				 location=j;
				 number=change;
			 }
			 
		}
		
		
		return location;
	}
	
	
	 public int findstationsatrole(String roles) throws Exception {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/kebiao", "root", "123456");
			roles=roles+"ºÅÏß";
			String sql="SELECT  sname FROM biejing_subway"
					+ " WHERE sline='"+roles+"';";
			Statement stmt= conn.createStatement();
			ResultSet find=stmt.executeQuery(sql);
			int stationsnumber=-1;
			while(find.next()) {
				stationsnumber++;
				onrolestation[stationsnumber]=new String();
				onrolestation[stationsnumber]=find.getString(1);
				
			}
			
			find.close();
			stmt.close();
			conn.close();
			
		 return stationsnumber;
	 }
	
	 public int findrolesatstation(String stations) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/kebiao", "root", "123456");
			String sql="SELECT  sline FROM biejing_subway"
					+ " WHERE sname='"+stations+"';";
			Statement stmt= conn.createStatement();
			ResultSet find=stmt.executeQuery(sql);
			int rolesnumber=-1,zhuanhuan=0;
		while(find.next()) {
			if(zhuanhuan%2==0) {
			rolesnumber++;	
			onstationatroles[rolesnumber]=new String();
			onstationatroles[rolesnumber]=find.getString(1);

			}
						 System.out.print(rolesnumber);
			zhuanhuan++;
		}
			
		find.close();
		stmt.close();
		conn.close();
		 return rolesnumber;
	 }
	


	 
	 

}
