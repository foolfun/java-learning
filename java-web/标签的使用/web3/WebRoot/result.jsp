<%@ page language="java" import="java.util.*" pageEncoding="gbk" errorPage="error.jsp"%>
<html>
  <head>
    <title>���ҳ��</title>
  </head>   
  <body>
  <center>
  	<table border="1" cellspacing=0 width=25%>
  		<tr align="center">
	  		<td>���</td>
	  		<td>��ʾ</td>
	  		<td>���</td>
  		</tr>
    <%!
   		long fun(int i)
        {
        int s=1;
        for(int k=1;k<=i;k++){
    	   s=s*k;
  		}
    	return s;
    	}
    %>
    <%
    String num=request.getParameter("number");
    if(num!=null && !num.equals("")){
    int n=Integer.parseInt(num);
     if(n%1==0){
     for(int i=n;i>0;i--){
  		%>
		    <tr align="center">
			  	<td><%=n-i+1 %></td>
			  	<td><%=i %>�Ľ׳�Ϊ</td>
			  	<td><%=fun(i) %></td>
		    </tr>
  		<%	
  			}
  		}
  	}
  	%>
     </table>
     <a href="index.jsp"><input type="button" value="����"/></a>
     </center>
  </body>
</html>
