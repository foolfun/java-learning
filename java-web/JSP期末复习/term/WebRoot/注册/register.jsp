<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>

<html>
  <head>
    <title>ע��ҳ��</title>
    <script type="text/javascript">
    	function check(){
    		var username = document.myf.username.value;
    		if(username == null || username==""){
    			alert("�û�������Ϊ��");
    			return false;
    		}
    		var pwd1 = document.myf.pwd1.value;
    		if(pwd1 == null || pwd1==""){
    			alert("���벻��Ϊ��");
    			return false;
    		}
    		var pwd2 = document.myf.pwd2.value;
    		if(pwd2 == null || pwd2==""){
    			alert("ȷ�����벻��Ϊ��");
    			return false;
    		}
    		if(pwd1 != pwd2){
    			alert("�������벻һ�£�����������");
    			return false;
    		}
    	
    	}
    </script>
  </head>
  
  <body>
   <h1>��ӭ����ע��ҳ��</h1><hr><h5>�뽫������Ϣ��д����</h5>
   <form  method="post" name="myf" onsubmit="return check()" >
   	��&nbsp;&nbsp;��&nbsp;&nbsp;����<input type="text" name="username"/><p></p>
  	��&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;�룺<input type="password" name="pwd1"/><p></p>
  	ȷ�����룺<input type="password" name="pwd2"/><p></p>
  	<input type="submit" name="ע��"/>
   </form>
  </body>
</html>
