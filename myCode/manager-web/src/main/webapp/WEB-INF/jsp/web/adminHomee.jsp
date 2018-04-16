<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>在线考试系统管理</title>
		<!-- 导入jquery核心类库 -->
		<script type="text/javascript" src="../js/jquery-1.8.3.js"></script>
		<!-- 导入easyui类库 -->
		<link id="easyuiTheme" rel="stylesheet" type="text/css" href="../js/easyui/themes/default/easyui.css">
		<link rel="stylesheet" type="text/css" href="../js/easyui/themes/icon.css">
		<link rel="stylesheet" type="text/css" href="../css/default.css">
		<script type="text/javascript" src="../js/easyui/jquery.easyui.min.js"></script>
		<!-- 导入ztree类库 -->
		<link rel="stylesheet" href="../js/ztree/zTreeStyle.css" type="text/css" />
		<script src="../js/ztree/jquery.ztree.all-3.5.js" type="text/javascript"></script>
		<script src="../js/easyui/locale/easyui-lang-zh_CN.js" type="text/javascript"></script>
		<script src="../js/adminhomee.js"></script>
	</head>

	<body class="easyui-layout">
		<div data-options="region:'north',border:false" style="height:70px;padding:10px;">
			<div>
				<img src="../img/logo.png" border="0">
			</div>
			<div id="sessionInfoDiv" style="position: absolute;right: 5px;top:10px;">
				[<strong>${sessionScope.loginuser.name}</strong>]，欢迎你！
			</div>
			<div style="position: absolute; right: 5px; bottom: 10px; ">
				<a href="javascript:void(0);" class="easyui-menubutton" onclick="logoutFun();">退出系统</a>
			</div>
		</div>
		<div data-options="region:'west',split:true,title:'菜单导航'" style="width:200px">
			<div class="easyui-accordion" fit="true" border="false">
				<div title="基本功能" data-options="iconCls:'icon-mini-add'" style="overflow:auto">
					<ul id="treeMenu" class="ztree"></ul>
				</div>
			</div>
		</div>
		<div data-options="region:'center'">
			<div id="tabs" fit="true" class="easyui-tabs" border="false">
				<div title="消息中心" id="subWarp" style="width:100%;height:100%;overflow:hidden">
					<iframe src="../page/home.html" style="width:100%;height:100%;border:0;"></iframe>
				</div>
			</div>
		</div>
		<div data-options="region:'south',border:false" style="height:50px;padding:10px;">
			<table style="width: 100%;">
				<tbody>
					<tr>
						<td style="width: 400px;">
							<div style="color: #999; font-size: 8pt;">
								在线考试系统管理平台 | Powered by <a href="#">XXX</a>
							</div>
						</td>
					</tr>
				</tbody>
			</table>
		</div>

		<div id="mm" class="easyui-menu" style="width:120px;">
			<div data-options="name:'Close'">关闭当前窗口</div>
			<div data-options="name:'CloseOthers'">关闭其它窗口</div>
			<div class="menu-sep"></div>
			<div data-options="iconCls:'icon-cancel',name:'CloseAll'">关闭全部窗口</div>
		</div>

	</body>

</html>