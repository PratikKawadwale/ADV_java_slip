<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form >
<input type="text" name="number" placeholder="Enter Number">
<input type="submit" value="Calculate">
</form>
    <%
      String no =request.getParameter("number");
      if(no!=null)
      {
    	  int n=Integer.parseInt(no);
    	  int last=n%10;
    	  while(n>=10)
    	  {
    		  n=n/10;
    	  }
    	  int first=n;
    	  int sum=first+last;
    	  out.println("<h1 style='color:red'>sum:"+sum+"</h1>");
      }
    %>
</body>
</html>