<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>日用水量查询</title>
<link href="${baseUrl }css/admin.css" type="text/css" rel="stylesheet" />
<script src="${baseUrl }js/jquery/jquery-1.7.2.min.js" type="text/javascript"></script>
<script>
$(function(){
	//全选
	var flag = true;
	$('#selectAllBtn').click(function(){
		if(flag){
			$.each($('.cb'), function(index){
				$(this)[0].checked = true;
			});
		}else{
			$.each($('.cb'), function(index){
				$(this)[0].checked = false;
			});
		}
		flag = !flag;
	});
});
</script>
</head>

<body style="min-width: 1100px;">
	<table class="position" border="0" cellSpacing="0" cellPadding="0" width="100%" align="center">
		<tbody>
			<tr class="position">
	 			<td class="position">当前位置: 数据查询 -&gt;  日用水量查询</td>
	 		</tr>
	 	</tbody>
	</table>	
	<table width="100%" border="0" align="" cellpadding="0" cellspacing="0">
		<tr><td>
			<div class="srhtab">
			    <table cellSpacing=0 cellPadding=2 border=0>
			      <tbody>
				      <tr>
				        <td>收费单位：</td>
				        <td>
				        	<select>
								<option>数据类型</option>
							</select>
						</td>
				        <td>资产编号：</td>
				        <td><input class="textbox" id="" style="width: 90px" name="" /></td>
				        <td>客户名称：</td>
				        <td><input class="textbox" id="" style="width: 90px" name="" /></td>
				        <td>月份：</td>
				        <td><input class="textbox" id="" style="width: 90px" name="" /></td>
				        <td>表号：</td>
				        <td><input class="textbox" id="" style="width: 90px" name="" /></td>
				      	<td><input class="button" id="" type="button" value="查询" name=""></td>
				      	<td><input class="button" id="" type="button" value="导出" name=""></td>
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
        <td width=""><div><span>客户编号</span></div></td>
        <td width=""><div><span>客户姓名</span></div></td>
        <td width=""><div><span>集中器编号</span></div></td>
        <td width=""><div><span>表号</span></div></td>
        <td width=""><div><span>表计类型</span></div></td>
        <td width=""><div><span>收费单位</span></div></td>
        <td width=""><div><span>1日用水量</span></div></td>
        <td width=""><div><span>2日用水量</span></div></td>
        <td width=""><div><span>3日用水量</span></div></td>
        <td width=""><div><span>4日用水量</span></div></td>
        <td width=""><div><span>5日用水量</span></div></td>
        <td width=""><div><span>6日用水量</span></div></td>
        <td width=""><div><span>6日用水量</span></div></td>
        <td width=""><div><span>7日用水量</span></div></td>
        <td width=""><div><span>8日用水量</span></div></td>
        <td width=""><div><span>9日用水量</span></div></td>
        <td width=""><div><span>10日用水量</span></div></td>
        <td width=""><div><span>11日用水量</span></div></td>
        <td width=""><div><span>12日用水量</span></div></td>
        <td width=""><div><span>13日用水量</span></div></td>
        <td width=""><div><span>14日用水量</span></div></td>
        <td width=""><div><span>15日用水量</span></div></td>
        <td width=""><div><span>16日用水量</span></div></td>
        <td width=""><div><span>17日用水量</span></div></td>
        <td width=""><div><span>18日用水量</span></div></td>
        <td width=""><div><span>19日用水量</span></div></td>
        <td width=""><div><span>20日用水量</span></div></td>
        <td width=""><div><span>21日用水量</span></div></td>
        <td width=""><div><span>22日用水量</span></div></td>
        <td width=""><div><span>23日用水量</span></div></td>
        <td width=""><div><span>24日用水量</span></div></td>
        <td width=""><div><span>25日用水量</span></div></td>
        <td width=""><div><span>26日用水量</span></div></td>
        <td width=""><div><span>27日用水量</span></div></td>
        <td width=""><div><span>28日用水量</span></div></td>
        <td width=""><div><span>29日用水量</span></div></td>
        <td width=""><div><span>30日用水量</span></div></td>
        <td width=""><div><span>31日用水量</span></div></td>
      </tr>
      <tr class="listTableTr">
        <td><div><input type="checkbox" name="" id="" class="cb" /></div></td>
        <td><div>1</div></td>
        <td><div></div></td>
        <td><div></div></td>
        <td><div></div></td>
        <td><div></div></td>
        <td><div></div></td>
        <td><div></div></td>
        <td><div></div></td>
        <td><div></div></td>
        <td><div></div></td>
        <td><div></div></td>
        <td><div></div></td>
        <td><div></div></td>
        <td><div></div></td>
        <td><div></div></td>
        <td><div></div></td>
        <td><div></div></td>
        <td><div></div></td>
        <td><div></div></td>
        <td><div></div></td>
        <td><div></div></td>
        <td><div></div></td>
        <td><div></div></td>
        <td><div></div></td>
        <td><div></div></td>
        <td><div></div></td>
        <td><div></div></td>
        <td><div></div></td>
        <td><div></div></td>
        <td><div></div></td>
        <td><div></div></td>
        <td><div></div></td>
        <td><div></div></td>
        <td><div></div></td>
        <td><div></div></td>
        <td><div></div></td>
        <td><div></div></td>
        <td><div></div></td>
        <td><div></div></td>
      </tr>
	 	<tr class="listFooterTr">
		<td colSpan=40>
		<table style="FONT-SIZE: 14px" border=0 cellSpacing=2 cellPadding=0 width="100%">
		<tbody>
		<tr>
		<td height=25 align=center>[<span class=currentFont>1</span>][<a class=other_page href="#">2</a>][<a class=other_page href="">3</a>][<a class=other_page href="">4</a>][<a class=other_page href="">5</a>][<a class=other_page href="">6</a>][<a class=other_page href="">7</a>][<a class=other_page href="">8</a>]...[<a class=other_page href="">1806</a>]<a class=other_page href="">下一页</a> </td></tr>
		<tr>
		<td align=center heigyh="25">总共<font color=red>36101</font>条记录， 当前显示第1-20条记录。跳转到 <input style="WIDTH: 40px" id=pagerID_tbPager jQuery172011253913807769178="36">页 <input value=确定 type=button jQuery172011253913807769178="37"> </td></tr></tbody></table></td>
		</tr>      
    </table>
</body>
</html>