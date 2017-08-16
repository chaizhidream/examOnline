<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Java类试卷试卷名</title>
        <link rel="stylesheet" href="css/getJava.css" />
    </head>
    <body>
    	<div class="main">
    		<form name="form1" method="post" action="../">
    	<table class="t" border="1px solid" cellspacing="0">
    	  	<tr>
    	  		<th>试卷名</th>
    	  		<th></th>
    	  	</tr>
    	  	<!--从ShowAllPaper中获取c++试卷名-->
    	  	<c:forEach items="${sessionScope.java}" var="j">
    	  	<tr>
    	  		<td><a href="ShowAllPaper?action=select&pname=${paper.papername }">${j.papername}</a></td>
    	  		<td><button style="background-color: lightblue;">导出试卷</button></td>
    	  	</tr>
    	  	</c:forEach>
    	  </table>
    	  </form>
    	  </div>
 	</body>
</html>