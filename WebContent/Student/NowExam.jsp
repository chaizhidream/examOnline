
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
	 				<tr>
	 				 <c:forEach items="${sessionScope.PaperNow }" var="pn">
	 				  <td>${pn.Id }</td>
	 				  <td>${pn.Starttime }</td>
	 				  <td>${pn.Endtime }</td>
	 				  <td>${pn.Papername }</a></td>
	 				  <td><a href=" ">加入考试</a><td>
	 				  </c:forEach>
	 				</tr>
	 			</table>
	 		</div>
 	</body>
</html>