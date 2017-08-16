<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>跳转到教师查询的成绩页面</title>
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
        </style>
    </head>
    <body>
    	<div id="div1">
    		<div id="div2" >
    			
    			请选择班级：<input type="text" id="paperName"/><br />
    			请选择试卷名：<br />
    			
    			<a href="checkExamResult.jsp">进入成绩查询页面</a>
    		</div>
    	</div>
 	</body>
</html>