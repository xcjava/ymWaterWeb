<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="gdcct" uri="http://www.xiaocong.net/gdcct/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>费用缴纳列表</title>
<link href="${baseUrl }css/admin.css" type="text/css" rel="stylesheet" />
<script src="${baseUrl }js/jquery/jquery-1.7.2.min.js" type="text/javascript"></script>
<script>
$(function(){
	if('${param.message}' != ''){
		alert('${param.message}');
	}
	//只能选中一个
    $("input[type='checkbox']").click(function() {
        if ($(this).attr("checked") == "checked") {
            $("input[type='checkbox']").attr("checked", false);
            $(this).attr("checked", "checked");
            $("#dataId").val($(this).attr("name"));
        }else{
        	$("#dataId").val('');
        }
    });
	
    $('#searchBtn').click(function(){
		$('#searchForm').submit();
	});
    
	$('#recharge').click(function(){
		var uid = $("#dataId").val();
		if(uid == ''){
			alert("请选择一条数据！");
			return false;
		}
		window.location = '${baseUrl }freesettle/costPayDetail.jspx?id='+uid+'&type=recharge';
	});
	$('#deduction').click(function(){
		var uid = $("#dataId").val();
		if(uid == ''){
			alert("请选择一条数据！");
			return false;
		}
		window.location = '${baseUrl }freesettle/costPayDetail.jspx?id='+uid+'&type=reduction';
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
	loadChargingUnit('${chargingUnitId }');
	
});
</script>
</head>

<body style="min-width: 1100px;">
	<table class="position" border="0" cellSpacing="0" cellPadding="0" width="100%" align="center">
		<tbody>
			<tr class="position">
	 			<td class="position">当前位置: 费用结算 -&gt;  费用缴纳</td>
	 		</tr>
	 	</tbody>
	</table>
	<form action="${baseUrl }freesettle/costPayList.jspx"  method="get" id="searchForm">
	<input type="hidden" id="dataId" value="" />
	<table width="100%" border="0" align="" cellpadding="0" cellspacing="0">
		<tr><td>
			<div class="srhtab">
			    <table cellSpacing=0 cellPadding=2 border=0>
			      <tbody>
				      <tr>
				        <td>收费单位：</td>
				        <td>
				        	<select id="chargingUnitSel" name="chargingUnitId">
								<option></option>
							</select>
				        </td>
				        <td>集中器ID</td>
				        <td><input class="textbox" id="concHardwareId" value="${concHardwareId }" style="width: 120px" name="concHardwareId" /></td>
				        <td>客户编号：</td>
				        <td><input class="textbox" id="userId" style="width: 120px" name="userId" value="${userId }" /></td>
				      	<td>表计编号：</td>
				        <td><input class="textbox" id="meterHardwareId" value="${meterHardwareId }" style="width: 120px" name="meterHardwareId" /></td>
				        <td>
				      		<input class="button" id="searchBtn" type="button" value="查询" name="searchBtn">
				      		<input class="button" id="recharge" type="button" value="充值" >
				      		<input class="button" id="deduction" type="button" value="减费" >
				        </td>
				      </tr>
			      </tbody>
			    </table>	
			</div>
		</td></tr>
	</table>
	</form>
    <table class="ymlistTable" width="100%" cellpadding="0" cellspacing="1" >
      <tr class="listTableHead">
        <td width=""><div align="center"><input type="checkbox" name="checkbox" id="selectAllBtn" /></div></td>
        <td width=""><div><span>序号</span></div></td>
        <td width=""><div><span>收费单位</span></div></td>
        <td width=""><div><span>客户编号</span></div></td>
        <td width=""><div><span>客户姓名</span></div></td>
        <td width=""><div><span>集中器编号</span></div></td>
        <td width=""><div><span>表计编号</span></div></td>
        <td width=""><div><span>告警金额(元)</span></div></td>
        <td width=""><div><span>账户余额(元)</span></div></td>
      </tr>
      <c:forEach var="waterDayCost" items="${list }">
      <tr class="listTableTr">
      	<td><div><input type="checkbox" name="${waterDayCost.userId }" class="cb" /></div></td>
        <td><div>${waterDayCost.id }</div></td>
        <td><div>
        	<c:forEach items="${mapList }" var="map">
        		<c:if test="${map.userId == waterDayCost.userId }">${map.chargingUnit }</c:if>
        	</c:forEach>
        </div></td>
        <td><div>${waterDayCost.userId }</div></td>
        <td><div>
        	<c:forEach items="${mapList }" var="map">
        		<c:if test="${map.userId == waterDayCost.userId }">${map.userName }</c:if>
        	</c:forEach>
        </div></td>
        <td><div>${waterDayCost.concHardwareId }</div></td>
        <td><div>${waterDayCost.meterHardwareId }</div></td>
       	<c:forEach items="${mapList }" var="map">
       		<c:if test="${map.userId == waterDayCost.userId }">
       		<td><div>
       			${map.warnPrice }
       		</div></td>
       		<td><div>
       			${map.userWallet }
       		</div></td>
       		</c:if>
       	</c:forEach>
      </tr>
      </c:forEach>
	  <tr class="listFooterTr">
	  	<td colSpan="15">
			<gdcct:pager id="pagerID" fontPageCSS="currentFont" pageStaticMax="0" pageIndex="${pageModel.pageIndex}" recordCount="${pageModel.recordCount }" pageFirstURL="${baseUrl }freesettle/costPayList.jspx" pageDynamicURLFormat="${baseUrl }freesettle/costPayList.jspx?pageIndex={0}" pageSize="${pageModel.pageSize}"></gdcct:pager>
		</td>
	  </tr>
    </table>
</body>
</html>