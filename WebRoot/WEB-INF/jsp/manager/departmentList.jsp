<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="gdcct" uri="http://www.xiaocong.net/gdcct/tags"%>
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
	$('#addDepartment').click(function(){
		window.location = '${baseUrl }manager/departmentDetail.jspx';
	});
	$('#status').val(${status});
	$('#searchBtn').click(function(){
		$('#searchForm').submit();
	});
	$('#openStatusBtn').click(function(){
		var deptId = $("#dataId").val();
		if(deptId == ''){
			alert("请选择一条数据！");
			return false;
		}
		if(confirm('是否启用该部门？')){
			window.location = '${baseUrl }manager/openDepartment.jspx?deptId='+deptId;
		}
	});
	$('#closeStatusBtn').click(function(){
		var deptId = $("#dataId").val();
		if(deptId == ''){
			alert("请选择一条数据！");
			return false;
		}
		if(confirm('是否禁用该部门？')){
			window.location = '${baseUrl }manager/closeDepartment.jspx?deptId='+deptId;
		}
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
	 			<td class="position">当前位置: 系统管理 -&gt;  部门列表</td>
	 		</tr>
	 	</tbody>
	</table>	
	<form action="${baseUrl }manager/departmentList.jspx" method="get" id="searchForm">
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
				        <td>状态：</td>
				        <td>
							<select id="status" name="status">
								<option value="">--请选择--</option>
								<option value="0" <c:if test="${status == 0 }">selected="selected"</c:if>>新建</option>
								<option value="1" <c:if test="${status == 1 }">selected="selected"</c:if>>正常</option>
								<option value="-1" <c:if test="${status == -1 }">selected="selected"</c:if>>停用</option>
							</select>
						</td>
				      	<td><input class="button" id="searchBtn" type="button" value="查询" name="searchBtn"></td>
				      	<td><input class="button" id="addDepartment" type="button" value="新增" name=""></td>
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
        <td width=""><div><span>部门编号</span></div></td>
        <td width=""><div><span>部门名称</span></div></td>
        <td width=""><div><span>上级部门</span></div></td>
        <td width=""><div><span>联系人</span></div></td>
        <td width=""><div><span>联系电话</span></div></td>
        <td width=""><div><span>收费单位</span></div></td>
       	<td width=""><div><span>状态</span></div></td>
        <td width=""><div><span>操作</span></div></td>
      </tr>
      <c:forEach var="department" items="${list }">
      <tr class="listTableTr">
        <td><div><input type="checkbox" name="${department.deptId }" class="cb" /></div></td>
        <td><div>${department.deptId }</div></td>
        <td><div>${department.name }</div></td>
        <td><div>${department.parentDeptId }</div></td>
        <td><div>${department.linkMan }</div></td>
        <td><div>${department.linkTel }</div></td>
        <td><div>${department.chargingUnitId }</div></td>
        <td><div>
        	<c:if test="${department.status == 0 }">新建</c:if>
        	<c:if test="${department.status == 1 }">启用</c:if>
        	<c:if test="${department.status == -1 }">停用</c:if><div>
        </td>
        <td><div><a href="${baseUrl }manager/departmentDetail.jspx?deptId=${department.deptId }">修改</a> | <a href="${baseUrl }manager/popedomList.jspx?deptId=${department.deptId }" target="_blank">权限</a></div></td>
      </tr>
      </c:forEach>
	 	<tr class="listFooterTr">
		<td colSpan=11>
			<gdcct:pager id="pagerID" fontPageCSS="currentFont" pageStaticMax="0" pageIndex="${pageModel.pageIndex}" recordCount="${pageModel.recordCount }" pageFirstURL="${baseUrl }manager/departmentList.jspx" pageDynamicURLFormat="${baseUrl }manager/departmentList.jspx?pageIndex={0}" pageSize="${pageModel.pageSize}"></gdcct:pager>
		</td>
		</tr>      
    </table>
</body>
</html>