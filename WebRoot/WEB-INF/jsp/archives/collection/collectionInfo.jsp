<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>采集点</title>
    
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
			<table class="editTable" border="0" cellspacing="1" cellpadding="10" width="100%" align="center">
				<tbody>
					<tr class="editTr">
						<td class="editLeftTd">采集点编号：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="collectionId" name="concentrator.collectionId" value="${concentrator.collectionId }" />
						</td>
						<td class="editLeftTd">采集点名称：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="collectionName" name="concentrator.collectionName" value="${concentrator.collectionName }" />
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd">采集点类型：</td>
						<td class="editRightTd" width="250px">
							<select id="collectionType" name="concentrator.collectionType">
								<option value="1">口采集点</option>
								<option value="2">用户采集点</option>
							</select>
						</td>
						<td class="editLeftTd">采集点状态：</td>
						<td class="editRightTd" width="250px">
							<select id="collectionStatus" name="concentrator.collectionStatus">
								<option value="1">初定方案</option>
								<option value="2">制定方案</option>
								<option value="3">已勘察</option>
								<option value="4">已确定终端安装方案</option>
							</select>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd">GPS经度：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="gpsLongitude" name="concentrator.gpsLongitude" value="${concentrator.gpsLongitude }" />
						</td>
						<td class="editLeftTd">GPS纬度：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="gpsLatitude" name="concentrator.gpsLatitude" value="${concentrator.gpsLatitude }" />
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd">采集点地址：</td>
						<td class="editRightTd" width="250px" colspan="3">
							<textarea style="float: left;" rows="3" cols="50" id="collectionAddress" name="concentrator.collectionAddress">${concentrator.collectionAddress }</textarea>
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
	$("#collectionType").val('${concentrator.collectionType}');
	$("#collectionStatus").val('${concentrator.collectionStatus}');
	if('${param.message}' != ''){
		alert('${param.message}');
	}
});
</script>
</body>
</html>