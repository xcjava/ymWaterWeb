<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="gdcct" uri="http://www.xiaocong.net/gdcct/tags"%>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <title>用水用户</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="${baseUrl }css/admin.css" type="text/css" rel="stylesheet" />
	<script src="${baseUrl }js/jquery/jquery-1.7.2.min.js" type="text/javascript"></script>
	<script src="${baseUrl }js/datePicker/WdatePicker.js" type="text/javascript"></script>
	<script src="${baseUrl }js/jquery/plugins/asyncbox/asyncbox.v1.5.beta.min.js" type="text/javascript"></script>
  </head>
<body style="padding: 3px;">
	<div id="main">
		<form class="registerform" method="post" action="" target="main">
			<input type="hidden" name="curr" value="${curr }" />
			<table class="editTable" border="0" cellspacing="1" cellpadding="5" width="100%" align="center">
				<tbody>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>客户编号<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="200px">
							<input type="text" id="userId" readonly="readonly" name="waterCustomer.userId" value="${waterCustomer.userId }"/>
							<input type="hidden" id="uid" name="waterCustomer.uid" value="${waterCustomer.uid }">
							<c:if test="${empty waterCustomer.customerId}"><button type="button" id="selectUid">选择</button></c:if>
						</td>
						<td class="editLeftTd"><span></span>客户名称<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="200px">
							<input type="text" id="userName" readonly="readonly" name="waterCustomer.userName" value="${waterCustomer.userName }" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！" />
							<span class="Validform_checktip"></span>
						</td>
						<td class="editLeftTd"><span></span>收费单位名称<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="200px">
							<input type="hidden" id="chargingUnitId" name="waterCustomer.chargingUnitId" value="${waterCustomer.chargingUnitId }">
							<select id="chargingUnitSel" disabled="disabled" name="">
								<option></option>
							</select>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>用水用户编号<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="200px">
							<input type="text" id="customerId" name="customerId" readonly="readonly" value="${waterCustomer.customerId }" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！" />
							<span class="Validform_checktip"></span>
						</td>
						<td class="editLeftTd"><span></span>用水用户名称<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="200px">
							<input type="text" id="customerName" name="waterCustomer.customerName" readonly="readonly" value="${waterCustomer.customerName }" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！" />
							<span class="Validform_checktip"></span>
						</td>
						<td class="editLeftTd">自定义查询号：</td>
						<td class="editRightTd" width="200px">
							<input type="text" id="customNum" name="waterCustomer.customNum" value="${waterCustomer.customNum }" />
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd">原用户编号：</td>
						<td class="editRightTd" width="200px">
							<input type="text" id="oldUserId" name="waterCustomer.oldUserId" value="${waterCustomer.oldUserId }"/>
						</td>
						<td class="editLeftTd">用户分类：</td>
						<td class="editRightTd" width="200px">
							<select id="customerType" name="waterCustomer.customerType" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！">
								<option value="1">高压</option>
								<option value="2">低压非居民</option>
								<option value="3">低压居民</option>
							</select>
						</td>
						<td class="editLeftTd">用户状态：</td>
						<td class="editRightTd" width="200px">
							<select id="customerStatus" name="waterCustomer.customerStatus" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！">
								<option value="1">正常用水客户</option>
								<option value="2">当前新装客户</option>
								<option value="3">当前变更客户</option>
								<option value="4">已销户客户</option>
							</select>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>行业分类：</td>
						<td class="editRightTd" width="200px">
							<select id="category" name="waterCustomer.category">
								<option value=""></option>
							</select>
						</td>
						<td class="editLeftTd"><span></span>业务类别：</td>
						<td class="editRightTd" width="200px">
							<select id="businessType" name="waterCustomer.businessType">
								<option value="1">大工业业务</option>
								<option value="2">中小化肥</option>
								<option value="3">居民生活业务</option>
								<option value="4">农业生产业务</option>
								<option value="5">贫困先农业排灌业务</option>
							</select>
						</td>
						<td class="editLeftTd"><span></span>合同容量：</td>
						<td class="editRightTd" width="200px">
							<input type="text" id="contractCapacity" name="waterCustomer.contractCapacity" value="${waterCustomer.contractCapacity }" />
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>高耗能行业类别：</td>
						<td class="editRightTd" width="200px">
							<select id="highEnergySectors" name="waterCustomer.highEnergySectors">
								<option value=""></option>
							</select>
						</td>
						<td class="editLeftTd"><span></span>开户日期：</td>
						<td class="editRightTd" width="200px">
							<input class="Wdate" type="text" onClick="WdatePicker()" name="openDate" id="openDate" value="<gdcct:fld pattren="yyyy-MM-dd" longTime="${waterCustomer.openTimestamp }"></gdcct:fld>">
						</td>
						<td class="editLeftTd">销户日期：</td>
						<td class="editRightTd" width="200px">
							<input class="Wdate" type="text" onClick="WdatePicker()" name="closeDate" id="closeDate" value="<gdcct:fld pattren="yyyy-MM-dd" longTime="${waterCustomer.closeTimestamp }"></gdcct:fld>">
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd">到期日期：</td>
						<td class="editRightTd" width="200px">
							<input class="Wdate" type="text" onClick="WdatePicker()" name="maturityDate" id="maturityDate" value="<gdcct:fld pattren="yyyy-MM-dd" longTime="${waterCustomer.maturityTimestamp }"></gdcct:fld>">
						</td>
						<td class="editLeftTd">水费通知方式：</td>
						<td class="editRightTd" width="200px">
							<select id="notifyType" name="waterCustomer.notifyType">
								<option value="1">短信</option>
								<option value="2">通知单</option>
								<option value="3">电话</option>
								<option value="4">E-MAIL</option>
							</select>
						</td>
						<td class="editLeftTd">水费结算方式：</td>
						<td class="editRightTd" width="200px">
							<select id="settlementType" name="waterCustomer.settlementType">
								<option value="1">分期结算</option>
								<option value="2">抄表结算</option>
							</select>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd">票据类型：</td>
						<td class="editRightTd" width="200px">
							<select id="billType" name="waterCustomer.billType">
								<option value="0">无</option>
								<option value="1">普通发票</option>
								<option value="2">增值税发票</option>
								<option value="3">收据</option>
							</select>
						</td>
						<td class="editLeftTd">停水标志：</td>
						<td class="editRightTd" width="200px">
							<select id="withoutWaterMark" name="waterCustomer.withoutWaterMark">
								<option value="1">已停水</option>
								<option value="2">未停水</option>
							</select>
						</td>
						<td class="editLeftTd">转供标志：</td>
						<td class="editRightTd" width="200px">
							<select id="turnForMark" name="waterCustomer.turnForMark">
								<option value="1">无转供</option>
								<option value="2">转供户</option>
								<option value="3">被转供户</option>
							</select>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd">抄表段编号<span style="color: red;">*</span>：</td>
						<td class="editRightTd" colspan="5" width="200px">
							<input type="text" id="meterSegmentNum" name="waterCustomer.meterSegmentNum" value="${waterCustomer.meterSegmentNum }" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！"/>
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd">业务地址<span style="color: red;">*</span>：</td>
						<td class="editRightTd" colspan="5" >
							<textarea id="busiAddress" name="waterCustomer.busiAddress" style="float: left;" rows="3" cols="50" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！">${waterCustomer.busiAddress }</textarea>
							<span class="Validform_checktip"></span>
						</td>
					</tr>
				</tbody>
			</table>
			<div class="editBtn" style="margin-top: 20px;" align="center">
				<input type="submit" value="保 存" /> <input type="reset" value="重 置" /><input type="button" onclick="javascript:window.open('${baseUrl}archives/waterCustomerList.jspx','main');"value="返 回">
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
			if('${waterCustomer.customerId }' == ''){
				$(".registerform").attr('action','${baseUrl }archives/saveWaterCustomer.jspx');
			}else{
				$(".registerform").attr('action','${baseUrl }archives/updateWaterCustomer.jspx?curr=${curr}');
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
	loadChargingUnit('${waterCustomer.chargingUnitId }');
	
	$("#customerType").val('${waterCustomer.customerType}');
	$("#customerStatus").val('${waterCustomer.customerStatus}');
	$("#category").val('${waterCustomer.category}');
	$("#businessType").val('${waterCustomer.businessType}');
	$("#highEnergySectors").val('${waterCustomer.highEnergySectors}');
	$("#notifyType").val('${waterCustomer.notifyType}');
	$("#settlementType").val('${waterCustomer.settlementType}');
	$("#billType").val('${waterCustomer.billType}');
	$("#withoutWaterMark").val('${waterCustomer.withoutWaterMark}');
	$("#turnForMark").val('${waterCustomer.turnForMark}');
	
	if('${param.message}' != ''){
		alert('${param.message}');
	}
	
	$('#selectUid').click(function(){
		asyncbox.open({
			id : 'selectuser',
			title : '选择用户',
		　　 url : '${baseUrl}archives/selectUserList.jspx',
		 	data : { },
		 	modal : true,
		 	reset : true,
		 	scroll : true,
		　　 width : 810,
		　　 height : 350,
		　　 buttons : asyncbox.btn.OKCANCEL,
		   	callback : function(buttonResult,contentWindow,returnValue){
			   		if(buttonResult == 'ok'){
			   			var uid = contentWindow.$('#dataId').val();
			   			if(uid == ''){
							asyncbox.alert('请选择用户！','提示');
							return false;
						}
			   			$('#uid').val(uid);
			   			$.ajax({
							url:'${baseUrl}archives/getUserAjax.jspx?rand=' + Math.random(),
							type:'get',
							data:{userId:uid},
							dataType:'json',
							success:function(response){
								if(response != ''){
									$('#userId').val(response.userId);
									$('#userName').val(response.userName);
									$('#customerName').val(response.userName);
									$('#customerId').val(response.waterCustomerId);
									$('#chargingUnitId').val(response.chargingUnitId);
									loadChargingUnit(response.chargingUnitId);
								}
								return true;
							},
							error:function(response){
								alert('服务忙，请重试。');
								return false;
							}
						});
					}
   			}
		});
	});
});
</script>
</body>
</html>