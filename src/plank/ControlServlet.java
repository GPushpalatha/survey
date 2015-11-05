package plank;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import plank.Constants;
import plank.ContactBean;
import plank.Model;

/**
 * Servlet implementation class ControlServlet
 */
@WebServlet("/ControlServlet")
public class ControlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String email;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControlServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Inside doGet() of CS");
		process(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	

protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
{
	System.out.println("Inside process() of CS");
	RequestDispatcher rd=null;
	Model model=new Model();
		try
		{
		String uri = request.getRequestURI();
		System.out.println("process()->uri = "+uri);
		if(uri.contains("/openAddSurveyView"))
		{
			rd = request.getRequestDispatcher("AddContact.jsp");
			rd.forward(request, response);
		}
		if(uri.contains("/addContact"))
		{
			System.out.println("Inside contact if block");
			ContactBean rb=(ContactBean)request.getAttribute("reg");
			System.out.println("CS->Bean "+rb);
			
			String result = model.addContact(rb);
			System.out.println("CS->result from contact model = "+result);
		    if(result.equals(Constants.SUCCESS))
		    {
		    	System.out.println("CS forwarding to Success.jsp");
		    	rd=request.getRequestDispatcher("Success.jsp");
		    	rd.forward(request, response);
		    }
			else
			{
				System.out.println("CS forwarding to addcontact.jsp");
				request.setAttribute("errorMsg", result);
				rd=request.getRequestDispatcher("AddContact.jsp");
				rd.forward(request, response);
			}
		}
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
			request.setAttribute("errorMsg","Opps something bad happened"+e.getMessage());
			rd=request.getRequestDispatcher("Error.jsp");
			try 
			{
				rd.forward(request, response);
			}
			catch (ServletException e1) 
			{
				e1.printStackTrace();
			} 
			catch (IOException e1) 
			{
				e1.printStackTrace();
			}
		}
	}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
	System.out.println("Inside doPost() of CS");
	process(request,response);
	
}

}

