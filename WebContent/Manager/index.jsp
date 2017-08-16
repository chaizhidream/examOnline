<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>管理员主页</title>
        <link rel="stylesheet" type="text/css" href="../css/slideshow.css"/>
    	<link type="text/css" rel="stylesheet"  href="css/managerIndex.css" />
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
						欢迎管理员${sessionScope.Manager.username}登陆
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
    	<!--管理员选项，图标要改！！！！！！！！！！！-->
    	<div id="main">
    		<table id="tab2">
    			<tr>
    				<td class="tdd1">
    					<a href="managerTeacher.jsp">
    						<img src="../images/stu1.jpg" />
    					</a>
    				</td>
    				<td class="tdd1">
    					<a href="managerRelease.jsp">
    						<img src="../images/stu2.jpg" />
    					</a>
    				</td>
    				<td class="tdd1">
    					<a href="managerSelf.jsp">
    						<img src="../images/stu3.jpg" />
    					</a>
    				</td>
    			</tr>
    			<tr>
    				<td class="tdd2">
    					<a href="managerTeacher.jsp">管理教师</a>
    				</td>
    				<td class="tdd2">
    					<a href="managerRelease.jsp">管理公告</a>
    				</td>
    				<td class="tdd2">
    					<a href="managerSelf.jsp">个人中心</a>
    				</td>
    			</tr>
    		</table>
    	</div>
    	
    	
		<div id="footer">
            <div class="copyright">Copyright © 1996-2017. All Rights Reserved. 版权所有</div>
        </div>
 	</body>
</html>