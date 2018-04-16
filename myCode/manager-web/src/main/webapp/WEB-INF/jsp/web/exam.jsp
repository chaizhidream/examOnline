<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta http-equiv="content-type" content="text/html;charset=UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<title>考试</title>

		<link href="../css/main.css" rel="stylesheet" type="text/css" />
		<link href="../css/iconfont.css" rel="stylesheet" type="text/css" />
		<link href="../css/test.css" rel="stylesheet" type="text/css" />
		<link rel="stylesheet" href="../css/easyui.css" />
		<link rel="stylesheet" href="../css/icon.css" />
		<style>
			.hasBeenAnswer {
				background: #5d9cec;
				color: #fff;
			}
		</style>

	</head>

	<body>
		<div class="main">
			<!--nr start-->
			<div class="test_main">
				<div class="nr_left">
					<div class="test">
						<form id="examForm">
							<input type="hidden" id="examtype" name="examtype" value="${examtype}">
							<div class="test_title">
								<p class="test_time">
									<i class="icon iconfont">&#xe6fb;</i><b class="alt-1">01:00</b>
								</p>
								<font><input type="button" id="submitBtn" name="submitBtn" value="交卷"></font>
							</div>

							<div class="test_content">
								<div class="test_content_title">
									<h2>判断题</h2>
									<p>
										<span>共</span><i class="content_lit">5</i><span>题，</span><span>合计</span><i class="content_fs">20</i><span>分</span>
									</p>
								</div>
							</div>
							<div class="test_content_nr">
								<c:forEach items="${JuquestionList}" var="Ju" varStatus="status">
									<ul>
										<li id="${Ju.quesId}">
											<div class="test_content_nr_tt">
												<i>${status.count}</i><span>(4分)</span>
												<font>${Ju.quesContent}</font><b class="icon iconfont">&#xe881;</b>
											</div>
											<input type="hidden" id="JuAn${status.count}" name="JuAn${status.count}" value="${Ju.juAnswer}">

											<div class="test_content_nr_main">
												<ul>

													<li class="option"><input type="radio" class="radioOrCheck" name="Ju${status.count}" id="Ju${status.count}" value="1" /> <label for="Ju${status.count}">
														A.
														<p class="ue" style="display: inline;">正确</p>
												</label></li>

													<li class="option"><input type="radio" class="radioOrCheck" name="Ju${status.count}" id="Ju${status.count}" value="2" /> <label for="Ju${status.count}">
														B.
														<p class="ue" style="display: inline;">错误</p>
												</label></li>

												</ul>
											</div>
										</li>
									</ul>
								</c:forEach>
							</div>

							<div class="test_content">
								<div class="test_content_title">
									<h2>单选题</h2>
									<p>
										<span>共</span><i class="content_lit">10</i><span>题，</span><span>合计</span><i class="content_fs">40</i><span>分</span>
									</p>
								</div>
							</div>
							<div class="test_content_nr">
								<c:forEach items="${RaquestionList}" var="Ra" varStatus="status">
									<ul>
										<li id="${Ra.quesId}">
											<div class="test_content_nr_tt">
												<i>${status.count}</i><span>(4分)</span>
												<font>${Ra.quesContent}</font><b class="icon iconfont">&#xe881;</b>
											</div>
											<input type="hidden" id="RaAn${status.count}" name="RaAn${status.count}" value="${Ra.chAnswer}">
											<div class="test_content_nr_main">
												<ul>

													<li class="option"><input type="radio" class="radioOrCheck" name="Ra${status.count}" id="Ra1${status.count}" value="A" /> <label for="Ra1${status.count}">
														A.
														<p class="ue" style="display: inline;">${Ra.chOptiona}</p>
												</label></li>

													<li class="option"><input type="radio" class="radioOrCheck" name="Ra${status.count}" id="Ra2${status.count}" value="B" /> <label for="Ra2${status.count}">
														B.
														<p class="ue" style="display: inline;">${Ra.chOptionb}</p>
												</label></li>

													<li class="option"><input type="radio" class="radioOrCheck" name="Ra${status.count}" id="Ra3${status.count}" value="C" /> <label for="Ra3${status.count}">
														C.
														<p class="ue" style="display: inline;">${Ra.chOptionc}</p>
												</label></li>

													<li class="option"><input type="radio" class="radioOrCheck" name="Ra${status.count}" id="Ra4${status.count}" value="D" /> <label for="Ra4${status.count}">
														D.
														<p class="ue" style="display: inline;">${Ra.chOptiond}</p>
												</label></li>
												</ul>
											</div>
										</li>
									</ul>
								</c:forEach>
							</div>
							<div class="test_content">
								<div class="test_content_title">
									<h2>多选题</h2>
									<p>
										<span>共</span><i class="content_lit">5</i><span>题，</span><span>合计</span><i class="content_fs">40</i><span>分</span>
									</p>
								</div>
							</div>
							<div class="test_content_nr">
								<c:forEach items="${ChquestionList}" var="CH" varStatus="status">
									<ul>
										<li id="${CH.quesId}">
											<div class="test_content_nr_tt">
												<i>${status.count}</i><span>(8分)</span>
												<font>${CH.quesContent}</font><b class="icon iconfont">&#xe881;</b>
											</div>
											<input type="hidden" id="ChAn${status.count}" name="ChAn${status.count}" value="${CH.chAnswer}">
											<div class="test_content_nr_main">
												<ul>

													<li class="option"><input type="checkbox" class="radioOrCheck" name="Ch${status.count}" id="CH1${status.count}" value="A" /> <label for="CH1${status.count}">
														A.
														<p class="ue" style="display: inline;">${CH.chOptiona}</p>
												</label></li>

													<li class="option"><input type="checkbox" class="radioOrCheck" name="Ch${status.count}" id="CH2${status.count}" value="B" /> <label for="CH2${status.count}">
														B.
														<p class="ue" style="display: inline;">${CH.chOptionb}</p>
												</label></li>

													<li class="option"><input type="checkbox" class="radioOrCheck" name="Ch${status.count}" id="CH3${status.count}" value="C" /> <label for="CH3${status.count}">
														C.
														<p class="ue" style="display: inline;">${CH.chOptionc}</p>
												</label></li>

													<li class="option"><input type="checkbox" class="radioOrCheck" name="Ch${status.count}" id="CH4${status.count}" value="D" /> <label for="CH4${status.count}">
														D.
														<p class="ue" style="display: inline;">${CH.chOptiond}</p>
												</label></li>

												</ul>
											</div>
										</li>
									</ul>
								</c:forEach>
							</div>

						</form>
					</div>

				</div>
				<div class="nr_right">
					<div class="nr_rt_main">
						<div class="rt_nr1">
							<div class="rt_nr1_title">
								<h1>
								<i class="icon iconfont">&#xe692;</i>答题卡
							</h1>
								<p class="test_time">
									<i class="icon iconfont">&#xe6fb;</i><b class="alt-1">01:00</b>
								</p>
							</div>

							<div class="rt_content">
								<div class="rt_content_tt">
									<h2>判断题</h2>
									<p>
										<span>共</span><i class="content_lit">10</i><span>题</span>
									</p>
								</div>
								<div class="rt_content_nr answerSheet">
									<ul>
										<c:forEach items="${JuquestionList}" var="Ju" varStatus="status">
											<li>
												<a href="#${Ju.quesId}">${status.count}</a>
											</li>
										</c:forEach>
									</ul>
								</div>
							</div>
							<div class="rt_content">
								<div class="rt_content_tt">
									<h2>单选题</h2>
									<p>
										<span>共</span><i class="content_lit">20</i><span>题</span>
									</p>
								</div>
								<div class="rt_content_nr answerSheet">
									<ul>
										<c:forEach items="${RaquestionList}" var="Ra" varStatus="status">
											<li>
												<a href="#${Ra.quesId}">${status.count}</a>
											</li>
										</c:forEach>
									</ul>
								</div>
							</div>

							<div class="rt_content">
								<div class="rt_content_tt">
									<h2>多选题</h2>
									<p>
										<span>共</span><i class="content_lit">10</i><span>题</span>
									</p>
								</div>
								<div class="rt_content_nr answerSheet">
									<ul>
										<c:forEach items="${ChquestionList}" var="Ch" varStatus="status">
											<li>
												<a href="#${Ch.quesId}">${status.count}</a>
											</li>
										</c:forEach>
									</ul>
								</div>
							</div>

						</div>

					</div>
				</div>
			</div>

			<!--nr end-->
			<div class="foot"></div>
		</div>
		<script src="../js/jquery-1.11.3.min.js"></script>
		<script src="../js/jquery.easy-pie-chart.js"></script>
		<!-- 导入 easyui 类库 -->
		<script type="text/javascript" src="../js/jquery.easyui.min.js"></script>
		<script type="text/javascript" src="../js/easyui-lang-zh_CN.js"></script>
		<!--时间js-->
		<script src="../js/jquery.countdown.js"></script>
		<script src="../js/exam.js"></script>
	</body>

</html>