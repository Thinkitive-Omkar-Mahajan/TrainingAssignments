package com.thinkitive.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
			
			Statement st = con.createStatement();
			
			//st.execute("create table Employee (empId int, Name varchar(30))");
			//st.execute("insert into Employee values (2, 'Employee2')");
			//st.execute("insert into Employee values (3, 'Parth')");
			ResultSet results = st.executeQuery("SELECT * FROM Employee");
			
			while (results.next()) {
				  System.out.println(results.getInt("empId") + " " + results.getString("Name"));
			}
			
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
