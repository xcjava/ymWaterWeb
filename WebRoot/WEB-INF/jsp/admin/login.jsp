<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>企业信息管理系统_用户登录</title>
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
	background-color: #016aa9;
	overflow:hidden;
}
.STYLE1 {
	color: #000000;
	font-size: 12px;
}
-->
</style>
<script src="${baseUrl }js/jquery/jquery-1.7.2.min.js" type="text/javascript"></script>
<script type="text/javascript">
	$(function(){
		//登录
		function login(){
			var loginForm = $('#loginForm'); 
			var managerId = $('#managerId').val();
			var password = $('#password').val();
			if(managerId == ''){
				alert('请输入用户名！');
				return false;
			}else if(password == ''){
				alert('请输入密码！');
				return false;
			}else{
				loginForm.attr('action','${baseUrl}admin/login.jspx');
				loginForm.submit();
			}
		}
		$('#login_btn').click(function(){
			login();
		});
		$('#password').keydown(function(e){
			if(e.keyCode==13){
				login();
			}
		}); 
	});
</script>
</head>
<body>
<form id="loginForm" method="post">
<table width="100%" height="100%" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td><table width="962" border="0" align="center" cellpadding="0" cellspacing="0">
      <tr>
        <td height="235" background="${baseUrl}images/login_03.gif">&nbsp;</td>
      </tr>
      <tr>
        <td height="53"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td width="394" height="53" background="${baseUrl}images/login_05.gif">&nbsp;</td>
            <td width="206" background="${baseUrl}images/login_06.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="16%" height="25"><div align="right"><span class="STYLE1">用户</span></div></td>
                <td width="57%" height="25"><div align="center">
                  <input type="text" name="managerId" id="managerId" style="width:105px; height:17px; background-color:#292929; border:solid 1px #7dbad7; font-size:12px; color:#6cd0ff">
                </div></td>
                <td width="27%" height="25">&nbsp;</td>
              </tr>
              <tr>
                <td height="25"><div align="right"><span class="STYLE1">密码</span></div></td>
                <td height="25"><div align="center">
                  <input type="password" name="password" id="password" style="width:105px; height:17px; background-color:#292929; border:solid 1px #7dbad7; font-size:12px; color:#6cd0ff">
                </div></td>
                <td height="25"><div align="left"><a href="javascript:void(0);" id="login_btn"><img src="${baseUrl}images/dl.gif" width="49" height="18" border="0"></a></div></td>
              </tr>
            </table></td>
            <td width="362" background="${baseUrl}images/login_07.gif">&nbsp;</td>
          </tr>
        </table></td>
      </tr>
      <tr>
        <td height="213" background="${baseUrl}images/login_08.gif">&nbsp;</td>
      </tr>
    </table></td>
  </tr>
</table>
</form>
<script type="text/javascript">
   	if('${message}' != ''){
		alert('${message}');
   	}
</script>
</body>
</html>