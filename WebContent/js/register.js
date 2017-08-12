function checkuname(){	
//判断用户名是否存在
///判断用户名是否合法
	var uname=document.getElementById("username").value;
	var sp1=document.getElementsByTagName("span")[0];
  	var unameReg = /^[a-zA-Z][a-zA-Z0-9_]{2,15}$/g;
  	var result1=unameReg.test(uname);
  	if(uname==""){
  		sp1.innerHTML="用户名不能为空";
  		sp1.style.color="red";
  	}
  	else if(!result1){
  		sp1.innerHTML="请以字母开头，允许数字下划线";
  		sp1.style.color="red";
  	}else{
  		sp1.innerHTML="用户名合法";
  		sp1.style.color="green";
  	}
}

function checkrealname(){
	//判断真实姓名是否为空
	var realname=document.getElementById("realname").value;
	var sp2=document.getElementsByTagName("span")[1];
	if(realname==""){
  		sp2.innerHTML="真实姓名不能为空";
  		sp2.style.color="red";
  	}else{
  		sp2.innerHTML="真实姓名合法";
  		sp2.style.color="green";
  	}
}

function checkclass(){
	//判断class是否存在
	//判断真实姓名是否为空
	var clas=document.getElementById("clas").value;
	var sp3=document.getElementsByTagName("span")[2];
	if(clas==""){
  		sp3.innerHTML="班级不能为空";
  		sp3.style.color="red";
  	}else{
  		sp3.innerHTML="合法";
  		sp3.style.color="green";
  	}
}

function checkpwd(){
	///判断密码是否合法
	var pwd=document.getElementById("pwd").value;
	var sp4=document.getElementsByTagName("span")[3];
  	var pwdReg = /^[a-zA-Z][a-zA-Z0-9_]{5,15}$/;
  	var result=pwdReg.test(pwd);
  	if(pwd==""){
  		sp4.innerHTML="密码不能为空";
  		sp4.style.color="red";
  	}
  	else if(!result){
  		sp4.innerHTML="请以字母开头，允许数字下划线";
  		sp4.style.color="red";
  	}else{
  		sp4.innerHTML="密码合法";
  		sp4.style.color="green";
  	}
}

function checkpwd2(){
	///判断密码是否合法
	var pwd2=document.getElementById("pwd2").value;
	var sp5=document.getElementsByTagName("span")[4];
  	if(pwd2!=""&&pwd2==document.getElementById("pwd").value){
  		sp5.innerHTML="合法";
  		sp5.style.color="green";
  	}
  	else {
  		sp5.innerHTML="两次密码输入不相同!";
  		sp5.style.color="red";
  	}
}
    
function myCheck(){
	
	if(document.getElementById("username").value==""){            
	    alert("用户名不能为空");  
	    document.formregister.username.focus();             
		return false;         
	} if(document.getElementById("realname").value==""){            
	    alert("请输入真实姓名");          
		document.formregister.realname.focus();            
		return false;         
	}  
	if(document.getElementById("clas").value==""){            
	    alert("请输入所在班级");          
		document.formregister.clas.focus();            
		return false;         
	}  
	if(document.getElementById("pwd").value==""){            
	    alert("请输入密码");          
		document.formregister.pwd.focus();            
		return false;         
	}  
	if(document.getElementById("pwd2").value==""){            
	    alert("请输入密码进行确认");          
		document.formregister.pwd2.focus();            
		return false;         
	}    
   
 return true;      
	
}	
//	//验证用户名是否被占用
//	var req = false;
//  	function processRequest(){
//  		if (window.XMLHttpRequest) {
//             req = new XMLHttpRequest();
//         }else if (window.ActiveXObject) {
//             req = new ActiveXObject("Microsoft.XMLHTTP");
//         }
//  		
//         if(req){
//        	var url = "register?action=check";
//        	// POST方式
//        	req.open("post", url, false);	
//        	// POST方式需要自己设置http的请求头
//		 	req.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
//        	var username = document.getElementById("username").value;
//       		req.onreadystatechange = updatePage;
//       		req.send("username=" + username);
//         }
//  	}
//
//  	function updatePage(){
//  		//alert(req.readyState);
//  		if(req.readyState==4){
//  			if(req.status==200){
//  				var res = req.responseText;
//  				if (res == 1) {
//  					document.getElementById("res").innerHTML="可以使用";
//  				} else {
//  					document.getElementById("res").innerHTML="已经被占用";
//  					document.getElementById("username").focus();
//  				}
//  			}
//  		}
//  	}