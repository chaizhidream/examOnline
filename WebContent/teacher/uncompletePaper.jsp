<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>未批阅试卷</title>
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
	 					<th>学生名</th>
	 					<th>操作</th>
	 				</tr>
	 				<!--获取未批阅试卷的集合 -->
	 				<c:forEach items="${sessionScope.listno }" var="ln">
	 				<tr>
	 				  <td width="500px"><center>${ln. username}</center></td>
	 				  <!--进入未批阅的试卷的页面，根据选中的试卷试卷名查询数据库
    					链接值为servlet中未批阅试卷的文件名-->
	 				  <td width="300px">
	 				  	<center>
	 				  	<a href="../CorrectPaper?papername=${ln.papername}&studentname=${ln.username}" target="top">进入</a>
	 				  	</center>
	 				  	<td>	
	 				  	<input type="hidden" value="-1" />
	 				</tr>
	 				</c:forEach>
	 			</table>
	 		</div>
 	</body>
</html>