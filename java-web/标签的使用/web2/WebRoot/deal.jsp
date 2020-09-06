<%@ page language="java" import="java.util.*" pageEncoding="gbk" %>

<html>
  <head>
    <title>¥¶¿Ì“≥√Ê</title>
  </head>
  
  <body>
  	<%
  		String username = request.getParameter("username");
  		String pwd = request.getParameter("pwd");
  		if(username.equals("lucy")&&pwd.equals("123456")){
  			%><jsp:forward page="result.jsp">
  				<jsp:param value="<%=username %>" name="name"/>
  			 </jsp:forward><%
  		}else{
  		  %><jsp:forward page="fail.jsp"></jsp:forward> <%
  		}
  	 %>
  </body>
</html>
