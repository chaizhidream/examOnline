<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>已批阅试卷</title>
        <style type="text/css">
      	.tt{
      		margin: 0 auto;
      		margin-top: 40px;
      		margin-left: 40px;
      	}
      	.tt a{
      		text-decoration: none;
      	}
      </style>
    </head>
      
    <body>
    	<div>
	 			<table class="tt" border="1px solid black">
	 				<tr>
	 					<th><center>学生名</center></th>
	 					<th>操作</th>
	 				</tr>
	 				<!--获取已批阅的集合 -->
	 				<c:forEach items="${sessionScope.listyes }" var="ly">
	 				<tr>
	 				  <td width="500px"><center>${ly.username }</center></td>
	 				  <!--进入选中的已批阅试卷的页面，根据选中的试卷试卷名查询数据库
    					链接值为后台存储学生上传的答案的文件-->
	 				  <td width="300px"><center>
	 				  	<a href="../CorrectPaper?papername=${pn.papername}&username=${pn.username}" target="top">进入</a>
	 				  	</center><td>
	 				  	
	 				</tr>
	 				<input type="hidden" value="1" />
	 				</c:forEach>
	 			</table>
	 		</div>
 	</body>
</html>