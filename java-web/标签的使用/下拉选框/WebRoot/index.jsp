<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<script>
 function check(){
 	document.f1.action=document.f1.school.value;
 	document.f1.submit();
 }
</script>
<html>
  <head>
    <title>��ҳ</title>
  </head>
  
  <body align="center">
    <form  method="post" name="f1"> 
        <select name="school" onchange="check()">
          <option value="0" checked>��ѡ��ѧУ</option>
          <option value="http://www.baidu.com">#</option>
        </select>
    </form>
  </body>
</html>
