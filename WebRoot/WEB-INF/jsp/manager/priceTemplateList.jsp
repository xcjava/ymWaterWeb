<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="gdcct" uri="http://www.xiaocong.net/gdcct/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>价目列表</title>
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
	
    $('#addPriceTemplate').click(function(){
		window.location = '${baseUrl }manage/priceTemplateDetail.jspx';
	});
    
	$('#status').val(${status});
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
	 			<td class="position">当前位置: 系统管理 -&gt;  价目列表</td>
	 		</tr>
	 	</tbody>
	</table>
	<form action="${baseUrl }manage/priceTemplateList.jspx" method="get" id="searchForm">
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
				        <td>价目代码：</td>
				        <td><input class="textbox" id="id" name="id" style="width: 120px" value="${id }" /></td>
				        <td>开始日期：</td>
				        <td>
				        	<input class="Wdate" type="text" onClick="WdatePicker()" name="startDate" id="startDate" value="${startDate}">&nbsp;至:
  							<input class="Wdate" type="text" onClick="WdatePicker()" name="endDate" id="endDate" value="${endDate}">
				        </td>
				      	<td><input class="button" id="searchBtn" type="button" value="查询" name="searchBtn"></td>
				      	<td><input class="button" id="addPriceTemplate" type="button" value="新增" name=""></td>
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
        <td width=""><div><span>价目id</span></div></td>
        <td width=""><div><span>项目名称</span></div></td>
        <td width=""><div><span>价目类型</span></div></td>
        <td width=""><div><span>开始日期</span></div></td>
        <td width=""><div><span>结束日期</span></div></td>
        <td width=""><div><span>结算周期</span></div></td>
        <td width=""><div><span>阶梯一水价(分)</span></div></td>
        <td width=""><div><span>阶梯一最大值</span></div></td>
        <td width=""><div><span>阶梯二水价(分)</span></div></td>
        <td width=""><div><span>阶梯二最大值</span></div></td>
        <td width=""><div><span>阶梯三水价(分)</span></div></td>
        <td width=""><div><span>阶梯三最大值</span></div></td>
        <td width=""><div><span>阶梯四水价(分)</span></div></td>
        <td width=""><div><span>阶梯四最大值</span></div></td>
        <td width=""><div><span>操作</span></div></td>
      </tr>
      <c:forEach var="priceTemplate" items="${list }">
      <tr class="listTableTr">
        <td><div><input type="checkbox" name="" id="" class="cb" /></div></td>
        <td><div>${priceTemplate.id }</div></td>
        <td><div>${priceTemplate.name }</div></td>
        <td><div>${priceTemplate.type }</div></td>
        <td><div><gdcct:fld pattren="yyyy-MM-dd" longTime="${priceTemplate.startTimestamp }"></gdcct:fld></div></td>
        <td><div><gdcct:fld pattren="yyyy-MM-dd" longTime="${priceTemplate.endTimestamp }"></gdcct:fld></div></td>
        <td><div>${priceTemplate.billingPeriod }</div></td>
        <td><div><gdcct:price longPrice="${priceTemplate.level1Cost }" ></gdcct:price></div></td>
        <td><div>${priceTemplate.level1Num }</div></td>
        <td><div><gdcct:price longPrice="${priceTemplate.level2Cost }" ></gdcct:price></div></td>
        <td><div>${priceTemplate.level2Num }</div></td>
        <td><div><gdcct:price longPrice="${priceTemplate.level3Cost }" ></gdcct:price></div></td>
        <td><div>${priceTemplate.level3Num }</div></td>
        <td><div><gdcct:price longPrice="${priceTemplate.level4Cost }" ></gdcct:price></div></td>
        <td><div>${priceTemplate.level4Num }</div></td>
        <td><div><a href="${baseUrl }manage/priceTemplateDetail.jspx?id=${priceTemplate.id }">修改</a></div></td>
      </tr>
      </c:forEach>
	 	<tr class="listFooterTr">
		<td colSpan="16">
			<gdcct:pager id="pagerID" fontPageCSS="currentFont" pageStaticMax="0" pageIndex="${pageModel.pageIndex}" recordCount="${pageModel.recordCount }" pageFirstURL="${baseUrl }manage/priceTemplateList.jspx" pageDynamicURLFormat="${baseUrl }manage/priceTemplateList.jspx?pageIndex={0}" pageSize="${pageModel.pageSize}"></gdcct:pager>
		</td>
		</tr>      
    </table>
</body>
</html>