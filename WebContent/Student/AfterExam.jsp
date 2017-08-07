<%@ page language="java" 
    pageEncoding="utf-8"%>
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
	 				<c:forEach items="${sessionScope.PaperAfter } var="pf">
	 				<tr>
	 				  <td>${pf. }</td>
	 				  <td>${pf.Starttime }</td>
	 				  <td>${pf.Endtime }</td>
	 				  <td>${pf.Papername }</td>
	 				</tr>
	 				</c:forEach>
	 			</table>
	 		</div>
</body>
</html>