
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
	 				<c:forEach items="${sessionScope.PaperAfter }" var="pf">
	 				<tr>
	 				  <td>${pf.Id }</td>
	 				  <td>${pf.Starttime }</td>
	 				  <td>${pf.Endtime }</td>
	 				  <td>${pf.Papername }</td>
	 				</tr>
	 				</c:forEach>
	 			</table>
	 		</div>
 	</body>
</html>