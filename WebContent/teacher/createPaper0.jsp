<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>进入出卷页面前的跳转页面</title>
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
        	/*td{
        		border: 1px red solid;
        	}*/
        	.td1{
        		text-align: right;
        	}
        	.td2{
        		width: 190px;
        		height: 30px;
        	}
        </style>
    </head>
    <body>
    	<div id="div1">
    		<div id="div2" >
    			<table>
    			<tr>
    				<td class="td1">请输入试卷名称:</td>
    				<td >
    					<input type="text" id="paperName" class="td2"/>
    				</td>
    			</tr>
    			<tr>
    				<td class="td1">请选择试卷开始时间：</td>
    				<td >
    					<input type="date" id="startTime"class="td2"/>
    				</td>
    			</tr>
    			<tr>
    				<td class="td1">请选择试卷结束时间：</td>
    				<td >
    					<input type="date" id="endTime"class="td2"/>
    				</td>
    			</tr>
    			<tr>
    				<td colspan="2" style="text-align: center;">
    					<a href="createPaper.jsp">进入出卷界面</a>
    				</td>
    			</tr>
    			</table>
    		</div>
    	</div>
 	</body>
</html>