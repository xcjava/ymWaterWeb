<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="true" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<s:action name="%{url}" namespace="/" executeResult="true"></s:action>
