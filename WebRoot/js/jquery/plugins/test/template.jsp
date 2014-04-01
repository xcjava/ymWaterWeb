<%@ page language="java" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>简洁jQuery滑动门插件 单击切换演示</title>
	<style type="text/css">
	body,ul,li{margin: 0;padding: 0;font: 12px normal "宋体", Arial, Helvetica, sans-serif;list-style: none;}
	a{text-decoration: none;color: #000;font-size: 14px;}
	
	#tabbox{ width:1000; overflow:hidden; margin:5 auto;}
	.tab_conbox{border: 1px solid #999;border-top: none;}
	.tab_con{ display:none;}
	
	.tabs{height: 32px;border-bottom:1px solid #999;border-left: 1px solid #999;width: 100%;}
	.tabs li{height:31px;line-height:31px;float:left;border:1px solid #999;border-left:none;margin-bottom: -1px;background: #e0e0e0;overflow: hidden;position: relative;}
	.tabs li a {display: block;padding: 0 20px;border: 1px solid #fff;outline: none;}
	.tabs li a:hover {background: #ccc;}	
	.tabs .thistab,.tabs .thistab a:hover{background: #fff;border-bottom: 1px solid #fff;}
	
	.tab_con {padding:12px;font-size: 14px; line-height:175%;}
	</style>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script src="<%=basePath%>js/jquery/jquery-1.7.2.min.js" type="text/javascript"></script>
	<script src="<%=basePath%>js/jquery/plugins/jquery.jqtab.js" type="text/javascript"></script>
	<script type="text/javascript">
	$(document).ready(function() {
		/*jQuery.jqtab = function(tabtit,tab_conbox,shijian) {
			$(tab_conbox).find("li").hide();
			$(tabtit).find("li:first").addClass("thistab").show(); 
			$(tab_conbox).find("li:first").show();
			
			$(tabtit).find(".curr").addClass("thistab").show().siblings("li").removeClass("thistab");
			var thisindex = $(tabtit).find("li").index(".curr")
			$(tab_conbox).children().eq(thisindex).show().siblings().hide();
		
			$(tabtit).find("li").bind(shijian,function(){
			  $(this).addClass("thistab").siblings("li").removeClass("thistab"); 
				var activeindex = $(tabtit).find("li").index(this);
				$(tab_conbox).children().eq(activeindex).show().siblings().hide();
				return false;
			});
		
		};*/
		/*调用方法如下：*/
		$.jqtab("#tabs","#tab_conbox","click");
		
		//$.jqtab("#tabs2","#tab_conbox2","mouseenter");
		
	});
	</script>	
  </head>
  
  <body>
	<div id="tabbox">
	    <ul class="tabs" id="tabs">
	       <li><a href="#">导航菜单</a></li>
	       <li><a href="#">焦点幻灯片</a></li>
	       <li><a href="#">广告代码</a></li>
	       <li><a href="#">网页特效</a></li>
	    </ul>
	    <ul class="tab_conbox" id="tab_conbox">
	        <li class="tab_con">
	           <iframe name="iframe1" scrolling="no"  width="100%" border="0" frameborder="0" src="<%=basePath%>archives/baseInfoJsp.jspx"></iframe>
	        </li>
	            
	        <li class="tab_con">
	        	<p>2<span><a href="http://www.51xuediannao.com/">懒人建站</a>2只收录实用和能提高用户体验的代码</span><br />
				<span>我们只想解放出你的部分写代码时间来思考更高层次的设计，而不是要你懒惰、拼凑。</span></p>
	        </li>
	    
	        <li class="tab_con">
	        	<p>3<span><a href="http://www.51xuediannao.com/">懒人建站</a>3只收录实用和能提高用户体验的代码</span><br />
				<span>我们只想解放出你的部分写代码时间来思考更高层次的设计，而不是要你懒惰、拼凑。</span></p>
	        </li>
	    
	        <li class="tab_con">
	        	<p>4<span><a href="http://www.51xuediannao.com/">懒人建站</a>4只收录实用和能提高用户体验的代码</span><br />
				<span>我们只想解放出你的部分写代码时间来思考更高层次的设计，而不是要你懒惰、拼凑。</span></p>
	        </li>
	    </ul>	
	</div>
  </body>
</html>
