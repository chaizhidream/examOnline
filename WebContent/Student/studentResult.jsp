<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
		<meta charset="UTF-8">
		<title>学生成绩查询</title>
		<!--<link rel="stylesheet" href="../css/studentResult.css" />-->
		<style>
			*{
				margin: 0;
				padding: 0;
			}
			
			.naver{
				width: 100%;
				height: 80px;
				background-color:  ghostwhite;
				border: 1px solid black;
				background-image: url(../images/logo.jpg);
			}
			.naver a{
				text-decoration: none;
			}
			.naver p{
				font-size: 30px;
				color: white;
				text-align: center;
				line-height: 80px;
				
			}
			body{
				background-color: ghostwhite;
			}
			#b1{
				width: 85px;
				height: 30px;
				background-color: lightblue;
			}

			.main{
				margin: 0 auto;
				width: 100%;
				height: 483px;
				/*background-color: grey;*/
			}
			.t1{
				margin: 0 auto;
				margin-top: 50px;
				width:80%;
				border-color: gainsboro;
			}
			.footer{
				width: 100%;
				height: 50px;
				/*border: 1px black  solid;*/
				background-image: url(../images/logo.jpg);
				
			}
			.copyright{
	           line-height: 50px;
	           text-align: center;
	           font-size: 15px;
			}
			
			<style type="text/css">
	   .pagination{
 overflow:hidden;
 margin-left: 450px;
 margin-top: 390px;
 padding:10px 10px 6px 10px;
 /*border-top:1px solid #f60;*/
 _zoom:1;
}
.pagination *{
 display:inline;
 float:left;
 margin:0;
 padding:0;
 font-size:12px;
}
.pagination i{
 float:none;
 padding-right:1px;
}
.currentPage b{
 float:none;
 color:#f00;
}
.pagination li{
 list-style:none;
 margin:0 5px;
}
.pagination li li{
 position:relative;
 margin:-2px 0 0;
 font-family: Arial, Helvetica, sans-serif
}
.firstPage a,.previousPage a,.nextPage a,.lastPage a{
 overflow:hidden;
 height:0;
 text-indent:-9999em;
 border-top:8px solid #fff;
 border-bottom:8px solid #fff;
}
.pagination li li a{
 margin:0 1px;
 padding:0 4px;
 border:3px double #fff;
 +border-color:#eee;
 background:#eee;
 color:#06f;
 text-decoration:none;
}
.pagination li li a:hover{
 background:#f60;
 border-color:#fff;
 +border-color:#f60;
 color:#fff;
}
li.firstPage{
 margin-left:40px;
 border-left:3px solid #06f;
}
.firstPage a,.previousPage a{
 border-right:12px solid #06f;
}
.firstPage a:hover,.previousPage a:hover{
 border-right-color: #f60;
}
.nextPage a,.lastPage a{
 border-left:12px solid #06f;
}
.nextPage a:hover,.lastPage a:hover{
 border-left-color:#f60;
}
li.lastPage{
 border-right:3px solid #06f;
}
li li.currentState a{
 position:relative;
 margin:-1px 3px;
 padding:1px 4px;
 border:3px double #fff;
 +border-color:#f60;
 background:#f60;
 color:#fff;
}
li.currentState,.currentState a,.currentState a:hover{
 border-color:#fff #ccc;
 cursor:default;
}

.fy{
   margin-top: 380px;
   margin-left: 450px;
}
		</style>
		
		<script type="text/javascript">
		window.onload=function(){
			var btn=document.getElementById("b1");
			btn.onclick=function(){
				
				window.open("jqchart/samples/AxisSettings.htm");
			}
		}
		</script>
	</head>
	<body>
		<div class="naver">
			<a href="index.jsp"><p>在线考试系统</p></a>
		</div>
		<div class="main">
		<form>
			<table class="t1" border="1px solid " cellspacing="0" >
				<!--<thead>考试成绩</thead>-->
				<tr>
					<th >学生班级</th>
					<th >学生名</th>
					<th >试卷名</th>
					<th >选择题成绩</th>
					<th >填空题成绩</th>
					<th >编程题成绩</th>
					<th >总成绩</th>
					<th ></th>
					
					
				</tr>
				<!-- 获取学生成绩的集合(list) -->
				<c:forEach var="user" items="${sessionScope.mygradelist }">
				<tr>		
				<td><center>${sessionScope.Student.studentclass }</center></td>
				<td><center>${user.username}</center></td>
				<td><center>${user.papername }</center></td>
				<td><center>${user.xztscore }</center></td>
				<td><center>${user.tktscore }</center></td>
				<td><center>${user.bctscore }</center></td>
				<td><center>${user.xztscore+user.tktscore+user.bctscore}</center></td>
				<td><center><button id="b1">成绩分析</button></center></td>
				</tr>
				</c:forEach>
			</table>
			</form>
			
			<div class="fy">
           	
		<ul class="pagination" title="分页列表">
        
        <li class="totalPage">总页数：<i>${sessionScope.paging.totalPage }页,
         <c:forEach begin="1" end="${sessionScope.paging.totalPage}" 
         step="1" var="pnum"></i></li>
        <li class="currentPage">
        <a href="../paging?reqNum=${pnum }">${pnum }</a></li>
         </c:forEach>
        <li class="previousPage ">
        <a href="../paging?reqNum=${sessionScope.paging.previous }" title="前一页">
          前一页</a></li>
        
       <li class="nextPage">
       <a href="../paging?reqNum=${sessionScope.paging.next }" title="后一页">
               后一页</a></li>
  </ul>
       <form name="form2" method="post">
       <button id="b2" style="background-color: lightblue;" onclick="fun2()">导出成绩</button>
       </form>
       </div>
		</div>
		<div class="footer">
			<div class="copyright">Copyright © 1996-2017. All Rights Reserved. 版权所有    冀ICP备16013410号</div>
		</div>
		
		<script language="JavaScript">
			function fun1(){
				document.form1.action=" ";//调用柱状分析
				
			}
			function fun2(){
				document.form2.action=" ../ExportExcel";//导出excel
				
			}
		</script>
 	</body>
</html>