
//刷新验证码    
function refresh()    
{    
document.getElementById("authImg").src="AuthImg?now="+new Date();//使用时间作为参数避免浏览器从缓存取图片    
}    
function check() {  
 //alert("开始check函数");
    if(document.getElementById("vcode").value==""){  
        //  document.getElementById("verSpan").innerHTML = "验证码不能为空";  
		alert("验证码不能为空!");
          return;   
      }      
    // alert("不为空判断完成"); 
    
    var xmlHttp;  
    if(window.XMLHttpRequest) { //如果是ie7以上浏览器，使用new new XMLHttpRequest()创建对象  
	
        xmlHttp = new XMLHttpRequest();  
	//	alert("xmlhttp对象创建完成"); 
    }  
    else { //如果是ie7以下使用new new XMLHttpRequest()创建对象  
        xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");  
    }  
	//alert("xmlhttp对象创建结束"); 
  
 
 var v =document.getElementById("vcode").value; 
 //alert("取得v值"+v);
    xmlHttp.open("POST", "CheckCode", true);  
    xmlHttp.setRequestHeader("Content-type","application/x-www-form-urlencoded;charset=UTF-8");

	xmlHttp.send("vcode=" + v + "&random=" + Math.random); 
	
    xmlHttp.onreadystatechange = function () {  

 //alert(xmlHttp.readyState);
 // alert(xmlHttp.status);

      if (xmlHttp.readyState == 4 && xmlHttp.status == 200) {  
            
            if (xmlHttp.responseText == "1") {//从服务端端返回的字符串如果为1，则判定输入验证码正确  
                //document.getElementById("verSpan").innerHTML = "验证码正确";  
           }  
           else {  
               document.getElementById("verSpan").innerHTML = "验证码不正确";  
            }  
      }  
	   
    }  
 
             
 //   var v =document.getElementById("vcode").value;  
  //  xmlHttp.open("GET", "CheckCode?vcode=" + v + "&random=" + Math.random, true);  
   // xmlHttp.send();  
}  
function delData() {  
    
    document.getElementById("vcode").value ="";  
    document.getElementById("verSpan").innerHTML="";  
}  





 function reloadcode() {
		document.getElementById("codeImg").src = "code?" + new Date();
	}
 
 window.onload=function()
 {
  var y=document.getElementById("vcode");
  y.onclick=function()
  {
    y.src="image.jsp?"+Math.random();
  }
 }
 
 function myCheck(){      
          
		if(document.form01.username.value==""){            
		    alert("用户名不能为空");          
			document.form01.username.focus();            
			return false;         
		}  

		if(document.form01.password.value==""){            
			alert("密码不能为空");          
			document.form01.password.focus();            
			return false;         
		}  
		
		if(document.form01.vcode.value==""){            
			alert("验证码不能为空");          
			document.form01.vcode.focus();            
			return false;         
		}  		       
		return true;       
	}