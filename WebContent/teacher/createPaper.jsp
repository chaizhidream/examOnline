<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>教师出卷</title>
        <link rel="stylesheet" type="text/css" href="css/createPaper.css"/>
    </head>
    <div class="header">
		<a href="index.jsp"><p>在线考试系统</p></a>
	</div>
	<!--nave开始-->
	<div id="nave">
		<table>
			<tr id="tr1">
				<!--这里需要添加js事件-->
				<td class="td1">
					<a href="createPaperXz.jsp" target="if">选择题</a>
				</td>
				<td class="td1">
					<a href="createPaperTk.jsp" target="if">填空题</a>
				</td>
				<td class="td1">
					<a href="createPaperBc.jsp" target="if">编程题</a>
				</td>
			</tr>
		</table>
	</div>
	<!--nave结束-->
	
	<!--main开始-->
	<div id="main">
		<form action="" method="post">
		<iframe src="createPaperXz.jsp" width="100%" height="100%"
			frameborder="0" scrolling="no" name="if"></iframe>
		<!--确认出卷-->
		<table id="tab4">
			<tr>
				<td style="width: 770px; text-align: center;"></td>
				<td style="width: 100px; text-align: center;">
					<input type="submit" value="确认出卷" style=""/>
				</td>
			</tr>
		</table>
		</form>
	</div>
	<!--main结束-->
	
	
	<div id="footer">
        <div class="copyright">Copyright © 1996-2017. All Rights Reserved.  版权所有    冀ICP备16013410号</div>
    </div>
    <div class="top">
		<a href="#" title="返回顶部"><img src="../images/top.png"></a>
	</div>
 	</body>
</html>