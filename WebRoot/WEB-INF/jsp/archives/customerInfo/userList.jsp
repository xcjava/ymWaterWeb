<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="gdcct" uri="http://www.xiaocong.net/gdcct/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>客户档案信息列表页</title>
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
	
    $('#addUser').click(function(){
		window.location = '${baseUrl }archives/userInfoTab.jspx';
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
	 			<td class="position">当前位置: 客户档案 -&gt; 客户档案信息</td>
	 		</tr>
	 	</tbody>
	</table>	
	<form action="${baseUrl }archives/userList.jspx" method="get" id="searchForm">
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
				        <td>客户编号：</td>
				        <td><input class="textbox" id="userId" style="width: 120px" name="userId" value="${userId }" /></td>
				        <td>客户姓名：</td>
				        <td><input class="textbox" id="name" style="width: 120px" name="name" value="${name }" /></td>
				      </tr>
				      <tr>
				        <td>经济类型</td>
				        <td>
					        <select id="economicType" name="economicType">
						        <option value="" selected>--全部--</option>
						        <option value="全民所有制经济">全民所有制经济</option>
						        <option value="集体所有制经济">集体所有制经济</option>
						        <option value="私人所有制经济">私人所有制经济</option>
						        <option value="混合所有制经济">混合所有制经济</option>
						        <option value="其他所有制经济">其他所有制经济</option>
					        </select>
				        </td>
				        <td>产业分类</td>
				        <td>
					        <select id="industrial" name="industrial">
						        <option value="" selected>--全部--</option>
						        <option value="第一产业">第一产业</option>
						        <option value="第二产业">第二产业</option>
						        <option value="第三产业">第三产业</option>
					        </select>
				        </td>
				        <td>起始日期</td>
				        <td>
				        	<input class="Wdate" type="text" onClick="WdatePicker()" name="startDate" id="startDate" value="${startDate}">&nbsp;至:
				        </td>
				        <td>
  							<input class="Wdate" type="text" onClick="WdatePicker()" name="endDate" id="endDate" value="${endDate}">
				        </td>
				      	<td><input class="button" id="searchBtn" type="button" value="查询" name="searchBtn"></td>
				      	<td><input class="button" id="" type="button" value="导出" name=""></td>
				      	<td><input class="button" id="addUser" type="button" value="新增" name=""></td>
				      	<td><input class="button" id="" type="button" value="充值" name=""></td>
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
        <td width=""><div><span>余额</span></div></td>
        <td width=""><div><span>产业分类</span></div></td>
        <td width=""><div><span>经济类型</span></div></td>
        <td width=""><div><span>收费单位</span></div></td>
        <td width=""><div><span>操作</span></div></td>
      </tr>
      <c:forEach var="user" items="${list }">
      <tr class="listTableTr">
        <td><div><input type="checkbox" name="" id="" class="cb" /></div></td>
        <td><div>${user.id }</div></td>
        <td><div>${user.userId }</div></td>
        <td><div>${user.name }</div></td>
        <td><div>
        	<c:forEach items="${mapList }" var="map">
        		<c:if test="${map.userId == user.id }">${map.userWallet }</c:if>
        	</c:forEach>
        </div></td>
        <td><div>${user.industrial }</div></td>
        <td><div>${user.economicType }</div></td>
        <td><div>
        	<c:forEach items="${mapList }" var="map">
        		<c:if test="${map.userId == user.id }">${map.chargingUnit }</c:if>
        	</c:forEach>
        </div></td>
        <td><div><a target="main" href="${baseUrl }archives/userInfoTab.jspx?id=${user.id }">修改</a></div></td>
      </tr>
      </c:forEach>
	  <tr class="listFooterTr">
	  	<td colSpan="10">
			<gdcct:pager id="pagerID" fontPageCSS="currentFont" pageStaticMax="0" pageIndex="${pageModel.pageIndex}" recordCount="${pageModel.recordCount }" pageFirstURL="${baseUrl }archives/userList.jspx" pageDynamicURLFormat="${baseUrl }archives/userList.jspx?pageIndex={0}" pageSize="${pageModel.pageSize}"></gdcct:pager>
		</td>
	  </tr>      
    </table>
</body>
</html>