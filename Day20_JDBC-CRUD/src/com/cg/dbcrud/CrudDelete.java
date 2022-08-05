package com.cg.dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbURL = "jdbc:mysql://localhost:3306/capgemini";
		String dbUsername = "root";
		String dbPassword = "Asha@1998";
		try
		{
			Connection c = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
			String query = "DELETE FROM EMPLOYEE WHERE ID=?";
			//it will fetch your query and it will be compiled
			PreparedStatement p = c.prepareStatement(query);
			p.setInt(1, 111);
			int r = p.executeUpdate();
			//if row>0 means at least some rows are there
			if(r>0)
			{
				System.out.println("New user is deleted successfully");
			}
			c.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}
