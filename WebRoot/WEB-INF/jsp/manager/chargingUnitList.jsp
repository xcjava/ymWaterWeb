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
	$('#addChargingUnit').click(function(){
		window.location = '${baseUrl }manager/chargingUnitDetail.jspx';
	});
	$('a[id^="foreverDel-"]').click(function(){
		var unitId = $(this).attr('id').substring(11,$(this).attr('id').length);
		if(confirm('是否永久删除该收费单位？')){
			window.location = '${baseUrl }manager/deleteChargingUnit.jspx?unitId='+unitId;
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
	<table width="100%" border="0" align="" cellpadding="0" cellspacing="0">
		<tr><td>
			<div class="srhtab">
			    <table cellSpacing=0 cellPadding=2 border=0>
			      <tbody>
				      <tr>
				        <td>收费单位：</td>
				        <td><input class="textbox" id="" style="width: 120px" name="" /></td>
				        <td>状态：</td>
				        <td>
							<select>
								<option>正常</option>
								<option>已删除</option>
							</select>
						</td>
				      	<td><input class="button" id="" type="button" value="查询" name=""></td>
				      	<td><input class="button" id="addChargingUnit" type="button" value="新增" name=""></td>
				      	<td><input class="button" id="" type="button" value="启用" name=""></td>
				      	<td><input class="button" id="" type="button" value="删除" name=""></td>
				      </tr>
			      </tbody>
			    </table>	
			</div>
		</td></tr>
	</table>

    <table class="ymlistTable" width="100%" cellpadding="0" cellspacing="1" >
      <tr class="listTableHead">
        <td width=""><div align="center"><input type="checkbox" name="checkbox" id="selectAllBtn" /></div></td>
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
        <td><div><input type="checkbox" name="" id="" class="cb" /></div></td>
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
        	<c:if test="${chargingUni.status == -1 }">删除</c:if><div>
        </td>
        <td><div><a href="${baseUrl }manager/chargingUnitDetail.jspx?unitId=${chargingUni.unitId }">修改</a><c:if test="${chargingUni.status == 0 }"> | <a href="#" id="foreverDel-${chargingUni.unitId }">永久删除</a></c:if></div></td>
      </tr>
      </c:forEach>
	 	<tr class="listFooterTr">
		<td colSpan=10>
			<gdcct:pager id="pagerID" fontPageCSS="currentFont" pageStaticMax="0" pageIndex="${pageModel.pageIndex}" recordCount="${pageModel.recordCount }" pageFirstURL="${baseUrl }manager/chargingUnitList.jspx" pageDynamicURLFormat="${baseUrl }manager/chargingUnitList.jspx?pageIndex={0}" pageSize="${pageModel.pageSize}"></gdcct:pager>
		</td>
		</tr>      
    </table>
</body>
</html>