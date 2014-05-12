<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="gdcct" uri="http://www.xiaocong.net/gdcct/tags"%>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>采集任务详细信息</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="${baseUrl }css/admin.css" type="text/css" rel="stylesheet" />
  </head>
<body style="min-width: 1100px;">
	<table class="position" border="0" cellSpacing="0" cellPadding="0" width="100%" align="center">
		<tbody>
			<tr class="position">
	 			<td class="position">当前位置: 数据采集 -&gt;  采集任务</td>
	 		</tr>
	 	</tbody>
	</table>
	<div id="main">
		<form class="registerform" method="post" action="" target="main">
			<input type="hidden" name="id" value="${id }" />
			<table class="editTable" border="0" cellspacing="1" cellpadding="10" width="100%" align="center">
				<tbody>
					<tr class="editTr">
						<td class="editLeftTd">任务类型：</td>
						<td class="editRightTd" width="250px">
							<select id="type" name="collectTask.type">
								<option value="定时任务">定时任务</option>
							</select>
						</td>
						<td class="editLeftTd">任务名称<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="name" name="collectTask.name" value="${collectTask.name }" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd">优先级<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<select id="priority" name="collectTask.priority" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！">
								<option value="1">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
								<option value="4">4</option>
								<option value="5">5</option>
								<option value="6">6</option>
								<option value="7">7</option>
								<option value="8">8</option>
								<option value="9">9</option>
							</select>
							<span class="Validform_checktip"></span>
						</td>
						<td class="editLeftTd">采集点类型<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<select id="collectType" name="collectTask.collectType" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！">
								<option value="负控用户">负控用户</option>
								<option value="关口">关口</option>
								<option value="集抄用户">集抄用户</option>
								<option value="公用配变">公用配变</option>
							</select>
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd">执行标志<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<select id="executeTag" name="collectTask.executeTag" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！">
								<option value="-1">暂停</option>
								<option value="1">执行</option>
							</select>
							<span class="Validform_checktip"></span>
						</td>
						<td class="editLeftTd"><span></span>补采次数<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="suppCount" name="collectTask.suppCount" value="${collectTask.suppCount }" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd">任务执行起始时间<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input class="Wdate" type="text" onClick="WdatePicker()" name="startDate" id="startDate" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！" value="<gdcct:fld pattren="yyyy-MM-dd" longTime="${collectTask.startTimestamp }"></gdcct:fld>">
							<span class="Validform_checktip"></span>
						</td>
						<td class="editLeftTd">任务执行结束时间<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input class="Wdate" type="text" onClick="WdatePicker()" name="endDate" id="endDate" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！" value="<gdcct:fld pattren="yyyy-MM-dd" longTime="${collectTask.endTimestamp }"></gdcct:fld>">
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>采集周期<span style="color: red;">*</span>：</td>
						<td class="editRightTd" colspan="3" >
							小时：
							<select id="startHour" name="collectTask.startHour" style="width: 50;float: none;">
								<option value="0">0</option>
								<option value="1">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
								<option value="4">4</option>
								<option value="5">5</option>
								<option value="6">6</option>
								<option value="7">7</option>
								<option value="8">8</option>
								<option value="9">9</option>
								<option value="10">10</option>
								<option value="11">11</option>
								<option value="12">12</option>
								<option value="13">13</option>
								<option value="14">14</option>
								<option value="15">15</option>
								<option value="16">16</option>
								<option value="17">17</option>
								<option value="18">18</option>
								<option value="19">19</option>
								<option value="20">20</option>
								<option value="21">21</option>
								<option value="22">22</option>
								<option value="23">23</option>
							</select>
							分钟：
							<select id="startMinute" name="collectTask.startMinute" style="width: 50;float: none;">
								<option value="1">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
								<option value="4">4</option>
								<option value="5">5</option>
								<option value="6">6</option>
								<option value="7">7</option>
								<option value="8">8</option>
								<option value="9">9</option>
								<option value="10">10</option>
								<option value="11">11</option>
								<option value="12">12</option>
								<option value="13">13</option>
								<option value="14">14</option>
								<option value="15">15</option>
								<option value="16">16</option>
								<option value="17">17</option>
								<option value="18">18</option>
								<option value="19">19</option>
								<option value="20">20</option>
								<option value="21">21</option>
								<option value="22">22</option>
								<option value="23">23</option>
								<option value="24">24</option>
								<option value="25">25</option>
								<option value="26">26</option>
								<option value="27">27</option>
								<option value="28">28</option>
								<option value="29">29</option>
								<option value="30">30</option>
								<option value="31">31</option>
								<option value="32">32</option>
								<option value="33">33</option>
								<option value="34">34</option>
								<option value="35">35</option>
								<option value="36">36</option>
								<option value="37">37</option>
								<option value="38">38</option>
								<option value="39">39</option>
								<option value="40">40</option>
								<option value="41">41</option>
								<option value="42">42</option>
								<option value="43">43</option>
								<option value="44">44</option>
								<option value="45">45</option>
								<option value="46">46</option>
								<option value="47">47</option>
								<option value="48">48</option>
								<option value="49">49</option>
								<option value="50">50</option>
								<option value="51">51</option>
								<option value="52">52</option>
								<option value="53">53</option>
								<option value="54">54</option>
								<option value="55">55</option>
								<option value="56">56</option>
								<option value="57">57</option>
								<option value="58">58</option>
								<option value="59">59</option>
								<option value="60">60</option>
							</select>&nbsp;&nbsp;&nbsp;至：&nbsp;&nbsp;&nbsp;
							小时：
							<select id="endHour" name="collectTask.endHour" style="width: 50;float: none;">
								<option value="0">0</option>
								<option value="1">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
								<option value="4">4</option>
								<option value="5">5</option>
								<option value="6">6</option>
								<option value="7">7</option>
								<option value="8">8</option>
								<option value="9">9</option>
								<option value="10">10</option>
								<option value="11">11</option>
								<option value="12">12</option>
								<option value="13">13</option>
								<option value="14">14</option>
								<option value="15">15</option>
								<option value="16">16</option>
								<option value="17">17</option>
								<option value="18">18</option>
								<option value="19">19</option>
								<option value="20">20</option>
								<option value="21">21</option>
								<option value="22">22</option>
								<option value="23">23</option>
							</select>
							分钟：
							<select id="endMinute" name="collectTask.endMinute" style="width: 50;float: none;">
								<option value="1">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
								<option value="4">4</option>
								<option value="5">5</option>
								<option value="6">6</option>
								<option value="7">7</option>
								<option value="8">8</option>
								<option value="9">9</option>
								<option value="10">10</option>
								<option value="11">11</option>
								<option value="12">12</option>
								<option value="13">13</option>
								<option value="14">14</option>
								<option value="15">15</option>
								<option value="16">16</option>
								<option value="17">17</option>
								<option value="18">18</option>
								<option value="19">19</option>
								<option value="20">20</option>
								<option value="21">21</option>
								<option value="22">22</option>
								<option value="23">23</option>
								<option value="24">24</option>
								<option value="25">25</option>
								<option value="26">26</option>
								<option value="27">27</option>
								<option value="28">28</option>
								<option value="29">29</option>
								<option value="30">30</option>
								<option value="31">31</option>
								<option value="32">32</option>
								<option value="33">33</option>
								<option value="34">34</option>
								<option value="35">35</option>
								<option value="36">36</option>
								<option value="37">37</option>
								<option value="38">38</option>
								<option value="39">39</option>
								<option value="40">40</option>
								<option value="41">41</option>
								<option value="42">42</option>
								<option value="43">43</option>
								<option value="44">44</option>
								<option value="45">45</option>
								<option value="46">46</option>
								<option value="47">47</option>
								<option value="48">48</option>
								<option value="49">49</option>
								<option value="50">50</option>
								<option value="51">51</option>
								<option value="52">52</option>
								<option value="53">53</option>
								<option value="54">54</option>
								<option value="55">55</option>
								<option value="56">56</option>
								<option value="57">57</option>
								<option value="58">58</option>
								<option value="59">59</option>
								<option value="60">60</option>
							</select>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd">任务来源：</td>
						<td class="editRightTd" colspan="3" >
							<textarea id="source" name="collectTask.source" style="float: left;" rows="3" cols="50" >${collectTask.source }</textarea>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd">收费单位<span style="color: red;">*</span>：</td>
						<td class="editRightTd" colspan="3" >
							<select id="chargingUnitSel" name="collectTask.chargingUnitId" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！">
								<option></option>
							</select>
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>集中器名称<span style="color: red;">*</span>：</td>
						<td class="editRightTd" colspan="3" >
							<input type="text" id="concHardwareIds" name="collectTask.concHardwareIds" value="${collectTask.concHardwareIds }" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<!-- <tr class="editTr">
						<td class="editLeftTd"><span></span>集中器名称<span style="color: red;">*</span>：</td>
						<td class="editRightTd" colspan="3" >
							<table class="editTable" style="width: 500;" border="0" cellspacing="1" cellpadding="1" align="left">
								<tbody>
									<tr class="listHeaderTr">
										<td><input style="width: 10;float:none;" type="radio" /></td>
										<td>序号</td>
										<td>集中器编号</td>
										<td>集中器名称</td>
										<td>操作</td>
									</tr>
									<tr class="listTr">
										<td><input style="width: 10;float:none;" type="radio" /></td>
										<td>1</td>
										<td></td>
										<td></td>
										<td>删除</td>
									</tr>
									<tr class="listTr">
										<td><input style="width: 10;float:none;" type="radio" /></td>
										<td>2</td>
										<td></td>
										<td></td>
										<td>删除</td>
									</tr>
									<tr class="listTr">
										<td><input style="width: 10;float:none;" type="radio" /></td>
										<td>3</td>
										<td></td>
										<td></td>
										<td>删除</td>
									</tr>
								</tbody>
							</table>
						</td>
					</tr> -->
				</tbody>
			</table>
			<div class="editBtn" style="margin-top: 20px;" align="center">
				<input type="submit" value="保 存" /> <input type="reset" value="重 置" /><input type="button" onclick="javascript:window.open('${baseUrl}data/collectTaskList.jspx','main');"value="返 回">
			</div>
		</form>
	</div>
	
