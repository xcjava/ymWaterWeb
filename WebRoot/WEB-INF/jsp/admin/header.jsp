<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>头部</title>
<script type="text/javascript" src="${baseUrl }js/jquery/jquery.js"></script>
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}
.STYLE1 {
	font-size: 12px;
	color: #FFFFFF;
}
.STYLE2 {font-size: 9px}
.STYLE3 {
	color: #033d61;
	font-size: 12px;
}
.STYLE3 a:link {color:#033d61; text-decoration:none;}    /* 未被访问的链接 */
.STYLE3 a:visited {color:#033d61;} /* 已被访问的链接 */
.STYLE3 a:hover {color:#033d61;}   /* 鼠标指针移动到链接上 */
.STYLE3 a:active {color:#033d61;}  /* 正在被点击的链接 */

.tdhover {
background-image: url('${baseUrl }images/bg.gif');
border-style: solid;
border-width: 1px;
/*border-color: #a6d0e7;*/
}
.tdouter {
background-image: 'url()';
border-style: none;
}
-->
</style>
<script type="text/javascript">
	$(function(){
		$('.navTD').hover(function() {
				$(this).addClass("tdhover");
			}, function() {
				$(this).removeClass("tdhover");
		});
		$('#logout').click(function(){
			$.get("${baseUrl }admin/logout.jspx", function(data){
				 parent.location.reload();
				});
		});
		
		function showDate()
		{        
		    var day="";        
		    var month="";        
		    var ampm="";        
		    var ampmhour="";        
		    var myweekday="";        
		    var year="";        
		    mydate=new Date();        
		    myweekday=mydate.getDay();        
		    mymonth=mydate.getMonth()+1;        
		    myday= mydate.getDate();        
		    myyear= mydate.getYear();        
		    year=(myyear > 200) ? myyear : 1900 + myyear;        
		    if(myweekday == 0)         
		        weekday=" 星期日";        
		    else if(myweekday == 1)        
		        weekday=" 星期一";        
		    else if(myweekday == 2)        
		        weekday=" 星期二";        
		    else if(myweekday == 3)        
		        weekday=" 星期三";        
		    else if(myweekday == 4)         
		        weekday=" 星期四";        
		    else if(myweekday == 5)        
		        weekday=" 星期五";       
		    else if(myweekday == 6)        
		        weekday=" 星期六";        
			$('#showDate').html(year+"年"+mymonth+"月"+myday+"日"+weekday);
		}
		showDate();
	});
</script>
</head>
<body>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td height="70" background="${baseUrl }images/main_05.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td height="24"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td width="270" height="24" background="${baseUrl }images/main_03.gif">&nbsp;</td>
            <td width="505" background="${baseUrl }images/main_04.gif">&nbsp;</td>
            <td>&nbsp;</td>
            <td width="21"><img src="${baseUrl }images/main_07.gif" width="21" height="24"></td>
          </tr>
        </table></td>
      </tr>
      <tr>
        <td height="38"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td width="270" height="38" background="${baseUrl }images/main_09.gif">&nbsp;</td>
            <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="77%" height="25" valign="bottom"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                  <tr>
                    <td width="50"><div align="center"><img id="logout" style="cursor: pointer;" src="${baseUrl }images/main_20.gif" width="48" height="19"></div></td>
                    <td width="100%" valign="bottom"><div align="center" class="STYLE1">欢迎您：<span style="">${manager.managerId }</span></div></td>
                    <td>&nbsp;</td>
                  </tr>
                </table></td>
                <td width="220" valign="bottom"  nowrap="nowrap"><div align="right"><span class="STYLE1"><span class="STYLE2">■</span> 今天是：<span id="showDate"></span></span></div></td>
              </tr>
            </table></td>
            <td width="21"><img src="${baseUrl }images/main_11.gif" width="21" height="38"></td>
          </tr>
        </table></td>
      </tr>
      <tr>
        <td height="8" style=" line-height:8px;"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td width="270" background="${baseUrl }images/main_29.gif" style=" line-height:8px;">&nbsp;</td>
            <td width="505" background="${baseUrl }images/main_30.gif" style=" line-height:8px;">&nbsp;</td>
            <td style=" line-height:8px;">&nbsp;</td>
            <td width="21" style=" line-height:8px;"><img src="${baseUrl }images/main_31.gif" width="21" height="8"></td>
          </tr>
        </table></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td height="28" background="${baseUrl }images/main_36.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="177" height="28" background="${baseUrl }images/main_32.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td width="20%"  height="22">&nbsp;</td>
            <td width="21%">&nbsp;</td>
          </tr>
        </table></td>
        <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td width="63"><table width="58" border="0" align="center" cellpadding="0" cellspacing="0">
              <tr>
                <td height="20" class="<c:choose><c:when test="${module == 'archives' }">tdhover</c:when><c:otherwise>navTD</c:otherwise></c:choose>"><div align="center" class="STYLE3"><a href="${baseUrl }admin/index.jspx?module=archives" target="_top">档案管理</a></div></td>
              </tr>
            </table></td>
            
            <td width="3"><img src="${baseUrl }images/main_34.gif" width="3" height="28"></td>
            
            <td width="63"><table width="58" border="0" align="center" cellpadding="0" cellspacing="0">
              <tr>
                <td height="20" class="<c:choose><c:when test="${module == 'data' }">tdhover</c:when><c:otherwise>navTD</c:otherwise></c:choose>"><div align="center" class="STYLE3"><a href="${baseUrl }admin/index.jspx?module=data" target="_top">数据采集</a></div></td>
              </tr>
            </table></td>
            
            <td width="3"><img src="${baseUrl }images/main_34.gif" width="3" height="28"></td>
            
            <td width="63"><table width="58" border="0" align="center" cellpadding="0" cellspacing="0">
              <tr>
                <td height="20" class="<c:choose><c:when test="${module == 'costing' }">tdhover</c:when><c:otherwise>navTD</c:otherwise></c:choose>"><div align="center" class="STYLE3"><a href="${baseUrl }admin/index.jspx?module=costing" target="_top">费用计算</a></div></td>
              </tr>
            </table></td>
            
            <td width="3"><img src="${baseUrl }images/main_34.gif" width="3" height="28"></td>
            
            <td width="63"><table width="58" border="0" align="center" cellpadding="0" cellspacing="0">
              <tr>
                <td height="20" class="<c:choose><c:when test="${module == 'settlement' }">tdhover</c:when><c:otherwise>navTD</c:otherwise></c:choose>"><div align="center" class="STYLE3"><a href="${baseUrl }admin/index.jspx?module=settlement" target="_top">费用结算</a></div></td>
              </tr>
            </table></td>
            
            <td width="3"><img src="${baseUrl }images/main_34.gif" width="3" height="28"></td>
            
            <td width="63"><table width="78" border="0" align="center" cellpadding="0" cellspacing="0">
              <tr>
                <td height="20" class="<c:choose><c:when test="${module == 'searchAnalysis' }">tdhover</c:when><c:otherwise>navTD</c:otherwise></c:choose>"><div align="center" class="STYLE3"><a href="${baseUrl }admin/index.jspx?module=searchAnalysis" target="_top">查询与分析</a></div></td>
              </tr>
            </table></td>
            
            <td width="3"><img src="${baseUrl }images/main_34.gif" width="3" height="28"></td>
            
            <td width="63"><table width="58" border="0" align="center" cellpadding="0" cellspacing="0">
              <tr>
                <td height="20" class="<c:choose><c:when test="${module == 'manager' }">tdhover</c:when><c:otherwise>navTD</c:otherwise></c:choose>"><div align="center" class="STYLE3"><a href="${baseUrl }admin/index.jspx?module=manager" target="_top">系统管理</a></div></td>
              </tr>
            </table></td>
            <td>&nbsp;</td>
          </tr>
        </table></td>
        <td width="21"><img src="${baseUrl }images/main_37.gif" width="21" height="28"></td>
      </tr>
    </table></td>
  </tr>
</table>
</body>
</html>