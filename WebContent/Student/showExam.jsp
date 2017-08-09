<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
		<meta charset="UTF-8">
		<title></title>
		<link rel="stylesheet" href="../css/showExam.css" />
	</head>
	<body>
	 <div class="header">
	 	<p>在线考试系统</p>
	 </div>
	 <div class="naver">
	 	<table class="t1">
	 				<tr style=" height: 40px;">
	 					<td width="200px"><center><a href="beforeExam.jsp" target="if"><p class="t11">已结束的考试</p></center></a></td>
	 					<td width="200px"><center><a href="nowExam.jsp" target="if"><p class="t11">正在进行的考试</p></a></center></td>
	 					<td width="200px"><center><a href="afterExam.jsp" target="if"><p class="t11">即将进行的考试</p></center></a></td>
	 				</tr>
	 			</table>
	 </div>
	 <div class="content">
	 	<div class="main">
	 			<iframe src="beforeExam.jsp" width="100%" height="400px"  frameborder="0" scrolling="no" name="if"></iframe>
	 		</div>
	 	</div>
	 <div class="footer">
	 	<div class="copyright">Copyright © 1996-2017. All Rights Reserved. 版权所有</div>
	 </div>
 	</body>
</html>