<script src="${baseUrl }js/jquery/jquery-1.7.2.min.js" type="text/javascript"></script>
<script type="text/javascript" src="${baseUrl }js/Validform_v5.3.2_min.js"></script>
<script src="${baseUrl }js/datePicker/WdatePicker.js" type="text/javascript"></script>
<script type="text/javascript">
$(function(){
	//$(".registerform").Validform();  //就这一行代码！;
		
	$(".registerform").Validform({
		tiptype:function(msg,o,cssctl){
			//msg：提示信息;
			//o:{obj:*,type:*,curform:*}, obj指向的是当前验证的表单元素（或表单对象），type指示提示的状态，值为1、2、3、4， 1：正在检测/提交数据，2：通过验证，3：验证失败，4：提示ignore状态, curform为当前form对象;
			//cssctl:内置的提示信息样式控制函数，该函数需传入两个参数：显示提示信息的对象 和 当前提示的状态（既形参o中的type）;
			if(!o.obj.is("form")){//验证表单元素时o.obj为该表单元素，全部验证通过提交表单时o.obj为该表单对象;
				//var objtip=$(o.obj).parent().next().find(".Validform_checktip");
				var objtip=o.obj.siblings(".Validform_checktip");
				cssctl(objtip,o.type);
				objtip.text(msg);
			}
		},
		callback:function(form){
			if('${collectTask.id }' == ''){
				$(".registerform").attr('action','${baseUrl }data/saveCollectTask.jspx');
			}else{
				$(".registerform").attr('action','${baseUrl }data/updateCollectTask.jspx');
			}
			if(confirm("您确定要提交表单吗？")){
				return true;
			}
			return false;
		}
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
	loadChargingUnit('${collectTask.chargingUnitId }');
	
	$("#type").val('${collectTask.type}');
	$("#priority").val('${collectTask.priority}');
	$("#collectType").val('${collectTask.collectType}');
	$("#executeTag").val('${collectTask.executeTag}');
	$("#startHour").val('${collectTask.startHour}');
	$("#startMinute").val('${collectTask.startMinute}');
	$("#endHour").val('${collectTask.endHour}');
	$("#endMinute").val('${collectTask.endMinute}');
	
	if('${param.message}' != ''){
		alert('${param.message}');
	}
});
</script>
</body>
</html>