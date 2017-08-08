<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>查看错题</title>
        <link rel="stylesheet" type="text/css" href="css/seeFaults.css"/>
    </head>
    <body>
    	<div class="header">
		<p>在线考试系统</p>
	</div>
	<!--nave开始-->
	<div id="nave">
		<table>
			<tr id="tr1">
				<td class="td1">
					请选择试卷：
					<select name="">
						<option value=""></option>
					</select>
				</td>
				<td class="td2">
					<button>查询</button>
				</td>
				<td class=""></td>
			</tr>
		</table>
	</div>
	<!--nave结束-->
	
	<!--main开始-->
	<div id="main">
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
			<tr>
				<td colspan="2" style="text-align: right;">
					正确答案：xxx
				</td>
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
				<td  style="text-align: right;">
					正确答案：xxx
				</td>
			</tr>
		</table>
		
		<!--编程题-->
		<table id="tab3">
			<tr>
				<td class="bc">三、编程题</td>
			</tr>
			<tr>
				<td class="bc_title">
					1.题目
				</td>
			</tr>
			<tr>
				<td style="text-align: right;">
					正确答案：xxx
				</td>
			</tr>
		</table>
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