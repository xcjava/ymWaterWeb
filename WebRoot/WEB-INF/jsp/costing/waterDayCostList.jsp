<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="gdcct" uri="http://www.xiaocong.net/gdcct/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>日用水费查询</title>
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
	
	$('#payStatus').val('${payStatus}');
	$('#checkPayStatus').val('${checkPayStatus}');
	
});
</script>
</head>

<body style="min-width: 1500px;">
	<table class="position" border="0" cellSpacing="0" cellPadding="0" width="100%" align="center">
		<tbody>
			<tr class="position">
	 			<td class="position">当前位置: 费用计算 -&gt;  日用水费查询</td>
	 		</tr>
	 	</tbody>
	</table>	
	<form action="${baseUrl }freesettle/waterDayCostList.jspx" method="get" id="searchForm">
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
				      	<td>支付状态</td>
				        <td>
					        <select id="payStatus" name="payStatus">
						        <option value="" selected>--全部--</option>
						        <option value="-1">未支付</option>
						        <option value="1">已支付</option>
					        </select>
				        </td>
				        <td>扣费检查状态</td>
				        <td>
					        <select id="checkPayStatus" name="checkPayStatus">
						        <option value="" selected>--全部--</option>
						        <option value="-1">未检查</option>
						        <option value="1">已检查</option>
					        </select>
				        </td>
				      </tr>
				      <tr>
				        <td>水表ID</td>
				        <td><input class="textbox" id="meterHardwareId" value="${meterHardwareId }" style="width: 120px" name="meterHardwareId" /></td>
				      	<td>集中器ID</td>
				        <td><input class="textbox" id="concHardwareId" value="${concHardwareId }" style="width: 120px" name="concHardwareId" /></td>
				        <td>冻结时间（年）</td>
				        <td><input class="textbox" id="freezeYear" value="${freezeYear }" style="width: 60px" name="freezeYear" /></td>
				        <td>冻结时间（月）</td>
				        <td><input class="textbox" id="freezeMonth" value="${freezeMonth }" style="width: 60px" name="freezeMonth" /></td>
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
        <td width=""><div><span>支付状态</span></div></td>
        <td width=""><div><span>扣费检查状态</span></div></td>
        <td width=""><div><span>收费单位</span></div></td>
        <td width=""><div><span>1日用水费</span></div></td>
        <td width=""><div><span>2日用水费</span></div></td>
        <td width=""><div><span>3日用水费</span></div></td>
        <td width=""><div><span>4日用水费</span></div></td>
        <td width=""><div><span>5日用水费</span></div></td>
        <td width=""><div><span>6日用水费</span></div></td>
        <td width=""><div><span>7日用水费</span></div></td>
        <td width=""><div><span>8日用水费</span></div></td>
        <td width=""><div><span>9日用水费</span></div></td>
        <td width=""><div><span>10日用水费</span></div></td>
        <td width=""><div><span>11日用水费</span></div></td>
        <td width=""><div><span>12日用水费</span></div></td>
        <td width=""><div><span>13日用水费</span></div></td>
        <td width=""><div><span>14日用水费</span></div></td>
        <td width=""><div><span>15日用水费</span></div></td>
        <td width=""><div><span>16日用水费</span></div></td>
        <td width=""><div><span>17日用水费</span></div></td>
        <td width=""><div><span>18日用水费</span></div></td>
        <td width=""><div><span>19日用水费</span></div></td>
        <td width=""><div><span>20日用水费</span></div></td>
        <td width=""><div><span>21日用水费</span></div></td>
        <td width=""><div><span>22日用水费</span></div></td>
        <td width=""><div><span>23日用水费</span></div></td>
        <td width=""><div><span>24日用水费</span></div></td>
        <td width=""><div><span>25日用水费</span></div></td>
        <td width=""><div><span>26日用水费</span></div></td>
        <td width=""><div><span>27日用水费</span></div></td>
        <td width=""><div><span>28日用水费</span></div></td>
        <td width=""><div><span>29日用水费</span></div></td>
        <td width=""><div><span>30日用水费</span></div></td>
        <td width=""><div><span>31日用水费</span></div></td>
        <td width=""><div><span>月合计费用</span></div></td>
        <td width=""><div><span>冻结时间(年)</span></div></td>
        <td width=""><div><span>冻结时间(月)</span></div></td>
        <td width=""><div><span>创建时间</span></div></td>
      </tr>
      <c:forEach var="waterDayCost" items="${list }">
      <tr class="listTableTr">
        <td><div><input type="checkbox" name="" id="" class="cb" /></div></td>
        <td><div>${waterDayCost.id }</div></td>
        <td><div>${waterDayCost.userId }</div></td>
        <td><div>${waterDayCost.concHardwareId }</div></td>
        <td><div>${waterDayCost.meterHardwareId }</div></td>
        <td><div>
        	<c:if test="${waterDayCost.payStatus == 1}">已支付</c:if>
        	<c:if test="${waterDayCost.payStatus == -1}">未支付</c:if>
        </div></td>
        <td><div>
        	<c:if test="${waterDayCost.checkPayStatus == 1}">已检查</c:if>
        	<c:if test="${waterDayCost.checkPayStatus == -1}">未检查</c:if>
        </div></td>
        <td><div>${waterDayCost.chargingUnitId }</div></td>
        <td><div><gdcct:price longPrice="${waterDayCost.cost1 }" ></gdcct:price></div></td>
        <td><div><gdcct:price longPrice="${waterDayCost.cost2 }" ></gdcct:price></div></td>
        <td><div><gdcct:price longPrice="${waterDayCost.cost3 }" ></gdcct:price></div></td>
        <td><div><gdcct:price longPrice="${waterDayCost.cost4 }" ></gdcct:price></div></td>
        <td><div><gdcct:price longPrice="${waterDayCost.cost5 }" ></gdcct:price></div></td>
        <td><div><gdcct:price longPrice="${waterDayCost.cost6 }" ></gdcct:price></div></td>
        <td><div><gdcct:price longPrice="${waterDayCost.cost7 }" ></gdcct:price></div></td>
        <td><div><gdcct:price longPrice="${waterDayCost.cost8 }" ></gdcct:price></div></td>
        <td><div><gdcct:price longPrice="${waterDayCost.cost9 }" ></gdcct:price></div></td>
        <td><div><gdcct:price longPrice="${waterDayCost.cost10 }" ></gdcct:price></div></td>
        <td><div><gdcct:price longPrice="${waterDayCost.cost11 }" ></gdcct:price></div></td>
        <td><div><gdcct:price longPrice="${waterDayCost.cost12 }" ></gdcct:price></div></td>
        <td><div><gdcct:price longPrice="${waterDayCost.cost13 }" ></gdcct:price></div></td>
        <td><div><gdcct:price longPrice="${waterDayCost.cost14 }" ></gdcct:price></div></td>
        <td><div><gdcct:price longPrice="${waterDayCost.cost15 }" ></gdcct:price></div></td>
        <td><div><gdcct:price longPrice="${waterDayCost.cost16 }" ></gdcct:price></div></td>
        <td><div><gdcct:price longPrice="${waterDayCost.cost17 }" ></gdcct:price></div></td>
        <td><div><gdcct:price longPrice="${waterDayCost.cost18 }" ></gdcct:price></div></td>
        <td><div><gdcct:price longPrice="${waterDayCost.cost19 }" ></gdcct:price></div></td>
        <td><div><gdcct:price longPrice="${waterDayCost.cost20 }" ></gdcct:price></div></td>
        <td><div><gdcct:price longPrice="${waterDayCost.cost21 }" ></gdcct:price></div></td>
        <td><div><gdcct:price longPrice="${waterDayCost.cost22 }" ></gdcct:price></div></td>
        <td><div><gdcct:price longPrice="${waterDayCost.cost23 }" ></gdcct:price></div></td>
        <td><div><gdcct:price longPrice="${waterDayCost.cost24 }" ></gdcct:price></div></td>
        <td><div><gdcct:price longPrice="${waterDayCost.cost25 }" ></gdcct:price></div></td>
        <td><div><gdcct:price longPrice="${waterDayCost.cost26 }" ></gdcct:price></div></td>
        <td><div><gdcct:price longPrice="${waterDayCost.cost27 }" ></gdcct:price></div></td>
        <td><div><gdcct:price longPrice="${waterDayCost.cost28 }" ></gdcct:price></div></td>
        <td><div><gdcct:price longPrice="${waterDayCost.cost29 }" ></gdcct:price></div></td>
        <td><div><gdcct:price longPrice="${waterDayCost.cost30 }" ></gdcct:price></div></td>
        <td><div><gdcct:price longPrice="${waterDayCost.cost31 }" ></gdcct:price></div></td>
        <td><div>${waterDayCost.totalCost }</div></td>
        <td><div>${waterDayCost.freezeYear }</div></td>
        <td><div>${waterDayCost.freezeMonth }</div></td>
        <td><div><gdcct:fld pattren="yyyy-MM-dd" longTime="${waterDayCost.createTimestamp }"></gdcct:fld></div></td>
      </tr>
      </c:forEach>
      <tr class="listFooterTr">
	  	<td colSpan="43">
			<gdcct:pager id="pagerID" fontPageCSS="currentFont" pageStaticMax="0" pageIndex="${pageModel.pageIndex}" recordCount="${pageModel.recordCount }" pageFirstURL="${baseUrl }freesettle/waterDayCostList.jspx" pageDynamicURLFormat="${baseUrl }freesettle/waterDayCostList.jspx?pageIndex={0}" pageSize="${pageModel.pageSize}"></gdcct:pager>
		</td>
	  </tr>
    </table>
</body>
</html>