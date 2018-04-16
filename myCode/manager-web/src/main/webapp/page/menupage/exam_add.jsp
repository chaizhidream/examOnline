<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta charset="UTF-8">
		<title>试题添加</title>
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
		<script src="/manager-web/js/exam_add.js" type="text/javascript"></script>
		<script type="text/javascript">
			$(function() {
				$('#save').click(function() {
					if($("#form").form('validate')){
						// 通过校验
						$('#form').submit();
					}
					
				});
				$("#examId").focusout(function() {
					var quesId = $("#examId").val();
					if(quesId != null && quesId != '') {
						checkName(quesId);
					}
				});

				function checkName(examId) {
					$.ajax({
						url: '/manager-web/check/checkExamId',
						type: "post",
						dataType: 'JSON',
						data: {
							examId: examId
						},
						success: function(result) {
							//已经存在该名字提示用户
							if(result == "false") {
								$("#errorMsg").html("<font color='red'>该试题编号已经存在,请重新输入!</font>");
							}else{
								$("#errorMsg").html("");
							}
						}
					});
				}
			});
		</script>
	</head>

	<body class="easyui-layout">
		<div region="north" style="height:31px;overflow:hidden;" split="false" border="false">
			<div class="datagrid-toolbar">
				<a id="save" icon="icon-save" href="#" class="easyui-linkbutton" plain="true">保存</a>
			</div>
		</div>
		<div region="center" style="overflow:auto;padding:5px;" border="false">
			<form id="form" method="post" action="/manager-web/adminExam/addExam">
				<table class="table-edit" width="95%" align="center">
					<tr class="title">
						<td colspan="4">试题信息</td>
					</tr>
					<tr>
						<td>试题编号:</td>
						<td>
							<input type="text" name="examId" id="examId" class="easyui-validatebox" required="true" />
							<span id="errorMsg"></span>
						</td>
						<td>试题名称:</td>
						<td>
							<input type="text" name="examName" id="examName" class="easyui-validatebox" required="true" />
						</td>
					</tr>
					<tr>
						<td>试题等级:</td>
						<td>
							<input type="text" name="examGrade" id="examGrade" class="easyui-validatebox" required="true" />
						</td>
						<td>试题状态:</td>
						<td>
							<input type="text" name="state" id="state" class="easyui-validatebox" required="true" placeholder="1代表正常2代表异常"  />
						</td>
					</tr>
					<tr class="title">
				</table>
			</form>
		</div>
	</body>

</html>