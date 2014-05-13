<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="gdcct" uri="http://www.xiaocong.net/gdcct/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>审核数据修正</title>
<link href="${baseUrl }css/admin.css" type="text/css" rel="stylesheet" />
<style type="text/css">
.mytableTd {
TEXT-ALIGN: center;
BACKGROUND-COLOR: #fffdf0;
}
.mytableInput{


}
</style>
<script src="${baseUrl }js/jquery/jquery-1.7.2.min.js" type="text/javascript"></script>
<script>
$(function(){
	//全选
	if(''!='${message}'){
		alert('${message}');
		if('${flag}')
			location.href="${baseUrl }searchAnalysis/checkingFreezeDataList.jspx";
	}
	
	$.getJSON("${baseUrl }common/getChargingUnitListAjax.jspx", function(data){
		  	var options = $('#unitId')[0].options;
			options.length = 0;
			options.add(new Option("-请选择-",""));
			$.each(data,function(item,i){
				var itemOption = new Option(item.name,item.unitId);
				options.add(itemOption);
			});
			$('#unitId').value = '${unitId}';
	});
	$('#btnSubmit').click(function(){
		$('#searchForm').submit();
	});
});
</script>
</head>

<body style="min-width: 1100px;">
	<table class="position" border="0" cellSpacing="0" cellPadding="0" width="100%" align="center">
		<tbody>
			<tr class="position">
	 			<td class="position">当前位置: 数据查询 -&gt;  数据审核查询</td>
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
				        <td>
				        	<select id="unitId" name="unitId">
							</select>
						</td>
				        <td>集中器编号：</td>
				        <td>${cfdReturn.concHardwareId }</td>
				        <td>客户编号：</td>
				        <td>${cfdReturn.userId }</td>
				        <td>表号：</td>
				        <td>${cfdReturn.meterHardwareId }</td>
				        <td>冻结时间：</td>
				        <td>${cfdReturn.freezeYear }年${cfdReturn.freezeMonth }月</td>
				        <td><input class="button" id="btnSubmit" type="button" value="提交"></td>
				      </tr>
			      </tbody>
			    </table>	
			</div>
		</td></tr>
	</table>
	<form id="searchForm" action="${baseUrl }searchAnalysis/checkingFreezeDataModify.jspx" method="post">
    <table border="0" cellspacing="1" cellpadding="10" width="50%" align="left" bgcolor="#b1ceee">
      <tr>
        <td width="30" class="mytableTd">日期</td><td width="200" class="mytableTd">原始数据</td><td width="200" class="mytableTd">修正数据</td>
        <c:if test="${cfdReturn!=null}">
        <input type="hidden" name="modifyParam.id" value="${cfdReturn.id}"/>
        <c:forEach var="item" items="${intList }" varStatus="vs">
       	<tr>
        <td class="mytableTd"><span>${vs.count }</span></td><td class="mytableTd">${cfdReturn[item]}</td><td class="mytableTd"><input type="text" id="modifyParam.${item}" name="modifyParam.${item}" style="width:176px"/></td>
        </tr>
        </c:forEach>
        </c:if>
    </table>
    </form>
</body>
</html>