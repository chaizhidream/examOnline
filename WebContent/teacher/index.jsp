<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>教师首页</title>
        <link rel="stylesheet" type="text/css" href="css/teacherIndex.css"/>
    	<link rel="stylesheet" type="text/css" href="../css/slideshow.css"/>
    	<script type="text/javascript" src="../js/slideshow.js"></script>
    </head>
    <body>
    	<div class="header">
			<p>在线考试系统</p>
		</div>
		<div id="nave">
			<table id="tab1">
				<tr>
					<td id="td1">
						欢迎教师${sessionScope.Teacher.username}登陆
					</td>
					<td style="text-align: center;">|</td>
					<td id="td11"><a href="../Logout"><p style="font-size:17px">退出</p></a></td>
				</tr>
			</table>
		</div>
		
		<!--下面是轮播图部分-->
		<div class="comiis_wrapad" id="slideContainer">
        <div id="frameHlicAe" class="frame cl">
            <div class="block">
                <div class="cl" >
                    <ul class="slideshow" id="slidesImgs" >
                        <li><a href="#" target="_blank">
                            <img src="../images/lb01.PNG" width="1040" height="390" alt="" /></a></li>
                        <li><a href="#" target="_blank">
                            <img src="../images/lb02.PNG" width="1040" height="390" alt="" /></a></li>
                        <li><a href="#" target="_blank">
                            <img src="../images/lb03.PNG" width="1040" height="390" alt="" /></a></li>
                        <li><a href="#" target="_blank">
                            <img src="../images/lb04.PNG" width="1040" height="390" alt="" /></a></li>
                    </ul>
                </div>
                <div class="slidebar" id="slideBar">
                    <ul>
                        <li class="on">1</li>
                        <li>2</li>
                        <li>3</li>
                        <li>4</li>
                    </ul>
                </div>
            </div>
        </div>
        </div>
    	<script type="text/javascript">
        	SlideShow(3000);
    	</script>
    	<!--图片轮播结束-->
    	<!--教师选项-->
    	<div id="main">
    	<!--加图片-->
    		
    		
    		<table id="tab2">
    			<!--<tr>
    				<td class="tdd1">
    					<a href="seeFaults.jsp">
    						<img src="../images/stu1.jpg" />
    					</a>
    				</td>
    				<td class="tdd1">
    					<a href="showExam.jsp">
    						<img src="../images/stu2.jpg" />
    					</a>
    				</td>
    				<td class="tdd1">
    					<a href="seeResult.jsp">
    						<img src="../images/stu3.jpg" />
    					</a>
    				</td>
    				<td class="tdd1">
    					<a href="selfTest0.jsp">
    						<img src="../images/stu4.jpg" />
    					</a>
    				</td>
    				<td class="tdd1">
    					<a href="studentSelf.jsp">
    						<img src="../images/stu4.jpg" />
    					</a>
    				</td>
    			</tr>-->
    			<tr>
    				<td class="tdd2">
    					<a href="seePaper.jsp">查看试卷</a>
    				</td>
    				<td class="tdd2">
    					<a href="../SelectClassAndPaper?type=1">批改试卷</a>
    				</td>
    				<td class="tdd2">
    					<a href="addQuestion.jsp">添加题目</a>
    				</td>
    				<td class="tdd2">
    					<a href="createPaper0.jsp">生成试卷</a>
    				</td>
    				<td class="tdd2">
    					<a href="../ShowUserInfo">管理学生</a>
    				</td>
    				<td class="tdd2">
    					<a href="../ShowStudentGrade">查看成绩</a>
    				</td>
    				<td class="tdd2">
    					<a href="teacherSelf.jsp">个人中心</a>
    				</td>
    			</tr>
    		</table>
    	</div>
    	
    	
		<div id="footer">
            <div class="copyright">Copyright © 1996-2017. All Rights Reserved.  版权所有    冀ICP备16013410号</div>
        </div>
 	</body>
</html>