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
	 				<tr>
	 					<th>考试号</th>
	 					<th>开始时间</th>
	 					<th>结束时间</th>
	 					<th>试卷名</th>
	 					<th>操作</th>
	 				</tr>
	 				<!--获取将来考试信息的集合 -->
	 				<c:forEach items="${sessionScope.paperNow }" var="pn">
	 				<tr>
	 				  <td>${pn.id }</td>
	 				  <td>${pn.starttime }</td>
	 				  <td>${pn.endtime }</td>
	 				  <td>${pn.papername }</a></td>
	 				  <td><a href=" ">加入考试</a><td>
	 				  </c:forEach>
	 				</tr>
	 			</table>
	 		</div>
 	</body>
</html>