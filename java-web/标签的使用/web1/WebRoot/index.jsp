<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>

<html>
  <head> 
    <title>����</title>
  </head>
  
  <body>
  <form action="index.jsp" method="get">
       ������һλ������<input type="text" name="num"/>
     <input type="submit" value="�ύ"/>
  </form>
	<% 
  		String num = request.getParameter("num");
  		if(num!=null&&num.equals("")!= true){
  			try{
	  		    int n = Integer.parseInt(num);	
		  		int i;
		  		if(n==1|| n==0){%>�жϽ��Ϊ���Ȳ�������Ҳ���Ƿ�����<%}
		  		else{
		  		for(i=2;i<n;i++){
		  			if(n%i==0)break;
		  		}
		  		if(i==n){
		  		%>�жϽ��Ϊ������<%
		  		}else{
		  		%>�жϽ��Ϊ��������<%
		  		}
		  		}
  			}catch(Exception e){
  				throw new Exception("��������");
  			}
  		}
  	%>
  </body>
</html>
