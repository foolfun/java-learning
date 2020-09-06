<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>

<html>
  <head>
    <title>判断用户名是否为空</title>
    <script type="text/javascript">
    	function check1(){
    		var username = document.form1.username.value;
    		if(username==null || username==""){
    			alert("请填写用户名1！"); 
    			return false; 		
    		}
    	}
        function check2(){
    		var username = document.getElementsByName("name")[0].value;
    		if(username==null || username==""){
    			alert("请填写用户名2！"); 
    			return false; 		
    		}
    	}
    	function check3(){
    		var username = document.getElementById("uname").value;
    		if(username==null || username==""){
    			alert("请填写用户名3！"); 
    			return false; 		
    		}
    	}
    
    
    
    
    </script>
  </head>
  
  <body> 
 	 <form action="" method="get" name="form1" onSubmit="return check1()">
	  	用户名1：<input type="text" name="username" />
	  	<input type="submit" value="submit"/>
  	</form>
  	
  	  用户名2：<input type="text" name="name" />
	<input type="button" value="button" onclick="return check2()"/>
	<p></p>
	<form action="" method="get" onSubmit="return check3()">
	  	用户名3：<input type="text" id="uname" />
	  	<input type="submit" value="submit"/>
  	</form>
  </body>
</html>
