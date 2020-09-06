<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@page import="hbfu.jsp.bean.*" %> 
<html>
  <head>
    
    <title></title>

  </head>
  
  <body>

	用户：<%=request.getParameter("username") %>注册成功！！！
	<a href="search.jsp" ><input type="button" value="进入查询" /></a>
  </body>
</html>
