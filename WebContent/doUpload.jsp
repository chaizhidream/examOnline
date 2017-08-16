<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@page import="com.jspsmart.upload.SmartFile"%>
<%@page import="com.jspsmart.upload.SmartFiles"%>
<%@page import="com.jspsmart.upload.SmartRequest"%>
<%@ page language="java" import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- 处理文件上传 -->
<jsp:useBean id="su" class="com.jspsmart.upload.SmartUpload">
</jsp:useBean>
<form action="Upload" 
method="post" enctype="multipart/form-data">
文件信息:<input type="text" name="msg">
<br/>
上传文件:<input type="file" name="file">
<br/>
<input type="submit" value="确定">

</form>






