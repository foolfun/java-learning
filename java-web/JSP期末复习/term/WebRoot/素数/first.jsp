<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>

<html>
  <head>
    <title>�ж��Ƿ�Ϊ����</title>
  </head>
  
  <body>
  <form action="first.jsp" method="post">
   ������һ��������<input type="text" name="number" />
   <input type="submit" value="submit" />
   </form>
   <%
  		String num = request.getParameter("number"); 
  		if(num==null || num.equals("")==true){
	  		%>��ʾ��������һ������<%
  		}else{
  			int n = Integer.parseInt(num);
		  		if(n<=1){%>��ʾ��<%=n %>�Ȳ�������Ҳ����Ҳ���Ƿ�����<%}
	  			else{
	  				int i;
	  				for(i=2;i<n;i++){
	  					if(n%i==0){break;}
	  				}
	  				if(i==n){%>��ʾ��<%=n %>������<%}
	  				else{%>��ʾ��<%=n %>������<%}
	  			}
  			}
    %>
  </body>
</html>
