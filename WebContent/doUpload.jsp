<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@page import="com.jspsmart.upload.SmartFile"%>
<%@page import="com.jspsmart.upload.SmartFiles"%>
<%@page import="com.jspsmart.upload.SmartRequest"%>
<%@ page language="java" import="java.util.*" %>

<!-- 处理文件上传 -->
<jsp:useBean id="su" class="com.jspsmart.upload.SmartUpload">
</jsp:useBean>
<%
su.initialize(pageContext);
su.setAllowedFilesList("jpg,png,jpeg,pdf,gif");
su.setMaxFileSize(1024*1024*10);
su.setTotalMaxFileSize(1024*1024*10*5);
su.upload();
SmartRequest sRequest=su.getRequest();
String msg=sRequest.getParameter("msg");
SmartFiles sfs=su.getFiles();
SmartFile sf=sfs.getFile(0);
//上传路径-----
String path=request.getContextPath()+"/pic";
String fname=sf.getFileName();
String arr[] = fname.split("\\.");
String newfname=arr[0]+new Date().getTime()+Math.random()+"."+arr[1];
sf.saveAs("/pic/"+newfname);
out.println("文件上传成功！"+"</br>");
%>





