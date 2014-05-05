<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="gdcct" uri="http://www.xiaocong.net/gdcct/tags"%>
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
		<form class="registerform" method="post" action="" target="main">
			<input type="hidden" name="id" value="${id }" />
			<input type="hidden" id="contactId" name="contactId" value="" />
			<input type="hidden" name="curr" value="${curr }" />
			<table class="editTable" border="0" cellspacing="1" cellpadding="10" width="100%" align="center">
				<tbody>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>联系类型：</td>
						<td class="editRightTd" width="250px">
							<select id="type" name="contact.type">
								<option value="1">给水联系人</option>
								<option value="2">账务联系人</option>
								<option value="3">停送水联系人</option>
							</select>
						</td>
						<td class="editLeftTd"><span></span>联系信息来源：</td>
						<td class="editRightTd" width="250px">
							<select id="source" name="contact.source">
								<option value="1">合同约定</option>
								<option value="2">95598</option>
								<option value="3">客户关系</option>
							</select>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>联系优先级：</td>
						<td class="editRightTd" width="250px">
							<select id="priority" name="contact.priority">
								<option value="1">优先级高</option>
								<option value="2">优先级低</option>
							</select>
						</td>
						<td class="editLeftTd"><span></span>联系人：</td>
						<td class="editRightTd" width="250px">
							<input id="linkMan" name="contact.linkMan" type="text" id="" />
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>性别：</td>
						<td class="editRightTd" width="250px">
							<select id="sex" name="contact.sex">
								<option value="1">男</option>
								<option value="2">女</option>
							</select>
						</td>
						<td class="editLeftTd"><span></span>部门编号：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="departmentId" readonly="readonly" name="departmentId" value="" />
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>职务/职称：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="position" name="contact.position" value="" />
						</td>
						<td class="editLeftTd"><span></span>办公电话：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="officePhone" name="contact.officePhone" value="" />
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>移动电话：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="mobile" name="contact.mobile" value="" />
						</td>
						<td class="editLeftTd"><span></span>传真号码：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="fax" name="contact.fax" value="" />
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>邮编：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="postcode" name="contact.postcode" value="" />
						</td>
						<td class="editLeftTd"><span></span>电子邮箱：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="email" name="contact.email" value="" />
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>联系备注：</td>
						<td class="editRightTd" colspan="3" >
							<textarea id="remark" name="contact.remark" style="float: left;" rows="3" cols="50"></textarea>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>联系地址<span style="color: red;">*</span>：</td>
						<td class="editRightTd" colspan="3" >
							<textarea style="float: left;" rows="3" cols="50" id="address" name="contact.address" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！"></textarea>
							<span class="Validform_checktip"></span>
						</td>
					</tr>
				</tbody>
			</table>
			<div class="editBtn" style="margin-top: 20px;" align="center">
				<input type="submit" id="subBtn" value="新 增" /> <input type="reset" value="重 置" /><input type="button" onclick="javascript:window.open('${baseUrl}archives/userList.jspx','main');"value="返 回">
			</div>
		</form>
		<div class="block10"></div>
		<table class="ymlistTable" width="100%" cellpadding="0" cellspacing="1" >
	      <tr class="listTableHead">
	      	<td><div><span>序号</span></div></td>
	        <td><div><span>联系类型</span></div></td>
	        <td><div><span>联系信息来源</span></div></td>
	        <td><div><span>联系优先级</span></div></td>
	        <td><div><span>联系人</span></div></td>
	        <td><div><span>操作</span></div></td>
	      </tr>
	      <c:forEach var="contact" items="${contactList }">
	      <tr class="listTableTr">
	      	<td><div>${contact.id }</div></td>
	        <td><div>
				<c:if test="${contact.type == '1'}">给水联系人</c:if>
				<c:if test="${contact.type == '2'}">账务联系人</c:if>
				<c:if test="${contact.type == '3'}">停送水联系人</c:if>
	        </div></td>
	        <td><div>
	        	<c:if test="${contact.source == '1'}">合同约定</c:if>
				<c:if test="${contact.source == '2'}">95598</c:if>
				<c:if test="${contact.source == '3'}">客户关系</c:if>
	        </div></td>
	        <td><div>
				<c:if test="${contact.priority == '1'}">优先级高</c:if>
				<c:if test="${contact.priority == '2'}">优先级低</c:if>
	        </div></td>
	        <td><div>${contact.linkMan }</div></td>
	        <td><div><a href="javascript:void(0);" class="btnEdit" title="${contact.id }" >修改</a> | <a href="javascript:void(0);" class="btnDelete" title="${contact.id }">删除</a></div></td>
	      </tr>
	      </c:forEach>
		  <tr class="listFooterTr">
		  	<td colSpan="6">
				<gdcct:pager id="pagerID" fontPageCSS="currentFont" pageStaticMax="0" pageIndex="${pageModel.pageIndex}" recordCount="${pageModel.recordCount }" pageFirstURL="${baseUrl }archives/contactDetail.jspx" pageDynamicURLFormat="${baseUrl }archives/contactDetail.jspx?pageIndex={0}" pageSize="${pageModel.pageSize}"></gdcct:pager>
			</td>
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
				cssctl(objtip,o.type);
				objtip.text(msg);
			}
		},
		callback:function(form){
			if('${id }' == ''){
				alert('请先完善基本信息！');
				window.open('${baseUrl}archives/userInfoTab.jspx','main');
				return false;
			}else{
				if($("#contactId").val() == ''){
					$(".registerform").attr('action','${baseUrl }archives/saveContact.jspx');
				}else{
					$(".registerform").attr('action','${baseUrl }archives/updateContact.jspx');
				}
			}
			if(confirm("您确定要提交表单吗？")){
				return true;
			}
			return false;
		}
	});
	
	$(".btnEdit").click(function(){
		
	});
	
	if('${param.message}' != ''){
		alert('${param.message}');
	}
});
</script>
</body>
</html>