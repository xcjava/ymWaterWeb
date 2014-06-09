<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="gdcct" uri="http://www.xiaocong.net/gdcct/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>月用水费查询</title>
<link href="${baseUrl }css/admin.css" type="text/css" rel="stylesheet" />
<script src="${baseUrl }js/jquery/jquery-1.7.2.min.js" type="text/javascript"></script>
<script src="${baseUrl }js/datePicker/WdatePicker.js" type="text/javascript"></script>
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
	 			<td class="position">当前位置: 费用计算 -&gt;  月用水费查询</td>
	 		</tr>
	 	</tbody>
	</table>
	<form action="${baseUrl }freesettle/waterMonthCostList.jspx" method="get" id="searchForm">
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
				        <td>客户编号：</td>
				        <td><input class="textbox" id="userId" style="width: 120px" name="userId" value="${userId }" /></td>
				      	<td>用水用户编号：</td>
				        <td><input class="textbox" id="waterCustomerId" style="width: 120px" name="waterCustomerId" value="${waterCustomerId }" /></td>
				      </tr>
				      <tr>
				        <td>水表ID</td>
				        <td><input class="textbox" id="meterHardwareId" value="${meterHardwareId }" style="width: 120px" name="meterHardwareId" /></td>
				      	<td>集中器ID</td>
				        <td><input class="textbox" id="concHardwareId" value="${concHardwareId }" style="width: 120px" name="concHardwareId" /></td>
				      	<td>
				      		<input class="button" id="searchBtn" type="button" value="查询" name="searchBtn">
				      		<input class="button" id="" type="button" value="导出" name="">
				      	</td>
				      </tr>
				      <tr>
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
        <td width=""><div><span>客户编号</span></div></td>
        <td width=""><div><span>集中器编号</span></div></td>
        <td width=""><div><span>水表编号</span></div></td>
        <td width=""><div><span>收费单位</span></div></td>
        <td width=""><div><span>1月用水费</span></div></td>
        <td width=""><div><span>2月用水费</span></div></td>
        <td width=""><div><span>3月用水费</span></div></td>
        <td width=""><div><span>4月用水费</span></div></td>
        <td width=""><div><span>5月用水费</span></div></td>
        <td width=""><div><span>6月用水费</span></div></td>
        <td width=""><div><span>7月用水费</span></div></td>
        <td width=""><div><span>8月用水费</span></div></td>
        <td width=""><div><span>9月用水费</span></div></td>
        <td width=""><div><span>10月用水费</span></div></td>
        <td width=""><div><span>11月用水费</span></div></td>
        <td width=""><div><span>12月用水费</span></div></td>
        <td width=""><div><span>冻结时间(年)</span></div></td>
        <td width=""><div><span>创建时间</span></div></td>
      </tr>
      <c:forEach var="waterMonthCost" items="${list }">
      <tr class="listTableTr">
        <td><div><input type="checkbox" name="" id="" class="cb" /></div></td>
        <td><div>${waterMonthCost.id }</div></td>
        <td><div>${waterMonthCost.userId }</div></td>
        <td><div>${waterMonthCost.concHardwareId }</div></td>
        <td><div>${waterMonthCost.meterHardwareId }</div></td>
        <td><div>${waterMonthCost.chargingUnitId }</div></td>
        <td><div><gdcct:price longPrice="${waterMonthCost.cost1 }" ></gdcct:price></div></td>
        <td><div><gdcct:price longPrice="${waterMonthCost.cost2 }" ></gdcct:price></div></td>
        <td><div><gdcct:price longPrice="${waterMonthCost.cost3 }" ></gdcct:price></div></td>
        <td><div><gdcct:price longPrice="${waterMonthCost.cost4 }" ></gdcct:price></div></td>
        <td><div><gdcct:price longPrice="${waterMonthCost.cost5 }" ></gdcct:price></div></td>
        <td><div><gdcct:price longPrice="${waterMonthCost.cost6 }" ></gdcct:price></div></td>
        <td><div><gdcct:price longPrice="${waterMonthCost.cost7 }" ></gdcct:price></div></td>
        <td><div><gdcct:price longPrice="${waterMonthCost.cost8 }" ></gdcct:price></div></td>
        <td><div><gdcct:price longPrice="${waterMonthCost.cost9 }" ></gdcct:price></div></td>
        <td><div><gdcct:price longPrice="${waterMonthCost.cost10 }" ></gdcct:price></div></td>
        <td><div><gdcct:price longPrice="${waterMonthCost.cost11 }" ></gdcct:price></div></td>
        <td><div><gdcct:price longPrice="${waterMonthCost.cost12 }" ></gdcct:price></div></td>
        <td><div>${waterMonthCost.freezeYear }</div></td>
        <td><div><gdcct:fld pattren="yyyy-MM-dd" longTime="${waterMonthCost.createTimestamp }"></gdcct:fld></div></td>
      </tr>
      </c:forEach>
      <tr class="listFooterTr">
	  	<td colSpan="20">
			<gdcct:pager id="pagerID" fontPageCSS="currentFont" pageStaticMax="0" pageIndex="${pageModel.pageIndex}" recordCount="${pageModel.recordCount }" pageFirstURL="${baseUrl }freesettle/waterMonthCostList.jspx" pageDynamicURLFormat="${baseUrl }freesettle/waterMonthCostList.jspx?pageIndex={0}" pageSize="${pageModel.pageSize}"></gdcct:pager>
		</td>
    </table>
</body>
</html>