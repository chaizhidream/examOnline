<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>未批改试卷</title>
        <link rel="stylesheet" href="../css/uncompletepaper2.css" />
        <script src="js/uncomepletePaper2.js"></script>
    </head>
    <body>
    	<!--批改编程题然后提交到后台-->
    	
    	<form name="form1" method="post" action="../">
		<table id="tab3">
			<tr>
				<td class="bc">三、编程题</td>
			</tr>
			<tr>
				<td class="bc_title">
					1.${}
				</td>
			</tr>
			<tr>
				<td style="text-align: right;">
					请评分
				</td>
				<td>
					<input type="text" name="fs"/>
				</td>
				<td>
					<input type="submit" id="s" value="提交分数" />
				</td>
			</tr>
		</table>
		</form>
 	</body>
</html>