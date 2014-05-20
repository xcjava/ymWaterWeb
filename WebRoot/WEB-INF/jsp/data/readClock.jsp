<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>集中器抄控列表</title>
<link href="${baseUrl }css/admin.css" type="text/css" rel="stylesheet" />
<script src="${baseUrl }js/jquery/jquery-1.7.2.min.js" type="text/javascript"></script>
<script src="${baseUrl }js/datePicker/WdatePicker.js" type="text/javascript"></script>
<script src="${baseUrl }js/jquery/plugins/asyncbox/asyncbox.v1.5.beta.min.js" type="text/javascript"></script>
<script>
$(function(){
	var dialog = frameElement.api;
	$.ajax({
		url:'${baseUrl}data/readClockAjax.jspx?rand=' + Math.random(),
		type:'get',
		timeout : 5000, //超时时间设置，单位毫秒
		data:{concHardwareId:dialog.data.concHardwareId},
		dataType:'json',
		success:function(response){
			if(!response.isFail){
				$('#result').text("集中器时钟："+response.date);
			}else{
				$('#result').text(response.errorMsg);
			}
		},
	　　complete : function(XMLHttpRequest,status){ //请求完成后最终执行参数
	　　　　if(status=='timeout'){//超时,status还有success,error等值的情况
			   $('#result').text("超时，请重试。");
	　　　　}
	　　},
		error:function(response){
			$('#result').text("服务忙，请重试。");
		}
	});
});
</script>
</head>

<body style="">
	<table width="100%" border="0" align="" cellpadding="0" cellspacing="0">
		<tr><td>
			<div class="srhtab">
			    <table cellSpacing=0 cellPadding=2 border=0>
			      <tbody>
				      <tr>
				        <td id="result">正在集中器时钟...</td>
				      </tr>
			      </tbody>
			    </table>
			</div>
		</td></tr>
	</table>
</body>
</html>