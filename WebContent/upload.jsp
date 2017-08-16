<%@ page language="java" contentType="text/html" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://www.atg.com/taglibs/json" prefix="json"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<form action="Upload" 
method="post" enctype="multipart/form-data">
文件信息:<input type="text" name="msg">
<br/>
上传文件:<input type="file" name="file">
<br/>
<input type="submit" value="确定">

</form>