<%@ page language="java" 
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
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
	 				<tr>
	 					<th>考试号</th>
	 					<th>开始时间</th>
	 					<th>结束时间</th>
	 					<th>试卷名</th>
	 					<th>操作</th>
	 				</tr>
	 				<!--获取后台 过去的考试信息-->
	 				 <c:forEach items="${sessionScope.paperBefore }" var="pb">
	 				<tr>
	 				  <td>${pb.id }</td>
	 				  <td>${pb.starttime }</td>
	 				  <td>${pb.endtime }</td>
	 				  <td>${pb.papername }</td>
	 				</tr>
	 				</c:forEach>
	 			</table>
	 		</div>
 	</body>
</html>