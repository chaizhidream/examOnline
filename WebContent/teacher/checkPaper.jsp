<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>教师批阅成绩页面</title>
        <link rel="stylesheet" href="css/checkPaper.css" />
        <script type="text/javascript">
        	window.onload=function(){
        		//alert("1111");
        		
          	} 
        </script>
    </head>
    <body>
    	<div class="header">
    		<a href="index.jsp"><p>在线考试系统</p></a>
    	</div>
    	
    	<div class="main">
    		<div class="left">
    			<ul>
    				<li><a href="completePaper.jsp" target="if">已批阅的试卷</a></li>
    				<li><a href="uncompletePaper.jsp" target="if">未批阅的试卷</a></li>
    			</ul>
    		</div>
    		
    		<div class="right">
    			<div >
    				<form name="form1" method="post" action="../ShowCorrectPaper">
    			<table  class="top">
    				<tr>
    			   	<td>请选择班级</td>
    			   	<td>
                         	<select name="studentclass" id="cla">
    			   	   	<!--遍历session中所有班级-->
    			   	   	<c:forEach items="${sessionScope.studentclass }" var="c">
    				   <option value="${c}">${c}</option>
    				   </c:forEach>
    			     </select>
    			   	</td>
    			   	<td>&nbsp;&nbsp;&nbsp;&nbsp;请选择试卷</td>
    			   	<td>
    			   		<!--遍历session中所有试卷-->
    			   		<select name="papername" id="paper">
    			   			<c:forEach items="${sessionScope.papername }" var="p">
    			   			<option value="${p}">${p }</option>
    			   			</c:forEach>
    			   		</select>
    			   	</td>
    			   	<td>
    			   		<input type="submit" value="查询" id="sub"/> 
    			   		
    			   		
    			   	</td>
    			   </tr>
    			</table>
    			</form>
    		</div>
    		<div>
    			<iframe src="" width="600px" height="300px"  frameborder="0" scrolling="no" name="if" ></iframe>
    		</div>
		</div>
    	</div>
    	
    	<div class="clear"></div>
    	<div class="footer">
    		<div class="copyright">Copyright © 1996-2017. All Rights Reserved.  版权所有    冀ICP备16013410号</div>
    	</div>
    	
 	</body>
</html>