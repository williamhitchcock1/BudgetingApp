package dao;

import java.sql.*;

public class DBConnection {
//	public static void main(String[] args) {
//		String dbUrl = "jdbc:mysql://localhost:3306/users";
//		String user = "root";
//		String password = "";
//		
//		// establish the db connection
//		try {
//			Connection myConn = DriverManager.getConnection(dbUrl, user, password);
//			
//			// create a statement
//			Statement myStmt = myConn.createStatement();
//			
//			// execute the query
//			ResultSet rs = myStmt.executeQuery("select * from students");
//			
//			// process the resultSet object
//			while(rs.next()) {
//				System.out.println(rs.getString("username") + " " + rs.getString("password"));
//			}
//			
//			myStmt.close();
//			myConn.close();
//					
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//	}
	
	public static String findUser(String uname) {
		String dbUrl = "jdbc:mysql://localhost:3306/users";
		String user = "root";
		String password = "";
		String foundUser = "";
		
		// establish the db connection
		try {
			Connection myConn = DriverManager.getConnection(dbUrl, user, password);
			System.out.println("Connection successful");
			
			// create a statement
			Statement myStmt = myConn.createStatement();
			System.out.println("Statement created.");
			
			String usernameQuery="select username from students where username='" + uname + "';";
	        ResultSet rs=myStmt.executeQuery(usernameQuery);
	        foundUser = rs.getString(usernameQuery);
			
			myStmt.close();
			myConn.close();
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		return foundUser;
	}
	
	public static String findPassword(String pword) {
		String dbUrl = "jdbc:mysql://localhost:3306/users";
		String user = "root";
		String password = "";
		String foundPassword = "";
		
		// establish the db connection
		try {
			Connection myConn = DriverManager.getConnection(dbUrl, user, password);
			
			// create a statement
			Statement myStmt = myConn.createStatement();
			
			
	        String passwordQuery="select password from students where password='" + pword + "';";
	        ResultSet rs=myStmt.executeQuery(passwordQuery);
	        foundPassword = rs.getString(passwordQuery);
			
			myStmt.close();
			myConn.close();
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		return foundPassword;
	}
}
