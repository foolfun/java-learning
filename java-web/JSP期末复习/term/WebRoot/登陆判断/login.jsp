<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>

<html>
  <head>
    <title>����ҳ��</title>
  </head>
  
  <body> 
<h1>��ӭ��������ҳ��</h1>
   <form action="" method="post" > 
	�û�����<input type="text" name="username"/><p></p>
  	��&nbsp;&nbsp;&nbsp;&nbsp;�룺<input type="password" name="pwd"/>
  	<input type="submit" name="����"/>
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
