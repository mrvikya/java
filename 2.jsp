<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<h1>Calculate sum of first and last digit</h1>
	<form method="post" action ="2.jsp">
		enter the number:<input type="text" name="number">
		<input type="submit" value="Calculate">
	</form>
	<%-- Retrive the input number from the request --%>
	<%
		String numberstr=request.getParameter("number");
		if(number!=null && !number.isEmpty()){
			int number=Integer.parseInt(numberstr);
			int lastdigit=number%10;
			int firstdigit=0;
			while(number!=0){
				firstdigit=number%10;
				number/=10;
			}
			int sum=firstdigit+lastdigit;
		%>
		<p>Number:<%= numberstr %></p>
		<p>firstdigit:<%= firstdigit %></p>
		<p>last digit:<%= lastdigit %></p>
		<p style="color:red font-size:18px;" > sum of fisrt and last digit:<%= sum %></p>
		<%> } <%>
