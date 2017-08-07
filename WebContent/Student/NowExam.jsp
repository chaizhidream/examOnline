<%@ page language="java" 
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>现在的考试</title>
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
	 				<!--获取将来考试信息的集合 -->
	 				<tr>
	 				  <c:forEach items="${sessionScope.PaperNow } var="pn">
	 				  <td>${pn.Id }</td>
	 				  <td>${pn.Starttime }</td>
	 				  <td>${pn.Endtime }</td>
	 				  <td>${pn.Papername }</td>
	 				  </c:forEach>
	 				</tr>
	 			</table>
	 		</div>
</body>
</html>