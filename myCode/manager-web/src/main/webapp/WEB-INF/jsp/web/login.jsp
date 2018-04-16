<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="mm" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎登陆XX在线考试系统</title>
<script type="text/javascript"></script>
<link rel="stylesheet" href="../css/login.css" type="text/css">
</head>
<body>
	<div id="background"
		style="position: absolute; z-index: -1; width: 100%; height: 100%; top: 0px; left: 0px;">
		<img src="../img/login.png" width="100%" height="100%" />
	</div>
	<div class="wrap">
		<form action="/manager-web/home/login" method="post">
			<div class="loginForm">
				<h1>用户登录</h1>
				<div style="color: #fc6c38; text-align: center; display: block;">
					${requestScope.msg}</div>
				<div class="loginForm_content">
					<fieldset>
						<div class="inputWrap">
							<input type="text" id="username" name="username"
								placeholder="学生学号" autofocus required>
						</div>
						<div class="inputWrap">
							<input type="password" id="password" name="password"
								placeholder="请输入密码" required>
						</div>
					</fieldset>
					<fieldset>
						<input type="submit" value="登录"> &nbsp;&nbsp;&nbsp; <span
							style="color: #797979">如忘记密码请联系教务处</span>
					</fieldset>
				</div>
			</div>
		</form>
	</div>
</body>
</html>