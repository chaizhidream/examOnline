<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ page language="java"  import="java.util.*"%>
<%@ taglib uri="http://www.atg.com/taglibs/json" prefix="json"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>批量上传</title>
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
        		width: 30px;
        		height: 20px;
        	}
        	#tab1 .xz{
        		margin-left: 20px;
        		text-align: center;
        		/*border: 1px red solid;*/
        	}
        	.file{
        		width: 750px;
        		/*border: 1px red solid;*/
        		height: 50px;
        	}
        </style>
    </head>
    <body>
    	<div id="div1">
    	
    		
    		<table id="tab1">
    		<form action="../InsertQuestion?questiontype=xztbatch" method="post" enctype="multipart/form-data">
    			<tr>
    			
    				<td colspan="2" style="text-align: left;">请选择上传题型:(文件格式.xls)</td>
    			</tr>
    			<tr>
    				<td class="xz">选择题</td>
    				<td class="file">
    					<input type="file" value="" name="f1"  />
    					
    					<input type="hidden" value="xztbatch" name="msg" />
    					
    				</td>
    				<td  style="text-align: right;"> 
    					<input type="submit" value="提交" style="border: none;width: 100px;height: 30px;background-color: lightskyblue;"/>
    				</td>
    			</tr>
    			</form>
    				<form action="../InsertQuestion?questiontype=tktbatch" method="post" enctype="multipart/form-data">
    			<tr>
    				<td class="xz">填空题</td>
    				<td >
    					<input type="file" value="" name="f2" id="" />
    					<input type="hidden" value="tktbatch" name="msg" />	
    				</td>
    				<td  style="text-align: right;">
    					<input type="submit" value="提交" style="border: none;width: 100px;height: 30px;background-color: lightskyblue;"/>
    				</td>
    			</tr>
    			</form>
    				<form action="../InsertQuestion?questiontype=bctbatch" method="post" enctype="multipart/form-data">
    			<tr>
    				<td class="xz">编程题</td>
    				<td >
    					<input type="file" value="" name="f3" id="" />	
    					<input type="hidden" value="bctbatch" name="msg" />	
    				</td>
    			
    				<td  style="text-align: right;">
    					<input type="submit" value="提交" style="border: none;width: 100px;height: 30px;background-color: lightskyblue;"/>
    				</td>	
    				</tr>
    		</form>
    		</table>
    	
    	</div>
 	</body>
</html>