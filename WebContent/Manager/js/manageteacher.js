
//button按钮点击事件
   window.onload=function(){
   	var ins=document.getElementById('su');
   	
    ins.onclick=function(){
    	if(confirm("是否确认添加，添加成功后即将返回首页")){
    		window.open("teacher/index.jsp");
    	}
    }
   	
   }
