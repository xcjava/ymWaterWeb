<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="gdcct" uri="http://www.xiaocong.net/gdcct/tags"%>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>证件</title>
    
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
						<td class="editLeftTd"><span></span>扫描件存放位置索引<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="credFilePath" name="user.credFilePath" value="${user.credFilePath }" />
						</td>
						<td class="editLeftTd"><span></span>证件类型<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<select id="credType" name="user.credType" value="${user.credType }" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！">
								<option value="身份证">身份证</option>
								<option value="护照">护照</option>
							</select>
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>证件名称<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="credName" name="user.credName" value="${user.credName }" />
						</td>
						<td class="editLeftTd"><span></span>证件号码<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="credNum" name="user.credNum" value="${user.credNum }" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>证件生效时间：</td>
						<td class="editRightTd" width="250px">
							<input class="Wdate" type="text" onClick="WdatePicker()" name="credValidDate" id="credValidDate" value="<gdcct:fld pattren="yyyy-MM-dd" longTime="${user.credValidTimestamp }"></gdcct:fld>">
						</td>
						<td class="editLeftTd"><span></span>证件失效时间：</td>
						<td class="editRightTd" width="250px">
							<input class="Wdate" type="text" onClick="WdatePicker()" name="credInvalidDate" id="credInvalidDate" value="<gdcct:fld pattren="yyyy-MM-dd" longTime="${user.credInvalidTimestamp }"></gdcct:fld>">
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
	$("#credType").val('${user.credType}');
	
	if('${param.message}' != ''){
		alert('${param.message}');
	}
});
</script>
</body>
</html>