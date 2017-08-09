<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.neuq.bean.Student"  %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style type="text/css">
			.naver{
				width: 100%;
				height: 100px;
				/*background-color: blue;*/
				border: 1px solid black;
			}
			.main{
				margin: 0 auto;
				width: 80%;
				height: 800px;
				margin-top: 30px;
				/*background-color: yellow;*/
				border: 1px solid black;
			}
			#fp{
				font-family: "微软雅黑";
				font-size: 18px;
				margin-bottom: 5px;
			}
			.h{
				margin-top: 0px;
			}
			#b1{
				margin-left: 900px;
				width: 70px;
				height: 30px;
				background-color: greenyellow;
			}
			.m2{
				margin-top: 60px;
				margin-left: 200px;
			}
			input{
				width: 200px;
				height: 25px;
			}
			.footer{
				width: 100%;
				height: 200px;
				border: 1px black  solid;
				
			}
		</style>
		<title>个人中心</title>
	</head>
	<body>
	<%Student u = (Student)session.getAttribute("Student"); %>
		<div class="naver"></div>
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
			  		<td>用户名</td>
			  		<td>
			  		  <input type="text" name="username" value="<%=u.getUsername()%>" style="width:200px height: 100px;"/>
			  		</td>
			  	</tr>
			  	<tr height="60px">
			  		<td>密码</td>
			  		<td>
			  		  <input type="password" value="<%=u.getPwd()%>" name="pwd" />
			  		</td>
			  	</tr>
			  	<tr height="60px">
			  		<td>姓名</td>
			  		<td>
			  		  <input type="text" name="name" value="<%=u.getName()%>" />
			  		</td>
			  	</tr>
			  	
			  	<tr height="20px">
			  		<td>性别</td>
			  		<td>
			  		  男<input type="radio" name="usex" value="<%=u.getSex()%>" checked style="height: 20px; width: 100px;">&nbsp;
			  		 女<input type="radio" name="usex" value="<%=u.getSex()%>" style="height: 20px; width: 100px;">
			  		</td>
			  	</tr>
			  	<tr height="60px">
			  		<td>班级</td>
			  	  	<td>
			  			<input type="text" name="sclass" value="<%=u.getStudentclass()%>" />
			  		</td>
			  	  </tr>
			  	  <tr height="60px">
			  		<td>手机号</td>
			  	  	<td>
			  			<input type="text" name="num" value="<%=u.getTelephone()%>" />
			  		</td>
			  	  </tr>
			  	  <tr height="60px">
			  		<td>邮箱</td>
			  	  	<td>
			  			<input type="text" name="email" value="<%=u.getEmail()%>" />
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
		<div class="footer"></div>
</body>
</html>