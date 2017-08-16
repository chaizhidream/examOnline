<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>管理员管理教师</title>
        <link rel="stylesheet" href="css/mangerTeacher.css" />
        <script type="text/javascript" src="js/managerteacher.js" ></script>
        
        <style type="text/css">
        	#popupcontent{ 
            position: absolute; 
            visibility: hidden; 
            overflow: hidden; 
            border:1px solid #CCC; 
            background-color:#F9F9F9; 
            border:1px solid #333; 
            padding:5px; 
            } 
            .bd {
            	
            	text-align: right;
            }
            .j{
            	margin-left: 150px;
            	margin-top: 30px;
            	width: 60px;
            	height: 30px;
            	background-color: lightblue;
            }

           .mm{
           	margin-top: 50px;
           	margin-left:20px ;
           }
           #b1{
           	   width: 80px;
                height: 40px;
            	background-color: lightblue;
           }
           #s{
           	width: 40px;
           	height: 30px;
           	background-color: lightblue;
           }
           .t{
           	border-color: gainsboro;
           }

        </style>
    </head>
    <body>
    	<div class="header">
    		<p>在线考试系统</p>
    	</div>
    	<div class="main">
    		<table class="m01">
    			<tr>
    				<td><p class="js">教师信息</p></td>
    				<!--<td><p class="tj" ><a href="managerTeacher0.jsp">添加教师</a></td>-->
    					<td><p class="tj" ><button id="b1">添加教师</button></td>
    			</tr>
    		</table>
    		<hr />
    		<form name="form1" method="post" action="../DeleteUser">
    		<table class="t" border="1px solid" cellspacing="0">
    			<tr>
    			  <th>用户名</th>
    			  <th>姓名</th>
    			  <th>性别</th>
    			  <th>电话</th>
    			  <th>邮箱</th>
    			  <th>操作</th>
    			</tr>
    			<c:forEach items="${sessionScope.teacherlist}" var="t">
    				<tr>
    				<td>${t.teachername}</td>
    				<td>${t.name}</td>
    				<td>${t.sex}</td>
    				<td>${t.telephone}</td>
    				<td>${t.email}</td>
    				<td>
    					
    				<center>
    					<input id="s" type="submit" value="删除" />
    		            </center>
    		            </form>
    				</td>    				
    			</tr>
    			</c:forEach>
    		</table>
    		<div id="popupcontent">
    			
    			<form name=form1 method="post" action="../AddUser" >
    				<table class="mm">
    				  <tr>
    				  	<td class="bd">
    		             请输入添加的用户名 ：
    		         </td>
    		         <td >
    		         	<input type="text" name="username"/>
    		         </td>
    		          </tr>
    		          
    		          <tr>
    		          	<td class="bd">
    			                  请输入添加的教师姓名： 
    			        </td>
    			        <td>
    			        	<input type="text" name="name"/>
    			        </td>
    			       </tr>
    			       
    			       <tr>
    			       	<td class="bd">
    			           请选择添加的教师性别： 
    			        </td>
    			        <td >
    			        	<input type="text" name="sex"/>
    			        </td>
    			        </tr>
    			   <tr>
    			   	<td>  
    			<input id="su" class="j" type="submit" value="添加" />
    			</td>
    			</tr> 
    			</table>
    			</form>
    		</div>
    	</div>
    	
    	<div class="footer">
    		<div class="copyright">Copyright © 1996-2017. All Rights Reserved. 版权所有</div>
    	</div>

   </body>
</html>