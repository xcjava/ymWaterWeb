<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="gdcct" uri="http://www.xiaocong.net/gdcct/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>召数据审核数据</title>
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
	 			<td class="position">当前位置: 数据查询 -&gt;  数据审核查询</td>
	 		</tr>
	 	</tbody>
	</table>	
	<table width="100%" border="0" align="" cellpadding="0" cellspacing="0">
		<tr><td>
			<div class="srhtab">
				<form id="searchForm" action="${baseUrl }searchAnalysis/checkingFreezeDataList.jspx" method="post">
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
        <td width=""><div><span>1日表码</span></div></td>
        <td width=""><div><span>2日表码</span></div></td>
        <td width=""><div><span>3日表码</span></div></td>
        <td width=""><div><span>4日表码</span></div></td>
        <td width=""><div><span>5日表码</span></div></td>
        <td width=""><div><span>6日表码</span></div></td>
        <td width=""><div><span>7日表码</span></div></td>
        <td width=""><div><span>8日表码</span></div></td>
        <td width=""><div><span>9日表码</span></div></td>
        <td width=""><div><span>10日表码</span></div></td>
        <td width=""><div><span>11日表码</span></div></td>
        <td width=""><div><span>12日表码</span></div></td>
        <td width=""><div><span>13日表码</span></div></td>
        <td width=""><div><span>14日表码</span></div></td>
        <td width=""><div><span>15日表码</span></div></td>
        <td width=""><div><span>16日表码</span></div></td>
        <td width=""><div><span>17日表码</span></div></td>
        <td width=""><div><span>18日表码</span></div></td>
        <td width=""><div><span>19日表码</span></div></td>
        <td width=""><div><span>20日表码</span></div></td>
        <td width=""><div><span>21日表码</span></div></td>
        <td width=""><div><span>22日表码</span></div></td>
        <td width=""><div><span>23日表码</span></div></td>
        <td width=""><div><span>24日表码</span></div></td>
        <td width=""><div><span>25日表码</span></div></td>
        <td width=""><div><span>26日表码</span></div></td>
        <td width=""><div><span>27日表码</span></div></td>
        <td width=""><div><span>28日表码</span></div></td>
        <td width=""><div><span>29日表码</span></div></td>
        <td width=""><div><span>30日表码</span></div></td>
        <td width=""><div><span>31日表码</span></div></td>
        <td width=""><div><span>操作</span></div></td>
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
        <td><div>${item.meterReading1}</div></td>
        <td><div>${item.meterReading2}</div></td>
        <td><div>${item.meterReading3}</div></td>
        <td><div>${item.meterReading4}</div></td>
        <td><div>${item.meterReading5}</div></td>
        <td><div>${item.meterReading6}</div></td>
        <td><div>${item.meterReading7}</div></td>
        <td><div>${item.meterReading8}</div></td>
        <td><div>${item.meterReading9}</div></td>
        <td><div>${item.meterReading10}</div></td>
        <td><div>${item.meterReading11}</div></td>
        <td><div>${item.meterReading12}</div></td>
        <td><div>${item.meterReading13}</div></td>
        <td><div>${item.meterReading14}</div></td>
        <td><div>${item.meterReading15}</div></td>
        <td><div>${item.meterReading16}</div></td>
        <td><div>${item.meterReading17}</div></td>
        <td><div>${item.meterReading18}</div></td>
        <td><div>${item.meterReading19}</div></td>
        <td><div>${item.meterReading20}</div></td>
        <td><div>${item.meterReading21}</div></td>
        <td><div>${item.meterReading22}</div></td>
        <td><div>${item.meterReading23}</div></td>
        <td><div>${item.meterReading24}</div></td>
        <td><div>${item.meterReading25}</div></td>
        <td><div>${item.meterReading26}</div></td>
        <td><div>${item.meterReading27}</div></td>
        <td><div>${item.meterReading28}</div></td>
        <td><div>${item.meterReading29}</div></td>
        <td><div>${item.meterReading30}</div></td>
        <td><div>${item.meterReading31}</div></td>
        <td><div><a href="${baseUrl }searchAnalysis/checkingFreezeDataDetail.jspx?id=${item.id}">详细</a></div></td>
      </tr>
      </c:forEach>
      </c:if>
      
	 	<tr class="listFooterTr">
		<td colSpan=40>
			<gdcct:pager id="pagerID" fontPageCSS="currentFont" pageStaticMax="0" pageIndex="${pageModel.pageIndex}" recordCount="${pageModel.recordCount }" pageFirstURL="${baseUrl }searchAnalysis/checkingFreezeDataList.jspx" pageDynamicURLFormat="${baseUrl }searchAnalysis/checkingFreezeDataList.jspx?pageIndex={0}" pageSize="${pageModel.pageSize}"></gdcct:pager>
		</td>
		</tr>       
    </table>
</body>
</html>