<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>在线考试</title>
<link rel="stylesheet" href="../css/easyui.css" />
<link rel="stylesheet" href="../css/icon.css" />
<script src="../js/jquery-1.11.3.min.js"></script>
<!-- 导入 easyui 类库 -->
<script type="text/javascript" src="../js/jquery.easyui.min.js"></script>
<script type="text/javascript" src="../js/easyui-lang-zh_CN.js"></script>
<script src="../js/home.js"></script>
</head>

<body>
	request:${sessionScope.msg}
	<br /> 
	当前登陆角色:${sessionScope.loginuser.name}
	<br> 
	当前角色自测等级:${sessionScope.usergrade.grade}
	<br /> 
	当前角色最后一次自测成绩:${sessionScope.usergrade.lastScore}
	<br /> 
	当前角色最好的自测成绩:${sessionScope.usergrade.bestScore}
	<br />
	<a href="#" onclick="getExam()">在线考试</a>
	<br />
	在线考试成绩:${sessionScope.userFormalExam}
	<br />
	<a href="/manager-web/exam/selfTest?grade=${sessionScope.usergrade.grade}">用户自测</a>
	<br />
	<a href="#" onclick="getExamList()">自测考试列表</a>
	<br />
	<a href="/manager-web/home/logOut">退出当前用户</a>
	<div id="tableDiv"style="display:none;text-align: center;">
		<table width="600" border="1" cellspacing="0">
			<thead>
				<tr>
					<td colspan="4">
						<button id="divButton" onclick="divHidden()">关闭</button>
					</td>
				</tr>
				<tr>
					<th>编号</th>
					<th>考试成绩</th>
					<th>考试时间</th>
					<th>状态</th>
				</tr>
			</thead>
			<tbody id="tbMain"></tbody>
		</table>
	</div>
</body>

</html>