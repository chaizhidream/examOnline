<%@ page language="java" import="java.util.*" 
pageEncoding="gbk"%>

<form action="Upload" 
method="post" enctype="multipart/form-data">
文件信息:<input type="text" name="msg">
<br/>
上传文件:<input type="file" name="file">
<br/>
<input type="submit" value="确定">

</form>