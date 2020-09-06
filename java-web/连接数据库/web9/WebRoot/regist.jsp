<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<html>
  <head>
    
    <title>用户注册</title>

  </head>
  
  <body align="center">
  <h1>用户注册</h1>
  <form action="adduser" name="user" method="post" >
  <table align="center" width="20%" cellspacing="5px">
	<tr>
	<td>姓名：</td>
	<td><input type="text" name="username"/></td>
	</tr>
	<tr>
	<td>性别：</td>
	<td><input type="text" name="gender"/></td>
	</tr>
	<tr>
	<td>年龄：</td>
	<td><input type="text" name="age"/></td>
	</tr>
	<tr>
	<td>出生日期：</td>
	<td><input type="text" name="birth"/></td>
	</tr>
	<tr>
	<td>密码：</td>
	<td><input type="password" name="pwd"/></td>
	</tr>
	<tr>
	<td colspan="2" align="center"><input type="submit" value="提交"/></td>
	</tr>
	</table>
	</form>
  </body>
</html>
