<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>

<html>
  <head>
    <title>登入页面</title>
  </head>
  
  <body> 
<h1>欢迎来到登入页面</h1>
   <form action="" method="post" > 
	用户名：<input type="text" name="username"/><p></p>
  	密&nbsp;&nbsp;&nbsp;&nbsp;码：<input type="password" name="pwd"/>
  	<input type="submit" name="登入"/>
   </form>
     <%
     	String username = request.getParameter("username");
     	String pwd = request.getParameter("pwd");
     	if(username != null && pwd != null && username.equals("")==false && pwd.equals("")==false){
	     	if(username.equals("admin") && pwd.equals("123456")){
	     	%>
	     	  <jsp:forward page="success.jsp">
	     	   <jsp:param value="<%=username %>" name="username"/>
	     	  </jsp:forward>
	     	<%
	     	}else{
	     	%>
	     	  <jsp:forward page="error.jsp"></jsp:forward>
	     	<%     	
     		}
     	}
      %>
  </body>
</html>
