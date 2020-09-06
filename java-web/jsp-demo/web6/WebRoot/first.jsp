<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>

<html>
  <head>
    
    <title>第一个页面</title>

  </head>
  
  <body>
  	<% 
  		String name = request.getParameter("name");
  		if(name!=null&&!name.equals("")){
    		session.setAttribute("name",name);    
    	}
     %>
    欢迎：<%=session.getAttribute("name") %>登陆第一个页面！！！
    
     <a href="second.jsp" target="_blank"><input type="button" value="下一页" /></a>
     <a href="index.jsp" target="_blank"><input type="button" value="返回首页" /></a>
  </body>
</html>
