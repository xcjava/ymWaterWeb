<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="gdcct" uri="http://www.xiaocong.net/gdcct/tags"%>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>采集点通信参数</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="${baseUrl }css/admin.css" type="text/css" rel="stylesheet" />
  </head>
<body style="padding: 3px;">
	<div id="main">
		<form class="registerform" method="post" action="" target="main">
			<input type="hidden" name="hardwareId" value="${hardwareId }" />
			<input type="hidden" name="curr" value="${curr }" />
			<table class="editTable" border="0" cellspacing="1" cellpadding="5" width="100%" align="center">
				<tbody>
					<tr class="editTr">
						<td class="editLeftTd">采集点编号：</td>
						<td class="editRightTd" width="200px">
							<input type="text" value="${concentrator.collectionId }" disabled="disabled" />
						</td>
						<td class="editLeftTd">信道编号：</td>
						<td class="editRightTd" width="200px">
							<input type="text" id="channelId" name="concentrator.channelId" value="${concentrator.channelId }" />
						</td>
						<td class="editLeftTd">RTS开：</td>
						<td class="editRightTd" width="200px">
							<input type="text" id="rtsOpen" name="concentrator.rtsOpen" value="${concentrator.rtsOpen }" />
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd">规约类型：</td>
						<td class="editRightTd" width="200px">
							<select id="statuteType" name="concentrator.statuteType">
								<option value="1">04版约规</option>
								<option value="2">96版约规</option>
							</select>
						</td>
						<td class="editLeftTd">中继类型：</td>
						<td class="editRightTd" width="200px">
							<select id="relayType" name="concentrator.relayType">
								<option value="1">01-无中继</option>
								<option value="2">02-无线中继</option>
								<option value="3">03-终端中继</option>
								<option value="4">04-智能中继</option>
							</select>
						</td>
						<td class="editLeftTd">电话号码：</td>
						<td class="editRightTd" width="200px">
							<input type="text" id="tel" name="concentrator.tel" value="${concentrator.tel }" />
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd">RTS关：</td>
						<td class="editRightTd" width="200px">
							<input type="text" id="rtsClose" name="concentrator.rtsClose" value="${concentrator.rtsClose }" />
						</td>
						<td class="editLeftTd">传输延时：</td>
						<td class="editRightTd" width="200px">
							<input type="text" id="transmissionDelay" name="concentrator.transmissionDelay" value="${concentrator.transmissionDelay }" />
						</td>
						<td class="editLeftTd">响应超时：</td>
						<td class="editRightTd" width="200px">
							<input type="text" id="responseTimeout" name="concentrator.responseTimeout" value="${concentrator.responseTimeout }" />
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd">主用IP地址：</td>
						<td class="editRightTd" width="200px">
							<input type="text" id="primaryIp" name="concentrator.primaryIp" value="${concentrator.primaryIp }" />
						</td>
						<td class="editLeftTd">备用IP地址：</td>
						<td class="editRightTd" width="200px">
							<input type="text" id="reserveIp" name="concentrator.reserveIp" value="${concentrator.reserveIp }" />
						</td>
						<td class="editLeftTd">网关IP地址：</td>
						<td class="editRightTd" width="200px">
							<input type="text" id="gatewayIp" name="concentrator.gatewayIp" value="${concentrator.gatewayIp }" />
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd">代理IP地址：</td>
						<td class="editRightTd" width="200px">
							<input type="text" id="proXyIp" name="concentrator.proXyIp" value="${concentrator.proXyIp }" />
						</td>
						<td class="editLeftTd">主用端口：</td>
						<td class="editRightTd" width="200px">
							<input type="text" id="primaryPort" name="concentrator.primaryPort" value="${concentrator.primaryPort }" />
						</td>
						<td class="editLeftTd">备用端口：</td>
						<td class="editRightTd" width="200px">
							<input type="text" id="reservePort" name="concentrator.reservePort" value="${concentrator.reservePort }" />
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd">网关端口：</td>
						<td class="editRightTd" width="200px">
							<input type="text" id="gatewayPort" name="concentrator.gatewayPort" value="${concentrator.gatewayPort }" />
						</td>
						<td class="editLeftTd">代理端口：</td>
						<td class="editRightTd" width="200px">
							<input type="text" id="proXyPort" name="concentrator.proXyPort" value="${concentrator.proXyPort }" />
						</td>
						<td class="editLeftTd">GPRS号码：</td>
						<td class="editRightTd" width="200px">
							<input type="text" id="gprsNum" name="concentrator.gprsNum" value="${concentrator.gprsNum }" />
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd">短信号码：</td>
						<td class="editRightTd" width="200px">
							<input type="text" id="smsNum" name="concentrator.smsNum" value="${concentrator.smsNum }" />
						</td>
						<td class="editLeftTd">心跳周期：</td>
						<td class="editRightTd" width="200px">
							<input type="text" id="heartbeatCycle" name="concentrator.heartbeatCycle" value="${concentrator.heartbeatCycle }" />
						</td>
						<td class="editLeftTd">启用日期：</td>
						<td class="editRightTd" width="200px">
							<input class="Wdate" type="text" onClick="WdatePicker()" name="channelStartDate" id="channelStartDate" value="<gdcct:fld pattren="yyyy-MM-dd" longTime="${concentrator.startTimestamp }"></gdcct:fld>">
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd">算法编号：</td>
						<td class="editRightTd" width="200px">
							<input type="text" id="algorithmNum" name="concentrator.algorithmNum" value="${concentrator.algorithmNum }" />
						</td>
						<td class="editLeftTd">算法密钥：</td>
						<td class="editRightTd" width="200px">
							<input type="text" id="algorithmKey" name="concentrator.algorithmKey" value="${concentrator.algorithmKey }" />
						</td>
						<td class="editLeftTd">终端无回答超时：</td>
						<td class="editRightTd" width="200px">
							<input type="text" id="terminalNoRespTimeout" name="concentrator.terminalNoRespTimeout" value="${concentrator.terminalNoRespTimeout }" />
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd">经由转发的终端：</td>
						<td class="editRightTd" width="200px">
							<input type="text" id="forwardTerminal" name="concentrator.forwardTerminal" value="${concentrator.forwardTerminal }" />
						</td>
						<td class="editLeftTd">RTS延时：</td>
						<td class="editRightTd" width="200px">
							<input type="text" id="rtsTimeout" name="concentrator.rtsTimeout" value="${concentrator.rtsTimeout }" />
						</td>
						<td class="editLeftTd">启动延迟时间：</td>
						<td class="editRightTd" width="200px">
							<input type="text" id="startTimeout" name="concentrator.startTimeout" value="${concentrator.startTimeout }" />
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd">终端区位码：</td>
						<td class="editRightTd" width="200px">
							<input type="text" id="terminalLocationCode" name="concentrator.terminalLocationCode" value="${concentrator.terminalLocationCode }" />
						</td>
						<td class="editLeftTd">终端通信密码：</td>
						<td class="editRightTd" width="200px">
							<input type="text" id="terminalCommPassword" name="concentrator.terminalCommPassword" value="${concentrator.terminalCommPassword }" />
						</td>
						<td class="editLeftTd">终端IP：</td>
						<td class="editRightTd" width="200px">
							<input type="text" id="terminalIp" name="concentrator.terminalIp" value="${concentrator.terminalIp }" />
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd">超时重发次数：</td>
						<td class="editRightTd" width="200px">
							<input type="text" id="resendTime" name="concentrator.resendTime" value="${concentrator.resendTime }" />
						</td>
						<td class="editLeftTd">终端端口：</td>
						<td class="editRightTd" width="200px">
							<input type="text" id="terminalPost" name="concentrator.terminalPost" value="${concentrator.terminalPost }" />
						</td>
						<td class="editLeftTd">终端地址码：</td>
						<td class="editRightTd" width="200px">
							<input type="text" id="terminalNum" name="concentrator.terminalNum" value="${concentrator.terminalNum }" />
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd">主站通信密码：</td>
						<td class="editRightTd" width="200px" colspan="5">
							<input type="text" id="primaryCommPassword" name="concentrator.primaryCommPassword" value="${concentrator.primaryCommPassword }" />
						</td>
					</tr>
				</tbody>
			</table>
			<div class="editBtn" style="margin-top: 20px;" align="center">
				<input type="submit" value="保 存" /> <input type="reset" value="重 置" /><input type="button" onclick="javascript:window.open('${baseUrl}archives/concentratorList.jspx','main');"value="返 回">
			</div>
		</form>
	</div>
	
