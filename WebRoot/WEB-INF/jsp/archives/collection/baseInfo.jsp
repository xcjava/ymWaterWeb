<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>水表集中器信息页面</title>
    
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
						<td class="editLeftTd">收费单位名称<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<select id="chargingUnitSel" name="concentrator.chargingUnitId" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！">
								<option></option>
							</select>
							<span class="Validform_checktip"></span>
						</td>
						<td class="editLeftTd">集中器ID<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input style="width: 70px;" type="text" id="areaCode" name="concentrator.areaCode" value="${concentrator.areaCode }" datatype="n4-4" nullmsg="请输入信息！" errormsg="请输入4位数字！" />
							<span>&nbsp;+ </span>
							<input style="width: 70px; float: none;" type="text" id="logicCode" name="concentrator.logicCode" value="${concentrator.logicCode }" datatype="n4-4" nullmsg="请输入信息！" errormsg="请输入4位数字！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd">集中器名称<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="name" name="concentrator.name" value="${concentrator.name }" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！" />
							<span class="Validform_checktip"></span>
						</td>
						<td class="editLeftTd">集中器密码<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="password" name="concentrator.password" value="${concentrator.password }" datatype="n6-6" nullmsg="请输入信息！" errormsg="集中器密码为6位纯数字！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd">表类别：</td>
						<td class="editRightTd" width="250px">
							<select id="meterType" name="concentrator.meterType">
								<option value="水表">水表</option>
							</select>
						</td>
						<td class="editLeftTd">上行通讯方式：</td>
						<td class="editRightTd" width="250px">
							<select id="communication" name="concentrator.communication">
								<option value="GPRS/以太网">GPRS/以太网</option>
							</select>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd">工作串口：</td>
						<td class="editRightTd" width="250px">
							<select id="serial" name="concentrator.serial">
								<option value="COM1">COM1</option>
							</select>
						</td>
						<td class="editLeftTd">中继方式：</td>
						<td class="editRightTd" width="250px">
							<select id="relaySystem" name="concentrator.relaySystem">
								<option value="自动中继">自动中继</option>
							</select>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd">省：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="province" name="concentrator.province" value="${concentrator.province }"/>
						</td>
						<td class="editLeftTd">市：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="city" name="concentrator.city" value="${concentrator.city }"/>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd">区县：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="district" name="concentrator.district" value="${concentrator.district }"/>
						</td>
						<td class="editLeftTd">街道：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="street" name="concentrator.street" value="${concentrator.street }"/>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd">通讯地址：</td>
						<td class="editRightTd" colspan="3" >
							<textarea id="address" name="concentrator.address" style="float: left;" rows="3" cols="50" >${concentrator.address }</textarea>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd">月冻结起始时日：</td>
						<td class="editRightTd" width="270px">
							<select id="monthFreezeStartDate" name="concentrator.monthFreezeStartDate">
								<c:forEach begin="1" end="31" var="day">
									<option value="${day }">${day }</option>
								</c:forEach>
							</select>&nbsp;日
						</td>
						<td class="editRightTd" width="270px" colspan="2">
							<select id="monthFreezeStartHour" name="concentrator.monthFreezeStartHour">
								<c:forEach begin="0" end="23" var="hour">
									<option value="${hour }">${hour }</option>
								</c:forEach>
							</select>&nbsp;时
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd">日冻结起始时日：</td>
						<td class="editRightTd" width="270px">
							<select id="dayFreezeStartHour" name="concentrator.dayFreezeStartHour">
								<c:forEach begin="0" end="23" var="hour">
									<option value="${hour }">${hour }</option>
								</c:forEach>
							</select>&nbsp;时
						</td>
						<td class="editRightTd" width="270px" colspan="2">
							<select id="dayFreezeStartMinute" name="concentrator.dayFreezeStartMinute">
								<c:forEach begin="0" end="59" var="min">
									<option value="${min }">${min }</option>
								</c:forEach>
							</select>&nbsp;分
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
				$(".registerform").attr('action','${baseUrl }archives/saveConcentrator.jspx');
			}else{
				$(".registerform").attr('action','${baseUrl }archives/updateConcentrator.jspx');
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
	loadChargingUnit('${concentrator.chargingUnitId }');
	
	$("#meterType").val('${concentrator.meterType}');
	$("#communication").val('${concentrator.communication}');
	$("#serial").val('${concentrator.serial}');
	$("#relaySystem").val('${concentrator.relaySystem}');
	$("#monthFreezeStartDate").val('${concentrator.monthFreezeStartDate}');
	$("#monthFreezeStartHour").val('${concentrator.monthFreezeStartHour}');
	$("#dayFreezeStartHour").val('${concentrator.dayFreezeStartHour}');
	$("#dayFreezeStartMinute").val('${concentrator.dayFreezeStartMinute}');
	
	if('${param.message}' != ''){
		alert('${param.message}');
	}
});
</script>
</body>
</html>