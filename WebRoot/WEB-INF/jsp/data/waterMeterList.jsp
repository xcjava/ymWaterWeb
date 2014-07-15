<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="gdcct" uri="http://www.xiaocong.net/gdcct/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无线智能水表页</title>
<link href="${baseUrl }css/admin.css" type="text/css" rel="stylesheet" />
<script src="${baseUrl }js/jquery/jquery-1.7.2.min.js" type="text/javascript"></script>
<script src="${baseUrl }js/datePicker/WdatePicker.js" type="text/javascript"></script>
<script src="${baseUrl }js/jquery/plugins/asyncbox/asyncbox.v1.5.beta.min.js" type="text/javascript"></script>
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
            $("#wmSn").val($(this).attr("title"));
        }else{
        	$("#dataId").val('');
        	$("#wmSn").val('');
        }
    });
	
    $('#addWaterMeter').click(function(){
		window.location = '${baseUrl }archives/waterMeterDetail.jspx?type=3';
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
	
	/*读日冻结*/
	$('#readDataByDate').click(function(){
		
		var dataId = $("#dataId").val();
		var wmSn = $("#wmSn").val();
		if(dataId == ''){
			asyncbox.alert('请选择一条数据！','提示');
			return false;
		}
		asyncbox.open({
			id : 'readDataByDateOpen',
			title : '读日冻结数据',
		　　 url : '${baseUrl}/jsp/data/readDataJsp.jspx',
		 	data : { concHardwareId : '${concentrator.hardwareId }'},
		 	modal : true,
		 	scroll : false,
		　　 width : 400,
		　　 height : 200,
		　　 buttons : asyncbox.btn.OKCANCEL,
		   	callback : function(buttonResult,contentWindow,returnValue){
			   		if(buttonResult == 'ok'){
						var count = contentWindow.$('#count').val();
						var setupDate = contentWindow.$('#setupDate').val();
						if(setupDate == ''){
							asyncbox.alert('请输入日期！','提示');
							return false;
						}
						if(count == ''){
							asyncbox.alert('请输入连续数量！','提示');
							return false;
						}
						if(!isUnsignedInteger(count)){
							return false;
						}
						window.location = "${baseUrl}data/readDataByDate.jspx?concHardwareId=${concentrator.hardwareId }&wmSn="+wmSn+"&count="+count+"&dataStr="+setupDate;
					}
   			   }
		　});
	});
	//检查是否为正整数
	function isUnsignedInteger(a){
		if(!(/^(\+|-)?\d+$/.test(a))){
		    asyncbox.alert('数量必须是正整数！','提示');
			return false;
		}else{
			return true;
		}
	}
	
	/*集中器调试*/
	$('#debug').click(function(){
		var wmSn = $("#wmSn").val();
		var concHardwareId = '${concentrator.hardwareId }';
		var hardwareId =  $("#dataId").val();
		if(hardwareId == ''){
			asyncbox.alert('请选择一条数据！','提示');
			return false;
		}
		if(wmSn == ''){
			asyncbox.alert('水表对应集中器序号为空！','提示');
			return false;
		}
		if(concHardwareId == ''){
			asyncbox.alert('集中器编号为空！','提示');
			return false;
		}
		window.location = "${baseUrl}data/debug.jspx?concHardwareId=${concentrator.hardwareId }&wmSn="+wmSn+"&hardwareId="+hardwareId;
	});
	
	/*集中器召测本机动态数据*/
	$('#testData').click(function(){
		var wmSn = $("#wmSn").val();
		var concHardwareId = '${concentrator.hardwareId }';
		var hardwareId =  $("#dataId").val();
		if(hardwareId == ''){
			asyncbox.alert('请选择一条数据！','提示');
			return false;
		}
		if(wmSn == ''){
			asyncbox.alert('水表对应集中器序号为空！','提示');
			return false;
		}
		if(concHardwareId == ''){
			asyncbox.alert('集中器编号为空！','提示');
			return false;
		}
		window.location = "${baseUrl}data/testData.jspx?concHardwareId=${concentrator.hardwareId }&wmSn="+wmSn+"&hardwareId="+hardwareId;
	});
	
	/*集中器调试*/
	$('#testMeterCode').click(function(){
		var wmSn = $("#wmSn").val();
		var concHardwareId = '${concentrator.hardwareId }';
		var hardwareId =  $("#dataId").val();
		if(hardwareId == ''){
			asyncbox.alert('请选择一条数据！','提示');
			return false;
		}
		if(wmSn == ''){
			asyncbox.alert('水表对应集中器序号为空！','提示');
			return false;
		}
		if(concHardwareId == ''){
			asyncbox.alert('集中器编号为空！','提示');
			return false;
		}
		window.location = "${baseUrl}data/testMeterCode.jspx?concHardwareId=${concentrator.hardwareId }&wmSn="+wmSn+"&hardwareId="+hardwareId;
	});
});
</script>
</head>

