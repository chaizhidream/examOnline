<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ page language="java"  import="java.util.*"%>
<%@ taglib uri="http://www.atg.com/taglibs/json" prefix="json"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>编程题页面</title>
        <link rel="stylesheet" type="text/css" href="css/paper.css"/>
    	<script type="text/javascript">
    		window.onload=function(){
    			var sub=document.getElementById("sub");
    			sub.onclick=function(){
    				if(confirm("是否确认提交？提交后将返回首页")){
    					window.open("student/index.jsp");
    				}
    			}
    			
    		}
    	</script>
    </head>
    <body>
     	<div id="div1">
		
    	<!--编程题-->
		
			<tr>
				<td class="bc" colspan="2">三、编程题</td>
			</tr>
			
			<form action="../examOnline/UploadBct" method="post" enctype="multipart/form-data">
		
			<table id="tab3">
			<tr><%int a = 1; %>
				<td class="bctitle"colspan="2">
					<%out.print(a++); %>.${sessionScope.ps.bct1qu}
				</td>
			</tr>
			<tr>
				<td class="bccon">
					请上传你的答案（文件格式jpg,png,jpeg,pdf,gif）	
				</td>
				<td>
				
					
				<input type="file" name="file"style="border: none;">
					
					<input type="submit"  value="确定上传" id="inputFile">
					
				</td>
			</tr>
			</table>
			</form>
			</div>
			<form action="../examOnline/UploadBct" method="post" enctype="multipart/form-data">
			<table id="tab4">
			<!--第二题-->
			<tr>
				<td class="bctitle"colspan="2">
					1.${sessionScope.ps.bct1qu}
				</td>
			</tr>
			<tr>
				<td class="bccon">
					请上传你的答案（文件格式jpg,png,jpeg,pdf,gif）	
				</td>
				<td>
					
						<input type="file" name="file" style="border: none;"method="post">
						<input type="submit"  value="确定上传" id="inputFile">
				
				</td>
			</tr>
		</table>
			</form>
		<!--提交试卷-->
		<table id="tab4">
			<tr>
				<td style="width: 770px; text-align: center;"></td>
				<td style="width: 100px; text-align: center;">
					<input type="submit" id="sub" value="提交试卷" onclick="subChecked()"
					style="border: none;background-color: lightblue; 
					width: 200px;height: 50px;margin-right: 15px;"/>
				</td>
			</tr>
		</table>
    </form>
    	
 	</body>
</html>