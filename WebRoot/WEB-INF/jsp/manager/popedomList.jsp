<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>  
    <title>权限</title>
	<link href="${baseUrl }css/admin.css" type="text/css" rel="stylesheet" />
	<!-- <link href="http://res.gdcct.com/css/admin/admin.css" type="text/css" rel="stylesheet" /> -->
	<style type="text/css">
	td.editRightTd input{border: ;padding: 0;width: 10px;float: none;}
	</style>
	<script src="${baseUrl }js/jquery/jquery-1.7.2.min.js" type="text/javascript"></script>
	<script type="text/javascript">
		$(function(){
			$("input[type='checkbox']").each(function(i,item){
				<c:if test="${not empty popedoms}">
				var editReArr = new Array();
				<c:forEach items="${popedoms}" var="popedom">
				var povalue = '${popedom.value}';
				var pokey = '${popedom.key}-';
				editReArr = povalue.split(",");
				for(var i=0;i<=editReArr.length-1;i++){
					if(item.value == pokey+editReArr[i])
					item.checked = true;
				}
				</c:forEach>
				</c:if>					
			});
			$("input[name='allchange']").click(function(){
				var clickitem = this;
				$("input[type='checkbox']").each(function(i,item){
					if(clickitem.value == item.value.substring(0,4)){
						if(!clickitem.checked){
							item.checked = false;
							clickitem.checked = false;
						}else{
							clickitem.checked = true;
							item.checked = true;
						}
					}
				});	
			});
			if('${message}' != ''){
				alert('${message}');
			}
		});
	</script>

  </head>
  
  <body style="padding: 3px; min-width: 1100px;">
    <form action="${baseUrl }manage/updatePopedom.jspx?deptId=${deptId }" method="post" id="">
    	<table class="editTable" border="0" cellspacing="1" cellpadding="0" width="100%" align="center">
    		<tbody>
    			<tr class="listHeaderTr">
    				<td>板块名称</td>
    				<td>栏目</td>
    				<td>管理权限</td>
    			</tr>
    			<c:forEach items="${popedom_data}" var="popedom_datas">
    				<tr class="editTr">
    					<td class="editLeftTd" rowspan="${fn:length(popedom_datas.columns)}">${popedom_datas.name}</td>
    					<td class="editRightTd">
    						${popedom_datas.columns[0].columnName}
    						<div style="float: right"><font style="font-weight: bold">全选</font>	<input type="checkbox" value="${popedom_datas.columns[0].columnCode}" name="allchange" />&nbsp;&nbsp;</div>
    					</td>
    					<td class="editRightTd">
    						<c:forEach items="${popedom_datas.columns[0].popedoms}" var="popedom">
    						${popedom.instruction}	<input type="checkbox" value="${popedom_datas.columns[0].columnCode}-${popedom.operaCode}" name="selectedOpers"/>&nbsp;|&nbsp;
    						
    						</c:forEach>
    					</td>
    				</tr>
    				<c:forEach items="${popedom_datas.columns}" var="columns" varStatus="vs">
    					<c:if test="${vs.index != '0'}">
    						<tr class="editTr">
		    					
		    					<td class="editRightTd" width="20%">
		    						${columns.columnName}
		    						<div style="float: right"><font style="font-weight: bold">全选</font>	<input type="checkbox" value="${columns.columnCode}" name="allchange"/>&nbsp;&nbsp;</div>
		    					</td>
		    					<td class="editRightTd">
		    						
		    						<c:forEach items="${columns.popedoms}" var="item">
		    						${item.instruction}	<input type="checkbox" value="${columns.columnCode}-${item.operaCode}" name="selectedOpers"/>&nbsp;|&nbsp;
		    						
		    						</c:forEach>
		    					</td>
		    				</tr>
    					</c:if>
    				</c:forEach>
    			</c:forEach>
    			
    			<tr class="editFooterTr">
    				<td colspan="3" class="editFooterTd">
    					<input type="submit" value=" 确定 "/>
    					<input type="button" onclick="javascript:window.location='${baseUrl}manage/departmentList.jspx';"value=" 返回">
    				</td>
    			</tr>
    		</tbody>
    	</table>
    </form>
  </body>
</html>
