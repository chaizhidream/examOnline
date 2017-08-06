<%@page import="com.neuq.bean.StudentGrade"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>学生成绩</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script>
	</script>
  </head>
  <body>
  		<!-- 用jsp语句,将servlet传过来的list数据拿到,并放到一个list中 -->
  	<% 
  		ArrayList<StudentGrade> list = (ArrayList<StudentGrade>) request.getAttribute("list");
  	%>
  	<!-- 声明一个表格,这是表头 -->
  	<h2 align = "center">成绩列表</h2>
  	<table border = 1px align = "center">
  		<tr>
  			<th>用户id</th>
  			<th>用户名</th>
  			<th>成绩</th>
  			<th>考试名称</th>
  		</tr>
  		
  		<%
  			for(int i = 0;i<list.size();i++){
  				StudentGrade sg =(StudentGrade) list.get(i);%>
  				<tr>
  				<th><%=sg.getId()%></th>
  				<th><%=sg.getUsername()%></th>
  				<th><%=sg.getScore()%></th>
  				<th><%=sg.getPapername()%></th><br>
  				
  				<!-- 此处设置了一个修改<a>标签,做修改操作.并将上面拿到的数据传给update.jsp,当进入修改页面的时候,原来的数据会显示 -->
  				<th><a href="update.jsp?name=<%=sg.getId()%>&author=<%=sg.getUsername()%>&
  				&country=<%=sg.getScore()%>&price=<%=sg.getPapername()%>">修改</a> 
  				<!-- 删除操作,只把name字段传给Delete_Servlet.java,用来做删除操作 -->
  				<a href="<%=sg.getId()%>" onclick="confirm('确定删除该条记录?')">删除</a>
  				</th>
  		<% }
  		 %> 
  	</table>
  </body>
</html>