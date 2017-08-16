<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
    <meta charset="utf-8" />
		<style type="text/css">
			*{
				margin: 0px;
				padding: 0px;
			}
			
			.b{
				background-color: ghostwhite;
			}
			.naver{
				width: 100%;
				height: 80px;
				/*background-color: blue;*/
				/*border: 1px solid black;*/
				background-image: url(../images/logo.jpg);
			}
			
			.content{
				width: 100%;
				height: 500px;
				background-color: ghostwhite;
				/*position: absolute;*/
				margin-top: 50px;
			}
			.main{
				margin: 0 auto;
				width: 80%;
				height: 480px;
				/*background-color: yellow;*/
				/*border: 1px solid black;*/
				/*position: absolute;*/
			}
			.naver p{
				font-size: 30px;
				color: white;
				text-align: center;
				line-height: 80px;
				
			}
			#fp{
				font-family: "微软雅黑";
				font-size: 30px;
				margin-bottom: 5px;
				color: black;
			}
			.h{
				margin-top: 0px;
			}
			#b1{
				margin-left: 900px;
				width: 70px;
				height: 30px;
				background-color: white;
			}
			.m2{
				margin-top: 60px;
				margin-left: 200px;
			}
			.m2 p{
				font-family: "微软雅黑";
				font-size: 20px;
			}
			input{
				width: 200px;
				height: 22px;
			}
			.footer{
				width: 100%;
				height: 50px;
				/*border: 1px black  solid;*/
				background-image: url(../images/logo.jpg);
				position: absolute;
				
			}
			.copyright{
	           text-align: center;
				line-height: 50px;
				font-family: "微软雅黑";
				color: white;
			}
		</style>
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
			<form action="../UploadSelfInfo?usertype=3" method="post">
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
			  			<input type="text" value="${Student.telephone}" name="telephone" />
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
			  	  		<input type="submit" value="保存" style="width: 60px; background-color: lightblue;" />	
			  	  	</td>
			  	  	<td>
			  	  		<input type="submit" value="返回主页 "style="width: 80px; background-color: lightblue;" />
			  	  	</td>
			  	  </tr>
			  </table>
			</form>	
		</div>
		</div>
		<div class="footer" style="margin-top: 80px;">
			<div class="copyright">Copyright © 1996-2017. All Rights Reserved. 版权所有</div>
		</div>
 	</body>
</html>