<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>减费页面</title>
    
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
	 			<td class="position">当前位置: 费用结算 -&gt;  费用缴纳</td>
	 		</tr>
	 	</tbody>
	</table>
	<div id="main">
		<form class="registerform" method="post" action="" target="main">
			<input type="hidden" id="uid" name="id" value="${user.id }" />
			<table class="editTable" border="0" cellspacing="1" cellpadding="10" width="100%" align="center">
				<tbody>
					<tr class="editTr">
						<td class="editLeftTd">客户编号：</td>
						<td class="editRightTd" width="250px">
							<input type="text" readonly="readonly" value="${user.userId }" />
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd">客户名称：</td>
						<td class="editRightTd" width="250px">
							<input type="text" readonly="readonly" value="${user.name }" />
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>减费金额（元）<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="price" name="price" value="" datatype="/^[0-9]+([.]\d{1,4})?$/" nullmsg="请输入信息！" errormsg="请输入数字(例:0.00),最高保留四位小数!" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd">备注：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="sysRemark" name="sysRemark" value="" />
						</td>
					</tr>
				</tbody>
			</table>
			<div class="editBtn" style="margin-top: 20px;" align="center">
				<input type="submit" id="subBtn" value="减 费" /> <input type="reset" id="resetBtn" value="重 置" /><input type="button" onclick="javascript:window.open('${baseUrl}freesettle/costPayList.jspx','main');"value="返 回">
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
			if($("#uid").val() == ''){
				alert('uid为空，非法操作！');
				window.open('${baseUrl}freesettle/costPayList.jspx','main');
			}else{
				$(".registerform").attr('action','${baseUrl }freesettle/reduction.jspx');
			}
			if(confirm("您确定要提交表单吗？")){
				return true;
			}
			return false;
		}
	});
});
</script>
</body>
</html>