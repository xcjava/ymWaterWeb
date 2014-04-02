<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>列表页</title>
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

<body>
	<!-- <table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
      <tr bgcolor="#353c44">
        <td width="28px" height="24" valign="center"><div align="center"><img src="${baseUrl }images/tb.gif" width="14" height="14" /></div></td>
        <td width="300px" valign="center"><span style="color: #e1e2e3;font-size: 12px;"> 你当前的位置：[业务中心]-[我的邮件]</span></td>
        <td width="500px">
        	<div align="right">
        		<span style="color: #e1e2e3;font-size: 12px; display: none;">
          			<img src="${baseUrl }images/add.gif" width="10" height="10" /> 添加   &nbsp; <img src="${baseUrl }images/del.gif" width="10" height="10" /> 删除    &nbsp;&nbsp;<img src="${baseUrl }images/edit.gif" width="10" height="10" /> 编辑   &nbsp;
          		</span>
          	</div>
        </td>
      </tr>
	</table> -->
	<table class="position" border="0" cellSpacing="0" cellPadding="0" width="100%" align="center">
		<tbody>
			<tr class="position">
	 			<td class="position">当前位置: 团购管理 -&gt; 物流公司列表</td>
	 		</tr>
	 	</tbody>
	</table>	
	<table width="100%" border="0" align="" cellpadding="0" cellspacing="0">
		<tr><td>
			<div class="srhtab">
			    <table cellSpacing=0 cellPadding=2 border=0>
			      <tbody>
			      <tr>
			        <td>筛选数据：</td>
			        <td>
			        <select id=sClient name=sClient>
			        	<option value="" selected>全部广告商</option> 
			            <option value=lenovo>罗宝网</option>
			            <option value=lenovoshop>联想在线</option>
			            <option value=letao>乐淘网</option>
			        </select>
			        </td>
			        <td><select id=sFlag name=sFlag><option value=0 selected>全部状态</option> <option value=1>新申请</option> <option value=2>审核通过</option> <option value=3>审核未通过</option></option></td>
			        <td>渠道商</td>
			        <td><input class=textbox id=sChannel2 style="WIDTH: 120px" maxLength=50 name=sChannel2></td>
			        <td>起始日期</td>
			        <td><input class=textbox id=sStart2 style="WIDTH: 120px" name=sStart2></td>
			        <td>截止日期</td>
			        <td><input class=textbox id=sEnd2 style="WIDTH: 120px" name=sEnd2></td>
			        <td><input class=button id=sButton2 type=submit value="搜索" name=sButton2></td>
			        </tr>
			        </tbody>
			    </table>	
			</div>
		</td></tr>
	</table>

    <table class="ymlistTable" width="100%" cellpadding="0" cellspacing="1" >
      <tr class="listTableHead">
        <td width="4%"><div align="center"><input type="checkbox" name="checkbox" id="selectAllBtn" /></div></td>
        <td width="10%"><div><span>用户名</span></div></td>
        <td width="15%"><div><span>用户角色</span></div></td>
        <td width="14%"><div><span>联系方式</span></div></td>
        <td width="16%"><div><span>IP地址</span></div></td>
        <td width="27%"><div><span>详细描述</span></div></td>
        <td width="14%"><div><span>基本操作</span></div></td>
      </tr>
      <tr class="listTableTr">
        <td><div><input type="checkbox" name="" id="" class="cb" /></div></td>
        <td><div><span class="STYLE19">admin</span></div></td>
        <td><div>系统管理员系统管理员</div></td>
        <td><div>13913612548</div></td>
        <td><div>192.168.0.124</div></td>
        <td><div>用户可以对系统的所有操作进行管理...</div></td>
        <td><div><a href="#">删除</a> | <a href="#">查看</a></div></td>
      </tr>
      <tr class="listTableTr">
        <td><div><input type="checkbox" name="" id="" class="cb" /></div></td>
        <td><div><span class="STYLE19">admin</span></div></td>
        <td><div>系统管理员系统管理员</div></td>
        <td><div>13913612548</div></td>
        <td><div>192.168.0.124</div></td>
        <td><div>用户可以对系统的所有操作进行管理...</div></td>
        <td><div><a href="#">删除</a> | <a href="#">查看</a></div></td>
      </tr>
      <tr class="listTableTr">
        <td><div><input type="checkbox" name="" id="" class="cb" /></div></td>
        <td><div><span class="STYLE19">admin</span></div></td>
        <td><div>系统管理员系统管理员</div></td>
        <td><div>13913612548</div></td>
        <td><div>192.168.0.124</div></td>
        <td><div>用户可以对系统的所有操作进行管理...</div></td>
        <td><div><a href="#">删除</a> | <a href="#">查看</a></div></td>
      </tr>
      <tr class="listTableTr">
        <td><div><input type="checkbox" name="" id="" class="cb" /></div></td>
        <td><div><span class="STYLE19">admin</span></div></td>
        <td><div>系统管理员系统管理员</div></td>
        <td><div>13913612548</div></td>
        <td><div>192.168.0.124</div></td>
        <td><div>用户可以对系统的所有操作进行管理...</div></td>
        <td><div><a href="#">删除</a> | <a href="#">查看</a></div></td>
      </tr>
	 	<tr class="listFooterTr">
		<td colSpan=7>
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