<%@ page language="java" 
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css">
        	.tt{
        		
        		margin: 0 auto;
        		margin-top: 40px;
        	}
        </style>
    </head>
    <body>
    	<div>
	 			<table class="tt">
	 				<!--获取后台 将来的考试信息-->
	 				<tr>
	 					<th>考试号</th>
	 					<th>开始时间</th>
	 					<th>结束时间</th>
	 					<th>试卷名</th>
	 					<th>操作</th>
	 				</tr>
	 				<c:forEach items="${sessionScope.paperAfter }" var="pf">
	 				<tr>
	 				  <td>${pf.id }</td>
	 				  <td>${pf.starttime }</td>
	 				  <td>${pf.endtime }</td>
	 				  <td>${pf.papername }</td>
	 				</tr>
	 				</c:forEach>
	 			</table>
	 		</div>
 	</body>
</html>