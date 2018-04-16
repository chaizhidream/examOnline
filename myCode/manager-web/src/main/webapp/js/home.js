function getExamList() {

	$.ajax({
		type: "POST",
		url: "/manager-web/exam/examList",
		success: function(data) {
			$("#tableDiv").show(1000);
			console.log(data);
			var html = []
			for(var i = 0; i < data.length; i++) {
				var state = data[i].state = 1 ? '正常' : '异常';
				var template = '<tr><td>' + data[i].id + '</td><td>' + data[i].score + '</td><td>' + data[i].examDate + '</td><td>' + state + '</td></tr>'
				html.push(template)
				document.getElementById('tbMain').innerHTML = html.join('')
			}
		}
	});
}

function divHidden() {
	$("#tableDiv").hide(1000);
}

function getExam() {

	$.ajax({
		type: "POST",
		url: "/manager-web/formal/getFormalExam",
		success: function(data) {
			var msg = data.msg;
			var exam = data.data;
			console.log(exam);
			console.log(msg);
			if(msg == "还没考") {
				if(confirm("此次考试只能参与一次,请准备充足后参加!")) {
					$(window).attr('location', '/manager-web/formal/selfExam');
				}
			}
			if(msg == "考完了") {
				alert('您已经参与过此次考试,考试成绩为:' + exam.score);
			}
		}
	});
}