
//button按钮点击事件
   window.onload=function(){
   	var ins=document.getElementById('s');
   	
    ins.onclick=function(){
    	if(confirm("是否确认提交，提交成功后即将返回首页")){
    		window.open("teacher/index.jsp");
    	}
    }
   	
   }
