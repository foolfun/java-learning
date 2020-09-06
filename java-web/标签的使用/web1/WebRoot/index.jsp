<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>

<html>
  <head> 
    <title>素数</title>
  </head>
  
  <body>
  <form action="index.jsp" method="get">
       请输入一位整数：<input type="text" name="num"/>
     <input type="submit" value="提交"/>
  </form>
	<% 
  		String num = request.getParameter("num");
  		if(num!=null&&num.equals("")!= true){
  			try{
	  		    int n = Integer.parseInt(num);	
		  		int i;
		  		if(n==1|| n==0){%>判断结果为：既不是素数也不是非素数<%}
		  		else{
		  		for(i=2;i<n;i++){
		  			if(n%i==0)break;
		  		}
		  		if(i==n){
		  		%>判断结果为：素数<%
		  		}else{
		  		%>判断结果为：非素数<%
		  		}
		  		}
  			}catch(Exception e){
  				throw new Exception("输入有误");
  			}
  		}
  	%>
  </body>
</html>
