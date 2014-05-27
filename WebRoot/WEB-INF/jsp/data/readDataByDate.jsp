<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>水表参数列表</title>
<link href="${baseUrl }css/admin.css" type="text/css" rel="stylesheet" />
<script src="${baseUrl }js/jquery/jquery-1.7.2.min.js" type="text/javascript"></script>
<script>
$(function(){

	if('${param.message}' != ''){
		alert('${param.message}');
	}
});
</script>
</head>

<body style="min-width: 1100px;">
	<table class="position" border="0" cellSpacing="0" cellPadding="0" width="100%" align="center">
		<tbody>
			<tr class="position">
	 			<td class="position">当前位置: 数据采集 -&gt;  读日冻结数据</td>
	 		</tr>
	 	</tbody>
	</table>
	<table width="100%" border="0" align="" cellpadding="0" cellspacing="0">
		<tr><td>
			<div class="srhtab">
			    <table cellSpacing="0" cellPadding="2" border="0">
			      <tbody>
				      <tr>
				      	<td>
				      		<input class="button" type="button" onclick="javascript:window.open('${baseUrl}data/waterMeterList.jspx?concHardwareId=${concHardwareId }','main');"value="返回">
				      	</td>
				      </tr>
			      </tbody>
			    </table>	
			</div>
		</td></tr>
	</table>	
	<input type="hidden" id="dataId" value="" />
    <table class="ymlistTable" width="100%" cellpadding="0" cellspacing="1" >
      <tr class="listTableHead">
        <td width=""><div><span>智能水表编号</span></div></td>
        <td width=""><div><span>冻结日期</span></div></td>
        <td width=""><div><span>读数</span></div></td>
        <td width=""><div><span>电池电压</span></div></td>
        <td width=""><div><span>阀门状态</span></div></td>
        <td width=""><div><span>数据类型</span></div></td>
        <td width=""><div><span>磁攻击</span></div></td>
        <td width=""><div><span>错误状态</span></div></td>
        <td width=""><div><span>应答状态</span></div></td>
      </tr>
      <c:if test="${not empty list}">
      <c:forEach var="item"  items="${list }" varStatus="vs">
      <tr class="listTableTr">
        <td><div>${item.meterId}</div></td>
        <td><div>${item.readDateStr}</div></td>
        <td><div>${item.measure}</div></td>
        <td><div>${item.batteryVoltage}</div></td>
        <td><div>
        	<c:if test="${item.valveStatus == '01'}">半阀</c:if>
        	<c:if test="${item.valveStatus == '10'}">开阀</c:if>
        	<c:if test="${item.valveStatus == '11'}">关阀</c:if>
        	<c:if test="${item.valveStatus == '00'}">未知</c:if>
        </div></td>
        <td><div>
        	<c:if test="${item.dataType == '0'}">光电</c:if>
        	<c:if test="${item.dataType == '1'}">脉冲</c:if>
        </div></td>
        <td><div>
        	<c:if test="${item.magneticAttack == '0'}">无磁攻击</c:if>
        	<c:if test="${item.magneticAttack == '1'}">有磁攻击</c:if>
        </div></td>
        <td><div>
        	<c:if test="${item.errorStatus == '0'}">正确</c:if>
        	<c:if test="${item.errorStatus == '1'}">错误</c:if>
        </div></td>
        <td><div>
        	<c:if test="${item.replyStatus == '0'}">有应答</c:if>
        	<c:if test="${item.replyStatus == '1'}">无应答</c:if>
        </div></td>
      </tr>
      </c:forEach>
      </c:if>
    </table>
</body>
</html>