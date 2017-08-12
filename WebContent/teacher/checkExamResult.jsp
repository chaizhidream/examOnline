<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>教师查看成绩页面</title>
        <link rel="stylesheet" href="css/checkExamResult.css" />
        <script type="text/javascript">
        window.onload=function(){
        	fun2(){
        		window.open("teacherpic.jsp");
        	}
        }
        </script>
    </head>
    <body>
    	<div class="header">
    		<p>在线考试系统</p>
    	</div>
    	<div class="main">
    		<div class="m1" >
    		<form name="form1dsccb" action>
    			<table class="xz" cellspacing="30px">
    			   <tr>
    			   	<td><p>请选择班级</p></td>
    			   	<td>
    			   	  
                         	<select name="class">
    			   	   	<!--遍历session中所有班级-->
    			   	     	<c:forEach items="${sessionScope.studentclass }" var="c">
    				   <option value="${c}">${c}</option>
    				   </c:forEach>
                          </select>
    			   	</td>
    			   	<td><p>请选择试卷</p></td>
    			   	<td>
    			   		<!--遍历session中所有试卷-->
    			   		<select name="papername" id="paper">
    			   			<c:forEach items="${sessionScope.papername }" var="p">
    			   			<option value="${p}">${p }</option>
    			   			</c:forEach>
    			   		</select>
    			   	</td>
    			   	<td>&nbsp;&nbsp;<button id="b1" onclick="fun1()">查询</button></td>
    			    <td>&nbsp;&nbsp;<button id="b2" onclick="fun2()">成绩分析</button></td>
    			   </tr>
    			</table>
    		</div>
    			
    			<div class="m2">
    				<table class="cj" border="1px solid black">
    					<th>学生名</th>
    					<th>试卷名</th>
    					<th>成绩</th>
    					<th>学生个人成绩</th>
    					<c:forEach items="${sessionScope.StudentGrade }" var="sg">
    					<tr>
    						<td>${sg.papername}</td>
    						<td>${sg.username }</td>
    						<td>${sg.score }</td>
    						<td>
    							<center>
    							<!--进入学生个人成绩页面，根据选中的学生用户名查询数据库
    							 链接值为servlet中老师对学生进行操作的文件名
    							-->
    							   <a href="../ShowStudentgrade=select&uname=${user.username}">进入</a>
    							</center>
    						</td>    						
    					</tr>
    					</c:forEach>
    				</table>
    				</form>
    		</div>
    	</div>
    	<div class="footer">
    		<div class="copyright">Copyright © 1996-2017. All Rights Reserved. 版权所有</div>
    	</div>
    	<script language="JavaScript">
			function fun1(){
				document.form1.action="../ShowStudentGrade ";//查询学生成绩
			}
			function fun2(){
				document.form1.action="../ExportExcel";//柱状分析的servlet
			}
		</script>
 	</body>
</html>