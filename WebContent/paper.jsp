<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>试卷页</title>
<link rel="stylesheet" type="text/css" href="css/paper.css"/>
<script type="text/javascript">
		function subChecked(){
			var sub=document.getElementById("sub");
			if(sub.value=="提交并进入编程题"){
				if(confirm("是否确认提交？")){
				//获取选择填空题,返回选择题和填空题数组
				var xztkan=document.getElementsByTagName("input");
				//在原页面打开编程题
				window.open("paperBct.jsp","if");
				sub.type="hidden";
				}	
			}
		}
</script>
</head>
<body>
	<div class="header">
		<p>在线考试系统</p>
	</div>
	<!--nave开始-->
	<div id="nave">
		<table>
			<tr id="tr1">
						
				<td class="td1">考试开始时间${ps.starttime}</td>
				<td class="td1">考试结束时间${ps.endtime}</td>
				<td class="td1">倒计时</td>
			</tr>
		</table>
	</div>
	<!--nave结束-->
	
	<!--main开始-->
	<!--框架-->
	
	<div id="main">
		<form action="" method="post">
		<iframe src="paperXzTk.jsp" width="900px" height="3000px" frameborder="0" scrolling="no" name="if" target="top"></iframe>
		
		</form>
	</div>
	<!--main结束-->
	<!--提交试卷-->
		<table id="tab4">
			<tr>
				<td style="width: 770px; text-align: center;"></td>
				<td style="width: 100px; text-align: center;">
					<input type="submit" id="sub" value="提交并进入编程题" onclick="subChecked()"
					style="border: none;background-color: lightblue; 
					width: 200px;height: 50px;margin-right: 15px;"/>
				</td>
			</tr>
		</table>
	
	<div id="footer">
        <div class="copyright">Copyright © 1996-2017. All Rights Reserved. 版权所有</div>
    </div>
    <div class="top">
		<a href="#" title="返回顶部"><img src="images/top.png"></a>
	</div>
</body>
</html>