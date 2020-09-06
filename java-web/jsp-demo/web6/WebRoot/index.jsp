<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>

<html>
  <head>
    
    <title>登陆页面</title>

  </head>
  
  <body>
  <%!
  		int num=0;
  		synchronized void fun(){
  			num++;
  		}
   %>
  <%
 	//session.setAttribute("name",null);
  	if(session.isNew()==false){
  		session.removeAttribute("name");
  		//session.invalidate();
  	}else{
  	 	fun();
  	 }
   %>
          您是第 <%=num %>位访问的用户
 <form action="first.jsp" method="get">
   用户名：<input type="text" name="name"/><p>
   密&nbsp;码：<input type="password" name="pwd"/><p>
   <input type="submit" value="登陆"/>
    <input type="reset" value="重置"/>
 </form>
  </body>
</html>
