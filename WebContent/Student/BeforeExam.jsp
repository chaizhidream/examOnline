<%@ page language="java" 
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>过去的考试</title>
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
	 				<!--获取后台 过去的考试信息-->
	 				 <c:forEach var="pb" items="${sessionScope.PaperBefore }">
	 				<tr>
	 				  <td>${pb.Id }</td>
	 				  <td>${pb.Starttime }</td>
	 				  <td>${pb.Endtime }</td>
	 				  <td>${pb.Papername }</td>
	 				</tr>
	 				</c:forEach>
	 			</table>
	 		</div>
</body>
</html>