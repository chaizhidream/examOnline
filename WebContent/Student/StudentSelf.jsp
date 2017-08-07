<%@ page language="java" contentType="text/html; 
    pageEncoding="utf-8" import="com.neuq.bean.Student"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta charset="utf-8" />
		<link rel="stylesheet" href="../css/StudengtSelf.css" />
		<title>个人中心</title>
	</head>
	<body class="b">
		<% 
  		Student u = (Student) request.getAttribute("Student");
  	%>
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
			  		  <input type="text" name="username" value="<%=u.getUsername()%>" style="width:200px height: 100px;"/>
			  		</td>
			  	</tr>
			  	<tr height="60px">
			  		<td><p>密码</p></td>
			  		<td>
			  		  <input type="password" value="<%=u.getPwd()%>" name="pwd" />
			  		</td>
			  	</tr>
			  	<tr height="60px">
			  		<td><p>姓名</p></td>
			  		<td>
			  		  <input type="text" value="<%=u.getName()%>" name="name" />
			  		</td>
			  	</tr>
			  	
			  	<tr height="20px">
			  		<td><p>性别</p></td>
			  		<td>
			  		  男<input type="radio" name="usex"  value="<%=u.getSex()%>=1" checked style="height: 20px; width: 100px;">&nbsp;
			  		 女<input type="radio" name="usex"  value="<%=u.getSex()%>=2" style="height: 20px; width: 100px;">
			  		</td>
			  	</tr>
			  	<tr height="60px">
			  		<td><p>班级</p></td>
			  	  	<td>
			  			<input type="text" value="<%=u.getStudentclass()%>" name="sclass" />
			  		</td>
			  	  </tr>
			  	  <tr height="60px">
			  		<td><p>手机号</p></td>
			  	  	<td>
			  			<input type="text" value="<%=u.getTelephone()%>" name="num" />
			  		</td>
			  	  </tr>
			  	  <tr height="60px">
			  		<td><p>邮箱</p></td>
			  	  	<td>
			  			<input type="text" value="<%=u.getEmail()%>" name="email" />
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