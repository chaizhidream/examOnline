<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>管理员发布公共页面</title>
		<link rel="stylesheet" type="text/css" href="../css/managerRelease.css"/>
		<script type="text/javascript" src="../js/managerRelease.js"></script>
	</head>
	<body>
		<div class="header">
			<p>在线考试系统</p>
		</div>
		<!--第二部分-->
		<div id="naver">
			<P class="pl">当前位置：公告页面</P>
			<p class="pr">欢迎XXXX登录</p>
			<div class="clear"></div>
		</div>
		<!--第三部分-->
		<div id="main">
			
			<table class="tab1">
				<tr>
					<td class="td1">
						<input type="checkbox" name="actionSelects" value="" />
					</td>
					<td>
						<a href="">公告1标题</a>
					</td>
				</tr>
			</table>
			
			<table class="tab1">
				<tr>
					<td class="td1">
						<input type="checkbox" name="actionSelects" value="" />
					</td>
					<td>
						<a href="">公告2标题</a>
					</td>
				</tr>
			</table>
		</div>
		<!--选项功能-->
		<div id="checked">
			<table id="tab2">
				<tr>
					<td>
						<input type="checkbox" name="" id="allSelect" value="" onclick="check()"/>全选
					</td>
					<td>
						<button id="del" onclick="deleted()">删除</button>
					</td>
					<td>
						<a href="adminAdd.jsp">新建</a>	
					</td>
				</tr>
			</table>
		</div>
		<div id="">
			<iframe src="managerAdd.jsp" width="" height=""></iframe>
		</div>
		
		
		
		<div id="footer">
            <div class="copyright">Copyright © 1996-2017. All Rights Reserved. 版权所有</div>
        </div>
	</body>
</html>
