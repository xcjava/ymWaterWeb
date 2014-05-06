<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title> </title>
    <link href="${baseUrl }css/admin.css" type="text/css" rel="stylesheet" />
	<style type="text/css">
	body,ul,li{margin: 0;padding: 0;font: 12px normal "宋体", Arial, Helvetica, sans-serif;list-style: none;}
	body {BACKGROUND-COLOR: #fff; COLOR: #000;margin-left: 3px;margin-top: 0px;margin-right: 3px;margin-bottom: 0px;}
	a{text-decoration: none;color: #000;font-size: 14px;}
	#tabbox{ width:100%; overflow:hidden; margin:5 auto;}
	.tab_conbox{border: 1px solid #999;border-top: none;}
	.tab_con{ display:;}
	
	.tabs{height: 32px;border-bottom:1px solid #999;border-left: 1px solid #999;width: 100%;}
	.tabs li{height:31px;line-height:31px;float:left;border:1px solid #999;border-left:none;margin-bottom: -1px;background: #e0e0e0;overflow: hidden;position: relative;}
	.tabs li a {display: block;padding: 0 20px;border: 1px solid #fff;outline: none;}
	.tabs li a:hover {background: #ccc;}	
	.tabs .thistab,.tabs .thistab a:hover{background: #fff;border-bottom: 1px solid #fff;}
	
	.tab_con {padding:12px;font-size: 14px; line-height:175%;}
	</style>
	<script src="${baseUrl }js/jquery/jquery-1.7.2.min.js" type="text/javascript"></script>
	<script src="${baseUrl }js/jquery/plugins/jquery.jqtab.js?v=20140429" type="text/javascript"></script>
	<script type="text/javascript">
	$(document).ready(function() {
		//调用tab插件
		$.jqtab("#tabs","#tab_conbox","#mainframe","click");
		//重置iframe高度
		setInterval(function reinitIframem(){
			var iframe = document.getElementById("mainframe");
			try{
				var bHeight = iframe.contentWindow.document.body.scrollHeight;
				var dHeight = iframe.contentWindow.document.documentElement.scrollHeight;
				var height = Math.max(bHeight, dHeight);
				iframe.height =  height;
			}catch (ex){}
		}, 500);
	});
	</script>		
  </head>
  <body style="min-width: 1100px;">
  	<table class="position" border="0" cellSpacing="0" cellPadding="0" width="100%" align="center">
		<tbody>
			<tr class="position">
	 			<td class="position">当前位置: 客户档案 -&gt; 客户档案信息</td>
	 		</tr>
	 	</tbody>
	</table>
	<div id="tabbox">
	    <ul class="tabs" id="tabs">
	       <li data-src="${baseUrl }archives/userDetail.jspx?id=${id}&message=${message}&tab=baseInfo"><a href="#">基本信息</a></li>
	       <li data-src="${baseUrl }archives/userDetail.jspx?id=${id}&curr=customerAddress&message=${message}&tab=custAddress" <c:if test="${param.curr == 'customerAddress' }">class="curr"</c:if>><a href="#">客户地址</a></li>
	       <li data-src="${baseUrl }archives/contactDetail.jspx?id=${id}&curr=contactInfo&message=${message}" <c:if test="${param.curr == 'contactInfo' }">class="curr"</c:if>><a href="#">联系信息</a></li>
	       <li data-src="${baseUrl }archives/bankDetail.jspx?id=${id}&curr=bankInfo&message=${message}" <c:if test="${param.curr == 'bankInfo' }">class="curr"</c:if>><a href="#">银行账号</a></li>
	       <li data-src="${baseUrl }archives/busiAddressDetail.jspx?id=${id}&curr=bllAddress&message=${message}" <c:if test="${param.curr == 'bllAddress' }">class="curr"</c:if>><a href="#">业务地址</a></li>
	       <li data-src="${baseUrl }archives/vatDetail.jspx?id=${id}&curr=vatInfo&message=${message}" <c:if test="${param.curr == 'vatInfo' }">class="curr"</c:if>><a href="#">增值税</a></li>
	       <li data-src="${baseUrl }archives/userDetail.jspx?id=${id}&curr=credentials&message=${message}&tab=credentials" <c:if test="${param.curr == 'credentials' }">class="curr"</c:if>><a href="#">证件</a></li>
	    </ul>
	    <ul class="tab_conbox" id="tab_conbox">
	        <li class="tab_con">
	           <iframe name="mainframe" id="mainframe" allowTransparency scrolling="no" onload="this.height=300;" scrolling="no"  width="100%" border="0" frameborder="0" src="${baseUrl }jsp/archives/customerInfo/baseInfoJsp.jspx"></iframe>
	        </li>
	    </ul>	
	</div>
  </body>
</html>