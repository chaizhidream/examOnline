<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
  <head>
    <title>全局消息显示页面</title>
	   
		${message2}
  </head>
  
  <body>
 <script type="text/javascript">
  window.onload = function (){
	  alert("${message1}");
  } 
</script>

  </body>
</html>
