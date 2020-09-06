<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>

<html>
  <head>
    
    <title>第二个页面</title>

  </head>
  
  <body>
    欢迎：<%=session.getAttribute("name")  %>登陆第二个页面！！！
     <a href="three.jsp" target="_blank"><input type="button" value="下一页" /></a>
      <a href="first.jsp" target="_blank"><input type="button" value="上一页" /></a>
     <a href="index.jsp" target="_blank"><input type="button" value="返回首页" /></a>
  </body>
</html>
