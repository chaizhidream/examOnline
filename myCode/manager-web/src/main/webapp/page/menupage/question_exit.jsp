<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<html>

	<head>
		<meta charset="UTF-8">
		<title>题目修改</title>
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
			$(function() {
				// 点击保存
				$('#save').click(function() {
					if($("#menuForm").form('validate')) {
						// 通过校验 
						$("#menuForm").submit();
					}
				});
				$("#quesId").focusout(function() {
					var quesId = $("#quesId").val();
					if(quesId != null && quesId != '') {
						checkName(quesId);
					}
				});

				function checkName(quesId) {
					$.ajax({
						url: '/manager-web/check/checkQuestionId',
						type: "post",
						dataType: 'JSON',
						data: {
							quesId: quesId
						},
						success: function(result) {
							//已经存在该名字提示用户
							if(result == "false") {
								$("#errorMsg").html("<font color='red'>该编号已经存在,请重新输入!</font>");
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
		<div data-options="region:'north'">
			<div class="datagrid-toolbar">
				<a id="save" icon="icon-save" href="#" class="easyui-linkbutton" plain="true">保存</a>
			</div>
		</div>
		<div data-options="region:'center'">
			<form id="menuForm" method="post" action="/manager-web/adminExam/exitQuestions">
				<table class="table-edit" width="80%" align="center">
					<tr class="title">
						<td colspan="2">题目信息</td>
					</tr>
					<tr>
						<td>题目编号</td>
						<td>
							<input type="text"  id="quesId" value="<%=request.getParameter("quesId")%>" class="easyui-validatebox" data-options="required:true" placeholder="CH_单选RA_多选JU_判断" readonly="readonly" />
							<span id='errorMsg'>
						</td>
					</tr>
					<tr>
						<td>题目等级</td>
						<td>
							<input type="text" name="quesLevel" value="<%=request.getParameter("quesLevel")%>" class="easyui-validatebox" data-options="required:true" />
						</td>
					</tr>
					<tr>
						<td>题目内容</td>
						<td>
							<input type="text" name="quesContent" class="easyui-validatebox" value="<%=request.getParameter("quesContent")%>" data-options="required:true" />
						</td>
					</tr>
					<tr>
						<td>选项A</td>
						<td>
							<input type="text" name="chOptiona" class="easyui-validatebox" value="<%=request.getParameter("chOptiona")%>" data-options="required:true" />
						</td>
					</tr>
					<tr>
						<td>选项B</td>
						<td>
							<input type="text" name="chOptionb" class="easyui-validatebox" value="<%=request.getParameter("chOptionb")%>" data-options="required:true" />
						</td>
					</tr>
					<tr>
						<td>选项C</td>
						<td>
							<input type="text" name="chOptionc" class="easyui-validatebox" value="<%=request.getParameter("chOptionc")%>" data-options="required:true" />
						</td>
					</tr>
					<tr>
						<td>选项D</td>
						<td>
							<input type="text" name="chOptiond" class="easyui-validatebox" value="<%=request.getParameter("chOptiond")%>" data-options="required:true" />
						</td>
					</tr>
					<tr>
						<td>判断题答案</td>
						<td>
							<input type="text " name="juAnswer " value="<%=request.getParameter("juAnswer")%>"  class="easyui-validatebox "/>
						</td>
					</tr>
					<tr>
						<td>选择题答案</td>
						<td>
							<input type="text " name="chAnswer " value="<%=request.getParameter("chAnswer")%>"  class="easyui-validatebox "/>
						</td>
					</tr>
					<tr>
						<td>状态</td>
						<td>
							<input type="text " name="state " value="<%=request.getParameter("state")%>"  class="easyui-validatebox " data-options="required:true "/>
						</td>
					</tr>
				</table>
			</form>
		</div>
	</body>

</html>