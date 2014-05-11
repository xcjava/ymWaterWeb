<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>无线智能水表详细页</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="${baseUrl }css/admin.css" type="text/css" rel="stylesheet" />
  </head>
<body style="min-width: 1100px;">
	<table class="position" border="0" cellSpacing="0" cellPadding="0" width="100%" align="center">
		<tbody>
			<tr class="position">
	 			<td class="position">当前位置: 计量点档案 -&gt;  <c:if test="${type == '1' }">IC卡预付费</c:if><c:if test="${type == '2' }">红外卡预付费</c:if><c:if test="${type == '3' }">无线智能</c:if>水表</td>
	 		</tr>
	 	</tbody>
	</table>
	<div id="main">
		<form class="registerform" method="post" action="" target="main">
			<input type="hidden" name="waterMeter.type" value="${type }" />
			<table class="editTable" border="0" cellspacing="1" cellpadding="10" width="100%" align="center">
				<tbody>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>客户用水编号<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="waterCustomerId" name="waterMeter.waterCustomerId" value="${waterMeter.waterCustomerId }" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！" />
							<span class="Validform_checktip"></span>
						</td>
						<td class="editLeftTd"><span></span>客户用水名称<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="userName" name="waterMeter.userName" value="${waterMeter.userName }" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>客户编号<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="uid" name="waterMeter.uid" value="${waterMeter.uid }" />
							<input type="text" id="userId" name="waterMeter.userId" value="${waterMeter.userId }" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！" />
							<span class="Validform_checktip"></span>
						</td>
						<td class="editLeftTd"><span></span>客户名称<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="userName" name="" value="${waterMeter.userName }" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>收费单位名称<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<select id="chargingUnitSel" name="waterMeter.chargingUnitId" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！">
								<option></option>
							</select>
							<span class="Validform_checktip"></span>
						</td>
						<td class="editLeftTd">用水性质：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="nature" name="waterMeter.nature" value="${waterMeter.nature }" />
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd">水表编号<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="hardwareId" name="hardwareId" value="${waterMeter.hardwareId }" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！" />
							<span class="Validform_checktip"></span>
						</td>
						<td class="editLeftTd">集中器<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="concHardwareId" name="waterMeter.concHardwareId" value="${waterMeter.concHardwareId }" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd">数据类别：</td>
						<td class="editRightTd" width="250px">
							<select id="dataType" name="waterMeter.dataType">
				        		<option value="1" <c:if test="${waterMeter.dataType == '1' }">selected="selected"</c:if>>脉冲</option>
				        		<option value="2" <c:if test="${waterMeter.dataType == '2' }">selected="selected"</c:if>>直读</option>
				        	</select>
						</td>
						<td class="editLeftTd">脉冲常数：</td>
						<td class="editRightTd" width="250px">
							<select id="constant" name="waterMeter.constant">
								<option value="10">10</option>
							</select>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd">初始表码<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="initialYards" name="waterMeter.initialYards" value="${waterMeter.initialYards }" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！" />
							<span class="Validform_checktip"></span>
						</td>
						<td class="editLeftTd">告警量：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="alarmVolume" name="waterMeter.alarmVolume" value="${waterMeter.alarmVolume }aaaaaaa<s:fielderror ></s:fielderror>" />
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd">无线频率：</td>
						<td class="editRightTd" width="250px" colspan="3">
							<input type="text" id="radioFrequency" name="waterMeter.radioFrequency" value="${waterMeter.radioFrequency }" />
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>当前水价<span style="color: red;">*</span>：</td>
						<td class="editRightTd" colspan="3" >
							<input type="text" id="price" name="waterMeter.price" value="${waterMeter.price }" />
						</td>
					</tr>
				</tbody>
			</table>
			<div class="editBtn" style="margin-top: 20px;" align="center">
				<input type="submit" value="保 存" /> <input type="reset" value="重 置" /><input type="button" onclick="javascript:window.open('${baseUrl}archives/waterMeterList.jspx','main');"value="返 回">
			</div>
		</form>
	</div>
	
<script src="${baseUrl }js/jquery/jquery-1.7.2.min.js" type="text/javascript"></script>
<script type="text/javascript" src="${baseUrl }js/Validform_v5.3.2_min.js"></script>
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
			if('${waterMeter.hardwareId }' == ''){
				$(".registerform").attr('action','${baseUrl }archives/saveWaterMeter.jspx');
			}else{
				$(".registerform").attr('action','${baseUrl }archives/updateWaterMeter.jspx');
			}
			if(confirm("您确定要提交表单吗？")){
				return true;
			}
			return false;
		}
	});
	
	//加载收费单位
	function loadChargingUnit(unitId){
		var _loadSelObj=$("#chargingUnitSel");
    	_loadSelObj.empty();
		$.ajax({
			url:'${baseUrl}common/getChargingUnitListAjax.jspx?rand=' + Math.random(),
			type:'get',
			data:{},
			dataType:'json',
			success:function(response){
				var optStr="<option value=''>-请选择-</option>";
				if(response.length>0){
					for(var i=0;i<response.length;i++){
						optStr+="<option value='"+response[i].unitId+"'>"+response[i].name+"</option>";
   					}
				}				
				_loadSelObj.append(optStr);
				_loadSelObj.val(unitId);
			},
			error:function(response){
				alert("服务忙，请重试。");
			}
		});
	}
	loadChargingUnit('${waterMeter.chargingUnitId }');
	
	if('${param.message}' != ''){
		alert('${param.message}');
	}
});
</script>
</body>
</html>