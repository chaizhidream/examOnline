<%@ page language="java" 
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
	 				<c:forEach var="pf" items="${sessionScope.PaperAfter }">
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