<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>添加填空题</title>
        <style type="text/css">
        	#div1{
        		width: 840px;
        		height: 550px;
        		border: gainsboro 1px solid;
        	}
        	#tab1{
        		margin-left: 20px;
        		margin-top: 20px;
        		margin-right: 20px;
        		/*border: 1px black solid;*/
        		width: 800px;
        		height: 500px;
        	}
        	#tab1 td{
        		width: 100%;
        		height: 20px;
        	}
        	#tab1 .tkchoose{
        		margin-left: 20px;
        		/*width: 120px;*/
        		text-align: center;
        		/*border: 1px red solid;*/
        	}
        	#tktitle,#key{
        		width: 750px;
        		/*border: 1px red solid;*/
        		height: 50px;
        	}
        </style>
    </head>
    <body>
    	<div id="div1">
    		<form action="../InsertQuestion?questiontype=xztbatch" method="post"enctype="multipart/form-data">
    		<table id="tab1">
    			<tr>
    				<td colspan="2" style="text-align: center;">填空题</td>
    			</tr>
    			<tr>
    				<td class="tkchoose">题目</td>
    				<td >
    					<input type="text" value="" name="" id="tktitle" placeholder="请输入题目"/>	
    				</td>
    			</tr>
    			<tr>
    				<td class="tkchoose">答案</td>
    				<td><input type="text" value=""placeholder="请输入答案" id="key"/></td>
    			</tr>
    			<tr>
    				<td ></td>
    				<td  style="text-align: right;">
    					<input type="submit" value="提交" style="border: none;width: 100px;height: 30px;background-color: lightskyblue;"/>
    				</td>
    			</tr>	
    		</form>
    		</table>
    	</div>
 	</body>
</html>