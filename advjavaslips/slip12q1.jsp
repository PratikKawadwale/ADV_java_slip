<%-- 1. Write a JSP program to check whether given number is Perfect or not. (Use Include 
directive) --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <form action="slip12q1.jsp">
    <input type="text" placeholder="Enter number" name="num">
    <input type="submit" value="check">
  </form>
  <%
    String no=request.getParameter("num");
    
    if(no!=null)
    {
    	int n=Integer.parseInt(no);
    	int sum=0;
    	for(int i=1;i<n;i++)
    	{
    		if(n%i==0)
    		{
    			sum=sum+i;
    		}
    	}
    	if(sum==n)
    	{
    		out.println("no is perfect");
    	}
    	else
    	{
    		out.println("no is not perfect");
    	}
    }
  %>
</body>
</html>