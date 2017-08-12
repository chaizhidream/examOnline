<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>出选择题</title>
        <link rel="stylesheet" type="text/css" href="css/createPaper.css"/>
    </head>
    <body>
    	<!--选择题-->
		<table id="tab1">
			
			<tr >
				<td colspan="2" id="xz">一、选择题(请在以下选择题中选择10道)</td>
			</tr>
			<c:forEach items="${}" var="">
			<tr>
				<td colspan="2" id="xztitle">
					<input type="checkbox" name="" id="" value="" />&nbsp;&nbsp;1.题目
					<input type="hidden" name="xzt" id="xzt" value="1" />
				</td>
			</tr>
			<tr>
				<td class="xzchoose">
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;A
				</td>
				<td class="xzcon">
					选项A内容
				</td>
			</tr>
			<tr>
				<td>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;B
				</td>
				<td>选项B内容</td>
			</tr>
			<tr>
				<td>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;C
				</td>
				<td>选项C内容</td>
			</tr>
			<tr>
				<td>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;D
				</td>
				<td>选项D内容</td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: right;">
					正确答案：xxx
				</td>
			</tr>
			</c:forEach>
		</table>
 	</body>
</html>