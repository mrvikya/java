<%@page import="java.sql.*,java.util.*"%>
	<h2>Patient Details</h2>
	<table border="1">
		<tr>
			<th>Patient Numbr</th>
			<th>Name</th>
			<th>Address</th>
			<th>Age</th>
			<th>Disease</th>
		</tr>
		<%
		try{
			class.forName("org.postgesql.Driver");
			Connection c=DriverManager.getConnection("jdbc:postgressql"//localhost:5432/testdb","postgres","123");
			Statement st=c.createStatement();
			ResultSet rs=st.executeQuery("SELECT * FROM Patient");
			while(rs.next()){
			%>
			<tr>
				<td><%=rs.getInt(1) %></td>
				<td><%=rs.getString(2) %></td>
				<td><%=rs.getString(3) %></td>
				<td><%=rs.getInt(4) %></td>
				<td><%=rs.getString(5) %></td>
			</tr>
			<%
			}
			rs.close();
			st.close();
			c.close();
			}
			catch(Exception e){
			e.printStackTrace();
		}
		%>
		</table>
