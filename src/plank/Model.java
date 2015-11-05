package plank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import java.util.ArrayList;
import java.util.List;




import plank.Constants;
import plank.JDBCHelper;
import plank.ContactBean;

public class Model {
	
	 SessionIdentifierGenerator sb=new SessionIdentifierGenerator();
	 
	public String id=sb.nextSessionId();
			
		

	
	 
	public String addContact(ContactBean rb)
	{
		System.out.println("Inside model contacts() "+rb);
		System.out.println("call validate()");
		String msg=rb.validate();
		
		
		
		
		
		System.out.println("Result of validation "+msg);
		if(msg.equals(Constants.SUCCESS))
		{
		System.out.println("Validation is Successed");
		Connection con=null;
		PreparedStatement ps_ins=null,ps_sel=null;
		ResultSet rs=null;
		try
		{
			con=JDBCHelper.getConnection();
			if(con==null)
				return "No DB Connection..Please Connect";
			    else
			    {
			    	ps_ins=con.prepareStatement("insert into Survey3(name,q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,id)values(?,?,?,?,?,?,?,?,?,?,?,?)");
			    	ps_ins.setString(1,rb.getName());
			    	ps_ins.setString(2,rb.getQ1());
			    	ps_ins.setString(3,rb.getQ2());
			    	ps_ins.setString(4,rb.getQ3());
			    	ps_ins.setString(5,rb.getQ4());
			    	ps_ins.setString(6,rb.getQ5());
			    	ps_ins.setString(7,rb.getQ6());
			    	ps_ins.setString(8,rb.getQ7());
			    	ps_ins.setString(9,rb.getQ8());
			    	ps_ins.setString(10,rb.getQ9());
			    	ps_ins.setString(11,rb.getQ10());
			    	
			    	ps_ins.setString(12,id);
			    	
			    	ps_ins.execute();
			    	
			    	System.out.println(id);
			    	
			    	return Constants.SUCCESS;
			    }
			}
			
		
		catch(SQLException e)
		{
			e.printStackTrace();
		    return "Something Bad happened"+e.getMessage();
		}
		finally
		  {
			JDBCHelper.close(rs);
			JDBCHelper.close(ps_sel);
			JDBCHelper.close(ps_ins);
			JDBCHelper.close(con);
		  }
		}
		else
		
		return msg;
	}
	
}
