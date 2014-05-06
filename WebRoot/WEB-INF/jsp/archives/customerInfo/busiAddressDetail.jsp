<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="gdcct" uri="http://www.xiaocong.net/gdcct/tags"%>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>业务地址</title>
    
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
			<input type="hidden" id="busiAddressId" name="busiAddressId" value="" />
			<input type="hidden" name="curr" value="${curr }" />
			<table class="editTable" border="0" cellspacing="1" cellpadding="10" width="100%" align="center">
				<tbody>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>省码<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<select id="province" name="busiAddress.province" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！">
								<option>湖南</option>
								<option>广东</option>
							</select>
							<span class="Validform_checktip"></span>
						</td>
						<td class="editLeftTd"><span></span>市码<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<select id="city" name="busiAddress.city" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！">
								<option>长沙</option>
								<option>常德</option>
							</select>
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>区县码<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<select id="district" name="busiAddress.district" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！">
								<option>广东</option>
							</select>
							<span class="Validform_checktip"></span>
						</td>
						<td class="editLeftTd"><span></span>街道码（乡镇）<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<select id="street" name="busiAddress.street" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！">
								<option>天河街</option>
							</select>
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>居委会码（村）<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<select id="village" name="busiAddress.village" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！">
								<option>111</option>
								<option>222</option>
							</select>
							<span class="Validform_checktip"></span>
						</td>
						<td class="editLeftTd"><span></span>道路码<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<select id="road" name="busiAddress.road" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！">
								<option>2222</option>
								<option>3333</option>
							</select>
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>小区码<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<select id="residential" name="busiAddress.residential" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！">
								<option>4444</option>
								<option>5555</option>
							</select>
							<span class="Validform_checktip"></span>
						</td>
						<td class="editLeftTd"><span></span>楼栋码<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<select id="storiedBuilding" name="busiAddress.storiedBuilding" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！">
								<option>5555</option>
								<option>6666</option>
							</select>
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>单元码<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<select id="unit" name="busiAddress.unit" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！">
								<option>2323</option>
								<option>3232</option>
							</select>
							<span class="Validform_checktip"></span>
						</td>
						<td class="editLeftTd"><span></span>楼层码<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<select id="floor" name="busiAddress.floor" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！">
								<option>345345</option>
								<option>543543</option>
							</select>
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>门牌号<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="roomNo" name="busiAddress.roomNo" value="" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！" />
							<span class="Validform_checktip"></span>
						</td>
						<td class="editLeftTd"><span></span>业务联系人<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="linkMan" name="busiAddress.linkMan" value="" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
				</tbody>
			</table>
			<div class="editBtn" style="margin-top: 20px;" align="center">
				<input type="submit" id="subBtn" value="新 增" /> <input type="reset" id="resetBtn" value="重 置" /><input type="button" onclick="javascript:window.open('${baseUrl}archives/userList.jspx','main');"value="返 回">
			</div>
		</form>
		<div class="block10"></div>
		<c:if test="${not empty id }">
		<table class="ymlistTable" width="100%" cellpadding="0" cellspacing="1" >
	      <tr class="listTableHead">
	      	<td><div><span>序号</span></div></td>
	        <td><div><span>业务联系人</span></div></td>
	        <td><div><span>市码</span></div></td>
	        <td><div><span>区县码</span></div></td>
	        <td><div><span>街道码（乡镇）</span></div></td>
	        <td><div><span>操作</span></div></td>
	      </tr>
	      <c:forEach var="busiAddress" items="${busiAddressList }">
	      <tr class="listTableTr">
	      	<td><div>${busiAddress.id }</div></td>
	        <td><div>
	        	${busiAddress.linkMan}
	        </div></td>
	        <td><div>
	        	${busiAddress.city}
	        </div></td>
	        <td><div>
				${busiAddress.district}
	        </div></td>
	        <td><div>${busiAddress.street}</div></td>
	        <td><div>
	        	<a href="javascript:void(0);" class="btnEdit" title="${busiAddress.id }">修改</a>
	         | <a href="javascript:void(0);" class="btnDelete" title="${busiAddress.id }">删除</a>
	        </div></td>
	      </tr>
	      </c:forEach>
	      <tr class="listFooterTr">
		  	<td colSpan="6">
				<gdcct:pager id="pagerID" fontPageCSS="currentFont" pageStaticMax="0" pageIndex="${pageModel.pageIndex}" recordCount="${pageModel.recordCount }" pageFirstURL="${baseUrl }archives/busiAddressDetail.jspx" pageDynamicURLFormat="${baseUrl }archives/busiAddressDetail.jspx?pageIndex={0}" pageSize="${pageModel.pageSize}"></gdcct:pager>
			</td>
		  </tr>
	    </table>
	    </c:if>
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
			if($("#busiAddressId").val() == ''){
				if('${id }' != ''){
					$(".registerform").attr('action','${baseUrl }archives/saveBusiAddress.jspx');
				}else{
					alert('请先完善基本信息！');
					window.open('${baseUrl}archives/userInfoTab.jspx','main');
				}
			}else{
				$(".registerform").attr('action','${baseUrl }archives/updateBusiAddress.jspx');
			}
			if(confirm("您确定要提交表单吗？")){
				return true;
			}
			return false;
		}
	});
	
	$(".btnEdit").click(function(){
		$('#subBtn').val('修 改');
		var data = eval(${busiAddressListJson});
		for(var key in data){
			var busiAddress = data[key];
			if($(this).attr('title') == busiAddress.id){
				$('#busiAddressId').val(busiAddress.id);
				$('#province').val(busiAddress.province);
				$('#city').val(busiAddress.city);
				$('#district').val(busiAddress.district);
				$('#street').val(busiAddress.street);
				$('#village').val(busiAddress.village);
				$('#road').val(busiAddress.road);
				$('#residential').val(busiAddress.residential);
				$('#storiedBuilding').val(busiAddress.storiedBuilding);
				$('#unit').val(busiAddress.unit);
				$('#floor').val(busiAddress.floor);
				$('#roomNo').val(busiAddress.roomNo);
				$('#linkMan').val(busiAddress.linkMan);
			}
		}
	});
	$(".btnDelete").click(function(){
		var busiAddressId = $(this).attr('title');
		var confirm = window.confirm('请确认是否删除该银行信息?');
		if(confirm){
			window.open('${baseUrl}archives/deleteBusiAddress.jspx?id=${id}&busiAddressId='+busiAddressId+'&curr=${curr}','main');
		}
	});
	
	$('#resetBtn').click(function(){
		$('#subBtn').val('新 增');
		$('#busiAddressId').val('');
	});
	
	if('${param.message}' != ''){
		alert('${param.message}');
	}
});
</script>
</body>
</html>