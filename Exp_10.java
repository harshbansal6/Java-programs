/*
Exp No . 10
To read the data from the database (mysql)
(JDBC)

Steps:

- To download mysql exe file and download mysql connector file.
- To install mysql and java on your pc.
- Path Setting of mysql.
	
- To Create database tables .
- To create java program to read/write/update data from the table.
	- To access the Driver.
	- To make the connection of java program with the mysql.
	- To give the query.
	- To contain the result.
=========================================================

- java.sql.*;
	(inbuilt interfaces)
	- Connection 
	- PreparedStatement 
	- ResultSet 
	
	(inbuilt classes)
	- DriverManager
=========================================================
*/

import java.sql.*;

class read_data
{
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	read_data()
	{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/CSE_Gen","root","password");

		ps=con.prepareStatement("select * from login");

		rs=ps.executeQuery();

		System.out.println("\nRead the table : login");

		System.out.println("Username\tPassword");
		System.out.println("------------------------------------");
		while(rs.next())
		{
			System.out.print(rs.getString(1));
			System.out.println("\t\t"+rs.getString(2));
		}
		}
		catch(Exception e)
		{
		
		}		
	}
	public static void main(String args[])
	{
			new read_data();
	}
}






















	
