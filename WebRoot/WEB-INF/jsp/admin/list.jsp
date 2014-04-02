<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<style type="text/css">
<!--
body {
	margin-left: 3px;
	margin-top: 0px;
	margin-right: 3px;
	margin-bottom: 0px;
}
-->
.srhtab { border:#c0d0dc 1px solid; background-color:#f5f5f5; padding:10px; margin-top:5px;margin-bottom:5px; color: #000000; font-size: 12px; FONT-FAMILY: 宋体}
.srhtab td{color: #000000; font-size: 12px;}
.srhtab .textbox {
	BORDER-RIGHT: #cccccc 1px solid; BORDER-TOP: #cccccc 1px solid; BORDER-LEFT: #cccccc 1px solid; COLOR: #333333; BORDER-BOTTOM: #cccccc 1px solid; HEIGHT: 17px; BACKGROUND-COLOR: #fdfdfd
}
.srhtab .button {
	BORDER-RIGHT: #888888 1px solid; BORDER-TOP: #f4f4f4 1px solid; BORDER-LEFT: #f4f4f4 1px solid; COLOR: #000000; PADDING-TOP: 2px; BORDER-BOTTOM: #888888 1px solid
}
.srhtab input {
	FONT-SIZE: 12px; FONT-FAMILY: 宋体
}
.srhtab select {
	FONT-SIZE: 12px; FONT-FAMILY: 宋体
}
.listTable{border: 0;background-color: #a8c7ce; }
.listTable .listTableHead td{background-color: #d3eaef;color: #000000; font-size: 12px;height: 20px;}
.listTable .listTableHead td div{text-align: center;}
.listTable .listTableHead td div span{color: #000000; font-size: 12px;}
.listTable .listTableTr td{background-color: #FFFFFF;color: #344b50;font-size: 12px;height: 20px;}
.listTable .listTableTr td div{text-align: center;}
.listTable .listTableTr td div a{font-size: 12px;color: #3b6375;}
</style>
<script>
</script>
</head>

<body>
	<table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
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
	</table>
	<table width="100%" border="0" align="left" cellpadding="0" cellspacing="0">
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

    <table class="listTable" width="100%" cellpadding="0" cellspacing="1" >
      <tr class="listTableHead">
        <td width="4%"><div align="center"><input type="checkbox" name="checkbox" id="checkbox" /></div></td>
        <td width="10%"><div><span>用户名</span></div></td>
        <td width="15%"><div><span>用户角色</span></div></td>
        <td width="14%"><div><span>联系方式</span></div></td>
        <td width="16%"><div><span>IP地址</span></div></td>
        <td width="27%"><div><span>详细描述</span></div></td>
        <td width="14%"><div><span>基本操作</span></div></td>
      </tr>
      <tr class="listTableTr">
        <td><div><input type="checkbox" name="" id="" /></div></td>
        <td><div><span class="STYLE19">admin</span></div></td>
        <td><div>系统管理员系统管理员</div></td>
        <td><div>13913612548</div></td>
        <td><div>192.168.0.124</div></td>
        <td><div>用户可以对系统的所有操作进行管理...</div></td>
        <td><div><a href="#">删除</a> | <a href="#">查看</a></div></td>
      </tr>
      <tr class="listTableTr">
        <td><div><input type="checkbox" name="" id="" /></div></td>
        <td><div><span class="STYLE19">admin</span></div></td>
        <td><div>系统管理员系统管理员</div></td>
        <td><div>13913612548</div></td>
        <td><div>192.168.0.124</div></td>
        <td><div>用户可以对系统的所有操作进行管理...</div></td>
        <td><div><a href="#">删除</a> | <a href="#">查看</a></div></td>
      </tr>
      <tr class="listTableTr">
        <td><div><input type="checkbox" name="" id="" /></div></td>
        <td><div><span class="STYLE19">admin</span></div></td>
        <td><div>系统管理员系统管理员</div></td>
        <td><div>13913612548</div></td>
        <td><div>192.168.0.124</div></td>
        <td><div>用户可以对系统的所有操作进行管理...</div></td>
        <td><div><a href="#">删除</a> | <a href="#">查看</a></div></td>
      </tr>
      <tr class="listTableTr">
        <td><div><input type="checkbox" name="" id="" /></div></td>
        <td><div><span class="STYLE19">admin</span></div></td>
        <td><div>系统管理员系统管理员</div></td>
        <td><div>13913612548</div></td>
        <td><div>192.168.0.124</div></td>
        <td><div>用户可以对系统的所有操作进行管理...</div></td>
        <td><div><a href="#">删除</a> | <a href="#">查看</a></div></td>
      </tr>
    </table>

</body>
</html>