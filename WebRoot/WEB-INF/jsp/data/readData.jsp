<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>读日冻结</title>
<link href="${baseUrl }css/admin.css" type="text/css" rel="stylesheet" />
<script src="${baseUrl }js/jquery/jquery-1.7.2.min.js" type="text/javascript"></script>
<script src="${baseUrl }js/datePicker/WdatePicker.js" type="text/javascript"></script>
<script src="${baseUrl }js/jquery/plugins/asyncbox/asyncbox.v1.5.beta.min.js" type="text/javascript"></script>
<script>
$(function(){
});
</script>
</head>

<body style="">
	<div id="main">
	<table class="editTable" border="0" cellspacing="1" cellpadding="10" width="100%" align="center" >
		<tbody>
		<tr class="editTr">
			<td class="editLeftTd">日期(dataStr)<span style="color: red;">*</span>：</td>
			<td class="editRightTd" width="250px">
				<input class="Wdate" type="text" onClick="WdatePicker()" id="setupDate" value="" />
			</td>
		</tr>
		<tr class="editTr">
			<td class="editLeftTd">连续数量(count)<span style="color: red;">*</span>：</td>
			<td class="editRightTd" width="250px">
				<input  type="text" id="count" value="" />
			</td>
		</tr>
		</tbody>
	</table>
</body>
</html>