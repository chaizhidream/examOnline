<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>试卷页选择题</title>
<link rel="stylesheet" type="text/css" href="css/paper.css"/>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
</head>
<body>
		<form action="DoExam" method="ps">
		<!--选择题-->

		<table id="tab1">
			<tr >
				<td colspan="2" id="xz">一、选择题</td>
			</tr>
			
				<%int a=1;%>
			<tr>
		
				<td colspan="2" id="xztitle">
					<%out.print(a++ +". ");%>${ps.xzt1qu}
				</td>
			</tr>
			<tr>
				<td class="xzchoose">
					<input type="radio" value="A" name="xz1"/>&nbsp;&nbsp;&nbsp;A
				</td>
				<td class="xzcon">
					${ps.xzt1opA}
				</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="B" name="xz1"/>&nbsp;&nbsp;&nbsp;B
				</td>
				<td>${ps.xzt1opB}</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="C" name="xz1"/>&nbsp;&nbsp;&nbsp;C
				</td>
				<td>${ps.xzt1opC}</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="D" name="xz1"/>&nbsp;&nbsp;&nbsp;D
				</td>
				<td>${ps.xzt1opD}</td>
			</tr>
			
			
			<!--第二题-->
			<tr>
				<td colspan="2" id="xztitle">
					2.${ps.xzt2qu}
				</td>
			</tr>
			<tr>
				<td class="xzchoose">
					<input type="radio" value="A" name="xz2"/>&nbsp;&nbsp;&nbsp;A
				</td>
				<td class="xzcon">
					${ps.xzt2opA}
				</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="B" name="xz2"/>&nbsp;&nbsp;&nbsp;B
				</td>
				<td>${ps.xzt2opB}</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="C" name="xz2"/>&nbsp;&nbsp;&nbsp;C
				</td>
				<td>${sessionScope.ps.xzt2opC}</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="D" name="xz2"/>&nbsp;&nbsp;&nbsp;D
				</td>
				<td>${sessionScope.ps.xzt2opD}</td>
			</tr>
			<!--第三题-->
			<tr>
				<td colspan="2" id="xztitle">
					3.${sessionScope.ps.xzt3qu}
				</td>
			</tr>
			<tr>
				<td class="xzchoose">
					<input type="radio" value="A" name="xz3"/>&nbsp;&nbsp;&nbsp;A
				</td>
				<td class="xzcon">
					${sessionScope.ps.xzt3opA}
				</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="B" name="xz3"/>&nbsp;&nbsp;&nbsp;B
				</td>
				<td>${sessionScope.ps.xzt3opB}</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="C" name="xz3"/>&nbsp;&nbsp;&nbsp;C
				</td>
				<td>${sessionScope.ps.xzt3opC}</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="D" name="xz3"/>&nbsp;&nbsp;&nbsp;D
				</td>
				<td>${sessionScope.ps.xzt3opD}</td>
			</tr>
			<!--第四题-->
			<tr>
				<td colspan="2" id="xztitle">
					4.${sessionScope.ps.xzt4qu}
				</td>
			</tr>
			<tr>
				<td class="xzchoose">
					<input type="radio" value="A" name="xz4"/>&nbsp;&nbsp;&nbsp;A
				</td>
				<td class="xzcon">
					${sessionScope.ps.xzt4opA}
				</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="B" name="xz4"/>&nbsp;&nbsp;&nbsp;B
				</td>
				<td>${sessionScope.ps.xzt4opB}</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="C" name="xz4"/>&nbsp;&nbsp;&nbsp;C
				</td>
				<td>${sessionScope.ps.xzt4opC}</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="D" name="xz4"/>&nbsp;&nbsp;&nbsp;D
				</td>
				<td>${sessionScope.ps.xzt4opD}</td>
			</tr>
			<!--第五题-->
			<tr>
				<td colspan="2" id="xztitle">
					5.${sessionScope.ps.xzt5qu}
				</td>
			</tr>
			<tr>
				<td class="xzchoose">
					<input type="radio" value="A" name="xz5"/>&nbsp;&nbsp;&nbsp;A
				</td>
				<td class="xzcon">
					${sessionScope.ps.xzt5opA}
				</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="B" name="xz5"/>&nbsp;&nbsp;&nbsp;B
				</td>
				<td>${sessionScope.ps.xzt5opB}</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="C" name="xz5"/>&nbsp;&nbsp;&nbsp;C
				</td>
				<td>${sessionScope.ps.xzt5opC}</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="D" name="xz5"/>&nbsp;&nbsp;&nbsp;D
				</td>
				<td>${sessionScope.ps.xzt5opD}</td>
			</tr>
			<!--第六题-->
			<tr>
				<td colspan="2" id="xztitle">
					6.${sessionScope.ps.xzt6qu}
				</td>
			</tr>
			<tr>
				<td class="xzchoose">
					<input type="radio" value="A" name="xz6"/>&nbsp;&nbsp;&nbsp;A
				</td>
				<td class="xzcon">
					${sessionScope.ps.xzt6opA}
				</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="B" name="xz6"/>&nbsp;&nbsp;&nbsp;B
				</td>
				<td>${sessionScope.ps.xzt6opB}</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="C" name="xz6"/>&nbsp;&nbsp;&nbsp;C
				</td>
				<td>${sessionScope.ps.xzt6opC}</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="D" name="xz6"/>&nbsp;&nbsp;&nbsp;D
				</td>
				<td>${sessionScope.ps.xzt6opD}</td>
			</tr>
			<!--第七题-->
			<tr>
				<td colspan="2" id="xztitle">
					7.${sessionScope.ps.xzt7qu}
				</td>
			</tr>
			<tr>
				<td class="xzchoose">
					<input type="radio" value="A" name="xz7"/>&nbsp;&nbsp;&nbsp;A
				</td>
				<td class="xzcon">
					${sessionScope.ps.xzt7opA}
				</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="B" name="xz7"/>&nbsp;&nbsp;&nbsp;B
				</td>
				<td>${sessionScope.ps.xzt7opB}</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="C" name="xz7"/>&nbsp;&nbsp;&nbsp;C
				</td>
				<td>${sessionScope.ps.xzt7opC}</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="D" name="xz7"/>&nbsp;&nbsp;&nbsp;D
				</td>
				<td>${sessionScope.ps.xzt7opD}</td>
			</tr>
			<!--第八题-->
			<tr>
				<td colspan="2" id="xztitle">
					8.${sessionScope.ps.xzt8qu}
				</td>
			</tr>
			<tr>
				<td class="xzchoose">
					<input type="radio" value="A" name="xz8"/>&nbsp;&nbsp;&nbsp;A
				</td>
				<td class="xzcon">
					${sessionScope.ps.xzt8opA}
				</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="B" name="xz8"/>&nbsp;&nbsp;&nbsp;B
				</td>
				<td>${sessionScope.ps.xzt8opB}</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="C" name="xz8"/>&nbsp;&nbsp;&nbsp;C
				</td>
				<td>${sessionScope.ps.xzt8opC}</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="D" name="xz8"/>&nbsp;&nbsp;&nbsp;D
				</td>
				<td>${sessionScope.ps.xzt8opD}</td>
			</tr>
			<!--第九题-->
			<tr>
				<td colspan="2" id="xztitle">
					9.${sessionScope.ps.xzt9qu}
				</td>
			</tr>
			<tr>
				<td class="xzchoose">
					<input type="radio" value="A" name="xz9"/>&nbsp;&nbsp;&nbsp;A
				</td>
				<td class="xzcon">
					${sessionScope.ps.xzt9opA}
				</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="B" name="xz9"/>&nbsp;&nbsp;&nbsp;B
				</td>
				<td>${sessionScope.ps.xzt9opB}</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="C" name="xz9"/>&nbsp;&nbsp;&nbsp;C
				</td>
				<td>${sessionScope.ps.xzt9opC}</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="D" name="xz9"/>&nbsp;&nbsp;&nbsp;D
				</td>
				<td>${sessionScope.ps.xzt9opD}</td>
			</tr>
			<!--第十题-->
			<tr>
				<td colspan="2" id="xztitle">
					10.${sessionScope.ps.xzt10qu}
				</td>
			</tr>
	
			<tr>
				<td class="xzchoose">
					<input type="radio" value="A" name="xz10"/>&nbsp;&nbsp;&nbsp;A
				</td>
				<td class="xzcon">
					${sessionScope.ps.xzt10opA}
				</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="B" name="xz10"/>&nbsp;&nbsp;&nbsp;B
				</td>
				<td>${sessionScope.ps.xzt10opB}</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="C" name="xz10"/>&nbsp;&nbsp;&nbsp;C
				</td>
				<td>${sessionScope.ps.xzt10opC}</td>
			</tr>
			<tr>
				<td>
					<input type="radio" value="D" name="xz10"/>&nbsp;&nbsp;&nbsp;D
				</td>
				<td>${sessionScope.ps.xzt10opD}</td>
			</tr>
			
		</table>
		
		<!--填空题-->
		<table id="tab2">
			<tr>
				<td class="tk">二、填空题</td>
			</tr>
			<tr>
				<td class="tktitle">
					1.${sessionScope.ps.tkt1qu}
				</td>
			</tr>
			<tr>
				<td class="tkcon">
					请输入你的答案:
					<input type="text" style="border: none;
						width: 700px;height: 30px;border-bottom: 1px solid black;" />
				</td>
			</tr>
			<!--第二题-->
			<tr>
				<td class="tktitle">
					2.${sessionScope.ps.tkt2qu}
				</td>
			</tr>
			<tr>
				<td class="tkcon">
					请输入你的答案:
					<input type="text" style="border: none;
						width: 700px;height: 30px;border-bottom: 1px solid black;" />
				</td>
			</tr>
			<!--第三题-->
			<tr>
				<td class="tktitle">
					3.${sessionScope.ps.tkt3qu}
				</td>
			</tr>
			<tr>
				<td class="tkcon">
					请输入你的答案:
					<input type="text" style="border: none;
						width: 700px;height: 30px;border-bottom: 1px solid black;" />
				</td>
			</tr>
			<!--第四题-->
			<tr>
				<td class="tktitle">
					4.${sessionScope.ps.tkt4qu}
				</td>
			</tr>
			<tr>
				<td class="tkcon">
					请输入你的答案:
					<input type="text" style="border: none;
						width: 700px;height: 30px;border-bottom: 1px solid black;" />
				</td>
			</tr>
			<!--第五题-->
			<tr>
				<td class="tktitle">
					5.${sessionScope.ps.tkt5qu}
				</td>
			</tr>
			<tr>
				<td class="tkcon">
					请输入你的答案:
					<input type="text" style="border: none;
						width: 700px;height: 30px;border-bottom: 1px solid black;" />
				</td>
			</tr>
		</table>
		
		</form>
</body>
</html>