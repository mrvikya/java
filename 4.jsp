<%@ page import="java.util.*"%>
<% 
	String name=request.getParameter("uname");
	Date d=new Date();
	if(d.getHours()<12)
	{
%>
Good Morning<%+name%>
<%
	}
	else if(d.getHours()<16)
	{
%>
good Afternoon <%=name%>
<%
	}
	else
	{
%>
Good Evening<%=name%>
<%
	}
%>
