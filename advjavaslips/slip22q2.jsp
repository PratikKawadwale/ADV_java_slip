<%--2. Write a JSP program which accepts UserName in a TextBox and greets the user 
according to the time on server machine.  --%>
<%@ page import="java.util.Calendar" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <form action="slip22q2.jsp">
     <input type="text" placeholder="Enter name" name="name">
     <input type="submit" value="greet">
  </form>
  
  <%
     Calendar c=Calendar.getInstance();
     String name=request.getParameter("name");
     int hours=Calendar.HOUR_OF_DAY;
     String greet="";
     if(hours>=5 && hours<=12)
     {
    	 greet="Good Morning";
     }
     else if(hours >=12 && hours<=18)
     {
    	 greet="Good afternoon";
     }
     else 
     {
    	 greet="Good evining";
     }
     out.println("<h1>"+greet+""+name+"</h1>");
  %>
</body>
</html>