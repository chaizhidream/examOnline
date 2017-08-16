<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>自测中间跳转页</title>
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
    		<div id="div2">
    			<table>
    				<tr>
    					<td>
    						<span>请选择你要测试的知识点类型：</span>
    					</td>
    					<td>
    						<select name="">
    						<option value="">C++</option>
    						<option value="">Java</option>
    						</select>
    					</td>
    				</tr>
    				<tr>
    					<td colspan="2" style="text-align: center;">
    						<a href="../SelfTest">提交</a>
    					</td>
    				</tr>
    			</table>
    				
    		</div>
    	</div>
 	</body>
</html>