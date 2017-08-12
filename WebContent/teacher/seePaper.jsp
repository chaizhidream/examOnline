<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>查看试卷</title>
        <link rel="stylesheet" href="css/seePaper.css" />
        <script type="text/javascript" src="js/seePaper2.js" ></script>
    </head>
    <body>
    	<div class="header">
	 	<a href="index.jsp"><p>在线考试系统</p></a>
	 </div>
	 <div class="main">
	 	<div id="left">
	 		<span style="color: black;" class="h1">
			<dl class="dropDown">
			<dt id="dt1" onmouseover="drop($('dd1'))" onmouseout="unDrop($('dd1'))"><p>按知识点</p></dt>
			<dd id="dd1" onmouseover="cancelHide($('dd1'))" onmouseout="unDrop($('dd1'))">
				<ul >
						<li><a href="getCplus.jsp" target="if"><p>C++</p></a></li>
						<li><a href="getJava.jsp" target="if"><p>JAVA</p></a></li>
						<input type="hidden" value="2"/>
			    </ul>
			</dd>
		</dl>
		
				<ul class="al">
					<li><a  href="../ShowAllPaper?selectpoint=1" target="if"><p>所有试卷</p></a>
		<input type="hidden" value="1" /></li>
				</ul>
	 	</div>
	 	<div id="right">
	 		<iframe src="seeNullPaper.jsp" width="100%" height="720px"  frameborder="0" scrolling="no" name="if"></iframe>
	 	</div>
	 </div>
	 <div class="clear"></div>
	 <div class="footer">
	 	<div class="copyright">Copyright © 1996-2017. All Rights Reserved.  版权所有    冀ICP备16013410号</div>
	 </div>
 	</body>
</html>