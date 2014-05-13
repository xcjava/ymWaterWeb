<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="gdcct" uri="http://www.xiaocong.net/gdcct/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>日用水量查询</title>
<link href="${baseUrl }css/admin.css" type="text/css" rel="stylesheet" />
<script src="${baseUrl }js/jquery/jquery-1.7.2.min.js" type="text/javascript"></script>
<script>
$(function(){
	//全选
	var flag = true;
	$('#selectAllBtn').click(function(){
		if(flag){
			$.each($('.cb'), function(index){
				$(this)[0].checked = true;
			});
		}else{
			$.each($('.cb'), function(index){
				$(this)[0].checked = false;
			});
		}
		flag = !flag;
	});
	$.getJSON("${baseUrl }common/getChargingUnitListAjax.jspx", function(data){
		  	var options = $('#unitId')[0].options;
			options.length = 0;
			options.add(new Option("-请选择-",""));
			$.each(data,function(item,i){
				var itemOption = new Option(item.name,item.unitId);
				options.add(itemOption);
			});
			$('#unitId').value = '${unitId}';
	});
	$('#btnSubmit').click(function(){
		$('#searchForm').submit();
	});
});
</script>
</head>

<body style="min-width: 1100px;">
	<table class="position" border="0" cellSpacing="0" cellPadding="0" width="100%" align="center">
		<tbody>
			<tr class="position">
	 			<td class="position">当前位置: 数据查询 -&gt;  日用水量查询</td>
	 		</tr>
	 	</tbody>
	</table>	
	<table width="100%" border="0" align="" cellpadding="0" cellspacing="0">
		<tr><td>
			<div class="srhtab">
				<form id="searchForm" action="${baseUrl }searchAnalysis/waterDayUsageAmountList.jspx" method="post">
			    <table cellSpacing=0 cellPadding=2 border=0>
			      <tbody>
				      <tr>
				        <td>收费单位：</td>
				        <td>
				        	<select id="unitId" name="unitId">
							</select>
						</td>
				        <td>集中器编号：</td>
				        <td><input class="textbox" id="concHardwareId" style="width: 90px" name="concHardwareId" value="${concHardwareId }"/></td>
				        <td>客户编号：</td>
				        <td><input class="textbox" id="userId" style="width: 90px" name="userId" value="${userId }"/></td>
				        <td>年份：</td>
				        <td><input class="textbox" id="freezeYear" style="width: 90px" name="freezeYear" value="${freezeYear }"/></td>
				        <td>月份：</td>
				        <td><input class="textbox" id="freezeMonth" style="width: 90px" name="freezeMonth" value="${freezeMonth }"/></td>
				        <td>表号：</td>
				        <td><input class="textbox" id="meterHardwareId" style="width: 90px" name="meterHardwareId"  value="${meterHardwareId }"/></td>
				      	<td><input class="button" id="btnSubmit" type="button" value="查询" name="btnSubmit"></td>
				      	<td><input class="button" id="btnExport" type="button" value="导出" name="btnExport"></td>
				      </tr>
			      </tbody>
			    </table>
			    </form>	
			</div>
		</td></tr>
	</table>

    <table class="ymlistTable" width="100%" cellpadding="0" cellspacing="1" >
      <tr class="listTableHead">
        <td width=""><div align="center"><input type="checkbox" name="checkbox" id="selectAllBtn" /></div></td>
        <td width=""><div><span>序号</span></div></td>
        <td width=""><div><span>客户编号</span></div></td>
        <td width=""><div><span>集中器编号</span></div></td>
        <td width=""><div><span>表号</span></div></td>
        <td width=""><div><span>收费单位</span></div></td>
        <td width=""><div><span>1日用水量</span></div></td>
        <td width=""><div><span>2日用水量</span></div></td>
        <td width=""><div><span>3日用水量</span></div></td>
        <td width=""><div><span>4日用水量</span></div></td>
        <td width=""><div><span>5日用水量</span></div></td>
        <td width=""><div><span>6日用水量</span></div></td>
        <td width=""><div><span>7日用水量</span></div></td>
        <td width=""><div><span>8日用水量</span></div></td>
        <td width=""><div><span>9日用水量</span></div></td>
        <td width=""><div><span>10日用水量</span></div></td>
        <td width=""><div><span>11日用水量</span></div></td>
        <td width=""><div><span>12日用水量</span></div></td>
        <td width=""><div><span>13日用水量</span></div></td>
        <td width=""><div><span>14日用水量</span></div></td>
        <td width=""><div><span>15日用水量</span></div></td>
        <td width=""><div><span>16日用水量</span></div></td>
        <td width=""><div><span>17日用水量</span></div></td>
        <td width=""><div><span>18日用水量</span></div></td>
        <td width=""><div><span>19日用水量</span></div></td>
        <td width=""><div><span>20日用水量</span></div></td>
        <td width=""><div><span>21日用水量</span></div></td>
        <td width=""><div><span>22日用水量</span></div></td>
        <td width=""><div><span>23日用水量</span></div></td>
        <td width=""><div><span>24日用水量</span></div></td>
        <td width=""><div><span>25日用水量</span></div></td>
        <td width=""><div><span>26日用水量</span></div></td>
        <td width=""><div><span>27日用水量</span></div></td>
        <td width=""><div><span>28日用水量</span></div></td>
        <td width=""><div><span>29日用水量</span></div></td>
        <td width=""><div><span>30日用水量</span></div></td>
        <td width=""><div><span>31日用水量</span></div></td>
      </tr>
      <c:if test="${not empty list}">
      <c:forEach var="item"  items="${list }" varStatus="vs">
      <tr class="listTableTr">
        <td><div><input type="checkbox" name="" id="" class="cb" /></div></td>
        <td><div>${vs.count}</div></td>
        <td><div>${item.userId}</div></td>
        <td><div>${item.concHardwareId}</div></td>
        <td><div>${item.meterHardwareId}</div></td>
        <td><div>${item.chargingUnitId}</div></td>
        <td><div>${item.usageAmount1}</div></td>
        <td><div>${item.usageAmount2}</div></td>
        <td><div>${item.usageAmount3}</div></td>
        <td><div>${item.usageAmount4}</div></td>
        <td><div>${item.usageAmount5}</div></td>
        <td><div>${item.usageAmount6}</div></td>
        <td><div>${item.usageAmount7}</div></td>
        <td><div>${item.usageAmount8}</div></td>
        <td><div>${item.usageAmount9}</div></td>
        <td><div>${item.usageAmount10}</div></td>
        <td><div>${item.usageAmount11}</div></td>
        <td><div>${item.usageAmount12}</div></td>
        <td><div>${item.usageAmount13}</div></td>
        <td><div>${item.usageAmount14}</div></td>
        <td><div>${item.usageAmount15}</div></td>
        <td><div>${item.usageAmount16}</div></td>
        <td><div>${item.usageAmount17}</div></td>
        <td><div>${item.usageAmount18}</div></td>
        <td><div>${item.usageAmount19}</div></td>
        <td><div>${item.usageAmount20}</div></td>
        <td><div>${item.usageAmount21}</div></td>
        <td><div>${item.usageAmount22}</div></td>
        <td><div>${item.usageAmount23}</div></td>
        <td><div>${item.usageAmount24}</div></td>
        <td><div>${item.usageAmount25}</div></td>
        <td><div>${item.usageAmount26}</div></td>
        <td><div>${item.usageAmount27}</div></td>
        <td><div>${item.usageAmount28}</div></td>
        <td><div>${item.usageAmount29}</div></td>
        <td><div>${item.usageAmount30}</div></td>
        <td><div>${item.usageAmount31}</div></td>
      </tr>
      </c:forEach>
      </c:if>
		<tr class="listFooterTr">
		<td colSpan=40>
			<gdcct:pager id="pagerID" fontPageCSS="currentFont" pageStaticMax="0" pageIndex="${pageModel.pageIndex}" recordCount="${pageModel.recordCount }" pageFirstURL="${baseUrl }searchAnalysis/waterDayUsageAmountList.jspx" pageDynamicURLFormat="${baseUrl }searchAnalysis/waterDayUsageAmountList.jspx?pageIndex={0}" pageSize="${pageModel.pageSize}"></gdcct:pager>
		</td>
		</tr>    
    </table>
</body>
</html>