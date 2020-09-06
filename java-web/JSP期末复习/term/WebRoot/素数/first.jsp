<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>

<html>
  <head>
    <title>判断是否为素数</title>
  </head>
  
  <body>
  <form action="first.jsp" method="post">
   请输入一个整数：<input type="text" name="number" />
   <input type="submit" value="submit" />
   </form>
   <%
  		String num = request.getParameter("number"); 
  		if(num==null || num.equals("")==true){
	  		%>提示：请输入一个整数<%
  		}else{
  			int n = Integer.parseInt(num);
		  		if(n<=1){%>提示：<%=n %>既不是素数也不是也不是非素数<%}
	  			else{
	  				int i;
	  				for(i=2;i<n;i++){
	  					if(n%i==0){break;}
	  				}
	  				if(i==n){%>提示：<%=n %>是素数<%}
	  				else{%>提示：<%=n %>非素数<%}
	  			}
  			}
    %>
  </body>
</html>
