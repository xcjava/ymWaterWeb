<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>实抄集中器下表的信息</title>
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
	 			<td class="position">当前位置: 数据采集 -&gt;  集中器抄控</td>
	 		</tr>
	 	</tbody>
	</table>	
	<table width="100%" border="0" align="" cellpadding="0" cellspacing="0">
		<tr><td>
			<div class="srhtab">
			    <table cellSpacing=0 cellPadding=2 border=0>
			      <tbody>
				      <tr>
				      	<td><input class="button" id="" type="button" value="返回" name=""></td>
				      </tr>
				      <tr>
				      </tr>
			      </tbody>
			    </table>	
			</div>
		</td></tr>
	</table>
	
    <table class="ymlistTable" width="100%" cellpadding="0" cellspacing="1" >
      <tr class="listTableHead">
        <td width="" colspan="12">实抄集中器下表的信息</td>
      </tr>
      <tr class="listTableHead">
        <td width=""><div align="center"><input type="checkbox" name="checkbox" id="selectAllBtn" /></div></td>
        <td width=""><div><span>序号</span></div></td>
        <td width=""><div><span>客户编号</span></div></td>
        <td width=""><div><span>客户名称</span></div></td>
        <td width=""><div><span>加载序号</span></div></td>
        <td width=""><div><span>水表编号</span></div></td>
        <td width=""><div><span>抄表方式</span></div></td>
        <td width=""><div><span>水表类型</span></div></td>
        <td width=""><div><span>拉闸功能</span></div></td>
        <td width=""><div><span>中继方式</span></div></td>
        <td width=""><div><span>收费单位</span></div></td>
        <td width=""><div><span>操作</span></div></td>
      </tr>
      <tr class="listTableTr">
        <td><div><input type="checkbox" name="" id="" class="cb" /></div></td>
        <td><div>1</div></td>
        <td><div>系统管理员</div></td>
        <td><div>系统管理员</div></td>
        <td><div>系统管理员</div></td>
        <td><div>系统管理员</div></td>
        <td><div>系统管理员</div></td>
        <td><div>系统管理员</div></td>
        <td><div>系统管理员</div></td>
        <td><div>系统管理员</div></td>
        <td><div>系统管理员</div></td>
        <td><div><a href="#">修改</a> | <a href="#">查看</a></div></td>
      </tr>
      <tr class="listTableTr">
        <td><div><input type="checkbox" name="" id="" class="cb" /></div></td>
        <td><div>2</div></td>
        <td><div>系统管理员</div></td>
        <td><div>系统管理员</div></td>
        <td><div>系统管理员</div></td>
        <td><div>系统管理员</div></td>
        <td><div>系统管理员</div></td>
        <td><div>系统管理员</div></td>
        <td><div>系统管理员</div></td>
        <td><div>系统管理员</div></td>
        <td><div>系统管理员</div></td>
        <td><div><a href="#">修改</a> | <a href="#">查看</a></div></td>
      </tr>
      <tr class="listTableTr">
        <td><div><input type="checkbox" name="" id="" class="cb" /></div></td>
        <td><div>3</div></td>
        <td><div>系统管理员</div></td>
        <td><div>系统管理员</div></td>
        <td><div>系统管理员</div></td>
        <td><div>系统管理员</div></td>
        <td><div>系统管理员</div></td>
        <td><div>系统管理员</div></td>
        <td><div>系统管理员</div></td>
        <td><div>系统管理员</div></td>
        <td><div>系统管理员</div></td>
        <td><div><a href="#">修改</a> | <a href="#">查看</a></div></td>
      </tr>
      
	 	<tr class="listFooterTr">
		<td colSpan=12>
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