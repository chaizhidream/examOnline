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
     		border-color: gainsboro;
     	}
     </style>
    </head>
    <body>
    	<div>   		  
	 			<table class="tt" border="1px solid" cellspacing="0">
	 				<tr>
	 					<th>考试号</th>
	 					<th>开始时间</th>
	 					<th>结束时间</th>
	 					<th>试卷名</th>
	 				</tr>
	 				<!--获取后台 过去的考试信息-->
	 				<%int a=1;%>
	 				 <c:forEach items="${PaperBefore}" var="pb">
	 				<tr>
	 				
	 				  <td><%out.println(a++ +". ");%>${pb.id }</td>
	 				  <td>${pb.starttime }</td>
	 				  <td>${pb.endtime}</td>
	 				  <td>${pb.papername}</td>
	 				</tr>
	 				</c:forEach>
	 			</table>
	 		</div>
 	</body>
</html>