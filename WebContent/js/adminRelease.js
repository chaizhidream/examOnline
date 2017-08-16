	//是否删除
	function deleted(){
		confirm("是否确定删除？");
	}
	//全选
	function check(){
		var targets=document.getElementsByName("actionSelects");//获取目标元素
		targetsLen=targets.length;//目标元素个数
		i=0;
		for(i=0;i<targetsLen;i++){
			targets[i].checked=true;
		}
	}
	