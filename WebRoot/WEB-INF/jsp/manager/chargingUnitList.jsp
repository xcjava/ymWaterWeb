<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="gdcct" uri="http://www.xiaocong.net/gdcct/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>部门列表</title>
<link href="${baseUrl }css/admin.css" type="text/css" rel="stylesheet" />
<script src="${baseUrl }js/jquery/jquery-1.7.2.min.js" type="text/javascript"></script>
<script>
$(function(){
	if('${param.message}' != ''){
		alert('${param.message}');
	}
	//全选
	/*var flag = true;
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
	});*/
	//只能选中一个
    $("input[type='checkbox']").click(function() {
        if ($(this).attr("checked") == "checked") {
            $("input[type='checkbox']").attr("checked", false);
            $(this).attr("checked", "checked");
            $("#dataId").val($(this).attr("name"));
        }
    });
	$('#addChargingUnit').click(function(){
		window.location = '${baseUrl }manager/chargingUnitDetail.jspx';
	});
	$('a[id^="foreverDel-"]').click(function(){
		var unitId = $(this).attr('id').substring(11,$(this).attr('id').length);
		if(confirm('是否永久删除该收费单位？')){
			window.location = '${baseUrl }manager/deleteChargingUnit.jspx?unitId='+unitId;
		}
	});
	$('#status').val(${status});
	$('#searchBtn').click(function(){
		$('#searchForm').submit();
	});
	$('#openStatusBtn').click(function(){
		var unitId = $("#dataId").val();
		if(unitId == ''){
			alert("请选择一条数据！");
			return false;
		}
		if(confirm('是否启用该收费单位？')){
			window.location = '${baseUrl }manager/openChargingUnit.jspx?unitId='+unitId;
		}
	});
	$('#closeStatusBtn').click(function(){
		var unitId = $("#dataId").val();
		if(unitId == ''){
			alert("请选择一条数据！");
			return false;
		}
		if(confirm('是否禁用该收费单位？')){
			window.location = '${baseUrl }manager/closeChargingUnit.jspx?unitId='+unitId;
		}
	});
});
</script>
</head>

<body style="min-width: 1100px;">
	<table class="position" border="0" cellSpacing="0" cellPadding="0" width="100%" align="center">
		<tbody>
			<tr class="position">
	 			<td class="position">当前位置: 系统管理 -&gt;  收费单位列表</td>
	 		</tr>
	 	</tbody>
	</table>
	<form action="${baseUrl }manager/chargingUnitList.jspx" method="get" id="searchForm">
	<input type="hidden" id="dataId" value="" />
	<table width="100%" border="0" align="" cellpadding="0" cellspacing="0">
		<tr><td>
			<div class="srhtab">
			    <table cellSpacing=0 cellPadding=2 border=0>
			      <tbody>
				      <tr>
				        <td>收费单位：</td>
				        <td><input class="textbox" id="name" name="name" style="width: 120px" value="${name }" /></td>
				        <td>状态：</td>
				        <td>
							<select id="status" name="status">
								<option value="">--请选择--</option>
								<option value="0">新建</option>
								<option value="1">正常</option>
								<option value="-1">停用</option>
							</select>
						</td>
				      	<td><input class="button" id="searchBtn" type="button" value="查询" name="searchBtn"></td>
				      	<td><input class="button" id="addChargingUnit" type="button" value="新增" name=""></td>
				      	<td></td>
				      	<td></td>
				      	<td></td>
				      	<td><input class="button" type="button" value="启用" id="openStatusBtn"></td>
				      	<td><input class="button" type="button" value="停用" id="closeStatusBtn"></td>
				      </tr>
				      
			      </tbody>
			    </table>	
			</div>
		</td></tr>
	</table>
	</form>
    <table class="ymlistTable" width="100%" cellpadding="0" cellspacing="1" >
      <tr class="listTableHead">
        <td width=""><div align="center"><input type="checkbox" name="" id="selectAllBtn" /></div></td>
        <td width=""><div><span>序号</span></div></td>
        <td width=""><div><span>收费单位编号</span></div></td>
        <td width=""><div><span>上级收费单位</span></div></td>
        <td width=""><div><span>收费单位名称</span></div></td>
        <td width=""><div><span>联系人</span></div></td>
        <td width=""><div><span>联系电话</span></div></td>
        <td width=""><div><span>地址</span></div></td>
       	<td width=""><div><span>状态</span></div></td>
        <td width=""><div><span>操作</span></div></td>
      </tr>
      <c:forEach var="chargingUni" items="${list }">
      <tr class="listTableTr">
        <td><div><input type="checkbox" name="${chargingUni.unitId }" class="cb" /></div></td>
        <td><div>${chargingUni.unitId }</div></td>
        <td><div>${chargingUni.unitId }</div></td>
        <td><div>${chargingUni.parentUnitId }</div></td>
        <td><div>${chargingUni.name }</div></td>
        <td><div>${chargingUni.linkMan }</div></td>
        <td><div>${chargingUni.linkTel }</div></td>
        <td><div>${chargingUni.linkAddr }</div></td>
        <td><div>
        	<c:if test="${chargingUni.status == 0 }">新建</c:if>
        	<c:if test="${chargingUni.status == 1 }">启用</c:if>
        	<c:if test="${chargingUni.status == -1 }">停用</c:if><div>
        </td>
        <td><div><a href="${baseUrl }manager/chargingUnitDetail.jspx?unitId=${chargingUni.unitId }">修改</a><c:if test="${chargingUni.status == 0 }"> | <a href="#" id="foreverDel-${chargingUni.unitId }">永久删除</a></c:if></div></td>
      </tr>
      </c:forEach>
	 	<tr class="listFooterTr">
		<td colSpan=10>
			<gdcct:pager id="pagerID" fontPageCSS="currentFont" pageStaticMax="0" pageIndex="${pageModel.pageIndex}" recordCount="${pageModel.recordCount }" pageFirstURL="${baseUrl }manager/chargingUnitList.jspx?name=${urlName }&status=${status }" pageDynamicURLFormat="${baseUrl }manager/chargingUnitList.jspx?pageIndex={0}&name=${urlName }&status=${status }" pageSize="${pageModel.pageSize}"></gdcct:pager>
		</td>
		</tr>      
    </table>
</body>
</html>