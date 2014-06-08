<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="gdcct" uri="http://www.xiaocong.net/gdcct/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无线智能水表页</title>
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
	
    $('#addWaterMeter').click(function(){
		window.location = '${baseUrl }archives/waterMeterDetail.jspx?type=${type}';
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
	 			<td class="position">当前位置: 计量点档案 -&gt;  <c:if test="${type == '1' }">IC卡预付费</c:if><c:if test="${type == '2' }">红外卡预付费</c:if><c:if test="${type == '3' }">无线智能</c:if>水表</td>
	 		</tr>
	 	</tbody>
	</table>	
	<form action="${baseUrl }archives/waterMeterList.jspx" method="get" id="searchForm">
	<input type="hidden" id="dataId" value="" />
	<input type="hidden" id="type" value="${type }" />
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
				        <td>客户姓名：</td>
				       	<td><input class="textbox" id="userName" style="width: 120px" name="userName" value="${userName }" /></td>
				      	<td>创建时间</td>
				        <td>
				        	<input class="Wdate" type="text" onClick="WdatePicker()" name="startDate" id="startDate" value="${startDate}">&nbsp;至:
				        </td>
				        <td>
  							<input class="Wdate" type="text" onClick="WdatePicker()" name="endDate" id="endDate" value="${endDate}">
				        </td>
				      </tr>
				      <tr>
				        <td>水表编号</td>
				        <td><input class="textbox" id="hardwareId" style="width: 120px" name="hardwareId" value="${hardwareId }" /></td>
				        <td>数据类别</td>
				        <td>
				        	<select id="dataType" name="dataType">
				        		<option value="">全部状态</option>
				        		<option value="1" <c:if test="${dataType == '1' }">selected="selected"</c:if>>脉冲</option>
				        		<option value="2" <c:if test="${dataType == '2' }">selected="selected"</c:if>>直读</option>
				        	</select>
				        </td>
				      	<td></td>
				      	<td>
				      		<input class="button" id="searchBtn" type="button" value="查询" name="searchBtn">
				      		<input class="button" id="" type="button" value="导出" name="">
				      		<input class="button" id="addWaterMeter" type="button" value="新增" name="">
				      	</td>
				      	<td></td>
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
        <td width=""><div><span>水表编号</span></div></td>
        <td width=""><div><span>用水性质</span></div></td>
        <td width=""><div><span>客户编号</span></div></td>
        <td width=""><div><span>客户姓名</span></div></td>
        <td width=""><div><span>开始时间</span></div></td>
        <td width=""><div><span>收费单位</span></div></td>
        <td width=""><div><span>操作</span></div></td>
      </tr>
      <c:forEach var="waterMeter" items="${list }">
      <tr class="listTableTr">
        <td><div><input type="checkbox" name="" id="" class="cb" /></div></td>
        <td><div>${waterMeter.hardwareId }</div></td>
        <td><div>${waterMeter.nature }</div></td>
        <td><div>${waterMeter.userId }</div></td>
        <td><div>${waterMeter.userName }</div></td>
        <td><div><gdcct:fld pattren="yyyy-MM-dd HH:mm:ss" longTime="${waterMeter.createTimestamp }"></gdcct:fld></div></td>
        <td><div>
        	<c:forEach items="${mapList }" var="map">
        		<c:if test="${map.hardwareId == waterMeter.hardwareId }">${map.chargingUnit }</c:if>
        	</c:forEach>
        </div></td>
        <td><div><a target="main" href="${baseUrl }archives/waterMeterDetail.jspx?hardwareId=${waterMeter.hardwareId }&type=${type}">修改</a></div></td>
      </tr>
      </c:forEach>
      <tr class="listFooterTr">
	  	<td colSpan="8">
			<gdcct:pager id="pagerID" fontPageCSS="currentFont" pageStaticMax="0" pageIndex="${pageModel.pageIndex}" recordCount="${pageModel.recordCount }" pageFirstURL="${baseUrl }archives/waterMeterList.jspx" pageDynamicURLFormat="${baseUrl }archives/waterMeterList.jspx?pageIndex={0}" pageSize="${pageModel.pageSize}"></gdcct:pager>
		</td>
	  </tr>
    </table>
</body>
</html>