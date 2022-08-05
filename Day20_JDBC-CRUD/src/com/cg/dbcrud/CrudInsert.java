package com.cg.dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudInsert {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String dbURL = "jdbc:mysql://localhost:3306/capgemini";
		String dbUsername = "root";
		String dbPassword = "Asha@1998";
		try
		{
			Connection c = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
			//to insert a rows
			String query = "INSERT INTO EMPLOYEE (ID, NAME, EMAIL_ID, PASSWORD) VALUES(?,?,?,?)";
			//it will fetch your query and it will be compiled
			PreparedStatement p = c.prepareStatement(query);
//			p.setInt(1, 121);
//			p.setString(2, "John");
//			p.setString(3, "John@gmail.com");
//			p.setString(4, "John@123");
			p.setInt(1, 111);
			p.setString(2, "Neha");
			p.setString(3, "neha@gmail.com");
			p.setString(4, "neha@123");
			int r = p.executeUpdate();
			//if row>0 means at least some rows are there
			if(r>0)
			{
				System.out.println("New user is inserted successfully");
			}
			c.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}
