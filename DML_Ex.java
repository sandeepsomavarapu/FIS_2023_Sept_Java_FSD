package com.fis.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DML_Ex {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// loading the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		// creating the connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/fisglobal", "root", "rpsconsulting");
		// creating the statement,preparedStatement,CallableStatement
		Statement stmt = conn.createStatement();
		// execute the query ddl--execute(), dml--executeUpdate() drl-->executeQuery()
		//int result = stmt.executeUpdate("insert into emps values(123,'suresh')");
//		int result = stmt.executeUpdate("update emps set ename='sandeep'");
		int result = stmt.executeUpdate("delete from emps");
		// close the connection
		conn.close();
		System.out.println(result + "rows deleted ");
	}

}
