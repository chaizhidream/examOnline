$(function() {
	/** 
	   Ztree菜单通用配置 
	*/
	var setting = {
		data: {
			simpleData: { // 简单数据 
				enable: true
			}
		},
		callback: {
			onClick: onClick
		}
	};

	
	// 基本功能菜单加载
	$.post("/manager-web/admin/menuShow", function(data) {
		$.fn.zTree.init($("#treeMenu"), setting, data);
	}, "json");

	// 页面加载后 右下角 弹出窗口
	/*window.setTimeout(function() {
		$.messager.show({
			title: "消息提示",
			msg: '欢迎登录，超级管理员！ <a href="javascript:void" onclick="top.showAbout();">联系管理员</a>',
			timeout: 5000
		});
	}, 3000);*/

	$("#btnCancel").click(function() {
		$('#editPwdWindow').window('close');
	});


	// 设置全局变量 保存当前正在右键的tabs 标题 
	var currentRightTitle;

	// 为选项卡，添加右键菜单 
	$('#tabs').tabs({
		onContextMenu: function(e, title, index) {
			currentRightTitle = title;
			$('#mm').menu('show', {
				left: e.pageX,
				top: e.pageY
			});
			e.preventDefault(); // 禁用原来的右键效果 
		}
	});

	$('#mm').menu({
		onClick: function(item) {
			if(item.name === 'Close') {
				$('#tabs').tabs('close', currentRightTitle);
			} else if(item.name === 'CloseOthers') {
				var tabs = $('#tabs').tabs('tabs');
				$(tabs).each(function() {
					if($(this).panel('options').title != '消息中心' && $(this).panel('options').title != currentRightTitle) {
						$('#tabs').tabs('close', $(this).panel('options').title);
					}
				});
			} else if(item.name === 'CloseAll') {
				var tabs = $('#tabs').tabs('tabs');
				$(tabs).each(function() {
					if($(this).panel('options').title != '消息中心') {
						$('#tabs').tabs('close', $(this).panel('options').title);
					}
				});
			}
		}
	});
});

function onClick(event, treeId, treeNode, clickFlag) {
	// 判断树菜单节点是否含有 page属性
	if(treeNode.page != undefined && treeNode.page != "") {
		if($("#tabs").tabs('exists', treeNode.name)) { // 判断tab是否存在
			$('#tabs').tabs('select', treeNode.name); // 切换tab
		} else {
			// 开启一个新的tab页面
			var content = '<div style="width:100%;height:100%;overflow:hidden;">' +
				'<iframe src="' +
				treeNode.page +
				'" scrolling="auto" style="width:100%;height:100%;border:0;" ></iframe></div>';

			$('#tabs').tabs('add', {
				title: treeNode.name,
				content: content,
				closable: true,
				tools: [{
					iconCls: 'icon-reload', // 刷新按钮
					handler: function() {
						var tab = $('#tabs').tabs('getTab', treeNode.name);
						$("iframe[src='" + treeNode.page + "']").get(0).contentWindow.location.reload(true);
					}
				}]
			});
		}
	}
}

// 退出登录
function logoutFun() {
	$.messager
		.confirm('系统提示', '您确定要退出本次登录吗?', function(isConfirm) {
			if(isConfirm) {
				location.href = '/manager-web/home/logOut';
			}
		});
}
