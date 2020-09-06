<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>

<html>
  <head>
    <title>注册页面</title>
    <script type="text/javascript">
    	function check(){
    		var username = document.myf.username.value;
    		if(username == null || username==""){
    			alert("用户名不能为空");
    			return false;
    		}
    		var pwd1 = document.myf.pwd1.value;
    		if(pwd1 == null || pwd1==""){
    			alert("密码不能为空");
    			return false;
    		}
    		var pwd2 = document.myf.pwd2.value;
    		if(pwd2 == null || pwd2==""){
    			alert("确认密码不能为空");
    			return false;
    		}
    		if(pwd1 != pwd2){
    			alert("两次密码不一致，请重新输入");
    			return false;
    		}
    	
    	}
    </script>
  </head>
  
  <body>
   <h1>欢迎来到注册页面</h1><hr><h5>请将以下信息填写完整</h5>
   <form  method="post" name="myf" onsubmit="return check()" >
   	用&nbsp;&nbsp;户&nbsp;&nbsp;名：<input type="text" name="username"/><p></p>
  	密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码：<input type="password" name="pwd1"/><p></p>
  	确认密码：<input type="password" name="pwd2"/><p></p>
  	<input type="submit" name="注册"/>
   </form>
  </body>
</html>
