<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
    	<meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximun-scale=1.0,user-scalable=no">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>查看错题</title>
       
   
    <style type="text/css">
    *{
	margin:0;
	padding:0;
}
a{
	text-decoration: none;
	color: black;
}
a:hover{
	color: lightblue;
}
.header{
		width:100%;
		height: 80px;
		/*height:20%;*/
		background-image: url('../images/logo.jpg');
		position:relative;
}
.header p{
		font-size: 30px;
		color: white;
		text-align: center;
		line-height: 80px;
}
#nave{
	/*border:1px solid red;*/
	height:50px;
	/*height: 10%;*/
	width:80%;
	margin: 0 auto;
	position: relative;
}
#nave .td0{
	width: 250px;
	/*border: 1px black solid;*/
	text-align: center;
	line-height: 50px;
}



#nave #tr1{
	text-align: center;
	line-height: 50px;
}
#nave .td1{
	width: 350px;
	/*border: 1px solid black;*/	
}

#nave .td2{
	width: 50px;
	text-align: right;
}
/*#nave .td2 button{
	width: 50px;
	background-color: deepskyblue;
}*/
#main{
	height: 2000px;
	width: 70%;
	border: 1px solid cornflowerblue;
	margin: 0 auto;
	box-shadow: 0px 0px 8px cornflowerblue;
	position: relative;
}
#tab1{
	margin-top: 20px;
	margin-left: 20px;
	border-spacing: 10px;
	border: 1px solid gainsboro;
	
}

.xz,.tk,.bc{
	height: 50px;
	/*border: 1px solid red;*/
	font-size: 20px;
	font-weight: 500;
}
#xz_title,.tk_title,.bc_title{
	/*border: 1px solid red;*/
	/*border: 1px solid red;*/
	font-size: 18px;
	height: 20px;
}
.xz_choose{
	width: 50px;
	/*border: 1px solid red;*/
	height: 20px;
	font-size: 16px;
}
.xz_con{
	/*border: 1px solid red;*/
	width: 820px;
}
/*濉┖*/
#tab2{
	margin-top: 20px;
	margin-left: 20px;
	border-spacing: 10px;
	border: 1px solid gainsboro;
}
.tk_title,.bc_title{
	width: 880px;
}
/*缂栫▼*/
#tab3{
	margin-top: 20px;
	margin-left: 20px;
	border-spacing: 10px;
	border: 1px solid gainsboro;
}
#footer{
	width:100%;
	height:50px;
	background-image: url('images/logo.jpg');

	
}
.copyright{
	line-height: 50px;
	text-align: center;
	font-size: 15px;
}
.top{
	width:54px;
	height:54px;
	position:fixed;
	right:0px;
	bottom:20px;
}
.fy{

    margin-top: -50px;
    margin-left: 350px;
	 
}
    </style>
     </head>
    <body>
    	<div class="header">
		<a href="index.jsp"><p>在线考试系统</p></a>
	</div>
	<!--nave开始-->
	<div id="nave">
		<table class="pagination">
			<tr id="tr0" >
				<td class="td0" >
					请选择查看题型：
				</td>
				<td class="td0">
			
					
					<a href="student/seeFaultsXz.jsp?xztlist" target="if">选择题</a>
					<!-- 获取学生成绩的集合(list) -->
				
				</td>
				<td class="td0">
					<a href="student/seeFaultsTk.jsp?tktlist" target="if">填空题</a>
				</td>
				<td class="td0">
					<a href="student/seeFaultsBc.jsp?bctlist" target="if">编程题</a>
				</td>
			</tr>
		</table>
	</div>
	<!--nave结束-->
	
	<!--main开始-->
	<div id="main">
		<iframe src="student/seeFaultsXz.jsp" width="100%" height="100%" frameborder="0" scrolling="no" name="if"></iframe>
		
        <table class="fy" cellspacing="20px" cellpadding="10px">
		<tr>
		<td class="">
		<p style="font-size:23px">共有1页</p>
         <c:forEach begin="1" end="${sessionScope.paging.totalPage}" 
         step="1" var="pnum">
         <td>
         <a href="../paging?reqNum=${pnum }">${pnum }</a>
         </td>
         </c:forEach>
         </td>
         
         <td class="previousPage">
         <p style="color:gray">上一页</p>
         </td>
         
         <td class="nextPage">
         <p  style="color:gray">下一页

</p>
         </td>
         </tr>
         </table>
	</div>
	<!--main结束-->
	<div id="footer">
        <div class="copyright">Copyright © 1996-2017. All Rights Reserved. 版权所有    冀ICP备16013410号</div>
    </div>
    <div class="top">
		<a href="#" title="返回顶部"><img src="../images/top.png"></a>
	</div>
 	</body>
</html>