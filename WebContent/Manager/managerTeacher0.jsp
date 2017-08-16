<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>跳转到添加教师页面</title>
    <style type="text/css">
        	#div1{
        		border: 1px ghostwhite solid;
        		width: 400px;
        		height: 200px;
        		margin: 0 auto;
        		margin-top: 100px;
        	}
        	#div2{
        		margin-top: 50px;
        		margin-left: 20px;
        		line-height: 30px;
        	}
        	#div1 select{
        		width: 100px;
        		height: 30px;
        	}
        	a{
        		text-decoration: none;
        		margin-top: 10px;
        		margin: 0 auto;
        	}
        	.j{
        		margin-left: 90px;
        		margin-top: 40px;
        		
        	}
        </style>
    </head>
    <body>
    	<div id="div1">
    		<div id="div2" >
    			<!--../后加AddUser的webxml中的路径-->
    			<form name=form1 method="post" action="../AddUser" >
    		         请输入添加的用户名 &nbsp;  ：<input type="text" name="username"/><br />
    			              请输入添加的教师姓名：<input type="text" name="name"/><br />
    			              请选择添加的教师性别：<input type="text" name="sex"/><br />
    			
    			<input id="su" class="j" type="submit" value="添加" />
    			</form>
    		</div>
    	</div>
 	</body>
</html>