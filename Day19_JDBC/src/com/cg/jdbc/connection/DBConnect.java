package com.cg.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect {
	//if your username, password, URL is incorrect, then it will throw the SQLException
	public static void main (String[] args) throws SQLException
	{
		String dbDriver = "com.mysql.cj.jdbc.Driver";
		//To connect eclipse with mysql server
		String dbURL = "jdbc:mysql://localhost:3306/capgemini";
		String dbUsername = "root";
		String dbPassword = "Asha@1998";
		String query = "SELECT * FROM STUDENTS";
		// if any exception will occur in driver class, that will be handle by using catch block
		//if driver class name is incorrect, then it will throw an exception
		try
		{
			Class.forName(dbDriver);
		}
		catch(ClassNotFoundException e)
		{
			//not compulsory but it will show us that particular line where we will get the error
			//we can use system.out.println() but it will only give ClassNotFoundException
			e.printStackTrace();	
		}
		try
		{
			//connection class will make the connection between mysql workbench and eclipse
			Connection c = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
			
			//statement will execute all your sql query that's why it is used
			//createStatement is used bcoz it will create the statement and fetch all the data from sql
			Statement s = c.createStatement();
			ResultSet r = s.executeQuery(query);
			
			//next() will execute the next method; will check if the table has next row and if it's true, then it will be executed
			while(r.next())
			{
				String data = "";
				
				//for loop belongs to column
				for (int i=1; i<=2; i++)
				{
					data = data + " " + r.getString(i);
				}
				System.out.println(data);
			}
		}
		catch(SQLException e)
		{
			System.out.println("Invalid URL/ID/PASSWORD");
			e.printStackTrace();
		}
	}
}