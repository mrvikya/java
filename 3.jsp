<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<h1>Conert number to words</h1>
	<form method="post" action=3.jsp">
		enter a number"<input type="text" name="number">
		<input type="submit" value="Convert">
	</form>
	<%-- Retrive the input number from the request --%>
	<% 
		String numberstr=request.getParameter("number");
		if(numberstr !=null && !number.isEmpty()){
			String[] words={"zero","one","two","three","four","five","six","seven","eight","nine"};
			int number=Integer.parseInt(numberstr);
			String numberinwords="";
			while(number>0){
			int digit=number%10;
			numberinwords=words[digit}+""+numberinwords;
			number=number/10;
		}
	%>
	<p>number: <%= numberstr%></p>
	<p style="color:red;">Number in Words: <%= numberinwords.trim() %></p>
	<% } <%>
