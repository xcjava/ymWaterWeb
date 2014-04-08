<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>供水点</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="${baseUrl }css/admin.css" type="text/css" rel="stylesheet" />
  </head>
<body style="padding: 3px;">
	<div id="main">
		<form class="registerform" method="post" enctype="multipart/form-data" action="">
			<table class="editTable" border="0" cellspacing="1" cellpadding="10" width="100%" align="center">
				<tbody>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>供水点名称<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="" name="" value="" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！" />
							<span class="Validform_checktip"></span>
						</td>
						<td class="editLeftTd"><span></span>供水点类型<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<select datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！">
								<option>身份证</option>
								<option>护照</option>
							</select>
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>运行状态<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<select datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！">
								<option>身份证</option>
								<option>护照</option>
							</select>
							<span class="Validform_checktip"></span>
						</td>
						<td class="editLeftTd"><span></span>定价策略类型<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<select datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！">
								<option>身份证</option>
								<option>护照</option>
							</select>
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>基本水费计算方式<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<select datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！">
								<option>身份证</option>
								<option>护照</option>
							</select>
							<span class="Validform_checktip"></span>
						</td>
						<td class="editLeftTd"><span></span>水价行业类别<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<select datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！">
								<option>身份证</option>
								<option>护照</option>
							</select>
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>用水性质<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<select datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！">
								<option>身份证</option>
								<option>护照</option>
							</select>
							<span class="Validform_checktip"></span>
						</td>
						<td class="editLeftTd"><span></span>是否执行阶梯标志<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<select datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！">
								<option></option>
							</select>
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>当前水价<span style="color: red;">*</span>：</td>
						<td class="editRightTd" colspan="3" >
							<table class="editTable" border="0" cellspacing="1" cellpadding="1" width="100%" align="center">
								<tbody>
									<tr class="listHeaderTr">
										<td>序号</td>
										<td>阶梯值</td>
										<td>阶梯单价</td>
									</tr>
									<tr class="listTr">
										<td>1</td>
										<td>阶梯值</td>
										<td>阶梯单价</td>
									</tr>
									<tr class="listTr">
										<td>2</td>
										<td>阶梯值</td>
										<td>阶梯单价</td>
									</tr>
									<tr class="listTr">
										<td>3</td>
										<td>阶梯值</td>
										<td>阶梯单价</td>
									</tr>
								</tbody>
							</table>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>供水点备注<span style="color: red;">*</span>：</td>
						<td class="editRightTd" colspan="3" >
							<textarea style="float: left;" rows="3" cols="50" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！"></textarea>
							<span class="Validform_checktip"></span>
						</td>
					</tr>
				</tbody>
			</table>
			<div class="editBtn" style="margin-top: 20px;" align="center">
				<input type="submit" value="修 改" /> <input type="reset" value="重 置" /> <input type="button" value="返 回" />
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
		}
	});
});
</script>
</body>
</html>