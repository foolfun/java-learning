<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>

<html>
  <head>
    
    <title>��½ҳ��</title>

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
          ���ǵ� <%=num %>λ���ʵ��û�
 <form action="first.jsp" method="get">
   �û�����<input type="text" name="name"/><p>
   ��&nbsp;�룺<input type="password" name="pwd"/><p>
   <input type="submit" value="��½"/>
    <input type="reset" value="����"/>
 </form>
  </body>
</html>
