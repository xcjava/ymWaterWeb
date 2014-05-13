<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="gdcct" uri="http://www.xiaocong.net/gdcct/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>集中器列表</title>
<link href="${baseUrl }css/admin.css" type="text/css" rel="stylesheet" />
<script src="${baseUrl }js/jquery/jquery-1.7.2.min.js" type="text/javascript"></script>
<script src="${baseUrl }js/datePicker/WdatePicker.js" type="text/javascript"></script>
<script>
$(function(){
	//只能选中一个
    $("input[type='checkbox']").click(function() {
        if ($(this).attr("checked") == "checked") {
            $("input[type='checkbox']").attr("checked", false);
            $(this).attr("checked", "checked");
            $("#dataId").val($(this).attr("name"));
        }
    });
	$('#btnSubmit').click(function(){
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
	 			<td class="position">当前位置: 采集点管理 -&gt;  集中器列表</td>
	 		</tr>
	 	</tbody>
	</table>	
	<table width="100%" border="0" align="" cellpadding="0" cellspacing="0">
		<tr><td>
			<div class="srhtab">
			<form id="searchForm" action="${baseUrl }archives/concentratorList.jspx" method="post">
			    <table cellSpacing=0 cellPadding=2 border=0>
			      <tbody>
				      <tr>
				        <td>收费单位：</td>
				        <td>
				        	<select id="chargingUnitSel" name="chargingUnitId">
								<option></option>
							</select>
				        </td>
				        
				        <td>集中器ID：</td>
				        <td><input class="textbox" id="" style="width: 120px" name="hardwareId" value="${hardwareId}"/></td>
				        
				      </tr>
				      <tr>
				        <td>集中器名称</td>
				        <td><input class=textbox id=sStart2 style="WIDTH: 120px" name="name" value="${name}"></td>
				      	<td>起始日期</td>
				        <td>
				        	<input class="Wdate" type="text" onClick="WdatePicker()" name="startDate" id="startDate" value="${startDate}">&nbsp;至:
				        </td>
				        <td>
  							<input class="Wdate" type="text" onClick="WdatePicker()" name="endDate" id="endDate" value="${endDate}">
				        </td>
				      	<td><input class="button" id="" type="button" value="新增" name=""></td>
				      	<td><input class="button" id="" type="button" value="充值" name=""></td>
				      	<td><input class="button" id="" type="button" value="查询" name=""></td>
				      	<td><input class="button" id="" type="button" value="导出" name=""></td>
				      </tr>
				      <tr>
				      </tr>
			      </tbody>
			    </table>
			    </form>	
			</div>
		</td></tr>
	</table>

    <table class="ymlistTable" width="100%" cellpadding="0" cellspacing="1" >
      <tr class="listTableHead">
        <td width=""><div align="center"><input type="checkbox" name="checkbox" id="selectAllBtn" /></div></td>
        <td width=""><div><span>序号</span></div></td>
        <td width=""><div><span>集中器编号</span></div></td>
        <td width=""><div><span>电话号码</span></div></td>
        <td width=""><div><span>省</span></div></td>
        <td width=""><div><span>市</span></div></td>
        <td width=""><div><span>区县</span></div></td>
        <td width=""><div><span>街道</span></div></td>
        <td width=""><div><span>小区</span></div></td>
        <td width=""><div><span>收费单位</span></div></td>
        <td width=""><div><span>安装地址</span></div></td>
        <td width=""><div><span>端口号</span></div></td>
        <td width=""><div><span>操作</span></div></td>
      </tr>
      <c:if test="${not empty list}">
      <c:forEach var="item"  items="${list }" varStatus="vs">
      <tr class="listTableTr">
        <td><div><input type="checkbox" name="" id="" class="cb" /></div></td>
        <td><div><span class="STYLE19">${vs.count}</span></div></td>
        <td><div>${item.hardwareId}</div></td>
        <td><div>${item.tel}</div></td>
        <td><div>${item.province}</div></td>
        <td><div>${item.city}</div></td>
        <td><div>${item.district}</div></td>
        <td><div>${item.street}</div></td>
        <td><div>${item.address}</div></td>
        <td><div>${item.chargingUnitId}</div></td>
        <td><div>${item.collectionAddress}</div></td>
        <td><div>${item.terminalPost}</div></td>
        <td><div><a target="main" href="${baseUrl }archives/collectionTab.jspx?hardwareId=${item.hardwareId}">修改</a></div></td>
      </tr>
      </c:forEach>
      </c:if>
     
	 	<tr class="listFooterTr">
		<td colSpan=13>
			<gdcct:pager id="pagerID" fontPageCSS="currentFont" pageStaticMax="0" pageIndex="${pageModel.pageIndex}" recordCount="${pageModel.recordCount }" pageFirstURL="${baseUrl }archives/concentratorList.jspx" pageDynamicURLFormat="${baseUrl }archives/concentratorList.jspx?pageIndex={0}" pageSize="${pageModel.pageSize}"></gdcct:pager>
		</td>
		</tr>      
    </table>
</body>
</html>