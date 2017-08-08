<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>自测</title>
        <link rel="stylesheet" type="text/css" href="css/selfTest.css"/>
    </head>
    <body>
    	<body>
	<div class="header">
		<p>在线考试系统</p>
	</div>
	<!--nave开始-->
	<div id="nave">
		<table>
			<tr id="tr1">
				<td class="td1"></td>
				<td class="td1"></td>
				<td class="td1">试卷名称xxx</td>
			</tr>
		</table>
	</div>
	<!--nave结束-->
	
	<!--main开始-->
	<div id="main">
		<form action="" method="post">
		<!--选择题-->
		<table id="tab1">
			
			<tr >
				<td colspan="2" id="xz">一、选择题</td>
			</tr>
			<tr>
				<td colspan="2" id="xz_title">
					1.题目
				</td>
			</tr>
			<tr>
				<td class="xz_choose">
					<input type="radio" value="" name="xz1"/>&nbsp;&nbsp;&nbsp;A
				</td>
				<td class="xz_con">
					选项A内容
				</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="" name="xz1"/>&nbsp;&nbsp;&nbsp;B
				</td>
				<td>选项B内容</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="" name="xz1"/>&nbsp;&nbsp;&nbsp;C
				</td>
				<td>选项C内容</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="" name="xz1"/>&nbsp;&nbsp;&nbsp;D
				</td>
				<td>选项D内容</td>
			</tr>
		</table>
		
		<!--填空题-->
		<table id="tab2">
			<tr>
				<td class="tk">二、填空题</td>
			</tr>
			<tr>
				<td class="tk_title">
					1.题目
				</td>
			</tr>
			<tr>
				<!--文本框改下划线-->
				<td class="tk_con">
					请输入你的答案:
					<input type="text" style="border-bottom: 1px solid black;" />
				</td>
			</tr>
		</table>
		
		<!--编程题-->
		<table id="tab3">
			<tr>
				<td class="bc" colspan="2">三、编程题</td>
			</tr>
			<tr>
				<td class="bc_title"colspan="2">
					1.题目
				</td>
			</tr>
			<tr>
				<td class="bc_con">
					请上传你的答案（文件格式jpg,png,jpeg,pdf,gif）	
				</td>
				<td>
					<form action="doUpload.jsp" method="post" enctype="multipart/form-data">
						<input type="file" name="file" >
						<input type="submit"  value="确定上传" id="inputFile">
					</form>
				</td>
			</tr>
		</table>
		<!--提交试卷-->
		<table id="tab4">
			<tr>
				<td style="width: 770px; text-align: center;"></td>
				<td style="width: 100px; text-align: center;">
					<input type="submit" value="提交试卷" style=""/>
				</td>
			</tr>
		</table>
		</form>
	</div>
	<!--main结束-->
	
	
	<div id="footer">
        <div class="copyright">Copyright © 1996-2017. All Rights Reserved. 版权所有</div>
    </div>
    <div class="top">
		<a href="#" title="返回顶部"><img src="../images/top.png"></a>
	</div>
 	</body>
</html>