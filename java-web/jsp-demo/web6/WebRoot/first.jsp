<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>

<html>
  <head>
    
    <title>��һ��ҳ��</title>

  </head>
  
  <body>
  	<% 
  		String name = request.getParameter("name");
  		if(name!=null&&!name.equals("")){
    		session.setAttribute("name",name);    
    	}
     %>
    ��ӭ��<%=session.getAttribute("name") %>��½��һ��ҳ�棡����
    
     <a href="second.jsp" target="_blank"><input type="button" value="��һҳ" /></a>
     <a href="index.jsp" target="_blank"><input type="button" value="������ҳ" /></a>
  </body>
</html>
