<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
  <head>
    <title>全局消息显示页面</title>
	${message1}
		${message2}
  </head>
  
  <body>
 <script type="text/javascript">
  Window.onload = function (){
	  alert(${message1});
	  alert(${message2});
  } 
  alert(${message1});
  alert(${message2});
</script>

  </body>
</html>
