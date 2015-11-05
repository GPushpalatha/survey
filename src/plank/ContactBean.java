package plank;

import java.io.Serializable;


public class ContactBean implements Serializable 
{
	private String name,q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,id;
	
	
	
	
	public ContactBean(){
		System.out.println("no args constr");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Inside setname"+name);
	}
	
	
	
	
	public String getQ1() {
		return q1;
	}

	public void setQ1(String q1) {
		this.q1 = q1;
		System.out.println("Inside setname"+q1);
	}
	
	public String getQ2() {
		return q2;
	}

	public void setQ2(String q2) {
		this.q2 = q2;
		System.out.println("Inside setname"+q2);
	}
	
	public String getQ3() {
		return q3;
	}

	public void setQ3(String q3) {
		this.q3 = q3;
		System.out.println("Inside setname"+q3);
	}
	
	public String getQ4() {
		return q4;
	}

	public void setQ4(String q4) {
		this.q4 = q4;
		System.out.println("Inside setname"+q4);
	}
	
	public String getQ5() {
		return q5;
	}

	public void setQ5(String q5) {
		this.q5 = q5;
		System.out.println("Inside setname"+q5);
	}
	
	public String getQ6() {
		return q6;
	}

	public void setQ6(String q6) {
		this.q6 = q6;
		System.out.println("Inside setname"+q6);
	}
	
	public String getQ7() {
		return q7;
	}

	public void setQ7(String q7) {
		this.q7 = q7;
		System.out.println("Inside setname"+q7);
	}
	
	public String getQ8() {
		return q8;
	}

	public void setQ8(String q8) {
		this.q8 = q8;
		System.out.println("Inside setname"+q8);
	}
	
	
	public String getQ9() {
		return q9;
	}

	public void setQ9(String q9) {
		this.q9 = q9;
		System.out.println("Inside setname"+q1);
	}
	
	public String getQ10() {
		return q10;
	}

	public void setQ10(String q10) {
		this.q10 = q10;
		System.out.println("Inside setname"+q10);
	}
	

	

	@Override
	public String toString() {
		return "ContactBean [name=" + name +  "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((q1 == null) ? 0 : q1.hashCode());
		result = prime * result + ((q2 == null) ? 0 : q2.hashCode());
		result = prime * result + ((q3 == null) ? 0 : q3.hashCode());
		result = prime * result + ((q4 == null) ? 0 : q4.hashCode());
		result = prime * result + ((q5 == null) ? 0 : q5.hashCode());
		result = prime * result + ((q6 == null) ? 0 : q6.hashCode());
		result = prime * result + ((q7 == null) ? 0 : q7.hashCode());
		result = prime * result + ((q8 == null) ? 0 : q8.hashCode());
		result = prime * result + ((q9 == null) ? 0 : q9.hashCode());
		result = prime * result + ((q10 == null) ? 0 : q10.hashCode());
		
		
		return result;
	}

	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContactBean other = (ContactBean) obj;
		
		
		if (q1 == null) {
			if (other.q1 != null)
				return false;
		} else if (!q1.equals(other.q1))
			return false;
		
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
		
		
		
		
	}
	public String validate()
	{
		System.out.println("Bean->validate");
		String msg="";
		StringBuilder sb=new StringBuilder();
		if(name==null||name.trim().equals(""))
		sb.append("Name has not been entered");
		
		if(q1==null||q1.trim().equals(""))
			sb.append("Question1 has not been Answered");
		
		if(q2==null||q2.trim().equals(""))
			sb.append("Question2 has not been Answered");
		
		if(q3==null||q3.trim().equals(""))
			sb.append("Question3 has not been Answered");
		
		if(q4==null||q4.trim().equals(""))
			sb.append("Question4 has not been Answered");
		
		if(q5==null||q5.trim().equals(""))
			sb.append("Question5 has not been Answered");
		
		if(q6==null||q6.trim().equals(""))
			sb.append("Question6 has not been Answered");
		
		if(q7==null||q7.trim().equals(""))
			sb.append("Question7 has not been Answered");
		
		if(q8==null||q8.trim().equals(""))
			sb.append("Question8 has not been Answered");
		
		if(q9==null||q9.trim().equals(""))
			sb.append("Question9 has not been Answered");
		
		if(q10==null||q10.trim().equals(""))
			sb.append("Question10 has not been Answered");
		
		
			
		
		msg=sb.toString();
		if(msg.equals(""))
			return Constants.SUCCESS;
		else
			return msg;
	}
}
