<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="gdcct" uri="http://www.xiaocong.net/gdcct/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>费用缴纳列表</title>
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
	
    $('#searchBtn').click(function(){
		$('#searchForm').submit();
	});
    
	$('#recharge').click(function(){
		var uid = $("#dataId").val();
		if(uid == ''){
			alert("请选择一条数据！");
			return false;
		}
		window.location = '${baseUrl }freesettle/costPayDetail.jspx?id='+uid+'&type=recharge';
	});
	$('#deduction').click(function(){
		var uid = $("#dataId").val();
		if(uid == ''){
			alert("请选择一条数据！");
			return false;
		}
		window.location = '${baseUrl }freesettle/costPayDetail.jspx?id='+uid+'&type=reduction';
	});
	//查询余额
	$('a[id^="searchBlance"]').click(function(){
		var uid = this.id.substring('12',this.id.length);
		$.ajax({
			url:'${baseUrl}freesettle/getUserBlanceAjax.jspx?rand=' + Math.random(),
			type:'get',
			data:{uid:uid},
			dataType:'json',
			success:function(response){
				alert('用户id'+uid+'余额：' + response.blance);
			},
			error:function(response){
				alert("服务忙，请重试。");
			}
		});
	});
	
});
</script>
</head>

<body style="min-width: 1100px;">
	<table class="position" border="0" cellSpacing="0" cellPadding="0" width="100%" align="center">
		<tbody>
			<tr class="position">
	 			<td class="position">当前位置: 费用结算 -&gt;  费用缴纳</td>
	 		</tr>
	 	</tbody>
	</table>
	<form action="${baseUrl }freesettle/costPayList.jspx"  method="get" id="searchForm">
	<input type="hidden" id="dataId" value="" />
	<table width="100%" border="0" align="" cellpadding="0" cellspacing="0">
		<tr><td>
			<div class="srhtab">
			    <table cellSpacing=0 cellPadding=2 border=0>
			      <tbody>
				      <tr>
				        <td>客户编号：</td>
				        <td>
				        	<input class="textbox" id="userId" style="width: 120px" name="userId" value="${userId }" />
				      		<input class="button" id="searchBtn" type="button" value="查询" name="searchBtn">
				      		<input class="button" id="recharge" type="button" value="充值" >
				      		<input class="button" id="deduction" type="button" value="减费" >
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
        <td width=""><div><span>客户ID</span></div></td>
        <td width=""><div><span>客户编号</span></div></td>
        <td width=""><div><span>客户姓名</span></div></td>
        <td width=""><div><span>产业分类</span></div></td>
        <td width=""><div><span>经济类型</span></div></td>
        <td width=""><div><span>余额(分)</span></div></td>
        <td width=""><div><span>收费单位</span></div></td>
      </tr>
      <c:forEach var="user" items="${list }">
      <tr class="listTableTr">
      	<td><div><input type="checkbox" name="${user.id }" class="cb" /></div></td>
        <td><div>${user.id }</div></td>
        <td><div>${user.userId }</div></td>
        <td><div>${user.name }</div></td>
        <td><div>${user.industrial }</div></td>
        <td><div>${user.economicType }</div></td>
        <td><div>
        	<c:forEach items="${mapList }" var="map">
        		<c:if test="${map.userId == user.id }">${map.userWallet }</c:if>
        	</c:forEach>
        </div></td>
        <td><div>
        	<c:forEach items="${mapList }" var="map">
        		<c:if test="${map.userId == user.id }">${map.chargingUnit }</c:if>
        	</c:forEach>
        </div></td>
      </tr>
      </c:forEach>
	  <tr class="listFooterTr">
	  	<td colSpan="9">
			<gdcct:pager id="pagerID" fontPageCSS="currentFont" pageStaticMax="0" pageIndex="${pageModel.pageIndex}" recordCount="${pageModel.recordCount }" pageFirstURL="${baseUrl }freesettle/costPayList.jspx" pageDynamicURLFormat="${baseUrl }freesettle/costPayList.jspx?pageIndex={0}" pageSize="${pageModel.pageSize}"></gdcct:pager>
		</td>
	  </tr>
    </table>
</body>
</html>