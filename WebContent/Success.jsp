<%@ page import="java.sql.*" %>
 <%@ page import="plank.*"%>

<html>
<body>
<h1>Successful!</h1>
<b>
<%
Model m=new Model();
String n=request.getParameter("name");
//String id=Model.id;
if(n==null||n.equals(""))
	out.println("error");
else
	out.println("Thank you "+n+" \t \t  your unique id is \t \t ");
	


Connection con=null;
PreparedStatement ps_ins=null,ps_sel=null;
ResultSet rs1=null;
con=JDBCHelper.getConnection();
%>
</b>
<b><font color="purple" > <font size="5">
<% 
if(con==null)
	 out.println("No DB Connection..Please Connect");
else
{
Statement stmt=null;

	stmt=con.createStatement();
	String sql="select id from survey3 where sno=(select max (sno)from survey3) ";
	ResultSet rs=stmt.executeQuery(sql);
	while (rs.next()){
		
		String id=rs.getString("id");
		out.println(id);
	}
	
    rs.close();
}



%>
</font> </font> </b>
<b>

<br/><br/><a href="HomePage.jsp">Go Back to Home</a>
</b>
</body>
</html>