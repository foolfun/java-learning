<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>

<html>
  <head>
    <title>�ж��û����Ƿ�Ϊ��</title>
    <script type="text/javascript">
    	function check1(){
    		var username = document.form1.username.value;
    		if(username==null || username==""){
    			alert("����д�û���1��"); 
    			return false; 		
    		}
    	}
        function check2(){
    		var username = document.getElementsByName("name")[0].value;
    		if(username==null || username==""){
    			alert("����д�û���2��"); 
    			return false; 		
    		}
    	}
    	function check3(){
    		var username = document.getElementById("uname").value;
    		if(username==null || username==""){
    			alert("����д�û���3��"); 
    			return false; 		
    		}
    	}
    
    
    
    
    </script>
  </head>
  
  <body> 
 	 <form action="" method="get" name="form1" onSubmit="return check1()">
	  	�û���1��<input type="text" name="username" />
	  	<input type="submit" value="submit"/>
  	</form>
  	
  	  �û���2��<input type="text" name="name" />
	<input type="button" value="button" onclick="return check2()"/>
	<p></p>
	<form action="" method="get" onSubmit="return check3()">
	  	�û���3��<input type="text" id="uname" />
	  	<input type="submit" value="submit"/>
  	</form>
  </body>
</html>
