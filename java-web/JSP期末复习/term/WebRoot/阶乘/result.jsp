<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>

<html>
  <head>
    <title>结果页面</title>
  </head>
  
  <body>
  
  <table align="center" width="40%" cellspacing="0" border="1" >
	<tr  align="center">
  	<td>序号</td>
  	<td>显示</td>
  	<td>结果</td>
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
			  	<td><%=i %>的阶乘是</td>
			  	<td><%=fun(i) %></td>
			  	</tr>
	  			<%  		
	  			}
	  		}
   %>
   </table>
  </body>
</html>
