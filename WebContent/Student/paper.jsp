<%@ page language="java" contentType="text/html" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>考试查询页面</title>
       <link rel="stylesheet" href="../css/showexam.css" />
    </head>
    <body>
    	<div class="header">
	 	<p>在线考试系统</p>
	 </div>
	 <div class="naver">
	 	<table class="t1">
	 				<tr style=" height: 40px;">
	 				<td width="200px">
	 					<center>
	 					<a href="BeforExam.jsp" target="if">
	 					    <p class="t11">已结束的考试</p>
	 					 </a>
	 					 </center>
	 				</td>
	 				<td width="200px">
	 				      <center>
	 				  <a href="NowExam.jsp" target="if">
	 				        <p class="t11">正在进行的考试</p>
	 				        </a>
	 				      </center>
	 				 </td>
	 					<td width="200px">
	 					<center>
	 					<a href="AfterExam.jsp" target="if">
	 					<p class="t11">即将进行的考试</p>
	 					</a>
	 					</center>
	 					</td>
	 				</tr>
	 			</table>
	 </div>
	 <div class="content">
	 	<div class="main">
	 			<iframe src="PastExam.jsp" width="100%" height="400px"  frameborder="0" scrolling="no" name="if"></iframe>
	 		</div>
	 	</div>
	 <div class="footer">
	 	<div class="copyright">Copyright © 1996-2017. All Rights Reserved. 版权所有</div>
	 </div>
 	</body>

</body>
</html>