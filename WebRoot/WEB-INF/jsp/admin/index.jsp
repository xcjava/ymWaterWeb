<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>企业信息管理系统</title>
</head>

<frameset rows="98,*,8" frameborder="no" border="0" framespacing="0">
  <frame src="${baseUrl }/admin/headerJsp.jspx" name="topFrame" scrolling="no" noresize="" id="topFrame" />
  <frame src="${baseUrl }/admin/mainJsp.jspx" name="mainFrame" scrolling="no" id="mainFrame" />
  <frame src="${baseUrl }/admin/downJsp.jspx" name="bottomFrame" scrolling="no" noresize="" id="bottomFrame" />
</frameset>
<noframes><body>
</body>
</noframes></html>