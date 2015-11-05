package plank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCHelper 
{
	public static void close(Statement s)
	{
		try
		{
			if(s!=null)
				s.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public static void close(ResultSet r)
	{
		try
		{
			if(r!=null)
				r.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public static void close(Connection c)
	{
		try
		{
			if(c!=null)
				c.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public static Connection getConnection()
	{
		try
		{
			Class.forName(Constants.DRIVER);
			Connection con=DriverManager.getConnection(Constants.URL,Constants.UID,Constants.PWD);
			System.out.println("Connection Established"+con);
			return con;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
}
