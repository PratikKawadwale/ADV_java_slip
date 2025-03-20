<%--1. Write a JSP program to display the details of Patient (PNo, PName, Address, age, 
disease) in tabular form on browser --%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <%
   try{
	   Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pratik","root","1234");
       Statement smt=con.createStatement();
	   ResultSet rs=smt.executeQuery("select * from patient");
	 %>
	 <table border="1">
	   <tr>
	      <th>Pno</th>
	      <th>Pname</th>
	      <th>Address</th>
	      <th>Age</th>
	      <th>disease</th>
	   </tr>
	   <% while(rs.next()){%>
	   <tr>
	      <td><%=rs.getInt(1)%> </td>
	      <td><%=rs.getString(2)%></td>
	      <td><%=rs.getString(3)%></td>
	      <td><%=rs.getInt(4)%></td>
	      <td><%=rs.getString(5)%></td>
	   </tr>
	   <%} %>
	 </table>
	 
	 <%
   }catch(Exception e)
   {
	   System.out.println(e);
   }
   
   %>
</body>
</html>