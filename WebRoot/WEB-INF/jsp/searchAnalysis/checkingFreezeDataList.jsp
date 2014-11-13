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
	loadChargingUnit('${unitId }');
	$('#btnSubmit').click(function(){
		$('#searchForm').submit();
	});
	
	$('#exportBtn').click(function(){
    	var chargingUnitId = $('#chargingUnitSel').val();
    	var concHardwareId = $('#concHardwareId').val();
    	var userId = $('#userId').val();
    	var meterHardwareId = $('#meterHardwareId').val();
    	var freezeYear = $('#freezeYear').val();
    	var freezeMonth = $('#freezeMonth').val();
    	window.open('${baseUrl }searchAnalysis/downloadCheckingFreezeDataList.jspx?unitId='+chargingUnitId +'&userId='+userId +'&concHardwareId='+concHardwareId 
    			+'&meterHardwareId='+meterHardwareId
    			+'&freezeYear='+freezeYear
    			+'&freezeMonth='+freezeMonth
    			+'&random=' + Math.random());
    });
	
	if('${message}' != ''){
		alert('${message}');
	}
});
</script>
</head>

<body style="min-width: 2600px;">
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
				        	<select id="chargingUnitSel" name="unitId">
								<option></option>
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
				      	<td><input class="button" id="exportBtn" type="button" value="导出" name=""></td>
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
        <td width=""><div><span>冻结时间</span></div></td>
        <td width=""><div><span>1日表计读数</span></div></td>
        <td width=""><div><span>2日表计读数</span></div></td>
        <td width=""><div><span>3日表计读数</span></div></td>
        <td width=""><div><span>4日表计读数</span></div></td>
        <td width=""><div><span>5日表计读数</span></div></td>
        <td width=""><div><span>6日表计读数</span></div></td>
        <td width=""><div><span>7日表计读数</span></div></td>
        <td width=""><div><span>8日表计读数</span></div></td>
        <td width=""><div><span>9日表计读数</span></div></td>
        <td width=""><div><span>10日表计读数</span></div></td>
        <td width=""><div><span>11日表计读数</span></div></td>
        <td width=""><div><span>12日表计读数</span></div></td>
        <td width=""><div><span>13日表计读数</span></div></td>
        <td width=""><div><span>14日表计读数</span></div></td>
        <td width=""><div><span>15日表计读数</span></div></td>
        <td width=""><div><span>16日表计读数</span></div></td>
        <td width=""><div><span>17日表计读数</span></div></td>
        <td width=""><div><span>18日表计读数</span></div></td>
        <td width=""><div><span>19日表计读数</span></div></td>
        <td width=""><div><span>20日表计读数</span></div></td>
        <td width=""><div><span>21日表计读数</span></div></td>
        <td width=""><div><span>22日表计读数</span></div></td>
        <td width=""><div><span>23日表计读数</span></div></td>
        <td width=""><div><span>24日表计读数</span></div></td>
        <td width=""><div><span>25日表计读数</span></div></td>
        <td width=""><div><span>26日表计读数</span></div></td>
        <td width=""><div><span>27日表计读数</span></div></td>
        <td width=""><div><span>28日表计读数</span></div></td>
        <td width=""><div><span>29日表计读数</span></div></td>
        <td width=""><div><span>30日表计读数</span></div></td>
        <td width=""><div><span>31日表计读数</span></div></td>
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
        <td><div>${item.freezeYear}年${item.freezeMonth}月</div></td>
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
        <td><div><a href="${baseUrl }searchAnalysis/checkingFreezeDataDetail.jspx?id=${item.id}">修改审核数据</a></div></td>
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