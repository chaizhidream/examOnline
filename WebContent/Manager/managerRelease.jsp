<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>管理员发布公告页面</title>
		<link rel="stylesheet" type="text/css" href="css/managerRelease.css"/>
		<script type="text/javascript" src="js/managerRelease.js"></script>
		<script type="text/javascript" src="ckeditor/ckeditor.js"></script>
		<script type="text/javascript">
//			CKEDITOR.replace('test1');
			//获取发布内容
			window.onload=function(){
//				var test2=document.getElementById("test2");
//				test2.onclick=function(){
//					var test3=document.getElementById("test3");
//					
//				}
			}
		</script>
		

	</script>
	</head>
	<body>
		<div class="header">
			<p><a href="index.jsp">在线考试系统</a></p>
		</div>
		<!--第二部分-->
		<div id="naver">
			<P class="pl"></P>
			<p class="pr"></p>
			<div class="clear">当前位置：管理公告</div>
		</div>
		<!--第三部分-->
		<div id="main">
			<table style="width: 100%;height: 50px;">
				<tr>
					<td style="width: 35%; text-align: center;line-height: 50px;">添加公告 </td>
					<td style="width: 65%; text-align: center;line-height: 50px;">公告详情</td>
				</tr>
			</table>
			<!--向后台传数据在js里面-->
			<form action="" method="post">
			
			<div id="left">
				<!--<textarea class="ckeditor" name="" rows="10" cols="10" id="test1"></textarea>-->
				
				<input type="text" id="test1" value="" 
					style="width: 100%;height: 100%;"/>
			</div>
			
			<input type="button" id="test2" value="发布" />
				
			</form>
			<div id="test3"></div>
			
			<script type="text/javascript">
<!--
    var test1=document.getElementById("test1");
    var test2=document.getElementById("test2");
    var test3=document.getElementById("test3");
    var t,r,i=0;
    
    ///////////////点击发布的方法
    test2.onclick=move;
    function move(){
        var test=document.createElement('div');                            //创建一个微博框节点
        if(test1.value==""){                                            //如果输入的内容为空，重新输入
            alert("亲，请输入内容哦！");
            return;
        }else{
            test.setAttribute("class","test");                            //test的css样式
            test.innerHTML ='<p class="con">'+test1.value+'</p>';        //给节点添加内容 
            test3.insertBefore(test,test3.firstChild); //把创建的节点插入到temp3文档中,最新发布的放在第一个
            //获取上传内容
            var textcon=test3.firstChild.textContent;
            window.location.href="Notice?"
            
            test1.value="";                                                //当发布微博后，输入框里的内容消失
        ///////////////公告框运动
            var child=document.getElementById("test3").childNodes;        //获取所有test3的所有子节点
            var n=-test.offsetHeight;
            function run(){                                                //点击按钮时，微博框运动方法
                n++; 
                test.style.marginTop=n+"px";
                if(n>=0){n=0;return;clearTimeout(t);}                    ////此处return?????
                t=setTimeout(run,20);
            }run();    
        }
        ////////创建公告中时间和删除按钮节点
        var inf=document.createElement('div');                            //创建一个div节点，此div的目的是包含时间和删除按钮事件
            inf.setAttribute("class","inf");                            //inf的css样式
            var d=new Date();                                            //设置时间
            inf.innerHTML ='<span class="time">'+d.getHours()+"时"+d.getMinutes()+"分"+d.getSeconds()+"秒"+'</span>';//绑定时间 
            test.appendChild(inf);                                        //把inf节点插入到test中        
        var del=document.createElement('input');                        //创建删除按钮节点
            del.type="button";                                            //input的类型为button
            del.value="删除";
            del.style.float="right";
            del.style.border="none";
            del.style.backgroundColor="lightblue";
            del.style.width="60px";
            del.style.height="30px";
            inf.appendChild(del);                                        //del节点插入到test中
        /////删除按钮事件,删除的动画效果
        del.onclick=dele;
        function dele(){    
            //点击按钮，公告消失
            var m=test.offsetHeight;                                    //高度的值不能直接赋给变量,所以此处不用test.style.height
            function run2(){
                m--;
                r=setTimeout(run2,20);
                test.style.height=m+"px";
                if(m<=0)
                {m=0;clearTimeout(r);test3.removeChild(test);}            //test3.removeChild(test);//删除test的内容    
            }run2();
        }
    }
//-->
</script>
			
		</div>
		<div id="footer">
            <div class="copyright">Copyright © 1996-2017. All Rights Reserved. 版权所有</div>
        </div>
	</body>
</html>
