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
		<form class="registerform" method="post" action="" target="main">
		<input type="hidden" name="customerId" value="${customerId }" />
		<input type="hidden" name="curr" value="${curr }" />
			<table class="editTable" border="0" cellspacing="1" cellpadding="10" width="100%" align="center">
				<tbody>
					<tr class="editTr">
						<td class="editLeftTd">供水点名称：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="waterPointsName" name="waterCustomer.waterPointsName" value="${waterCustomer.waterPointsName }" />
						</td>
						<td class="editLeftTd">供水点类型：</td>
						<td class="editRightTd" width="250px">
							<select id="waterPointsType" name="waterCustomer.waterPointsType" value="${waterCustomer.waterPointsType }">
								<option></option>
							</select>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>运行状态：</td>
						<td class="editRightTd" width="250px">
							<select id="workStatus" name="waterCustomer.workStatus">
								<option value="1">运行</option>
								<option value="2">停止</option>
								<option value="3">拆除</option>
								<option value="4">暂停少量业务</option>
							</select>
						</td>
						<td class="editLeftTd">定价策略类型：</td>
						<td class="editRightTd" width="250px">
							<select id="pricStrategyType" name="waterCustomer.pricStrategyType">
								<option value="1">两部制</option>
								<option value="2">单一制</option>
							</select>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd">基本水费计算方式：</td>
						<td class="editRightTd" width="250px">
							<select id="basicWaterPriceCalc" name="waterCustomer.basicWaterPriceCalc">
								<option value="0">不计算</option>
							</select>
						</td>
						<td class="editLeftTd">水价行业类别：</td>
						<td class="editRightTd" width="250px">
							<select id="waterPriceIndustry" name="waterCustomer.waterPriceIndustry">
								<option value="1">商业</option>
								<option value="2">工业</option>
								<option value="3">农业 </option>
								<option value="4">渔业</option>
							</select>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd">用水性质：</td>
						<td class="editRightTd" width="250px">
							<select id="waterNature" name="waterCustomer.waterNature">
								<option value="居民生活用水">居民生活用水</option>
								<option value="非经营性用水">非经营性用水</option>
								<option value="经营性用水">经营性用水</option>
								<option value="商业服务企业">商业服务企业</option>
								<option value="一般工业企业">一般工业企业</option>
								<option value="高污染工业企业">高污染工业企业</option>
								<option value="特种行业用水（甲类、乙类）">特种行业用水（甲类、乙类）</option>
							</select>
						</td>
						<td class="editLeftTd">是否执行阶梯标志：</td>
						<td class="editRightTd" width="250px">
							<select id="ladderFlag" name="waterCustomer.ladderFlag">
								<option value="0">是</option>
								<option value="1">否</option>
							</select>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd">价目模版：</td>
						<td class="editRightTd" width="250px">
							<select id="priceTemplateSel" name="waterCustomer.priceTemplateId">
								<option></option>
							</select>
						</td>
						<td class="editLeftTd"><span></span>当前水价<span style="color: red;">*</span>：</td>
						<td class="editRightTd" colspan="2" >
							<table class="editTable" border="0" cellspacing="1" cellpadding="1" width="100%" align="center">
								<tbody>
									<tr class="listHeaderTr">
										<td>序号<span id="ptId"></span></td>
										<td>阶梯值</td>
										<td>阶梯单价</td>
									</tr>
									<tr class="listTr">
										<td>1</td>
										<td id="level1Num"></td>
										<td id="level1Cost"></td>
									</tr>
									<tr class="listTr">
										<td>2</td>
										<td id="level2Num"></td>
										<td id="level2Cost"></td>
									</tr>
									<tr class="listTr">
										<td>3</td>
										<td id="level3Num"></td>
										<td id="level3Cost"></td>
									</tr>
									<tr class="listTr">
										<td>4</td>
										<td id="level4Num"></td>
										<td id="level4Cost"></td>
									</tr>
								</tbody>
							</table>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd">供水点备注：</td>
						<td class="editRightTd" colspan="3" >
							<textarea id="remark" name="waterCustomer.remark" style="float: left;" rows="3" cols="50" >${waterCustomer.remark }</textarea>
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
				alert('请先完善基本信息！');
				window.open('${baseUrl}archives/waterCustomerTab.jsp.jspx','main');
				return false;
			}else{
				$(".registerform").attr('action','${baseUrl }archives/updateWaterCustomer.jspx');
			}
			if(confirm("您确定要提交表单吗？")){
				return true;
			}
			return false;
		}
	});
	
	//加载价目列表
	function loadPriceTemplateList(priceTemplateId){
		var _loadSelObj=$("#priceTemplateSel");
    	_loadSelObj.empty();
		$.ajax({
			url:'${baseUrl}common/getPriceTemplateListAjax.jspx?rand=' + Math.random(),
			type:'get',
			data:{},
			dataType:'json',
			success:function(response){
				var optStr="<option value=''>-请选择-</option>";
				if(response.length>0){
					for(var i=0;i<response.length;i++){
						optStr+="<option value='"+response[i].priceTemplateId+"'>"+response[i].name+"</option>";
   					}
				}				
				_loadSelObj.append(optStr);
				_loadSelObj.val(priceTemplateId);
			},
			error:function(response){
				alert("服务忙，请重试。");
			}
		});
	}
	loadPriceTemplateList('${waterCustomer.priceTemplateId }');
	
	//加载价目模板当前水价
	function loadPriceTemplate(priceTemplateId){
		$.ajax({
			url:'${baseUrl}common/getPriceTemplateAjax.jspx?rand=' + Math.random(),
			type:'get',
			data:{id:priceTemplateId},
			dataType:'json',
			success:function(response){
				$('#ptId').text(response.ptId);
				$('#level1Num').text(response.level1Num);
				$('#level2Num').text(response.level2Num);
				$('#level3Num').text(response.level3Num);
				$('#level4Num').text(response.level4Num);
				$('#level1Cost').text(response.level1Cost);
				$('#level2Cost').text(response.level2Cost);
				$('#level3Cost').text(response.level3Cost);
				$('#level4Cost').text(response.level4Cost);
			},
			error:function(response){
				alert("服务忙，请重试。");
			}
		});
	}
	loadPriceTemplate('${waterCustomer.priceTemplateId }');
	
	//价目模板选择事件
	$("#priceTemplateSel").change(function(){
		loadPriceTemplate($(this).val());
	});
	
	$("#waterPointsType").val('${waterCustomer.waterPointsType}');
	$("#workStatus").val('${waterCustomer.workStatus}');
	$("#pricStrategyType").val('${waterCustomer.pricStrategyType}');
	$("#basicWaterPriceCalc").val('${waterCustomer.basicWaterPriceCalc}');
	$("#waterPriceIndustry").val('${waterCustomer.waterPriceIndustry}');
	$("#waterNature").val('${waterCustomer.waterNature}');
	$("#ladderFlag").val('${waterCustomer.ladderFlag}');
	
	if('${param.message}' != ''){
		alert('${param.message}');
	}
});
</script>
</body>
</html>