<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>自测</title>
        <link rel="stylesheet" type="text/css" href="css/selfTest.css"/>
    	<script type="text/javascript">
    		window.onload=function(){
    			var btn=document.getElementById("btn");
    			btn.onclick=function(){
//  				alert(">>>");
    				var inputed=document.getElementsByClassName("an");
    				for(var i=0;i<inputed.length;i++){
    					inputed[i].type="text";
    				}
    				
    			}
    		}
    	</script>
    	
    
    </head>
    <body>
	<div class="header">
		<a href="index.jsp"><p>在线考试系统</p></a>
	</div>
	<!--nave开始-->
	<div id="nave">
		<table>
			<tr id="tr1">
				<td class="td1"></td>
				<td class="td1"></td>
				<td class="td1"><!--试卷名称xxx--></td>
			</tr>
		</table>
	</div>
	<!--nave结束-->
	
	<!--main开始-->
	<div id="main">
		<!--选择题-->
		<table id="tab1">
			
			<tr >
				<td colspan="2" id="xz">一、选择题</td>
			</tr>
			<tr>
				<td colspan="2" id="xz_title">
					1.${sessionScope.selftest.xzt1qu}
				</td>
			</tr>
			<tr>
				<td class="xz_choose">
					<input type="radio" value="" name="xz1"/>&nbsp;&nbsp;&nbsp;A
				</td>
				<td class="xz_con">
					${sessionScope.selftest.xzt1opA}
				</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="" name="xz1"/>&nbsp;&nbsp;&nbsp;B
				</td>
				<td>${sessionScope.selftest.xzt1opB}</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="" name="xz1"/>&nbsp;&nbsp;&nbsp;C
				</td>
				<td>${sessionScope.selftest.xzt1opC}</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="" name="xz1"/>&nbsp;&nbsp;&nbsp;D
				</td>
				<td>${sessionScope.selftest.xzt1opD}</td>
			</tr>
			<!--答案-->
			<tr>
				<td colspan="2" >
					<input id="an" type="hidden" name="" 
						value="正确答案：${sessionScope.selftest.xzt1an}"class="an" 
						style="border: none;color: red;width: 600px;height: 30px;"/>
				</td>
			</tr>
			<!--第二题-->
			<tr>
				<td colspan="2" id="xz_title">
					2.${sessionScope.selftest.xzt2qu}
				</td>
			</tr>
			<tr>
				<td class="xz_choose">
					<input type="radio" value="" name="xz1"/>&nbsp;&nbsp;&nbsp;A
				</td>
				<td class="xz_con">
					${sessionScope.selftest.xzt2opA}
				</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="" name="xz1"/>&nbsp;&nbsp;&nbsp;B
				</td>
				<td>${sessionScope.selftest.xzt2opB}</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="" name="xz1"/>&nbsp;&nbsp;&nbsp;C
				</td>
				<td>${sessionScope.selftest.xzt2opC}</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="" name="xz1"/>&nbsp;&nbsp;&nbsp;D
				</td>
				<td>${sessionScope.selftest.xzt2opD}</td>
			</tr>
			<!--答案-->
			<tr>
				<td colspan="2" >
					<input id="an" type="hidden" name="" 
						value="正确答案:${sessionScope.selftest.xzt2an}"class="an" 
						style="border: none;color: red;width: 600px;height: 30px;"/>
				</td>
			</tr>
			<!--第三题-->
			<tr>
				<td colspan="2" id="xz_title">
					3.${sessionScope.selftest.xzt3qu}
				</td>
			</tr>
			<tr>
				<td class="xz_choose">
					<input type="radio" value="" name="xz1"/>&nbsp;&nbsp;&nbsp;A
				</td>
				<td class="xz_con">
					${sessionScope.selftest.xzt3opA}
				</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="" name="xz1"/>&nbsp;&nbsp;&nbsp;B
				</td>
				<td>${sessionScope.selftest.xzt3opB}</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="" name="xz1"/>&nbsp;&nbsp;&nbsp;C
				</td>
				<td>${sessionScope.selftest.xzt3opC}</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="" name="xz1"/>&nbsp;&nbsp;&nbsp;D
				</td>
				<td>${sessionScope.selftest.xzt3opD}</td>
			</tr>
			<!--答案-->
			<tr>
				<td colspan="2" >
					<input id="an" type="hidden" name="" 
						value="正确答案:${sessionScope.selftest.xzt3an}"class="an" 
						style="border: none;color: red;width: 600px;height: 30px;"/>
				</td>
			</tr>
			<!--第四题-->
			<tr>
				<td colspan="2" id="xz_title">
					4.${sessionScope.selftest.xzt4qu}
				</td>
			</tr>
			<tr>
				<td class="xz_choose">
					<input type="radio" value="" name="xz1"/>&nbsp;&nbsp;&nbsp;A
				</td>
				<td class="xz_con">
					${sessionScope.selftest.xzt4opA}
				</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="" name="xz1"/>&nbsp;&nbsp;&nbsp;B
				</td>
				<td>${sessionScope.selftest.xzt4opB}</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="" name="xz1"/>&nbsp;&nbsp;&nbsp;C
				</td>
				<td>${sessionScope.selftest.xzt4opC}</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="" name="xz1"/>&nbsp;&nbsp;&nbsp;D
				</td>
				<td>${sessionScope.selftest.xzt4opD}</td>
			</tr>
			<!--答案-->
			<tr>
				<td colspan="2" >
					<input id="an" type="hidden" name="" 
						value="正确答案:${sessionScope.selftest.xzt4an}"class="an" 
						style="border: none;color: red;width: 600px;height: 30px;"/>
				</td>
			</tr>
			<!--第五题-->
			<tr>
				<td colspan="2" id="xz_title">
					5.${sessionScope.selftest.xzt5qu}
				</td>
			</tr>
			<tr>
				<td class="xz_choose">
					<input type="radio" value="" name="xz1"/>&nbsp;&nbsp;&nbsp;A
				</td>
				<td class="xz_con">
					${sessionScope.selftest.xzt5opA}
				</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="" name="xz1"/>&nbsp;&nbsp;&nbsp;B
				</td>
				<td>${sessionScope.selftest.xzt5opB}</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="" name="xz1"/>&nbsp;&nbsp;&nbsp;C
				</td>
				<td>${sessionScope.selftest.xzt5opC}</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="" name="xz1"/>&nbsp;&nbsp;&nbsp;D
				</td>
				<td>${sessionScope.selftest.xzt5opD}</td>
			</tr>
			<!--答案-->
			<tr>
				<td colspan="2" >
					<input id="an" type="hidden" name="" 
						value="正确答案:${sessionScope.selftest.xzt5an}"class="an" 
						style="border: none;color: red;width: 600px;height: 30px;"/>
				</td>
			</tr>
			<!--第六题-->
			<tr>
				<td colspan="2" id="xz_title">
					6.${sessionScope.selftest.xzt6qu}
				</td>
			</tr>
			<tr>
				<td class="xz_choose">
					<input type="radio" value="" name="xz1"/>&nbsp;&nbsp;&nbsp;A
				</td>
				<td class="xz_con">
					${sessionScope.selftest.xzt6opA}
				</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="" name="xz1"/>&nbsp;&nbsp;&nbsp;B
				</td>
				<td>${sessionScope.selftest.xzt6opB}</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="" name="xz1"/>&nbsp;&nbsp;&nbsp;C
				</td>
				<td>${sessionScope.selftest.xzt6opC}</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="" name="xz1"/>&nbsp;&nbsp;&nbsp;D
				</td>
				<td>${sessionScope.selftest.xzt6opD}</td>
			</tr>
			<!--答案-->
			<tr>
				<td colspan="2" >
					<input id="an" type="hidden" name="" 
						value="正确答案:${sessionScope.selftest.xzt6an}"class="an" 
						style="border: none;color: red;width: 600px;height: 30px;"/>
				</td>
			</tr>
			<!--第七题-->
			<tr>
				<td colspan="2" id="xz_title">
					7.${sessionScope.selftest.xzt7qu}
				</td>
			</tr>
			<tr>
				<td class="xz_choose">
					<input type="radio" value="" name="xz1"/>&nbsp;&nbsp;&nbsp;A
				</td>
				<td class="xz_con">
					${sessionScope.selftest.xzt7opA}
				</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="" name="xz1"/>&nbsp;&nbsp;&nbsp;B
				</td>
				<td>${sessionScope.selftest.xzt7opB}</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="" name="xz1"/>&nbsp;&nbsp;&nbsp;C
				</td>
				<td>${sessionScope.selftest.xzt7opC}</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="" name="xz1"/>&nbsp;&nbsp;&nbsp;D
				</td>
				<td>${sessionScope.selftest.xzt7opD}</td>
			</tr>
			<!--答案-->
			<tr>
				<td colspan="2" >
					<input id="an" type="hidden" name="" 
						value="正确答案:${sessionScope.selftest.xzt7an}"class="an" 
						style="border: none;color: red;width: 600px;height: 30px;"/>
				</td>
			</tr>
			<!--第八题-->
			<tr>
				<td colspan="2" id="xz_title">
					8.${sessionScope.selftest.xzt8qu}
				</td>
			</tr>
			<tr>
				<td class="xz_choose">
					<input type="radio" value="" name="xz1"/>&nbsp;&nbsp;&nbsp;A
				</td>
				<td class="xz_con">
					${sessionScope.selftest.xzt8opA}
				</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="" name="xz1"/>&nbsp;&nbsp;&nbsp;B
				</td>
				<td>${sessionScope.selftest.xzt8opB}</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="" name="xz1"/>&nbsp;&nbsp;&nbsp;C
				</td>
				<td>${sessionScope.selftest.xzt8opC}</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="" name="xz1"/>&nbsp;&nbsp;&nbsp;D
				</td>
				<td>${sessionScope.selftest.xzt8opD}</td>
			</tr>
			<!--答案-->
			<tr>
				<td colspan="2" >
					<input id="an" type="hidden" name="" 
						value="正确答案:${sessionScope.selftest.xzt8an}"class="an" 
						style="border: none;color: red;width: 600px;height: 30px;"/>
				</td>
			</tr>
			<!--第九题-->
			<tr>
				<td colspan="2" id="xz_title">
					9.${sessionScope.selftest.xzt9qu}
				</td>
			</tr>
			<tr>
				<td class="xz_choose">
					<input type="radio" value="" name="xz1"/>&nbsp;&nbsp;&nbsp;A
				</td>
				<td class="xz_con">
					${sessionScope.selftest.xzt9opA}
				</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="" name="xz1"/>&nbsp;&nbsp;&nbsp;B
				</td>
				<td>${sessionScope.selftest.xzt9opB}</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="" name="xz1"/>&nbsp;&nbsp;&nbsp;C
				</td>
				<td>${sessionScope.selftest.xzt9opC}</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="" name="xz1"/>&nbsp;&nbsp;&nbsp;D
				</td>
				<td>${sessionScope.selftest.xzt9opD}</td>
			</tr>
			<!--答案-->
			<tr>
				<td colspan="2" >
					<input id="an" type="hidden" name="" 
						value="正确答案:${sessionScope.selftest.xzt9an}"class="an" 
						style="border: none;color: red;width: 600px;height: 30px;"/>
				</td>
			</tr>
			<!--第十题-->
			<tr>
				<td colspan="2" id="xz_title">
					10.${sessionScope.selftest.xzt10qu}
				</td>
			</tr>
			<tr>
				<td class="xz_choose">
					<input type="radio" value="" name="xz1"/>&nbsp;&nbsp;&nbsp;A
				</td>
				<td class="xz_con">
					${sessionScope.selftest.xzt10opA}
				</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="" name="xz1"/>&nbsp;&nbsp;&nbsp;B
				</td>
				<td>${sessionScope.selftest.xzt10opB}</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="" name="xz1"/>&nbsp;&nbsp;&nbsp;C
				</td>
				<td>${sessionScope.selftest.xzt10opC}</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="" name="xz1"/>&nbsp;&nbsp;&nbsp;D
				</td>
				<td>${sessionScope.selftest.xzt10opD}</td>
			</tr>
			<!--答案-->
			<tr>
				<td colspan="2" >
					<input id="an" type="hidden" name="" 
						value="正确答案:${sessionScope.selftest.xzt10an}"class="an" 
						style="border: none;color: red;width: 600px;height: 30px;"/>
				</td>
			</tr>	
		</table>
		
		<!--填空题-->
		<table id="tab2">
			<tr>
				<td class="tk">二、填空题</td>
			</tr>
			<!--第一题-->
			<tr>
				<td class="tk_title">
					1.${sessionScope.selftest.tkt1qu}
				</td>
			</tr>
			<tr>
				<td class="tk_con">
					请输入你的答案:
					<input type="text" style="border: none; width: 600px; height: 30px;border-bottom: 1px black solid;" />
				</td>
			</tr>
			<!--填空题答案-->
			<tr>
				<td colspan="2" >
					<input id="an" type="hidden" name="" id="an" 
						value="正确答案：${sessionScope.selftest.tkt1an}"class="an" 
						style="border: none;color: red;width: 600px;height: 30px;"/>
				</td>
			</tr>
			<!--第二题-->
			<tr>
				<td class="tk_title">
					2.${sessionScope.selftest.tkt2qu}
				</td>
			</tr>
			<tr>
				<td class="tk_con">
					请输入你的答案:
					<input type="text" style="border: none; width: 600px; height: 30px;border-bottom: 1px black solid;" />
				</td>
			</tr>
			<!--填空题答案-->
			<tr>
				<td colspan="2" >
					<input id="an" type="hidden" name="" id="an" 
						value="正确答案：${sessionScope.selftest.tkt2an}"class="an" 
						style="border: none;color: red;width: 600px;height: 30px;"/>
				</td>
			</tr>
			<!--第三题-->
			<tr>
				<td class="tk_title">
					3.${sessionScope.selftest.tkt3qu}
				</td>
			</tr>
			<tr>
				<td class="tk_con">
					请输入你的答案:
					<input type="text" style="border: none; width: 600px; height: 30px;border-bottom: 1px black solid;" />
				</td>
			</tr>
			<!--填空题答案-->
			<tr>
				<td colspan="2" >
					<input id="an" type="hidden" name="" id="an" 
						value="正确答案：${sessionScope.selftest.tkt3an}"class="an" 
						style="border: none;color: red;width: 600px;height: 30px;"/>
				</td>
			</tr>
			<!--第四题-->
			<tr>
				<td class="tk_title">
					4.${sessionScope.selftest.tkt4qu}
				</td>
			</tr>
			<tr>
				<td class="tk_con">
					请输入你的答案:
					<input type="text" style="border: none; width: 600px; height: 30px;border-bottom: 1px black solid;" />
				</td>
			</tr>
			<!--填空题答案-->
			<tr>
				<td colspan="2" >
					<input id="an" type="hidden" name="" id="an" 
						value="正确答案：${sessionScope.selftest.tkt4an}"class="an" 
						style="border: none;color: red;width: 600px;height: 30px;"/>
				</td>
			</tr>
			<!--第五题-->
			<tr>
				<td class="tk_title">
					5.${sessionScope.selftest.tkt5qu}
				</td>
			</tr>
			<tr>
				<td class="tk_con">
					请输入你的答案:
					<input type="text" style="border: none; width: 600px; height: 30px;border-bottom: 1px black solid;" />
				</td>
			</tr>
			<!--填空题答案-->
			<tr>
				<td colspan="2" >
					<input id="an" type="hidden" name="" id="an" 
						value="正确答案：${sessionScope.selftest.tkt5an}"class="an" 
						style="border: none;color: red;width: 600px;height: 30px;"/>
				</td>
			</tr>	
		</table>
		
		<!--编程题-->
		<table id="tab3">
			<tr>
				<td class="bc" colspan="2">三、编程题</td>
			</tr>
			<tr>
				<td class="bc_title"colspan="2">
					1.${sessionScope.selftest.bct1qu}
				</td>
			</tr>
			<!--第二题-->
			<tr>
				<td class="bc_title"colspan="2">
					2.${sessionScope.selftest.bct2qu}
				</td>
			</tr>
		</table>
		<!--查看答案-->
		<table id="tab4">
			<tr>
				<td style="width: 770px; text-align: center;"></td>
				<td style="width: 100px; text-align: center;">
					<button id="btn" style="border: none; width: 100px; 
						height: 30px; background-color: lightblue;">
						查看答案
					</button>
				</td>
			</tr>
		</table>
	</div>
	<!--main结束-->
	
	
	<div id="footer">
        <div class="copyright">Copyright © 1996-2017. All Rights Reserved. 版权所有</div>
    </div>
    <div class="top">
		<a href="#" title="返回顶部"><img src="../images/top.png"></a>
	</div>
 	</body>
</html>