<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>

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
.STYLE3 {
	font-size: 12px;
	color: #033d61;
}
-->
</style>
<style type="text/css">
.menu_title SPAN {
	FONT-WEIGHT: bold; LEFT: 3px; COLOR: #ffffff; POSITION: relative; TOP: 2px 
}
.menu_title2 SPAN {
	FONT-WEIGHT: bold; LEFT: 3px; COLOR: #FFCC00; POSITION: relative; TOP: 2px
}

</style>
<table width="165" height="100%" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td height="28" background="${baseUrl }images/main_40.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="19%">&nbsp;</td>
        <td width="81%" height="20"><span class="STYLE1">管理菜单</span></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td valign="top"><table width="151" border="0" align="center" cellpadding="0" cellspacing="0">
      <tr>
        <td>
        <table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="23" background="${baseUrl }images/main_47.gif" id="imgmenu1" class="menu_title" onMouseOver="this.className='menu_title2';" onClick="showsubmenu(1)" onMouseOut="this.className='menu_title';" style="cursor:hand"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="18%">&nbsp;</td>
                <td width="82%" class="STYLE1">费用计算</td>
              </tr>
            </table></td>
          </tr>
          <tr>
            <td background="${baseUrl }images/main_51.gif" id="submenu1">
			 <div class="sec_menu" >  
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td>
	                <table width="90%" border="0" align="center" cellpadding="0" cellspacing="0">
	                  <tr>
	                    <td width="16%" height="25"><div align="center"><img src="${baseUrl }images/left.gif" width="10" height="10" /></div></td>
	                    <td width="84%" height="23"><table width="95%" border="0" cellspacing="0" cellpadding="0">
	                        <tr>
	                          <td height="20" style="cursor:hand" onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "onmouseout="this.style.borderStyle='none'"><span class="STYLE3"><a href="${baseUrl }freesettle/waterDayCostList.jspx" target="main">日用水费查询</a></span></td>
	                        </tr>
	                    </table></td>
	                  </tr>
	                  <tr>
	                    <td width="16%" height="25"><div align="center"><img src="${baseUrl }images/left.gif" width="10" height="10" /></div></td>
	                    <td width="84%" height="23"><table width="95%" border="0" cellspacing="0" cellpadding="0">
	                        <tr>
	                          <td height="20" style="cursor:hand" onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "onmouseout="this.style.borderStyle='none'"><span class="STYLE3"><a href="${baseUrl }freesettle/waterMonthCostList.jspx" target="main">月用水费查询</a></span></td>
	                        </tr>
	                    </table></td>
	                  </tr>
	                  <!-- <tr>
	                    <td width="16%" height="25"><div align="center"><img src="${baseUrl }images/left.gif" width="10" height="10" /></div></td>
	                    <td width="84%" height="23"><table width="95%" border="0" cellspacing="0" cellpadding="0">
	                        <tr>
	                          <td height="20" style="cursor:hand" onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "onmouseout="this.style.borderStyle='none'"><span class="STYLE3"><a href="${baseUrl }jsp/costing/oweCustomerListJsp.jspx" target="main">欠费用户查询</a></span></td>
	                        </tr>
	                    </table></td>
	                  </tr> -->
	                </table>
                </td>
              </tr>
              <tr>
                <td height="5"><img src="${baseUrl }images/main_52.gif" width="151" height="5" /></td>
              </tr>
            </table></div></td>
          </tr>
        </table></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td height="18" background="${baseUrl }images/main_58.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td height="18" valign="bottom"><div align="center" class="STYLE3">版本：2008V1.0</div></td>
      </tr>
    </table></td>
  </tr>
</table>
<script>




function showsubmenu(sid)
{
whichEl = eval("submenu" + sid);
imgmenu = eval("imgmenu" + sid);
if (whichEl.style.display == "none")
{
eval("submenu" + sid + ".style.display=\"\";");
imgmenu.background="${baseUrl }images/main_47.gif";
}
else
{
eval("submenu" + sid + ".style.display=\"none\";");
imgmenu.background="${baseUrl }images/main_48.gif";
}
}

</script>