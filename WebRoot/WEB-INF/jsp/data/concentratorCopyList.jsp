<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="gdcct" uri="http://www.xiaocong.net/gdcct/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>集中器抄控列表</title>
<link href="${baseUrl }css/admin.css" type="text/css" rel="stylesheet" />
<script src="${baseUrl }js/jquery/jquery-1.7.2.min.js" type="text/javascript"></script>
<script src="${baseUrl }js/datePicker/WdatePicker.js" type="text/javascript"></script>
<script src="${baseUrl }js/jquery/plugins/asyncbox/asyncbox.v1.5.beta.min.js" type="text/javascript"></script>
<script>
$(function(){
	
	function newopen(){
		asyncbox.open({
			id : 'cccc',
			url : 'http://www.baidu.com',
			title : '内容页 1 里跳出来的窗口 - 有遮罩层',
			width   : 400,
			height  : 300,
			modal : true,
			tipsbar : {
				title : '哎哟，不错哦',
				content : '哎哟，就是没话讲的时候哎哟哎哟？'
			},
			btnsbar : asyncbox.btn.OKCANCEL}
		);
	}
	
	$('#setupClock').click(function(){
		newopen();
	});
	
	if('${param.message}' != ''){
		alert('${param.message}');
	}
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
	
	$('#readClock').click(function(){
		var dataId = $("#dataId").val();
		if(dataId == ''){
			alert("请选择一条数据！");
			return false;
		}
		$.ajax({
			url:'${baseUrl}data/readClockAjax.jspx?rand=' + Math.random(),
			type:'get',
			data:{concHardwareId:dataId},
			dataType:'json',
			success:function(response){
				if(!response.isFail){
					alert("集中器时钟："+response.date);
				}else{
					alert(response.errorMsg);
				}
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
	 			<td class="position">当前位置: 数据采集 -&gt;  集中器抄控</td>
	 		</tr>
	 	</tbody>
	</table>
	<form action="${baseUrl }data/concentratorList.jspx" method="get" id="searchForm">
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
				        <td>集中器编号：</td>
				        <td><input class="textbox" id="hardwareId" name="hardwareId" value="${hardwareId}"/></td>
				        <td>集中器名称：</td>
				        <td><input class=textbox id="name" name="name" value="${name}"></td>
				        <td>电话号码：</td>
				        <td><input class="textbox" id="tel" name="tel" value="${tel}"/></td>
				      </tr>
				      <tr>
				        <td>在线状态：</td>
				        <td>
							<select id="status" name="status">
								<option value="">--请选择--</option>
								<option value="1" <c:if test="${status == 1 }">selected="selected"</c:if>>在线</option>
								<option value="-1" <c:if test="${status == -1 }">selected="selected"</c:if>>离线</option>
							</select>
						</td>
				        <td>省：</td>
				        <td><input class=textbox id="province" name="province" value="${province}"></td>
				        <td>市：</td>
				        <td><input class=textbox id="city" name="city" value="${city}"></td>
				        <td>区：</td>
				        <td><input class=textbox id="district" name="district" value="${district}"></td>
				        <td>
				        	<input class="button" id="btnSubmit" type="button" value="查询">
				        	<input class="button" id="" type="button" value="导出" name="">
				        </td>
				      </tr>
			      </tbody>
			    </table>
			</div>
		</td></tr>
	</table>
	</form>
	<table width="100%" border="0" align="" cellpadding="0" cellspacing="0">
		<tr><td>
			<div class="srhtab">
			    <table cellSpacing="0" cellPadding="2" border="0">
			      <tbody>
				      <tr>
				      	<td><input class="button" id="readClock" type="button" value="读时钟"></td>
				      	<td><input class="button" id="" type="button" value="读水表参数" name=""></td>
				      	<td><input class="button" id="" type="button" value="抄日冻结" name=""></td>
				      	<td><input class="button" id="setupClock" type="button" value="校时钟" name=""></td>
				      	<td><input class="button" id="" type="button" value="加载水表参数" name=""></td>
				      	<td><input class="button" id="" type="button" value="集中器调试" name=""></td>
				      	<td><input class="button" id="" type="button" value="集中器复位" name=""></td>
				      	<td><input class="button" id="" type="button" value="删除历史数据" name=""></td>
				      	<td><input class="button" id="" type="button" value="删除配置信息" name=""></td>
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
        <td width=""><div><span>集中器编号</span></div></td>
        <td width=""><div><span>集中器名称</span></div></td>
        <td width=""><div><span>电话号码</span></div></td>
        <td width=""><div><span>在线状态</span></div></td>
        <td width=""><div><span>省</span></div></td>
        <td width=""><div><span>市</span></div></td>
        <td width=""><div><span>区县</span></div></td>
        <td width=""><div><span>街道</span></div></td>
        <td width=""><div><span>通讯地址</span></div></td>
        <td width=""><div><span>收费单位</span></div></td>
        <td width=""><div><span>安装地址</span></div></td>
        <td width=""><div><span>终端端口号</span></div></td>
      </tr>
      <c:if test="${not empty list}">
      <c:forEach var="item"  items="${list }" varStatus="vs">
      <tr class="listTableTr">
        <td><div><input type="checkbox" name="${item.logicCode}" class="cb" /></div></td>
        <td><div>${vs.index+1}</div></td>
        <td><div>${item.hardwareId}</div></td>
        <td><div>${item.name}</div></td>
        <td><div>${item.tel}</div></td>
        <td><div>
        	<c:if test="${item.status == 1}">在线</c:if>
        	<c:if test="${item.status == -1}">离线</c:if>
        </div></td>
        <td><div>${item.province}</div></td>
        <td><div>${item.city}</div></td>
        <td><div>${item.district}</div></td>
        <td><div>${item.street}</div></td>
        <td><div>${item.address}</div></td>
        <td><div>
        	<c:forEach items="${mapList }" var="map">
        		<c:if test="${map.chargingUnit.unitId == item.chargingUnitId }">${map.chargingUnit.name }</c:if>
        	</c:forEach>
        </div></td>
        <td><div>${item.collectionAddress}</div></td>
        <td><div>${item.terminalPost}</div></td>
      </tr>
      </c:forEach>
      </c:if>
      <tr class="listFooterTr">
	  	<td colSpan="14">
			<gdcct:pager id="pagerID" fontPageCSS="currentFont" pageStaticMax="0" pageIndex="${pageModel.pageIndex}" recordCount="${pageModel.recordCount }" pageFirstURL="${baseUrl }data/concentratorList.jspx" pageDynamicURLFormat="${baseUrl }data/concentratorList.jspx?pageIndex={0}" pageSize="${pageModel.pageSize}"></gdcct:pager>
		</td>
	  </tr>
    </table>
</body>
</html>