<%-- 2.Write a JSP program to check whether a given number is prime or not. Display the result 
in red color --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
   .my{
   color:red;
   }
</style>
</head>
<body>
 <form action="slip8q2.jsp">
  <input type="text" placeholder="Enter number" name="num">
  <input type="submit" value="check">
 </form>
 <%
    String no=request.getParameter("num");
 	if(no!=null)
 	{
 		int n=Integer.parseInt(no);
 		int f=0;
 		for(int i=2;i<n;i++)
 		{
 			if(n%1==0)
 			{
 				f=1;
 				break;
 			}
 		}
 		if(f==0)
 		   out.println("<h1 class='my'>Number is prime</h1>");
 		else
 			out.println("<h1 class='my'>Number is Not prime</h1>");
 	}
 %>
</body>
</html>