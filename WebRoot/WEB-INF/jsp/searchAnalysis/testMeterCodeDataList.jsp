<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="gdcct" uri="http://www.xiaocong.net/gdcct/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>实招数据查询
</title>
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
    	window.open('${baseUrl }searchAnalysis/downloadTestMeterCodeDataList.jspx?unitId='+chargingUnitId +'&userId='+userId +'&concHardwareId='+concHardwareId 
    			+'&meterHardwareId='+meterHardwareId
    			+'&random=' + Math.random());
    });
});
</script>
</head>

<body style="min-width: 1100px;">
	<table class="position" border="0" cellSpacing="0" cellPadding="0" width="100%" align="center">
		<tbody>
			<tr class="position">
	 			<td class="position">当前位置: 数据查询 -&gt; 实招数据查询</td>
	 		</tr>
	 	</tbody>
	</table>	
	<table width="100%" border="0" align="" cellpadding="0" cellspacing="0">
		<tr><td>
			<div class="srhtab">
			    <form id="searchForm" action="${baseUrl }searchAnalysis/testMeterCodeDataList.jspx" method="post">
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
        <td width=""><div><span>表计编号</span></div></td>
        <td width=""><div><span>实招表码</span></div></td>
        <td width=""><div><span>电池电压</span></div></td>
        <td width=""><div><span>模块类型</span></div></td>
        <td width=""><div><span>磁攻击</span></div></td>
        <td width=""><div><span>数据异常</span></div></td>
        <td width=""><div><span>数据答应</span></div></td>
        <td width=""><div><span>阀门状态</span></div></td>
        <td width=""><div><span>创建时间</span></div></td>
        <td width=""><div><span>真实抄表时间</span></div></td>
      </tr>
      <c:if test="${not empty list}">
      <c:forEach var="item"  items="${list }" varStatus="vs">
      <tr class="listTableTr">
        <td><div><input type="checkbox" name="" id="" class="cb" /></div></td>
        <td><div>${vs.count}</div></td>
        <td><div>${item.userId}</div></td>
        <td><div>${item.concHardwareId}</div></td>
        <td><div>${item.meterHardwareId}</div></td>
        <td><div>${item.meterReading}</div></td>
        <td><div>${item.batteryVoltage}</div></td>
        <td><div>
        <c:if test="${item.dataType==0}">光电</c:if>
        <c:if test="${item.dataType==1}">脉冲</c:if>
        </div></td>
        <td><div>
        <c:if test="${item.magneticAttack==0}">无磁攻击</c:if>
        <c:if test="${item.magneticAttack==1}">有磁攻击</c:if>
        </div></td>
        <td><div>
        <c:if test="${item.errorStatus==0}">正确</c:if>
        <c:if test="${item.errorStatus==1}">错误</c:if>
        </div></td>
        <td><div>
        <c:if test="${item.replyStatus==0}">有应答</c:if>
        <c:if test="${item.replyStatus==1}">无应答</c:if>
        </div></td>
        <td><div>
        <c:if test="${item.valveStatus==01}">半阀</c:if>
        <c:if test="${item.valveStatus==10}">开阀</c:if>
        <c:if test="${item.valveStatus==11}">关阀</c:if>
        <c:if test="${item.valveStatus==00}">未知</c:if>
        </div></td>
        <td><div><gdcct:fld pattren="yyyy-MM-dd HH:mm:ss" longTime="${item.createTimestamp}"></gdcct:fld></div></td>
        <td><div><gdcct:fld pattren="yyyy-MM-dd HH:mm:ss" longTime="${item.realTimestamp}"></gdcct:fld></div></td>
      </tr>
      </c:forEach>
      </c:if>
	 	<tr class="listFooterTr">
		<td colSpan=21>
			<gdcct:pager id="pagerID" fontPageCSS="currentFont" pageStaticMax="0" pageIndex="${pageModel.pageIndex}" recordCount="${pageModel.recordCount }" pageFirstURL="${baseUrl }searchAnalysis/testMeterCodeDataList.jspx" pageDynamicURLFormat="${baseUrl }searchAnalysis/testMeterCodeDataList.jspx?pageIndex={0}" pageSize="${pageModel.pageSize}"></gdcct:pager>
		</td>
		</tr>      
    </table>
</body>
</html>