<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>

<html>
  <head>
    <title>���ҳ��</title>
  </head>
  
  <body>
  
  <table align="center" width="40%" cellspacing="0" border="1" >
	<tr  align="center">
  	<td>���</td>
  	<td>��ʾ</td>
  	<td>���</td>
  	</tr>
  	<%!
  		 long fun(int n){
  		 	int s=1;
  		 	for(int i=n;i>0;i--){
  		 		s=s*i;
  		 	}
  		 	return s;
  		 }
  	
  	 %>
  <%
  		String number = request.getParameter("num");
  		if(number!=null || number.equals("")==false){
	  		int n = Integer.parseInt(number);
	  		for(int i=n;i>0;i--){
	  			%><tr align="center">
			  	<td><%=n-i+1 %></td>
			  	<td><%=i %>�Ľ׳���</td>
			  	<td><%=fun(i) %></td>
			  	</tr>
	  			<%  		
	  			}
	  		}
   %>
   </table>
  </body>
</html>
