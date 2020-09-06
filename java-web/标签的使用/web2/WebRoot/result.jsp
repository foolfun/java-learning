<%@ page language="java" import="java.util.*" pageEncoding="gbk"
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>结果页面</title>
  </head>
  
  <body align="center">
 	<% String name = request.getParameter("name"); %>
 	<h2> 欢迎：<%=name %>!登陆成功！！！！！</h2>
   	<a href="index.jsp"><input type="button" value="返回"/></a>
  </body>
</html>
