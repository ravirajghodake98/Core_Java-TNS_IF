package com.cg.dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbURL = "jdbc:mysql://localhost:3306/capgemini";
		String dbUsername = "root";
		String dbPassword = "Asha@1998";
		try
		{
			Connection c = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
			//to retrieve a data
			String query = "SELECT * FROM EMPLOYEE";
			Statement s = c.createStatement();
			//to print output in particular format
			ResultSet r = s.executeQuery(query);
//			int count = 0;
			while(r.next())
			{
				int id = r.getInt(1);
				String name = r.getString(2);
				String email = r.getString(3);
				String password = r.getString(4);
				
				String output = "User: %d %s %s %s";
				System.out.println(String.format(output, id, name, email, password));
			}
			c.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}
