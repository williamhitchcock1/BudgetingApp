package dao;

import java.sql.*;

public class DBConnection {
	public static void main(String[] args) {
		String dbUrl = "jdbc:mysql://localhost:3306/users";
		String user = "root";
		String password = "";
		
		// establish the db connection
		try {
			Connection myConn = DriverManager.getConnection(dbUrl, user, password);
			
			// create a statement
			Statement myStmt = myConn.createStatement();
			
			// execute the query
			ResultSet rs = myStmt.executeQuery("select * from students");
			
			// process the resultSet object
			while(rs.next()) {
				System.out.println(rs.getString("username") + " " + rs.getString("password"));
			}
			
			myStmt.close();
			myConn.close();
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
