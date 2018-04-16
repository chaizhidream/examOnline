window.jQuery(function($) {
	"use strict";

	$('.alt-1').countDown({
		css_class: 'countdown-alt-1'
	});

});

$(function() {
	$('li.option label').click(
		function() {
			var examId = $(this).closest('.test_content_nr_main').closest(
				'li').attr('id'); // 得到题目ID
			var cardLi = $('a[href=#' + examId + ']'); // 根据题目ID找到对应答题卡
			// 设置已答题
			if(!cardLi.hasClass('hasBeenAnswer')) {
				cardLi.addClass('hasBeenAnswer');
			}

		});

	$("#submitBtn").click(function() {
		if(confirm("您确定要交卷麽?")) {

			var Jucount = 0; // 判断题对了几个
			var Racount = 0; // 单选题对了几个
			var Chcount = 0; // 多选题对了几个
			for(var int = 1; int < 11; int++) {
				var JuanName = "#JuAn" + int;
				var JuexName = "Ju" + int;
				// 获取值
				var Juan = $(JuanName).val();
				var Juex = $("input[name='" + JuexName + "']:checked").val();
				if(Juan != "" && Juan != null & Juex != null && Juex != "" && Juan == Juex) {
					Jucount++;
				}
			}
			for(var int = 1; int < 21; int++) {
				var RaanName = "#RaAn" + int;
				var RaexName = "Ra" + int;
				// 获取值
				var Raan = $(RaanName).val();
				var Raex = $("input[name='" + RaexName + "']:checked").val();
				if(Raan != "" && Raan != null & Raex != null && Raex != "" && Raan == Raex) {
					Racount++;
				}
			}
			for(var int = 1; int < 11; int++) {
				var ChanName = "#ChAn" + int;
				var ChexName = "Ch" + int;
				// 获取值
				var Chan = $(ChanName).val();
				var checkName = document.getElementsByName(ChexName);
				var chexList = [];
				for(k in checkName) {
					if(checkName[k].checked)
						chexList.push(checkName[k].value);
				}
				var Chex = chexList.join("-");
				if(Chan != "" && Chan != null & Chex != null && Chex != "" && Chan == Chex) {
					Chcount++;
				}
			}

			// 计算总成绩 返回
			var achievement = (Jucount + Racount) * 4 + Chcount * 8;

			var examtype = $("#examtype").val();
			console.log(examtype);
			if(examtype == 'self') {
				$.ajax({
					type: "POST",
					url: "/manager-web/exam/examAnList?achievement=" + achievement,
					success: function(data) {
						console.log(data)
						$(window).attr('location', '/manager-web/home/login');
					}
				});
			}
			
			if(examtype == 'formal') {
				$.ajax({
					type: "POST",
					url: "/manager-web/formal/examAnList?achievement=" + achievement,
					success: function(data) {
						console.log(data)
						$(window).attr('location', '/manager-web/home/login');
					}
				});
			}

		}
	});

});