// Exp No 11
// write the data into table...
// JTable : inbuilt class used to print the output into window mode.

import java.sql.*;

class write_data
{
	Connection con;
	PreparedStatement ps;
					
	write_data(String u,String p)
	{
		try
		{
		//Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/CSE_SPL","root","password");
		String uname="amit";
		ps = con.prepareStatement("insert into login values(?,?)");
		//ps.setString(1,"amit");
		ps.setString(1,u);
		ps.setString(2,p);	

	int x = ps.executeUpdate();

		if(x>0)
			System.out.println("Record Inserted .");
		else
			System.out.println("Not inserted");
				
		}
		catch(Exception e)
		{
		System.out.println(e);
		}
	}
	public static void main(String args[])
	{
		new write_data(args[0],args[1]);
	}
}
		
	
