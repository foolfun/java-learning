<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>

<html>
  <head>
    <title>�����</title>
  </head>
  
  <body>
  	<%!
  		 long fun(int n1,int n2){
  		 	int temp;
  		 	if(n1<n2){
  		 		temp = n1;
  		 		n1 = n2;
  		 		n2 = temp;
  		 	}
  		 	int a = n1;
  		 	int b = n2;
			while(b!=0){
				temp = a%b;
				a = b;
				b = temp;
			}
  		 	return a;
  		 }
  	
  	 %>
  <%
  		String num1 =request.getParameter("num1");
  		String num2 = request.getParameter("num2");
  		int n1 = Integer.parseInt(num1);
  		int n2 = Integer.parseInt(num2);
  		long a = fun(n1,n2);
   %>
   ����<%=num1%>,&nbsp;&nbsp;<%=num2%> �����Լ��Ϊ��<%=a %><p></p>
   ����<%=num1%>,&nbsp;&nbsp;<%=num2%>����С������Ϊ��<%=n1*n2/a %>
  </body>
</html>