<script src="${baseUrl }js/jquery/jquery-1.7.2.min.js" type="text/javascript"></script>
<script type="text/javascript" src="${baseUrl }js/Validform_v5.3.2/Validform_v5.3.2_min.js"></script>
<script src="${baseUrl }js/datePicker/WdatePicker.js" type="text/javascript"></script>
<script type="text/javascript">
$(function(){
	//$(".registerform").Validform();  //就这一行代码！;
		
	$(".registerform").Validform({
		tiptype:function(msg,o,cssctl){
			//msg：提示信息;
			//o:{obj:*,type:*,curform:*}, obj指向的是当前验证的表单元素（或表单对象），type指示提示的状态，值为1、2、3、4， 1：正在检测/提交数据，2：通过验证，3：验证失败，4：提示ignore状态, curform为当前form对象;
			//cssctl:内置的提示信息样式控制函数，该函数需传入两个参数：显示提示信息的对象 和 当前提示的状态（既形参o中的type）;
			if(!o.obj.is("form")){//验证表单元素时o.obj为该表单元素，全部验证通过提交表单时o.obj为该表单对象;
				//var objtip=$(o.obj).parent().next().find(".Validform_checktip");
				var objtip=o.obj.siblings(".Validform_checktip");
				cssctl(objtip,o.type);
				objtip.text(msg);
			}
		},
		callback:function(form){
			if('${concentrator.hardwareId }' == ''){
				alert('请先完善基本信息！');
				window.open('${baseUrl}archives/concentratorTab.jspx','main');
				return false;
			}else{
				$(".registerform").attr('action','${baseUrl }archives/updateConcentrator.jspx');
			}
			if(confirm("您确定要提交表单吗？")){
				return true;
			}
			return false;
		}
	});
	
	$("#statuteType").val('${concentrator.statuteType}');
	$("#relayType").val('${concentrator.relayType}');
	if('${param.message}' != ''){
		alert('${param.message}');
	}
});
</script>
</body>
</html>