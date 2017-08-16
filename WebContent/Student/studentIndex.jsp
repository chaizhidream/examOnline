<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html>
	<head>
		<meta charset="utf-8" />   
		<title>学生主页</title>
		<link href="../css/slideshow.css" rel="stylesheet" />
		<link href="../css/studentIndex.css" rel="stylesheet" />
		<script src="../js/slideshow.js" type="text/javascript"></script>
	</head>
	<body>

		<div class="header">
			<p>在线考试系统</p>
		</div>
		<div id="nave">
			<table id="tab1">
				<tr>
					<td id="td1">
					欢迎学生${sessionScope.Student.username }登陆						
					</td>
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
    	<!--学生选项-->
    	<div id="main">
    		<table id="tab2">
    			<tr>
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
    					<a href="../ShowStudentgrade">
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
    			</tr>
    			<tr>
    				<td class="tdd2">
    					<a href="seeFaults.jsp">我的错题</a>
    				</td>
    				<td class="tdd2">
    					<a href="showExam.jsp">查看考试</a>
    				</td>
    				<td class="tdd2">
    					<a href="../ShowStudentgrade">查看成绩</a>
    				</td>
    				<td class="tdd2">
    					<a href="selfTest0.jsp">自测</a>
    				</td>
    				<td class="tdd2">
    					<a href="studentSelf.jsp">个人中心</a>
    				</td>
    			</tr>
    		</table>
    	</div>
    	
    	
		<div id="footer">
            <div class="copyright">Copyright © 1996-2017. All Rights Reserved. 版权所有</div>
        </div>
	</body>
</html>
