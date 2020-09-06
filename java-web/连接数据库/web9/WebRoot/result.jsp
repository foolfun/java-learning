<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@page import="hbfu.jsp.bean.*" %> 
<%@page import="hbfu.jsp.servlet.QueryUserServlet" %> 
<%@page import="java.sql.*" %> 

<html>
  <head>
    
    <title></title>

  </head>
  
  <body>
  <% 
  	ResultSet rs = (ResultSet)request.getAttribute("rs");
   %>
   <table>
   <% while(rs.next()){ %>
   		<tr>
   		<td><%=rs.getString("username") %></td>
   		<td><%=rs.getString("gender") %></td>
   		<td><%=rs.getString("age") %></td>
   		</tr>
   	<%}
    %>
   </table>
  </body>
</html>
