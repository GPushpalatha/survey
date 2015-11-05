<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<H1><CENTER> Pwerwall Survey Form</CENTER></H1>
	<hr/>
  
	<P>
		The purpose of the survey would be stated here at the top of the
		survey. This survey should take less than 10 minutes to complete.
  	</P> <br> <br>
  	<hr/>
  
  	<H3>
  		<P>The following series of question are type "Yes or No", Multiple Choice and Open-ended questions.
  		</p>
  	</H3>
  
  
  <form action="AddContactInt.jsp" method="post">
		Enter Name: <input type="text" name="name"/><br/><br/>
		
		<TABLE BORDER>
    		<!-- fIRST QUESTION -->
        	<TR ALIGN=CENTER>
            	<TD  ALIGN=LEFT>
                		1.  Where/how did you hear about the Tesla PowerWall?
            	</TD>
        	</TR>
        	<TR>
            	<TD class="B" >
                	<TEXTAREA NAME="q1" ROWS="4"  COLS="50" palceholder="enter your text here" >  </TEXTAREA>
            	</TD>
            </TR>
            
            <!-- SECOND QUESTION -->
    
    		<TR ALIGN=CENTER>
        		<TD  ALIGN=LEFT>
              		 2.  What is your current power backup setup?
        		</TD>
        	</TR>
        	<TR>
            	<TD class="B"> 
            		<INPUT TYPE="RADIO" NAME="q2" VALUE="Generator">Generator<br>
               		<INPUT TYPE="RADIO" NAME="q2" VALUE="Battery">Battery<br>
               		<INPUT TYPE="RADIO" NAME="q2" VALUE="Other">Other
               	</TD>
        	</TR>
    
			<!-- THIRD QUESTION -->

			<TR ALIGN=CENTER>
				<TD  ALIGN=LEFT>
    				3.  What would be the main reason for you to purchase a powerwall?
    			</TD>
    		</TR>
   			<TR>
   				<TD class="B" >
   					<input type="checkbox" name="q3" value="Net Zero Energy Rating">Net Zero Energy Rating<br>
    				<input type="checkbox" name="q3" value="Save on Power Bills">Save on Power Bills<br>
    				<input type="checkbox" name="q3" value="Monitor power usage">Monitor power usage
    			</TD>
    		</TR>

			<!-- FOURTH QUESTION -->
    		<TR ALIGN=CENTER>
        		<TD  ALIGN=LEFT>
          			 4.   What is the most appealing factor of the powerwall?
          		</TD>
          	</TR>
    		<TR>
    			<TD class="B" >
    				<TEXTAREA NAME="q4" ROWS="4"  COLS="50">
					</TEXTAREA>
				</TD>
			</TR>

    		<!-- fIVTH QUESTION -->
    		<TR ALIGN=CENTER>
        		<TD  ALIGN=LEFT>
           			5.   What do you feel are the limitations of the powerwall??
           		</TD>
           	</TR>
    		<TR>
    			<TD class="B" >
	    				<TEXTAREA NAME="q5" ROWS="4"  COLS="50">
						</TEXTAREA>
				</TD>
			</TR>
			
			<!-- SIXTH QUESTION -->

			<TR ALIGN=CENTER>
        		<TD  ALIGN=LEFT>
          			 6.  Do you think the powerwall is affordable? ($3000 exclusive of solar panels and inverter)
          		</TD>
          	</TR>
    		<TR>
    			<TD class="B" >
    				<INPUT TYPE="RADIO" NAME="q6" VALUE="Yes">Yes<br>
        			<INPUT TYPE="RADIO" NAME="q6" VALUE="No">No
        		</TD>
        	</TR>

    
    		<!-- SEVENTH QUESTION -->
    		
    		<TR ALIGN=CENTER>
        		<TD  ALIGN=LEFT>
           			 7.  How conscious/aware are you of your power consumption?
           		</TD>
           	</TR>
       		<TR>
       			 <TD class="B" >
       			 	<INPUT TYPE="RADIO" NAME="q7" VALUE="Very">Very<br>
        			<INPUT TYPE="RADIO" NAME="q7" VALUE="Aware enough">Aware enough<br>
        			<INPUT TYPE="RADIO" NAME="q7" VALUE="No clue">No clue
        		</TD>
        	</TR>

    		<!-- EIGTH QUESTION -->
    		<TR ALIGN=CENTER>
        		<TD  ALIGN=LEFT>
           			 8.  Would you be interested in in-depth metrics and an overview of your power usage patterns?
           		</TD>
           	</TR>
    		<TR> 
    			<TD class="B" >
    				<INPUT TYPE="RADIO" NAME="q8" VALUE="Yes">Yes<br>
        			<INPUT TYPE="RADIO" NAME="q8" VALUE="Maybe">Maybe<br>
        			<INPUT TYPE="RADIO" NAME="q8" VALUE="Don't care">Don't care
        		</TD>
        	</TR>
    
    		<!-- NINTH QUESTION -->
    		<TR ALIGN=CENTER>
        		<TD  ALIGN=LEFT>
            		9.  Would you be interested in off the grid living?
            	</TD>
            </TR>
    		<TR> 
    			<TD class="B" >
    				<INPUT TYPE="RADIO" NAME="q9" VALUE="Yes">Yes<br>
    				<INPUT TYPE="RADIO" NAME="q9" VALUE="No">No
    			</TD>
        	</TR>

    		<!-- TENTH QUESTION -->
    		<TR ALIGN=CENTER>
        		<TD  ALIGN=LEFT>
            		10. Would you be interested in selling excess power, back to the grid?
            	</TD>
            </TR>
    		<TR> 
    			<TD class="B" >
    				<INPUT TYPE="RADIO" NAME="q10" VALUE="Yes">Yes<br>
    				<INPUT TYPE="RADIO" NAME="q10" VALUE="No">No
    			</TD>
			 </TR>

    	</TABLE>
    	<HR/>
    	
		<P>
			Thank you for taking the survey.  To submit the results, press the 
			<B>Send info</B> button below.
		</P>

    	
		
	
		<input type="submit" value="Submit"/>
		
	</form>
	<%
		if(request.getAttribute("errorMsg")!=null)
		{
			out.println("<h2>Error</h2>");
			out.println(request.getAttribute("errorMsg"));
		}
	
	%>
	
</body>
</html>