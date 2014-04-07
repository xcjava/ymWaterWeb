<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>联系信息</title>
    
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
						<td class="editLeftTd"><span></span>联系类型<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<select datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！">
								<option>01 给水联系人</option>
								<option>02 账务联系人</option>
								<option>02 停送水联系人</option>
							</select>
							<span class="Validform_checktip"></span>
						</td>
						<td class="editLeftTd"><span></span>联系信息来源<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<select datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！">
								<option>01 合同约定</option>
								<option>02 95598</option>
								<option>02 客户关系</option>
							</select>
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>联系优先级<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<select datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！">
								<option>01 代表优先级高</option>
								<option>02 代表优先级低</option>
							</select>
							<span class="Validform_checktip"></span>
						</td>
						<td class="editLeftTd"><span></span>联系人<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="" name="" value="" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>性别<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<select datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！">
								<option>男</option>
								<option>女</option>
							</select>
							<span class="Validform_checktip"></span>
						</td>
						<td class="editLeftTd"><span></span>部门编号<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="" name="" value="" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>职务/职称<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="" name="" value="" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！" />
							<span class="Validform_checktip"></span>
						</td>
						<td class="editLeftTd"><span></span>办公电话<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="" name="" value="" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>移动电话<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="" name="" value="" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！" />
							<span class="Validform_checktip"></span>
						</td>
						<td class="editLeftTd"><span></span>传真号码<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="" name="" value="" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>邮编<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="" name="" value="" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！" />
							<span class="Validform_checktip"></span>
						</td>
						<td class="editLeftTd"><span></span>电子邮箱<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="" name="" value="" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>联系备注<span style="color: red;">*</span>：</td>
						<td class="editRightTd" colspan="3" >
							<textarea style="float: left;" rows="3" cols="50" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！"></textarea>
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>联系地址<span style="color: red;">*</span>：</td>
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
		<div class="block10"></div>
		<table class="ymlistTable" width="100%" cellpadding="0" cellspacing="1" >
	      <tr class="listTableHead">
	        <td width="4%"><div align="center"><input type="checkbox" name="checkbox" id="selectAllBtn" /></div></td>
	        <td width="10%"><div><span>联系类型</span></div></td>
	        <td width="15%"><div><span>联系信息来源</span></div></td>
	        <td width="14%"><div><span>联系优先级</span></div></td>
	        <td width="16%"><div><span>联系人</span></div></td>
	      </tr>
	      <tr class="listTableTr">
	        <td><div><input type="checkbox" name="" id="" class="cb" /></div></td>
	        <td><div><span class="STYLE19"></span></div></td>
	        <td><div></div></td>
	        <td><div></div></td>
	        <td><div></div></td>
	      </tr>
	      <tr class="listTableTr">
	        <td><div><input type="checkbox" name="" id="" class="cb" /></div></td>
	        <td><div><span class="STYLE19"></span></div></td>
	        <td><div></div></td>
	        <td><div></div></td>
	        <td><div></div></td>
	      </tr>
	      <tr class="listTableTr">
	        <td><div><input type="checkbox" name="" id="" class="cb" /></div></td>
	        <td><div><span class="STYLE19"></span></div></td>
	        <td><div></div></td>
	        <td><div></div></td>
	        <td><div></div></td>
	      </tr>
	      <tr class="listTableTr">
	        <td><div><input type="checkbox" name="" id="" class="cb" /></div></td>
	        <td><div><span class="STYLE19"></span></div></td>
	        <td><div></div></td>
	        <td><div></div></td>
	        <td><div></div></td>
	      </tr>
		 	<tr class="listFooterTr">
			<td colSpan=5>
			<table style="FONT-SIZE: 14px" border=0 cellSpacing=2 cellPadding=0 width="100%">
			<tbody>
			<tr>
			<td height=25 align=center>[<span class=currentFont>1</span>][<a class=other_page href="#">2</a>][<a class=other_page href="">3</a>][<a class=other_page href="">4</a>][<a class=other_page href="">5</a>][<a class=other_page href="">6</a>][<a class=other_page href="">7</a>][<a class=other_page href="">8</a>]...[<a class=other_page href="">1806</a>]<a class=other_page href="">下一页</a> </td></tr>
			<tr>
			<td align=center heigyh="25">总共<font color=red>36101</font>条记录， 当前显示第1-20条记录。跳转到 <input style="WIDTH: 40px" id=pagerID_tbPager jQuery172011253913807769178="36">页 <input value=确定 type=button jQuery172011253913807769178="37"> </td></tr></tbody></table></td>
			</tr>      
	    </table>
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
				console.info(objtip);
				cssctl(objtip,o.type);
				objtip.text(msg);
			}
		}
	});
});
</script>
</body>
</html>