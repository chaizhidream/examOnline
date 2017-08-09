<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
    <meta charset="utf-8" />
		<link rel="stylesheet" href="../css/StudengtSelf.css" />
		<title>个人中心</title>
	</head>
	<body class="b">

		<div class="naver">
			<p>在线考试系统</p>
		</div>
		<div class="content">
		<div class="main">
			<table class="m1">
				<tr>
					<td>
						<p id="fp">基本信息</p>
					</td>
				</tr>
			</table>
			<hr class="h" color="grey"/>
			<form action=" " method="post">
			  <table class="m2">
			  	<tr height="60px">
			  		<td><p>用户名</p></td>
			  		<td>
			  		  <input type="text" name="username" value="${Student.username}" style="width:200px height: 100px;"/>
			  		</td>
			  	</tr>
			  	<tr height="60px">
			  		<td><p>密码</p></td>
			  		<td>
			  		  <input type="password" value="${Student.pwd}" name="pwd" />
			  		</td>
			  	</tr>
			  	<tr height="60px">
			  		<td><p>姓名</p></td>
			  		<td>
			  		  <input type="text" value="${Student.username}" name="name" />
			  		</td>
			  	</tr>
			  	
			  	<tr height="20px">
			  		<td><p>性别</p></td>
			  		<td>
			  		  男<input type="radio" name="usex"  value="${Student.sex}" checked style="height: 20px; width: 100px;">&nbsp;
			  		 女<input type="radio" name="usex"  value="${Student.sex}" style="height: 20px; width: 100px;">
			  		</td>
			  	</tr>
			  	<tr height="60px">
			  		<td><p>班级</p></td>
			  	  	<td>
			  			<input type="text" value="${Student.studentclass}" name="sclass" />
			  		</td>
			  	  </tr>
			  	  <tr height="60px">
			  		<td><p>手机号</p></td>
			  	  	<td>
			  			<input type="text" value="${Student.telephone}" name="num" />
			  		</td>
			  	  </tr>
			  	  <tr height="60px">
			  		<td><p>邮箱</p></td>
			  	  	<td>
			  			<input type="text" value="${Student.email}" name="email" />
			  		</td>
			  	  </tr>
			  	  <tr>
			  	  	<td >
			  	  		<input type="submit" value="保存" style="width: 60px;" />	
			  	  	</td>
			  	  	<td>
			  	  		<input type="submit" value="返回主页 "style="width: 80px;" />
			  	  	</td>
			  	  </tr>
			  </table>
			</form>	
		</div>
		</div>
		<div class="footer">
			<div class="copyright">Copyright © 1996-2017. All Rights Reserved. 版权所有</div>
		</div>
 	</body>
</html>