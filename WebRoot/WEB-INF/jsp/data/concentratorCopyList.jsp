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
	/*读时钟*/
	$('#readClock').click(function(){
		var dataId = $("#dataId").val();
		if(dataId == ''){
			asyncbox.alert('请选择一条数据！','提示');
			return false;
		}
		asyncbox.open({
			id : 'readclock',
			title : '集中器',
			url : '${baseUrl}/jsp/data/readClockJsp.jspx',
			data : { concHardwareId : dataId},
			width   : 200,
			height  : 52,
			modal : true,
			btnsbar : asyncbox.btn.OKCANCEL
		});
	});
	/*校时钟*/
	$('#setupClock').click(function(){
		var dataId = $("#dataId").val();
		if(dataId == ''){
			asyncbox.alert('请选择一条数据！','提示');
			return false;
		}
		asyncbox.open({
			id : 'setupclock',
			title : '设置集中器时间',
		　　 url : '${baseUrl}/jsp/data/setupClockJsp.jspx',
		 	data : { concHardwareId : dataId},
		 	modal : true,
		 	reset : true,
		 	scroll : false,
		　　 width : 400,
		　　 height : 200,
		　　 buttons : asyncbox.btn.OKCANCEL,
		   	callback : function(buttonResult,contentWindow,returnValue){
		   			var t = this;
			   		if(buttonResult == 'ok'){
						var setupDate = contentWindow.$('#setupDate').val();
						var hour = contentWindow.$('#hour').val();
						var minute = contentWindow.$('#minute').val();
						var second = contentWindow.$('#second').val();
						if(setupDate == ''){
							asyncbox.alert('请选择日期！','提示');
							return false;
						}
						$.ajax({
							url:'${baseUrl}data/setupClockAjax.jspx?rand=' + Math.random(),
							type:'get',
							timeout : 5000, //超时时间设置，单位毫秒
							data:{concHardwareId:dataId,setupDate:setupDate,hour:hour,minute:minute,second:second},
							dataType:'json',
							success:function(response){
								if(!response.isFail){
									asyncbox.alert('设置成功！','提示');
									asyncbox.close(t.id); 
								}else{
									alert('设置失败，错误信息：'+response.errorMsg,'提示');
									asyncbox.close(t.id); 
								}
							},
						　　complete : function(XMLHttpRequest,status){ //请求完成后最终执行参数
						　　　　if(status=='timeout'){//超时,status还有success,error等值的情况
									alert('操作超时！');
									return false;
						　　　　}
						　　},
							error:function(response){
								alert('服务忙，请重试。');
								return false;
							}
						});
						return false;
					}
   			   }
		　});
	});
	/*删除集中器历史数据*/
	$('#deleteData').click(function(){
		var dataId = $("#dataId").val();
		if(dataId == ''){
			asyncbox.alert('请选择一条数据！','提示');
			return false;
		}
		$('#deleteData').attr('disabled',true);
		$.ajax({
			url:'${baseUrl}data/deleteDataAjax.jspx?rand=' + Math.random(),
			type:'get',
			timeout : 5000, //超时时间设置，单位毫秒
			data:{concHardwareId : dataId},
			dataType:'json',
			success:function(response){
				if(!response.isFail){
					asyncbox.alert('操作成功！','提示');
					$('#deleteData').attr('disabled',false);
				}else{
					asyncbox.alert('操作失败！','提示');
					$('#deleteData').attr('disabled',false);
				}
			},
			complete : function(XMLHttpRequest,status){ //请求完成后最终执行参数
		　　　　if(status=='timeout'){//超时,status还有success,error等值的情况
				   $('#result').text("超时，请重试。");
		　　　　}
		　　},
			error:function(response){
				asyncbox.alert('服务忙，请重试。','提示');
				$('#deleteData').attr('disabled',false);
			}
		});
	});
	
	/*删除集中器配置信息*/
	$('#deleteSettings').click(function(){
		var dataId = $("#dataId").val();
		if(dataId == ''){
			asyncbox.alert('请选择一条数据！','提示');
			return false;
		}
		$('#deleteSettings').attr('disabled',true);
		$.ajax({
			url:'${baseUrl}data/deleteSettingsAjax.jspx?rand=' + Math.random(),
			type:'get',
			timeout : 5000, //超时时间设置，单位毫秒
			data:{concHardwareId : dataId},
			dataType:'json',
			success:function(response){
				if(!response.isFail){
					asyncbox.alert('操作成功！','提示');
					$('#deleteSettings').attr('disabled',false);
				}else{
					asyncbox.alert('操作失败！','提示');
					$('#deleteSettings').attr('disabled',false);
				}
			},
			complete : function(XMLHttpRequest,status){ //请求完成后最终执行参数
		　　　　if(status=='timeout'){//超时,status还有success,error等值的情况
				   $('#result').text("超时，请重试。");
		　　　　}
		　　 },
			error:function(response){
				asyncbox.alert('服务忙，请重试。','提示');
				$('#deleteSettings').attr('disabled',false);
			}
		});
	});
	
	/*集中器复位*/
	$('#restoreSettings').click(function(){
		var dataId = $("#dataId").val();
		if(dataId == ''){
			asyncbox.alert('请选择一条数据！','提示');
			return false;
		}
		$('#restoreSettings').attr('disabled',true);
		$.ajax({
			url:'${baseUrl}data/restoreSettingsAjax.jspx?rand=' + Math.random(),
			type:'get',
			timeout : 5000, //超时时间设置，单位毫秒
			data:{concHardwareId : dataId},
			dataType:'json',
			success:function(response){
				if(!response.isFail){
					asyncbox.alert('操作成功！','提示');
					$('#restoreSettings').attr('disabled',false);
				}else{
					asyncbox.alert('操作失败！','提示');
					$('#restoreSettings').attr('disabled',false);
				}
			},
			complete : function(XMLHttpRequest,status){ //请求完成后最终执行参数
		　　　　if(status=='timeout'){//超时,status还有success,error等值的情况
				   $('#result').text("超时，请重试。");
		　　　　}
		　　 },
			error:function(response){
				asyncbox.alert('服务忙，请重试。','提示');
				$('#restoreSettings').attr('disabled',false);
			}
		});
	});
	
	/*加载集中器水表参数*/
	$('#loadWm').click(function(){
		var dataId = $("#dataId").val();
		if(dataId == ''){
			asyncbox.alert('请选择一条数据！','提示');
			return false;
		}
		$('#loadWm').attr('disabled',true);
		window.location = "${baseUrl}data/loadWm.jspx?concHardwareId="+dataId;
	});
	
	
	/*读水表参数*/
	$('#readWaterMeterSn').click(function(){
		var dataId = $("#dataId").val();
		if(dataId == ''){
			asyncbox.alert('请选择一条数据！','提示');
			return false;
		}
		asyncbox.open({
			id : 'readWaterMeter',
			title : '读取水表参数',
		　　 url : '${baseUrl}/jsp/data/readWaterMeterSnJsp.jspx',
		 	data : { concHardwareId : dataId},
		 	modal : true,
		 	scroll : false,
		　　 width : 400,
		　　 height : 200,
		　　 buttons : asyncbox.btn.OKCANCEL,
		   	callback : function(buttonResult,contentWindow,returnValue){
			   		if(buttonResult == 'ok'){
						var wmSn = contentWindow.$('#wmSn').val();
						var count = contentWindow.$('#count').val();
						if(wmSn == ''){
							asyncbox.alert('请输入开始水表编号！','提示');
							return false;
						}
						if(count == ''){
							asyncbox.alert('请输入连续数量！','提示');
							return false;
						}
						if(!isUnsignedInteger(wmSn) || !isUnsignedInteger(count)){
							return false;
						}
						window.location = "${baseUrl}data/readWaterMeter.jspx?concHardwareId="+dataId+"&wmSn="+wmSn+"&count="+count;
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
				      	<td><input class="button" id="setupClock" type="button" value="校时钟"></td>
				      	<td><input class="button" id="deleteData" type="button" value="删除历史数据"></td>
				      	<td><input class="button" id="deleteSettings" type="button" value="删除配置信息"></td>
				      	<td><input class="button" id="restoreSettings" type="button" value="集中器复位"></td>
				      	<td><input class="button" id="loadWm" type="button" value="加载水表参数"></td>
				      	<td><input class="button" id="readWaterMeterSn" type="button" value="读水表参数"></td>
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
        <td width=""><div><span>已加载表</span></div></td>
        <td width=""><div><span>安装地址</span></div></td>
        <td width=""><div><span>终端端口号</span></div></td>
      </tr>
      <c:if test="${not empty list}">
      <c:forEach var="item"  items="${list }" varStatus="vs">
      <tr class="listTableTr">
        <td><div><input <c:if test="${item.status == -1}">disabled="disabled"</c:if> type="checkbox" name="${item.hardwareId}" class="cb" /></div></td>
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
        		<c:if test="${map.hardwareId == item.hardwareId }">${map.chargingUnit }</c:if>
        	</c:forEach>
        </div></td>
        <td>
        <div>
        	<c:if test="${item.status == 1}">
        	<a target="main" href="${baseUrl }data/waterMeterList.jspx?concHardwareId=${item.hardwareId}">功能操作</a>
        	</c:if>
        	<c:if test="${item.status == -1}">
        		功能操作
        	</c:if>
        </div>
        </td>
        <td><div>${item.collectionAddress}</div></td>
        <td><div>${item.terminalPost}</div></td>
      </tr>
      </c:forEach>
      </c:if>
      <tr class="listFooterTr">
	  	<td colSpan="15">
			<gdcct:pager id="pagerID" fontPageCSS="currentFont" pageStaticMax="0" pageIndex="${pageModel.pageIndex}" recordCount="${pageModel.recordCount }" pageFirstURL="${baseUrl }data/concentratorList.jspx" pageDynamicURLFormat="${baseUrl }data/concentratorList.jspx?pageIndex={0}" pageSize="${pageModel.pageSize}"></gdcct:pager>
		</td>
	  </tr>
    </table>
</body>
</html>