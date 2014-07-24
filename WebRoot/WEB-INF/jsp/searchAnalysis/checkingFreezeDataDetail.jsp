<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="gdcct" uri="http://www.xiaocong.net/gdcct/tags"%>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <title>审核数据修正</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="${baseUrl }css/admin.css" type="text/css" rel="stylesheet" />
	<script src="${baseUrl }js/jquery/jquery-1.7.2.min.js" type="text/javascript"></script>
  </head>
<body style="min-width: 1100px;">
	<table class="position" border="0" cellSpacing="0" cellPadding="0" width="100%" align="center">
		<tbody>
			<tr class="position">
	 			<td class="position">当前位置: 数据查询 -&gt; 审核数据修正</td>
	 		</tr>
	 	</tbody>
	</table>
	<div id="main">
		<form class="registerform" method="post" action="" target="main">
			<input type="hidden" name="id" value="${id }" />
			<table class="editTable" border="0" cellspacing="1" cellpadding="5" width="100%" align="center">
				<tbody>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>冻结日期：</td>
						<td class="editRightTd" width="250px">
							${checkingFreezeData.freezeYear }年${checkingFreezeData.freezeMonth }月
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>1日表计读数<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="meterReading1" name="checkingFreezeData.meterReading1" value="${checkingFreezeData.meterReading1 }" datatype="/^\d{0,8}\.{0,1}(\d*)?$/" nullmsg="请输入信息！" errormsg="请输入正数字！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>2日表计读数<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="meterReading2" name="checkingFreezeData.meterReading2" value="${checkingFreezeData.meterReading2 }" datatype="/^\d{0,8}\.{0,1}(\d*)?$/" nullmsg="请输入信息！" errormsg="请输入正数字！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>3日表计读数<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="meterReading3" name="checkingFreezeData.meterReading3" value="${checkingFreezeData.meterReading3 }" datatype="/^\d{0,8}\.{0,1}(\d*)?$/" nullmsg="请输入信息！" errormsg="请输入正数字！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>4日表计读数<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="meterReading4" name="checkingFreezeData.meterReading4" value="${checkingFreezeData.meterReading4 }" datatype="/^\d{0,8}\.{0,1}(\d*)?$/" nullmsg="请输入信息！" errormsg="请输入正数字！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>5日表计读数<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="meterReading5" name="checkingFreezeData.meterReading5" value="${checkingFreezeData.meterReading5 }" datatype="/^\d{0,8}\.{0,1}(\d*)?$/" nullmsg="请输入信息！" errormsg="请输入正数字！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>6日表计读数<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="meterReading6" name="checkingFreezeData.meterReading6" value="${checkingFreezeData.meterReading6 }" datatype="/^\d{0,8}\.{0,1}(\d*)?$/" nullmsg="请输入信息！" errormsg="请输入正数字！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>7日表计读数<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="meterReading7" name="checkingFreezeData.meterReading7" value="${checkingFreezeData.meterReading7 }" datatype="/^\d{0,8}\.{0,1}(\d*)?$/" nullmsg="请输入信息！" errormsg="请输入正数字！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>8日表计读数<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="meterReading8" name="checkingFreezeData.meterReading8" value="${checkingFreezeData.meterReading8 }" datatype="/^\d{0,8}\.{0,1}(\d*)?$/" nullmsg="请输入信息！" errormsg="请输入正数字！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>9日表计读数<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="meterReading9" name="checkingFreezeData.meterReading9" value="${checkingFreezeData.meterReading9 }" datatype="/^\d{0,8}\.{0,1}(\d*)?$/" nullmsg="请输入信息！" errormsg="请输入正数字！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>10日表计读数<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="meterReading10" name="checkingFreezeData.meterReading10" value="${checkingFreezeData.meterReading10 }" datatype="/^\d{0,8}\.{0,1}(\d*)?$/" nullmsg="请输入信息！" errormsg="请输入正数字！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>11日表计读数<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="meterReading11" name="checkingFreezeData.meterReading11" value="${checkingFreezeData.meterReading11 }" datatype="/^\d{0,8}\.{0,1}(\d*)?$/" nullmsg="请输入信息！" errormsg="请输入正数字！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>12日表计读数<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="meterReading12" name="checkingFreezeData.meterReading12" value="${checkingFreezeData.meterReading12 }" datatype="/^\d{0,8}\.{0,1}(\d*)?$/" nullmsg="请输入信息！" errormsg="请输入正数字！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>13日表计读数<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="meterReading13" name="checkingFreezeData.meterReading13" value="${checkingFreezeData.meterReading13 }" datatype="/^\d{0,8}\.{0,1}(\d*)?$/" nullmsg="请输入信息！" errormsg="请输入正数字！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>14日表计读数<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="meterReading14" name="checkingFreezeData.meterReading14" value="${checkingFreezeData.meterReading14 }" datatype="/^\d{0,8}\.{0,1}(\d*)?$/" nullmsg="请输入信息！" errormsg="请输入正数字！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>15日表计读数<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="meterReading15" name="checkingFreezeData.meterReading15" value="${checkingFreezeData.meterReading15 }" datatype="/^\d{0,8}\.{0,1}(\d*)?$/" nullmsg="请输入信息！" errormsg="请输入正数字！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>16日表计读数<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="meterReading16" name="checkingFreezeData.meterReading16" value="${checkingFreezeData.meterReading16 }" datatype="/^\d{0,8}\.{0,1}(\d*)?$/" nullmsg="请输入信息！" errormsg="请输入正数字！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>17日表计读数<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="meterReading17" name="checkingFreezeData.meterReading17" value="${checkingFreezeData.meterReading17 }" datatype="/^\d{0,8}\.{0,1}(\d*)?$/" nullmsg="请输入信息！" errormsg="请输入正数字！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>18日表计读数<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="meterReading18" name="checkingFreezeData.meterReading18" value="${checkingFreezeData.meterReading18 }" datatype="/^\d{0,8}\.{0,1}(\d*)?$/" nullmsg="请输入信息！" errormsg="请输入正数字！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>19日表计读数<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="meterReading19" name="checkingFreezeData.meterReading19" value="${checkingFreezeData.meterReading19 }" datatype="/^\d{0,8}\.{0,1}(\d*)?$/" nullmsg="请输入信息！" errormsg="请输入正数字！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>20日表计读数<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="meterReading20" name="checkingFreezeData.meterReading20" value="${checkingFreezeData.meterReading20 }" datatype="/^\d{0,8}\.{0,1}(\d*)?$/" nullmsg="请输入信息！" errormsg="请输入正数字！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>21日表计读数<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="meterReading21" name="checkingFreezeData.meterReading21" value="${checkingFreezeData.meterReading21 }" datatype="/^\d{0,8}\.{0,1}(\d*)?$/" nullmsg="请输入信息！" errormsg="请输入正数字！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>22日表计读数<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="meterReading22" name="checkingFreezeData.meterReading22" value="${checkingFreezeData.meterReading22 }" datatype="/^\d{0,8}\.{0,1}(\d*)?$/" nullmsg="请输入信息！" errormsg="请输入正数字！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>23日表计读数<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="meterReading23" name="checkingFreezeData.meterReading23" value="${checkingFreezeData.meterReading23 }" datatype="/^\d{0,8}\.{0,1}(\d*)?$/" nullmsg="请输入信息！" errormsg="请输入正数字！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>24日表计读数<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="meterReading24" name="checkingFreezeData.meterReading24" value="${checkingFreezeData.meterReading24 }" datatype="/^\d{0,8}\.{0,1}(\d*)?$/" nullmsg="请输入信息！" errormsg="请输入正数字！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>25日表计读数<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="meterReading25" name="checkingFreezeData.meterReading25" value="${checkingFreezeData.meterReading25 }" datatype="/^\d{0,8}\.{0,1}(\d*)?$/" nullmsg="请输入信息！" errormsg="请输入正数字！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>26日表计读数<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="meterReading26" name="checkingFreezeData.meterReading26" value="${checkingFreezeData.meterReading26 }" datatype="/^\d{0,8}\.{0,1}(\d*)?$/" nullmsg="请输入信息！" errormsg="请输入正数字！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>27日表计读数<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="meterReading27" name="checkingFreezeData.meterReading27" value="${checkingFreezeData.meterReading27 }" datatype="/^\d{0,8}\.{0,1}(\d*)?$/" nullmsg="请输入信息！" errormsg="请输入正数字！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>28日表计读数<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="meterReading28" name="checkingFreezeData.meterReading28" value="${checkingFreezeData.meterReading28 }" datatype="/^\d{0,8}\.{0,1}(\d*)?$/" nullmsg="请输入信息！" errormsg="请输入正数字！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>29日表计读数<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="meterReading29" name="checkingFreezeData.meterReading29" value="${checkingFreezeData.meterReading29 }" datatype="/^\d{0,8}\.{0,1}(\d*)?$/" nullmsg="请输入信息！" errormsg="请输入正数字！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>30日表计读数<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="meterReading30" name="checkingFreezeData.meterReading30" value="${checkingFreezeData.meterReading30 }" datatype="/^\d{0,8}\.{0,1}(\d*)?$/" nullmsg="请输入信息！" errormsg="请输入正数字！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>31日表计读数<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="meterReading31" name="checkingFreezeData.meterReading31" value="${checkingFreezeData.meterReading31 }" datatype="/^\d{0,8}\.{0,1}(\d*)?$/" nullmsg="请输入信息！" errormsg="请输入正数字！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
				</tbody>
			</table>
			<div class="editBtn" style="margin-top: 20px;" align="center">
				<input type="submit" value="保 存" /> <input type="reset" value="重 置" /><input type="button" onclick="javascript:window.open('${baseUrl}searchAnalysis/checkingFreezeDataList.jspx','main');"value="返 回">
			</div>
		</form>
	</div>
	
<script type="text/javascript" src="${baseUrl }js/Validform_v5.3.2/Validform_v5.3.2_min.js"></script>
<script type="text/javascript">
$(function(){
	$(".registerform").Validform({
		tiptype:function(msg,o,cssctl){
			if(!o.obj.is("form")){
				var objtip=o.obj.siblings(".Validform_checktip");
				cssctl(objtip,o.type);
				objtip.text(msg);
			}
		},
		callback:function(form){
			$(".registerform").attr('action','${baseUrl }searchAnalysis/checkingFreezeDataModify.jspx');
			if(confirm("您确定要提交表单吗？")){
				return true;
			}
			return false;
		}
	});
	
	if('${param.message}' != ''){
		alert('${param.message}');
	}
	
});
</script>
</body>
</html>