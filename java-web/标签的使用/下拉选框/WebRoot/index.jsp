<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<script>
 function check(){
 	document.f1.action=document.f1.school.value;
 	document.f1.submit();
 }
</script>
<html>
  <head>
    <title>首页</title>
  </head>
  
  <body align="center">
    <form  method="post" name="f1"> 
        <select name="school" onchange="check()">
          <option value="0" checked>请选择学校</option>
          <option value="http://www.baidu.com">#</option>
        </select>
    </form>
  </body>
</html>
