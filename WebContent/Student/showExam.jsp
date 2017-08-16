<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
		<meta charset="UTF-8">
		<title></title>
		<!--<link rel="stylesheet" href="../css/showExam.css"/>-->
		<style type="text/css">
			             *{
				margin: 0;
				padding: 0;
			}
			
			.header{
				width: 100%;
				height: 80px;
				/*background-color: blue;*/
				/*border: 1px solid black;*/
				background-image: url(../images/logo.jpg);
			}
			.header p{
				font-size: 30px;
				color: white;
				text-align: center;
				line-height: 80px;
				
			}
			.header a{
				text-decoration: none;
			}
			.content{
				width: 100%;
				height: 480px;
				/*border: 1px solid black;*/
				/*margin-top: 30px;*/
				/*background-color: gainsboro;*/
			}
			body{
			 background-color: ghostwhite;
			}
			.main{
				width:70% ;
				height: 510px;
				/*background-color: white;*/
				margin: 0 auto;
			}
			.t1{
				margin: 0 auto;
				/*padding-top: 30px;*/
				position: relative;
				/*background-color: lightyellow;*/
			}
			.t1 a{
				text-decoration: none;
			}
			
			.t1 a:visited{
			   red
			}
			.t11:hover{
				color: lightblue;
			}
			
			.t1 td p{
				color: gray;
				font-size: 20px;
			}
			.footer{
				width: 100%;
				height: 50px;
				/*border: 1px black  solid;*/
				background-image: url(../images/logo.jpg);
				
			}
			.copyright{
	           line-height: 50px;
	           text-align: center;
	           font-size: 15px;
			}
		</style>
	</head>
	<body>
	 <div class="header">
	 	<a href="index.jsp"><p>在线考试系统</p></a>
	 </div>
	 <div class="naver">
	 	<table class="t1">
	 				<tr style=" height: 40px;">
	 				
	 					<td width="200px"><center><a href="beforeExam.jsp?PaperBefore" target="if"><p class="t11">已结束的考试</p></a></center></td>
	 					<td width="200px"><center><a href="nowExam.jsp?PaperNow" target="if"><p class="t11">正在进行的考试</p></a></center></td>
	 					<td width="200px"><center><a href="afterExam.jsp?PaperAfter" target="if"><p class="t11">即将进行的考试</p></a></center></td>
	 				</tr>
	 			</table>
	 </div>
	 <div class="content">
	 	<div class="main">
	 			<iframe src="beforeExam.jsp"  width="100%" height="400px"  frameborder="0" scrolling="no" name="if"></iframe>
	 		</div>
	 	</div>
	 <div class="footer">
	 	<div class="copyright">Copyright © 1996-2017. All Rights Reserved. 版权所有    冀ICP备16013410号</div>
	 </div>
 	</body>
</html>