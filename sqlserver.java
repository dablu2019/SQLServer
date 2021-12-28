package jdbcproject;


import java.sql.*;

public class Sqlserver {
		

	public static void main(String[] args) {
		 // Create a variable for the connection string.
		try{  
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
	Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=master;user=sa;password=root");  
	 
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from Employee");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			con.close();  
			}
		catch(Exception e){ 
			System.out.println(e);
			
		}  
			}  
	}