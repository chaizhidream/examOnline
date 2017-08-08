
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
	 				 <c:forEach items="${sessionScope.PaperBefore }" var="pb">
	 				<tr>
	 				  <td>${pb.Id }</td>
	 				  <td>${pb.Starttime }</td>
	 				  <td>${pb.Endtime }</td>
	 				  <td>${pb.Papername }</td>
	 				</tr>
	 			</table>
	 		</div>
 	</body>
</html>