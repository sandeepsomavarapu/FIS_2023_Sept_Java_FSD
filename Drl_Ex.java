package com.fis.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Drl_Ex {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// loading the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		// creating the connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/fisglobal", "root", "rpsconsulting");
		// creating the statement,preparedStatement,CallableStatement
		Statement stmt = conn.createStatement();
		// execute the query ddl--execute(), dml--executeUpdate() drl-->executeQuery()
			
		ResultSet result=stmt.executeQuery("select * from emps");
		
		while(result.next())
		{
			System.out.println(result.getInt(1)+" "+result.getString("ename"));
		}
		
		// close the connection
		conn.close();
	
	}
}
