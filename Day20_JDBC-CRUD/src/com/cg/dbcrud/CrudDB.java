package com.cg.dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CrudDB {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String dbURL = "jdbc:mysql://localhost:3306/capgemini";
		String dbUsername = "root";
		String dbPassword = "Asha@1998";
		try
		{
			//to check if eclipse is connected with mysql or not	
			Connection c = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
			if(c!=null)
			{
				System.out.println("Connection is Established");
				//once connection is established, we need to close it
				c.close();
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}