<body style="min-width: 1100px;">
	<table class="position" border="0" cellSpacing="0" cellPadding="0" width="100%" align="center">
		<tbody>
			<tr class="position">
	 			<td class="position">集中器编号: ${concentrator.hardwareId } &nbsp;&nbsp; 在线状态： <c:if test="${concentrator.status == '1' }">在线</c:if><c:if test="${concentrator.status == '-1' }">离线</c:if></td>
	 		</tr>
	 	</tbody>
	</table>	
	<form action="${baseUrl }data/waterMeterList.jspx" method="get" id="searchForm">
	<input type="hidden" id="dataId" value="" />
	<input type="hidden" id="wmSn" value="" />
	<input type="hidden" name="concHardwareId" value="${concentrator.hardwareId }" />
	<input type="hidden" id="type" value="${type }" />
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
				       	<td><input class="textbox" id="userName" style="width: 120px" name="userName" value="${userName }" /></td>
				      	<td>创建时间</td>
				        <td>
				        	<input class="Wdate" type="text" onClick="WdatePicker()" name="startDate" id="startDate" value="${startDate}">&nbsp;至:
				        </td>
				        <td>
  							<input class="Wdate" type="text" onClick="WdatePicker()" name="endDate" id="endDate" value="${endDate}">
				        </td>
				        <td>水表编号</td>
				        <td><input class="textbox" id="hardwareId" style="width: 120px" name="hardwareId" value="${hardwareId }" /></td>
				      	<td>
				      		<input class="button" id="searchBtn" type="button" value="查询" name="searchBtn">
				      	</td>
				      	<td>
				      		<input class="button" type="button" onclick="javascript:window.open('${baseUrl}data/concentratorList.jspx','main');"value="返回">
				      	</td>
				      </tr>
			      </tbody>
			    </table>
			</div>
		</td></tr>
	</table>
	<table width="100%" border="0" align="" cellpadding="0" cellspacing="0">
		<tr><td>
			<div class="srhtab">
			    <table cellSpacing="0" cellPadding="2" border="0">
			      <tbody>
				      <tr>
				      	<td><input class="button" id="readDataByDate" type="button" value="抄日冻结数据" name=""></td>
				      	<td><input class="button" id="debug" type="button" value="集中器调试"></td>
				      	<td><input class="button" id="testData" type="button" value="集中器召测本机动态数据"></td>
				      	<td><input class="button" id="testMeterCode" type="button" value="集中器实时召测表码"></td>
				      </tr>
			      </tbody>
			    </table>	
			</div>
		</td></tr>
	</table>
	</form>
    <table class="ymlistTable" width="100%" cellpadding="0" cellspacing="1" >
      <tr class="listTableHead">
        <td width=""><div align="center"></div></td>
        <td width=""><div><span>水表编号</span></div></td>
        <td width=""><div><span>用水性质</span></div></td>
        <td width=""><div><span>客户编号</span></div></td>
        <td width=""><div><span>客户姓名</span></div></td>
        <td width=""><div><span>加载序号</span></div></td>
        <td width=""><div><span>开始时间</span></div></td>
        <td width=""><div><span>收费单位</span></div></td>
        <td width=""><div><span>操作</span></div></td>
      </tr>
      <c:forEach var="waterMeter" items="${list }">
      <tr class="listTableTr">
        <td><div><input type="checkbox" <c:if test="${empty waterMeter.wmSn}">disabled="disabled"</c:if> name="${waterMeter.hardwareId }" title="${waterMeter.wmSn }" id="" class="cb" /></div></td>
        <td><div>${waterMeter.hardwareId }</div></td>
        <td><div>${waterMeter.nature }</div></td>
        <td><div>${waterMeter.userId }</div></td>
        <td><div>${waterMeter.userName }</div></td>
        <td><div>${waterMeter.wmSn }</div></td>
        <td><div><gdcct:fld pattren="yyyy-MM-dd HH:mm:ss" longTime="${waterMeter.createTimestamp }"></gdcct:fld></div></td>
        <td><div>${waterMeter.chargingUnitId }</div></td>
        <td><div><a target="main" href="${baseUrl }archives/waterMeterDetail.jspx?hardwareId=${waterMeter.hardwareId }&type=${type}">修改</a></div></td>
      </tr>
      </c:forEach>
      <tr class="listFooterTr">
	  	<td colSpan="9">
			<gdcct:pager id="pagerID" fontPageCSS="currentFont" pageStaticMax="0" pageIndex="${pageModel.pageIndex}" recordCount="${pageModel.recordCount }" pageFirstURL="${baseUrl }data/waterMeterList.jspx" pageDynamicURLFormat="${baseUrl }data/waterMeterList.jspx?pageIndex={0}" pageSize="${pageModel.pageSize}"></gdcct:pager>
		</td>
	  </tr>
    </table>
</body>
</html>