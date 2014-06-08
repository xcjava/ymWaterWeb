<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="gdcct" uri="http://www.xiaocong.net/gdcct/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>客户用水信息列表页</title>
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
	
    $('#addWaterCustomer').click(function(){
		window.location = '${baseUrl }archives/waterCustomerTab.jspx';
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
	 			<td class="position">当前位置: 客户档案 -&gt;  客户用水信息</td>
	 		</tr>
	 	</tbody>
	</table>
	<form action="${baseUrl }archives/waterCustomerList.jspx" method="get" id="searchForm">
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
				        <td>客户姓名：</td>
				        <td><input class="textbox" id="userName" style="width: 120px" name="userName" value="${userName }" /></td>
				      </tr>
				      <tr>
				        <td>用水用户编号</td>
				        <td><input class=textbox id="customerId" style="WIDTH: 120px" name="customerId" value="${customerId }"></td>
				        <td>开始时间</td>
				        <td>
				        	<input class="Wdate" type="text" onClick="WdatePicker()" name="startDate" id="startDate" value="${startDate}">&nbsp;至:
				        </td>
				        <td>
  							<input class="Wdate" type="text" onClick="WdatePicker()" name="endDate" id="endDate" value="${endDate}">
				        </td>
				        <td>用户状态</td>
				        <td>
				        	<select id="customerStatus" name="customerStatus">
				        		<option value="0">全部状态</option>
								<option value="1" <c:if test="${customerStatus == '1' }">selected="selected"</c:if>>正常用水客户</option>
								<option value="2" <c:if test="${customerStatus == '2' }">selected="selected"</c:if>>当前新装客户</option>
								<option value="3" <c:if test="${customerStatus == '3' }">selected="selected"</c:if>>当前变更客户</option>
								<option value="4" <c:if test="${customerStatus == '4' }">selected="selected"</c:if>>已销户客户</option>
							</select>
				        </td>
				      	<td><input class="button" id="searchBtn" type="button" value="查询" name="searchBtn"></td>
				      	<td><input class="button" id="" type="button" value="导出" name=""></td>
				      	<td><input class="button" id="addWaterCustomer" type="button" value="新增" name=""></td>
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
        <td width=""><div><span>用水用户编号</span></div></td>
        <td width=""><div><span>用户状态</span></div></td>
        <td width=""><div><span>客户编号</span></div></td>
        <td width=""><div><span>客户姓名</span></div></td>
        <td width=""><div><span>开始时间</span></div></td>
        <td width=""><div><span>收费单位</span></div></td>
        <td width=""><div><span>用水性质</span></div></td>
        <td width=""><div><span>操作</span></div></td>
      </tr>
      <c:forEach var="waterCustomer" items="${list }">
      <tr class="listTableTr">
        <td><div><input type="checkbox" name="" id="" class="cb" /></div></td>
        <td><div>${waterCustomer.customerId }</div></td>
        <td><div>
        	<c:if test="${waterCustomer.customerStatus  == '1'}">正常用水客户</c:if>
        	<c:if test="${waterCustomer.customerStatus  == '2'}">当前新装客户</c:if>
        	<c:if test="${waterCustomer.customerStatus  == '3'}">当前变更客户</c:if>
        	<c:if test="${waterCustomer.customerStatus  == '4'}">已销户客户</c:if>
        </div></td>
        <td><div>${waterCustomer.userId }</div></td>
        <td><div>${waterCustomer.userName }</div></td>
        <td><div><gdcct:fld pattren="yyyy-MM-dd HH:mm:ss" longTime="${waterCustomer.openTimestamp }"></gdcct:fld></div></td>
        <td><div>
        	<c:forEach items="${mapList }" var="map">
        		<c:if test="${map.customerId == waterCustomer.customerId }">${map.chargingUnit }</c:if>
        	</c:forEach>
        </div></td>
        <td><div>${waterCustomer.waterNature }</div></td>
        <td><div><a target="main" href="${baseUrl }archives/waterCustomerTab.jspx?customerId=${waterCustomer.customerId }">修改</a></div></td>
      </tr>
      </c:forEach>
      <tr class="listFooterTr">
	  	<td colSpan="9">
			<gdcct:pager id="pagerID" fontPageCSS="currentFont" pageStaticMax="0" pageIndex="${pageModel.pageIndex}" recordCount="${pageModel.recordCount }" pageFirstURL="${baseUrl }archives/waterCustomerList.jspx" pageDynamicURLFormat="${baseUrl }archives/waterCustomerList.jspx?pageIndex={0}" pageSize="${pageModel.pageSize}"></gdcct:pager>
		</td>
	  </tr>
    </table>
</body>
</html>