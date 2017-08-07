<%@ page language="java" contentType="text/html; charset=ISO-8859-1"pageEncoding="UTF-8"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>试卷页</title>
<link rel="stylesheet" type="text/css" href="css/paper.css"/>
</head>
<body>
	<div class="header">
		<p>在线考试系统</p>
	</div>
	<!--nave开始-->
	<div id="nave">
		<table>
			<tr id="tr1">
				<td class="td1">考试开始时间</td>
				<td class="td1">考试结束时间</td>
				<td class="td1">倒计时</td>
			</tr>
		</table>
	</div>
	<!--nave结束-->
	
	<!--main开始-->
	<div id="main">
		<table id="tab1">
			
			<tr >
				<td colspan="2" id="xz">一、选择题</td>
			</tr>
			<tr>
				<td colspan="2" id="xz_title">
					1.题目
				</td>
			</tr>
			<tr>
				<td class="xz_choose">
					<input type="radio" value="" name="xz1"/>&nbsp;&nbsp;&nbsp;A
				</td>
				<td class="xz_con">
					选项A内容
				</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="" name="xz1"/>&nbsp;&nbsp;&nbsp;B
				</td>
				<td>选项B内容</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="" name="xz1"/>&nbsp;&nbsp;&nbsp;C
				</td>
				<td>选项C内容</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="" name="xz1"/>&nbsp;&nbsp;&nbsp;D
				</td>
				<td>选项D内容</td>
			</tr>
		</table>
	</div>
	
	
	
	<!--main结束-->
	
	
	<div id="footer">
        <div class="copyright">Copyright © 1996-2017. All Rights Reserved. 版权所有</div>
    </div>	
</body>
</html>