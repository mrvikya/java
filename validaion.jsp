<%@ page language="java"%>
<% 
	String username=request.getParaameter("uname");
	String password=request..getParameter("pass");
	if(username.equals(passsword))
		responce.sendRedirect("success.html");
	else
		responce.sendRedirect("errorr.html");
%>
