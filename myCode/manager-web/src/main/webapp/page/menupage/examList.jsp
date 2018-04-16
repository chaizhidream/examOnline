<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta charset="UTF-8">
		<title>自测试题列表</title>
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
				id: 'button-view',
				text: '查看',
				iconCls: 'icon-search',
				handler: doView
			}, {
				id: 'button-add',
				text: '新增',
				iconCls: 'icon-add',
				handler: doAdd
			}, {
				id: 'button-delete',
				text: '删除',
				iconCls: 'icon-cancel',
				handler: doDelete
			}, {
				id: 'button-link',
				text: '关联题目',
				iconCls: 'icon-ok',
				handler: doLink
			}];

			// 定义标题栏
			var columns = [
				[{
						field: 'examId',
						title: '试题编号',
						width: 200
					},
					{
						field: 'examName',
						title: '试题名称',
						width: 200
					},
					{
						field: 'examGrade',
						title: '试题等级',
						width: 200
					},
					{
						field: 'state',
						title: '试题状态',
						width: 200
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
					pageList: [30,50,100],
					pagination : true,
					toolbar: toolbar,
					url: "/manager-web/adminExam/showExam",
					idField: 'examId',
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

			function doAdd() {
				window.location.href = "/manager-web/page/menupage/exam_add.jsp";
			}

			function doView() {
				var examList = $('#grid').datagrid('getSelected');
				console.info(examList.examId);
				window.location.href = "/manager-web/page/menupage/examContent.jsp?examid=" + examList.examId +"&examName=" +examList.examName+"&examGrade=" +examList.examGrade+"&state=" +examList.state;
			}
			
			function doLink() {
				var exam = $('#grid').datagrid('getSelected');
				if(exam.length == 0) {
					$.messager.alert("警告", "关联试题只能选中一条数据", "warning");
				}else {
					window.location.href = "/manager-web/page/menupage/linkquestions.jsp?examId=" + exam.examId +"&examName=" +exam.examName+"&examGrade=" +exam.examGrade+"&state=" +exam.state;
				}
				
			}
			
			function doDelete() {
				var ids = [];
				var items = $('#grid').datagrid('getSelections');
				console.log(items)
				if(items.length == 0) {
					$.messager.alert("警告", "删除试题必须选中一条以上数据", "warning");
				} else {
					for(var i = 0; i < items.length; i++) {
						ids.push(items[i].examId);
					}
					console.log(ids)
					window.location.href = "/manager-web/adminExam/deleteExam?ids=" + ids;
				}

			}
		</script>
	</head>

	<body class="easyui-layout" style="visibility:hidden;">
		<div region="center" border="false">
			<table id="grid"></table>
		</div>
	</body>

</html>