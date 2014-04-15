<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="gdcct" uri="http://www.xiaocong.net/gdcct/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>管理员列表</title>
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
	$('#addManager').click(function(){
		window.location = '${baseUrl }jsp/manager/managerDetailJsp.jspx';
	});
});
</script>
</head>

<body style="min-width: 1100px;">
	<table class="position" border="0" cellSpacing="0" cellPadding="0" width="100%" align="center">
		<tbody>
			<tr class="position">
	 			<td class="position">当前位置: 系统管理 -&gt;  管理员列表</td>
	 		</tr>
	 	</tbody>
	</table>
	<form action="${baseUrl }manager/managerList.jspx"  method="post" id="searchForm">
	<table width="100%" border="0" align="" cellpadding="0" cellspacing="0">
		<tr><td>
			<div class="srhtab">
			    <table cellSpacing=0 cellPadding=2 border=0>
			      <tbody>
				      <tr>
				        <td>收费单位：</td>
				        <td><input class="textbox" id="" style="width: 120px" name="" /></td>
				        <td>部门：</td>
				        <td><input class="textbox" id="" style="width: 120px" name="" /></td>
				        <td>账号：</td>
				        <td><input class="textbox" id="" style="width: 120px" name="" /></td>
				      	<td><input class="button" id="addManager" type="button" value="新增" name=""></td>
				      	<td><input class="button" id="" type="button" value="修改" name=""></td>
				      	<td><input class="button" id="" type="submit" value="查询" name=""></td>
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
        <td width=""><div><span>账号</span></div></td>
        <td width=""><div><span>真实姓名</span></div></td>
        <td width=""><div><span>收费单位</span></div></td>
        <td width=""><div><span>部门</span></div></td>
        <td width=""><div><span>启用状态</span></div></td>
        <td width=""><div><span>操作</span></div></td>
      </tr>
      <c:forEach var="item" items="${list }">
      <tr class="listTableTr">
        <td><div><input type="checkbox" name="" id="" class="cb" /></div></td>
        <td><div>${item.managerId }</div></td>
        <td><div>${item.managerId }</div></td>
        <td><div>${item.name }</div></td>
        <td><div>${item.chargingUnitId }</div></td>
        <td><div>${item.departmentId }</div></td>
        <td>
        	<c:if test="${item.status == -1 }">停用</c:if>
        	<c:if test="${item.status == 1 }">启用</c:if>
        	<c:if test="${item.status == 0 }">新建</c:if>
        </td>
        <td><div><a href="#">修改</a> | <a href="#">查看</a></div></td>
      </tr>
      </c:forEach>
	 	<tr class="listFooterTr">
		<td colSpan=8>
	      <gdcct:pager id="pagerID" fontPageCSS="currentFont" pageStaticMax="0" pageIndex="${pageModel.pageIndex}" recordCount="${pageModel.recordCount }" pageFirstURL="/admin/m/mkConsultList.jspx&reply=${reply}&productId=${productId}&beginDate=${beginDate}&endDate=${endDate}" pageDynamicURLFormat="/admin/m/mkConsultList.jspx?pageIndex={0}&reply=${reply}&productId=${productId}&beginDate=${beginDate}&endDate=${endDate}" pageSize="${pageModel.pageSize}"></gdcct:pager>
		</td>
		</tr>      
    </table>
</body>
</html>