<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta charset="UTF-8">
		<title>题目列表</title>
		<!-- 导入jquery核心类库 -->
		<script type="text/javascript" src="/manager-web/js/jquery-1.8.3.js"></script>
		<!-- 导入easyui类库 -->
		<link rel="stylesheet" type="text/css" href="/manager-web/js/easyui/themes/default/easyui.css">
		<link rel="stylesheet" type="text/css" href="/manager-web/js/easyui/themes/icon.css">
		<link rel="stylesheet" type="text/css" href="/manager-web/js/easyui/ext/portal.css">
		<link rel="stylesheet" type="text/css" href="/manager-web/css/default.css">
		<script type="text/javascript" src="/manager-web/js/easyui/jquery.easyui.min.js"></script>
		<script type="text/javascript" src="/manager-web/js/easyui/ext/jquery.portal.js"></script>
		<script type="text/javascript" src="/manager-web/js/easyui/ext/jquery.cookie.js"></script>
		<script src="/manager-web/js/easyui/locale/easyui-lang-zh_CN.js" type="text/javascript"></script>
		<script type="text/javascript">
			// 工具栏
			var toolbar = [{
				id: 'button-save',
				text: '关联',
				iconCls: 'icon-save',
				handler: doSave
			},{
				id: 'button-wtf',
				text: '注意:CH代表多选,JU代表判断,RA代表单选。每套题题目分布为:5个判断，10个单选，5个多选。',
				iconCls: 'icon-233',
				handler: do233
			}];

			// 定义标题栏
			var columns = [
				[{
						field: 'quesId',
						title: '题目编号',
						width: 100
					},
					{
						field: 'quesLevel',
						title: '题目等级',
						width: 75
					},
					{
						field: 'quesContent',
						title: '题目内容',
						width: 300
					}, {
						field: 'chOptiona',
						title: '选项a',
						width: 200
					}, {
						field: 'chOptionb',
						title: '选项b',
						width: 200
					}, {
						field: 'chOptionc',
						title: '选项c',
						width: 200
					}, {
						field: 'chOptiond',
						title: '选项d',
						width: 200
					}, {
						field: 'juAnswer',
						title: '判断题答案',
						width: 75
					}, {
						field: 'chAnswer',
						title: '选择题答案',
						width: 75
					},
					{
						field: 'state',
						title: '题目状态',
						width: 75
					}
				]
			];
			$(function() {
				// 初始化 datagrid
				// 创建grid
				$('#grid').datagrid({
					iconCls: 'icon-forward',
					fit: true,
					border: false,
					rownumbers: true,
					striped: true,
					pageList: [30, 50, 100],
					pagination: true,
					toolbar: toolbar,
					url: "/manager-web/adminExam/showQuestions",
					idField: 'quesId',
					columns: columns,
					onClickRow: onClickRow,
					onDblClickRow: doDblClickRow
				});

				$("body").css({
					visibility: "visible"
				});
				
			});
			// 双击
			function doDblClickRow(rowIndex, rowData) {
				var items = $('#grid').datagrid('selectRow', rowIndex);
				doView();
			}
			// 单击
			function onClickRow(rowIndex) {

			}
			
			// 单击
			function do233() {

			}
			// 点击保存
			function doSave() {
				var ids = [];
				var items = $('#grid').datagrid('getSelections');
				var examId = $('#username').val();
				var examGrade = $('#nickname').val();
				if(items.length == 0) {
					$.messager.alert("警告", "关联试题必须选中一条以上数据", "warning");
				} else {
				for(var i = 0; i < items.length; i++) {
					ids.push(items[i].quesId);
				}
				var questionIds = ids.join(",");
				console.log(examId)
				console.log(questionIds)
				window.location.href = "/manager-web/adminExam/linkQuestions?questionIds=" + questionIds +"&examId=" +examId +"&examGrade=" +examGrade;
				}

			}
		</script>
	</head>

	<body class="easyui-layout" style="visibility:hidden;">
		<div region="center" border="false">
			<table class="table-edit" width="100%" align="center">
				<tr class="title">
					<td colspan="8">试题信息</td>
				</tr>
				<tr>
					<td>试题编号:</td>
					<td>
						<input type="text" name="username" id="username" class="easyui-validatebox" readonly="readonly" value="<%=request.getParameter("examId")%>" />
					</td>
					<td>试题名称:</td>
					<td>
						<input type="text" name="password" id="password" class="easyui-validatebox" readonly="readonly" value="<%=request.getParameter("examName")%>" />
					</td>
					<td>试题等级:</td>
					<td>
						<input type="text" name="nickname" id="nickname" class="easyui-validatebox" readonly="readonly" value="<%=request.getParameter("examGrade")%>" />
					</td>
					<td>试题状态:</td>
					<td>
						<input type="text" name="nickname" id="nickname1" class="easyui-validatebox" readonly="readonly" value="<%=request.getParameter("state")%>" />
					</td>
				</tr>
				<tr class="title">
					<td colspan="8">题目信息</td>
				</tr>
			</table>
			<table id="grid"></table>
		</div>
	</body>

</html>