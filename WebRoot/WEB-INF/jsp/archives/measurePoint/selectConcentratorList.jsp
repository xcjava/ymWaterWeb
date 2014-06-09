<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="gdcct" uri="http://www.xiaocong.net/gdcct/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>集中器列表</title>
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
            $("#concName").val($(this).attr("title"));
        }else{
        	$("#dataId").val('');
        	$("#concName").val('');
        }
    });
	
	$('#btnSubmit').click(function(){
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

<body style="min-width: 800px;">
	<form action="${baseUrl }archives/selectConcentratorList.jspx" method="get" id="searchForm">
	<input type="hidden" name="pageSize" value="10" />
	<input type="hidden" id="dataId" value="" />
	<input type="hidden" id="concName" value="" />
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
				        <td>集中器ID：</td>
				        <td><input class="textbox" id="hardwareId" name="hardwareId" value="${hardwareId}"/></td>
				        <td>集中器名称</td>
				        <td><input class=textbox id="name" name="name" value="${name}"></td>
				        <td>
				        	<input class="button" id="btnSubmit" type="button" value="查询">
				        	<input class="button" id="" type="button" value="导出" name="">
				        	<input class="button" id="addConcentrator" type="button" value="新增" name="">
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
        <td width=""><div><span>集中器编号</span></div></td>
        <td width=""><div><span>集中器名称</span></div></td>
        <td width=""><div><span>收费单位</span></div></td>
        <td width=""><div><span>安装地址</span></div></td>
        <td width=""><div><span>终端端口号</span></div></td>
      </tr>
      <c:if test="${not empty list}">
      <c:forEach var="item"  items="${list }" varStatus="vs">
      <tr class="listTableTr">
        <td><div><input type="checkbox" name="${item.hardwareId}" title="${item.name}" class="cb" /></div></td>
        <td><div>${vs.index+1}</div></td>
        <td><div>${item.hardwareId}</div></td>
        <td><div>${item.name}</div></td>
        <td><div>
        	<c:forEach items="${mapList }" var="map">
        		<c:if test="${map.hardwareId == item.hardwareId }">${map.chargingUnit }</c:if>
        	</c:forEach>
        </div></td>
        <td><div>${item.collectionAddress}</div></td>
        <td><div>${item.terminalPost}</div></td>
      </tr>
      </c:forEach>
      </c:if>
      <tr class="listFooterTr">
	  	<td colSpan="7">
			<gdcct:pager id="pagerID" fontPageCSS="currentFont" pageStaticMax="0" pageIndex="${pageModel.pageIndex}" recordCount="${pageModel.recordCount }" pageFirstURL="${baseUrl }archives/selectConcentratorList.jspx?pageSize=10" pageDynamicURLFormat="${baseUrl }archives/selectConcentratorList.jspx?pageIndex={0}&pageSize=10" pageSize="${pageModel.pageSize}"></gdcct:pager>
		</td>
	  </tr>
    </table>
</body>
</html>