
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>管理员管理教师</title>
        <link rel="stylesheet" href="../css/mangeteacher.css" />
        <script type="text/javascript" src="../js/manageteacher.js" ></script>
    </head>
    <body>
    	<div class="header">
    		<p>在线考试系统</p>
    	</div>
    	<div class="main">
    		<p>教师信息</p>
    		<hr />
    		<table class="t" border="1px solid black">
    			<tr>
    			  <th>教师id</th>
    			  <th>用户名</th>
    			  <th>姓名</th>
    			  <th>性别</th>
    			  <th>电话</th>
    			  <th>邮箱</th>
    			  <th>操作</th>
    			</tr>
    			<tr>
    			<c:forEach items="${sessionScope.}" var="t">
    				<td>${t.Id}</td>
    				<td>${t.Teachername}</td>
    				<td>${t.Name}</td>
    				<td>${t.Sex}</td>
    				<td>${t.Telephone}</td>
    				<td>${t.Email}</td>
    				<td>
    					<form>
    				<center>&nbsp;<button class="b" id="b2">删除</button>&nbsp;
    		            <button class="b" id="b1">添加</button>&nbsp;
    		            </center>
    		            </form>
    				</td>
    				</c:forEach>
    			</tr>
    		</table>
    		
    		
    	<!--<div class="m1">
    		共有:${sessionScope.paging.totalPage }页,
            <c:forEach begin="1" end="${sessionScope.paging.totalPage}" 
            step="1" var="pnum">
            <a href="../paging?reqNum=${pnum }">${pnum }</a>
            </c:forEach>
            <br/>
            <a href="../paging?reqNum=${sessionScope.paging.previous }">上一页</a>
            <a href="../paging?reqNum=${sessionScope.paging.next }">下一页</a>
    		
    	</div>	
    	</div>
    	<div class="footer">
    		<div class="copyright">Copyright © 1996-2017. All Rights Reserved. 版权所有</div>
    	</div>
-->	
   </body>
</html>