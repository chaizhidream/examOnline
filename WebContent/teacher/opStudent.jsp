<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@page contentType="text/html"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>教师增删学生</title>
        <link rel="stylesheet" href="css/opStudent.css" />
    </head>
    <body>
    	<div class="header">
    		<a href="index.jsp"><p>在线考试系统</p></a>
    	</div>
    	<div class="main">
    		<form name="form1" method="post" action="../DeleteUser">
    		<table class="m01">
    			<tr>
    				<td><p class="js">学生信息</p></td>
    			</tr>
    		</table>
    		<hr />
    		<table class="t" border="1px solid black">
    			<tr>
    			  <th>学生id</th>
    			  <th>用户名</th>
    			  <th>姓名</th>
    			  <th>性别</th>
    			  <th>电话</th>
    			  <th>邮箱</th>
    			  <th>操作</th>
    			</tr>
    			<c:forEach items="${sessionScope.studentlist}" var="u">
    			<tr>
    				<td>${u.id}</td>
    				<td>${u.username}</td>
    				<td>${u.name}</td>
    				<td>${u.sex}</td>
    				<td>${u.telephone}</td>
    				<td>${u.email}</td>
    				<td>
    					
    				<center>&nbsp;<button class="b" id="b2">删除</button>&nbsp;
    		            </center>
    		            
    				</td>    				
    			</tr>
    			</c:forEach>
    		</table>
    		</form>
    		</div>
    	
    	<div class="footer">
    		<div class="copyright">Copyright © 1996-2017. All Rights Reserved.  版权所有    冀ICP备16013410号</div>
    	</div>

    		
 	</body>
</html>