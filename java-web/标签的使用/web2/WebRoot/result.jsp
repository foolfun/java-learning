<%@ page language="java" import="java.util.*" pageEncoding="gbk"
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>���ҳ��</title>
  </head>
  
  <body align="center">
 	<% String name = request.getParameter("name"); %>
 	<h2> ��ӭ��<%=name %>!��½�ɹ�����������</h2>
   	<a href="index.jsp"><input type="button" value="����"/></a>
  </body>
</html>
