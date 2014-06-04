<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>管理员添加修改</title>
    
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
	 			<td class="position">当前位置: 系统管理 -&gt;  个人资料 -&gt;  资料修改</td>
	 		</tr>
	 	</tbody>
	</table>
	<div id="main">
		<form class="registerform" method="post" action="">
			<table class="editTable" border="0" cellspacing="1" cellpadding="10" width="100%" align="center">
				<tbody>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>管理员id<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<c:if test="${not empty managerReturn.managerId }">
								${managerReturn.managerId }<input type="hidden" name="managerId" value="${managerReturn.managerId }" />
							</c:if>
							<c:if test="${empty managerReturn.managerId }">
								<input type="text" id="managerId" name="managerId" value="" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！" />
								<span class="Validform_checktip"></span>
							</c:if>
						</td>
						<td class="editLeftTd"><span></span>姓名<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="name" name="name" value="${managerReturn.name }" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>密码<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input id="password" type="password" name="password" value="" <c:if test="${not empty managerReturn.managerId }">ignore="ignore"</c:if> datatype="*" nullmsg="请输入密码！" errormsg="请输入密码！" />
							<span class="Validform_checktip"></span>
						</td>
						<td class="editLeftTd"><span></span>重复密码<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input id="newPwd2" type="password" name="newPwd2" value="" <c:if test="${not empty managerReturn.managerId }">ignore="ignore"</c:if> datatype="*" recheck="password" nullmsg="请再输入一次密码！" errormsg="您两次输入的账号密码不一致！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>电话<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="tel" name="tel" value="${managerReturn.tel }" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！" />
							<span class="Validform_checktip"></span>
						</td>
						<td class="editLeftTd"><span></span>Email<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="email" name="email" value="${managerReturn.email }" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>收费单位：</td>
						<td class="editRightTd" width="250px">
							<select id="chargingUnitSel" name="chargingUnitId" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！">
								<option></option>
							</select>
							<span class="Validform_checktip"></span>
						</td>
						<td class="editLeftTd"><span></span>部门<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<select id="departmentSel" name="departmentId" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！">
								<option></option>
							</select>
							<span class="Validform_checktip"></span>
						</td>
					</tr>
				</tbody>
			</table>
			<div class="editBtn" style="margin-top: 20px;" align="center">
				<input type="submit" value="保 存" /> <input type="reset" value="重 置" /><input type="button" onclick="javascript:window.location='${baseUrl}manager/managerList.jspx';"value="返 回">
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
			if('${managerReturn.managerId }' == ''){
				$(".registerform").attr('action','${baseUrl }manager/saveManager.jspx');
			}else{
				$(".registerform").attr('action','${baseUrl }manager/updateManager.jspx');
			}
			if(confirm("您确定要提交表单吗？")){
				return true;
			}
			return false;
		}
	});
	
	if('${param.message}' != ''){
		alert('${param.message}');
	}
	//加载收费单位
	function loadChargingUnit(unitId,departmentId){
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
				loadDepartment(unitId,departmentId);
			},
			error:function(response){
				alert("服务忙，请重试。");
			}
		});
	}
	//加载部门
	function loadDepartment(unitId,departmentId){
		var _loadSelObj=$("#departmentSel");
    	_loadSelObj.empty();
		$.ajax({
			url:'${baseUrl}common/getDepartmentListAjax.jspx?rand=' + Math.random(),
			type:'get',
			data:{unitId:unitId},
			dataType:'json',
			success:function(response){
				var optStr="<option value=''>-请选择-</option>";
				if(response.length>0){
					for(var i=0;i<response.length;i++){
						optStr+="<option value='"+response[i].deptId+"'>"+response[i].name+"</option>";
   					}
				}				
				_loadSelObj.append(optStr);
				_loadSelObj.val(departmentId);
			},
			error:function(response){
				alert("服务忙，请重试。");
			}
		});
	}
	
	loadChargingUnit('${managerReturn.chargingUnitId }','${managerReturn.departmentId }');
	//收费单位选择事件
	$("#chargingUnitSel").change(function(){
		loadDepartment($(this).val(),'');
	});
});
</script>
</body>
</html>