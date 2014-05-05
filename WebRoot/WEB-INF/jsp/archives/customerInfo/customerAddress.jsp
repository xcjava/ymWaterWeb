<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>客户地址</title>
    
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
		<input type="hidden" name="id" value="${id }" />
		<input type="hidden" name="curr" value="${curr }" />
			<table class="editTable" border="0" cellspacing="1" cellpadding="10" width="100%" align="center">
				<tbody>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>省码<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<select datatype="*"  id="province" name="user.province" nullmsg="请输入信息！" errormsg="请输入信息！">
								<option value="湖南">湖南</option>
								<option value="广东">广东</option>
							</select>
							<span class="Validform_checktip"></span>
						</td>
						<td class="editLeftTd"><span></span>市码<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<select datatype="*" id="city" name="user.city" nullmsg="请输入信息！" errormsg="请输入信息！">
								<option value="长沙">长沙</option>
								<option value="常德">常德</option>
							</select>
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>区县码<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<select datatype="*" id="district" name="user.district" nullmsg="请输入信息！" errormsg="请输入信息！">
								<option value="萝岗区">萝岗区</option>
								<option value="天河区">天河区</option>
							</select>
							<span class="Validform_checktip"></span>
						</td>
						<td class="editLeftTd"><span></span>街道码（乡镇）<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<select id="street" name="user.street">
								<option value="街道1">街道1</option>
								<option value="街道2">街道2</option>
							</select>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>居委会码（村）<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<select id="village" name="user.village">
								<option value="1">1</option>
								<option value="2">2</option>
							</select>
						</td>
						<td class="editLeftTd"><span></span>道路码<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<select id="road" name="user.road">
								<option value="1">1</option>
								<option value="2">2</option>
							</select>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>小区码<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<select id="residential" name="user.residential">
								<option value="1">1</option>
								<option value="2">2</option>
							</select>
							<span class="Validform_checktip"></span>
						</td>
						<td class="editLeftTd"><span></span>楼栋码<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<select id="storiedBuilding" name="user.storiedBuilding">
								<option value="1">1</option>
								<option value="2">2</option>
							</select>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>单元码<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<select id="unit" name="user.unit">
								<option value="1">1</option>
								<option value="2">2</option>
							</select>
						</td>
						<td class="editLeftTd"><span></span>楼层码<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<select id="floor" name="user.floor">
								<option value="1">1</option>
								<option value="2">2</option>
							</select>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>门牌号<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="roomNo" name="user.roomNo" value="${user.roomNo }" />
						</td>
						<td class="editLeftTd"><span></span>邮编<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="postcode" name="user.postcode" value="${user.postcode }" />
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>地址类型<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<select id="addressType" name="user.addressType" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！">
								<option value="注册地址">注册地址</option>
								<option value="法律地址">法律地址</option>
							</select>
							<span class="Validform_checktip"></span>
						</td>
						<td class="editRightTd" colspan="2"></td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>客户地址<span style="color: red;">*</span>：</td>
						<td class="editRightTd" colspan="3" >
							<textarea style="float: left;" rows="3" cols="50" id="address" name="user.address" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！">${user.address }</textarea>
							<span class="Validform_checktip"></span>
						</td>
					</tr>
				</tbody>
			</table>
			<div class="editBtn" style="margin-top: 20px;" align="center">
				<input type="submit" value="保 存" /> <input type="reset" value="重 置" /><input type="button" onclick="javascript:window.open('${baseUrl}archives/userList.jspx','main');"value="返 回">
			</div>
		</form>
	</div>
	
<script src="${baseUrl }js/jquery/jquery-1.7.2.min.js" type="text/javascript"></script>
<script type="text/javascript" src="${baseUrl }js/Validform_v5.3.2_min.js"></script>
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
			if('${user.id }' == ''){
				alert('请先完善基本信息！');
				window.open('${baseUrl}archives/userInfoTab.jspx','main');
				return false;
			}else{
				$(".registerform").attr('action','${baseUrl }archives/updateUser.jspx');
			}
			if(confirm("您确定要提交表单吗？")){
				return true;
			}
			return false;
		}
	});
	
	$("#province").val('${user.province}');
	$("#city").val('${user.city}');
	$("#district").val('${user.district}');
	$("#street").val('${user.street}');
	$("#village").val('${user.village}');
	$("#road").val('${user.road}');
	$("#residential").val('${user.residential}');
	$("#storiedBuilding").val('${user.storiedBuilding}');
	$("#unit").val('${user.unit}');
	$("#floor").val('${user.floor}');
	$("#addressType").val('${user.addressType}');
	
	if('${param.message}' != ''){
		alert('${param.message}');
	}
});
</script>
</body>
</html>