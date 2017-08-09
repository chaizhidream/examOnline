<%@ page language="java" contentType="text/html" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://www.atg.com/taglibs/json" prefix="json"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
    				<span>请选择你要测试的知识点类型：</span>
    				<select name="">
    					<option value=""></option>
    				</select><br />
    				<span>请输入试卷名称：</span>
    				<input type="text" value=""id="" /><br />
    				<a href="selfTest.jsp">提交</a>
    		</div>
    	</div>
 	</body>
</html>