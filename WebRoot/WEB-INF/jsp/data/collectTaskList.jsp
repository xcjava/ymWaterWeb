<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="gdcct" uri="http://www.xiaocong.net/gdcct/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>采集任务列表</title>
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
	
    $('#addCollectTask').click(function(){
		window.location = '${baseUrl }data/collectTaskDetail.jspx';
	});
    
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
	 			<td class="position">当前位置: 数据采集 -&gt;  采集任务</td>
	 		</tr>
	 	</tbody>
	</table>
	<form action="${baseUrl }data/collectTaskList.jspx" method="get" id="searchForm">
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
				        <td>任务执行起始时间</td>
				        <td><input class="Wdate" type="text" onClick="WdatePicker()" name="startDate" id="startDate" value="${startDate}"></td>
				        <td>任务执行结束时间</td>
				        <td><input class="Wdate" type="text" onClick="WdatePicker()" name="endDate" id="endDate" value="${endDate}"></td>
				      </tr>
				      <tr>
				        <td>任务类型</td>
				        <td><input class="textbox" id="type" value="${type }" name="type" /></td>
				        <td>任务名称</td>
				        <td><input class="textbox" id="name" value="${name }" name="name" /></td>
				      	<td>
				      		<input class="button" id="searchBtn" type="button" value="查询" name="searchBtn">
				      		<input class="button" id="" type="button" value="导出" name="">
				      		<input class="button" id="addCollectTask" type="button" value="新增" name="">
				      	</td>
				      </tr>
				      <tr>
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
        <td width=""><div><span>任务名称</span></div></td>
        <td width=""><div><span>任务类型</span></div></td>
        <td width=""><div><span>优先级</span></div></td>
        <td width=""><div><span>采集点类型</span></div></td>
        <td width=""><div><span>执行标志</span></div></td>
        <td width=""><div><span>补采次数</span></div></td>
        <td width=""><div><span>当前状态</span></div></td>
        <td width=""><div><span>任务执行起始时间</span></div></td>
        <td width=""><div><span>任务执行结束时间</span></div></td>
        <td width=""><div><span>收费单位</span></div></td>
        <td width=""><div><span>操作</span></div></td>
      </tr>
      <c:forEach var="collectTask" items="${list }">
      <tr class="listTableTr">
        <td><div><input type="checkbox" name="" id="" class="cb" /></div></td>
        <td><div>${collectTask.id }</div></td>
        <td><div>${collectTask.name }</div></td>
        <td><div>${collectTask.type }</div></td>
        <td><div>${collectTask.priority }</div></td>
        <td><div>${collectTask.collectType }</div></td>
        <td><div>
        	<c:if test="${collectTask.executeTag == 1}">执行</c:if>
        	<c:if test="${collectTask.executeTag == -1}">暂停</c:if>
        </div></td>
        <td><div>${collectTask.suppCount }</div></td>
        <td><div>
        	<c:if test="${collectTask.status == 1}">忙</c:if>
        	<c:if test="${collectTask.status == -1}">空闲</c:if>
        </div></td>
        <td><div><gdcct:fld pattren="yyyy-MM-dd" longTime="${collectTask.startTimestamp }"></gdcct:fld></div></td>
        <td><div><gdcct:fld pattren="yyyy-MM-dd" longTime="${collectTask.endTimestamp }"></gdcct:fld></div></td>
        <td><div>${collectTask.chargingUnitId }</div></td>
        <td><div><a target="main" href="${baseUrl }data/collectTaskDetail.jspx?id=${collectTask.id }">修改</a></div></td>
      </tr>
      </c:forEach>
      <tr class="listFooterTr">
	  	<td colSpan="14">
			<gdcct:pager id="pagerID" fontPageCSS="currentFont" pageStaticMax="0" pageIndex="${pageModel.pageIndex}" recordCount="${pageModel.recordCount }" pageFirstURL="${baseUrl }data/coolectTaskList.jspx" pageDynamicURLFormat="${baseUrl }data/coolectTaskList.jspx?pageIndex={0}" pageSize="${pageModel.pageSize}"></gdcct:pager>
		</td>
	  </tr>
    </table>
</body>
</html>