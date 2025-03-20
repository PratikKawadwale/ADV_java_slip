<%--1. Write a JSP program to accept Name and Age of Voter and check whether he is 
eligible for voting or not. --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="slip25q1.jsp">
<input type="text" name="name" placeholder="Enter Name of Voter"><br><br>
<input type="text" name="age" placeholder="Enter age of Voter"><br><br>
<input type="submit" value="check">
</form>
<%
  String name=request.getParameter("name");
		if(name!=null)
		{
			int age=Integer.parseInt(request.getParameter("age"));
			if(age>=18)
			{
				out.println("Eligible for voting");
			}
			else
			{
				out.println("not eligible");
			}
		}
%>
</body>
</html>