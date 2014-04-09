
package com.ymsino.water.view.web.common;

import javax.servlet.jsp.tagext.*;


/**
 * 分页标签(支持动静态分页)
 * @author fullshit.xiao@gmail.com
 * @version 2.0
 * 
 * --------------使用说明--------------
 * 页面头部引入标签
 * <%@ taglib uri="http://www.xiaocong.net/gdcct/tags" prefix="gdcct"%>
 * 
 * 纯静态分页(调用时不要换行)
 * <gdcct:page id="pagerId" pageCSS="pagebottom" pageStaticMax="${pageModel.pageCount}" pageIndex="${pageModel.pageIndex}" 
 * recordCount="${pageModel.recordCount}" pageFirstURL="http://www.gdcct.com/list/${categoryCode}/index.htm" 
 * pageStaticURLFormat="http://www.gdcct.com/list/${categoryCode}/index_{0}.htm" pageSize="${pageModel.pageSize}"></gdcct:page>
 * 
 * 纯动态分页(调用时不要换行)
 * <gdcct:page id="pagerID" pageCSS="pagebottom" pageStaticMax="0" pageIndex="${pageModel.pageIndex}" recordCount="${pageModel.recordCount}" 
 * pageFirstURL="/market/supplyAllList.jspx" pageDynamicURLFormat="/market/supplyAllList.jspx?currIndex={0}" pageSize="${pageModel.pageSize}" 
 * addParam="true" pageParam="&pageSize=${pageModel.pageSize}"></gdcct:page>
 * 
 * 动静态分页结合，例如前5页静态，后面全部动态(调用时不要换行)
 * <gdcct:page id="pagerID" pageCSS="pagebottom" pageStaticMax="5" pageIndex="${pageModel.pageIndex}" recordCount="${pageModel.recordCount}" 
 * pageFirstURL="http://www.gdcct.com/list/${categoryCode}/index.htm" 
 * pageDynamicURLFormat="http://www.gdcct.com/mkProductList.jspx?currIndex={0}"
 * pageStaticURLFormat="http://www.gdcct.com/list/${categoryCode}/index_{0}.htm"
 * pageSize="${pageModel.pageSize}" pageParam="&categoryCode=${categoryCode}"></gdcct:page>
 * 
 * 参数说明
 * id							必要参数，当一个页面有两个分页标签时，此id不可重复；
 * recordCount					必要参数，总记录数；
 * pageIndex					必要参数，当前页码；
 * pageCount					必要参数，总页数；
 * pageSize						必要参数，每页的信息数量；
 * pageStaticMax				必要参数，静态页数量，纯动态分页，传入“0”，纯静态分页传入静态页面数量，如“${pageModel.pageCount}”，动静态结合分页传入静态页面数；
 * pageFirstURL					纯静态分页、动静结合分页时的必要参数，此时传入静态分页的首页地址；
 * pageStaticURLFormat			静态分页必要参数，传入静态地址url；
 * pageDynamicURLFormat			动态分页必要参数，传入动态地址url；
 * pageCSS						非必要参数，分页标签按钮使用样式，可传入新的样式名称，默认“pagebottom”；
 * addParam						非必要参数，没有搜索条件时url是否追加动态参数，默认为true，建议在没有搜索条件下传false，避免url带太多的参数不友好而导致搜索引擎不收录；
 * pageParam					非必要参数，动态参数，静态分页是无需传入，动态分页有搜索条件时需传入；
 * firstText					非必要参数，首页显示字样，可传入新字样，默认“首&nbsp;&nbsp;页”；
 * lastText						非必要参数，末页显示字样，可传入新字样，默认“末&nbsp;&nbsp;页”；
 * preText						非必要参数，上一页页显示字样，可传入新字样，默认“上一页”；
 * nextText						非必要参数，下一页页显示字样，可传入新字样，默认“下一页”；
 * searchText					非必要参数，下一页页显示字样，可传入新字样，默认“go”；
 * 
 */
public class Pager extends TagSupport {

	private static final long serialVersionUID = 1L;

	/**
     * 总记录数
     */
    private String recordCount = "1";
    
    /**
     * 当前页码
     */
    private String pageIndex = "1";
    
    /**
     * 总页数
     */
    private String pageCount = "1";
    
    /**
     * 每页的信息数量
     */
    private String pageSize = "1";
    
    /**
     * 首页地址
     */
    private String pageFirstURL = "http://www.gdcct.com";
    
    /**
     * 静态页数量
     */ 
    private String pageStaticMax = "0";
    
    /**
     * 没有搜索条件时url是否追加动态参数
     */
    private boolean addParam = true;
    
    /**
     * 动态参数
     */
    private String pageParam = "";
    
    /**
     * 静态页链接格式
     */
    private String pageStaticURLFormat = "http://www.gdcct.com/Static{0}";
    
    /**
     * 动态页链接格式
     */
    private String pageDynamicURLFormat = "http://www.gdcct.com/Dynamic?p={0}";
    
    /**
     * 当前页CSS样式
     */
    private String pageCSS = "pagebottom";
    
    /**
     * 标签id
     */
    private String id;
    
    /**
     * 首页显示字样
     */
    private String firstText = "首&nbsp;&nbsp;页";
    
    /**
     * 末页显示字样
     */
    private String lastText = "末&nbsp;&nbsp;页";
    
    /**
     * 上一页页显示字样
     */
    private String preText = "上一页";
    
    /**
     * 下一页页显示字样
     */
    private String nextText = "下一页";
    
    /**
     * 查看页按钮字样
     */
    private String searchText = "go";

	public String getRecordCount() {
		return recordCount;
	}

	public void setRecordCount(String recordCount) {
		this.recordCount = recordCount;
	}

	public String getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(String pageIndex) {
		this.pageIndex = pageIndex;
	}

	public String getPageCount() {
		return pageCount;
	}

	public void setPageCount(String pageCount) {
		this.pageCount = pageCount;
	}

	public String getPageSize() {
		return pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getPageFirstURL() {
		return pageFirstURL;
	}

	public void setPageFirstURL(String pageFirstURL) {
		this.pageFirstURL = pageFirstURL;
	}

	public String getPageStaticMax() {
		return pageStaticMax;
	}

	public void setPageStaticMax(String pageStaticMax) {
		this.pageStaticMax = pageStaticMax;
	}

	public String getPageParam() {
		return pageParam;
	}

	public void setPageParam(String pageParam) {
		this.pageParam = pageParam;
	}

	public String getPageStaticURLFormat() {
		return pageStaticURLFormat;
	}

	public void setPageStaticURLFormat(String pageStaticURLFormat) {
		this.pageStaticURLFormat = pageStaticURLFormat;
	}

	public String getPageDynamicURLFormat() {
		return pageDynamicURLFormat;
	}

	public void setPageDynamicURLFormat(String pageDynamicURLFormat) {
		this.pageDynamicURLFormat = pageDynamicURLFormat;
	}

	public String getPageCSS() {
		return pageCSS;
	}

	public void setPageCSS(String pageCSS) {
		this.pageCSS = pageCSS;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstText() {
		return firstText;
	}

	public void setFirstText(String firstText) {
		this.firstText = firstText;
	}

	public String getLastText() {
		return lastText;
	}

	public void setLastText(String lastText) {
		this.lastText = lastText;
	}

	public String getPreText() {
		return preText;
	}

	public void setPreText(String preText) {
		this.preText = preText;
	}

	public String getNextText() {
		return nextText;
	}

	public void setNextText(String nextText) {
		this.nextText = nextText;
	}

	public String getSearchText() {
		return searchText;
	}

	public void setSearchText(String searchText) {
		this.searchText = searchText;
	}

	public boolean isAddParam() {
		return addParam;
	}

	public void setAddParam(boolean addParam) {
		this.addParam = addParam;
	}

	private String creatPaper()
    {
		StringBuilder strPaper 	= new StringBuilder();
		StringBuilder sb 		= new StringBuilder();
		
		int intRecordCount 		= toInt(this.recordCount,0);
		int intPageIndex 		= toInt(this.pageIndex,0);
		int intPageSize 		= toInt(this.pageSize,0);
		int intPageStaticMax 	= toInt(this.pageStaticMax,0);
		int intPageCount 		= intRecordCount%intPageSize==0?intRecordCount/intPageSize:intRecordCount/intPageSize+1;
		this.pageCount 			= Integer.toString(intPageCount);
		
		
		if(intPageCount < 2){
			return sb.toString();
		}
		
		if(addParam && !isEmpty(this.pageParam))
			pageDynamicURLFormat += this.pageParam;
		
		if(intPageIndex == 1){
			strPaper.append("<h3>" + this.firstText + "</h3>");
			strPaper.append("<h3>" + this.preText + "</h3>");
			if(intPageIndex < intPageCount){
				if(intPageIndex < intPageStaticMax){
					strPaper.append("<h3><a href=" + pageStaticURLFormat.replace("{0}", Integer.toString(intPageIndex + 1)) + ">" + this.nextText + "</a></h3>");
				}else{
					strPaper.append("<h3><a href=" + pageDynamicURLFormat.replace("{0}", Integer.toString(intPageIndex + 1)) + ">" + this.nextText + "</a></h3>");
				}
				if(intPageStaticMax < intPageCount){
					strPaper.append("<h3><a href=" + pageDynamicURLFormat.replace("{0}", pageCount) + ">" + this.lastText + "</a></h3>");
				}else{
					strPaper.append("<h3><a href=" + pageStaticURLFormat.replace("{0}", pageCount) + ">" + this.lastText + "</a></h3>");
				}
			}
		}
		
		if(intPageIndex > 1){
			if(intPageStaticMax > 0){
				strPaper.append("<h3><a href=" + pageFirstURL + ">" + this.firstText + "</a></h3>");
			}else{
				strPaper.append("<h3><a href=" + pageDynamicURLFormat.replace("{0}", "1") + ">" + this.firstText + "</a></h3>");
			}
			if(intPageIndex - 1 <= intPageStaticMax){
				strPaper.append("<h3><a href=" + pageStaticURLFormat.replace("{0}", Integer.toString(intPageIndex - 1)) + ">" + this.preText + "</a></h3>");
			}else{
				strPaper.append("<h3><a href=" + pageDynamicURLFormat.replace("{0}", Integer.toString(intPageIndex - 1)) + ">" + this.preText + "</a></h3>");
			}
			if(intPageIndex < intPageCount){
				if(intPageIndex + 1 <= intPageStaticMax){
					 strPaper.append("<h3><a href=" + pageStaticURLFormat.replace("{0}", Integer.toString(intPageIndex + 1)) + ">" + this.nextText + "</a></h3>");
				}else{
					 strPaper.append("<h3><a href=" + pageDynamicURLFormat.replace("{0}", Integer.toString(intPageIndex + 1)) + ">" + this.nextText + "</a></h3>");
				}
				if(intPageStaticMax < intPageCount){
					strPaper.append("<h3><a href=" + pageDynamicURLFormat.replace("{0}", pageCount) + ">" + this.lastText + "</a></h3>");
				}else{
					strPaper.append("<h3><a href=" + pageStaticURLFormat.replace("{0}", pageCount) + ">" + this.lastText + "</a></h3>");
				}
			}
			if(intPageIndex == intPageCount){
				strPaper.append("<h3>" + this.nextText + "</h3>");
				strPaper.append("<h3>" + this.lastText + "</h3>");
			}
		}
		
        sb.append("<script language='javascript'>																														\r\n");
		sb.append("	function tagLib_" + this.id + "_btnGoPage(inputPageId)																								\r\n");
		sb.append("	{																																					\r\n");
		sb.append("		var strPage=document.getElementById(inputPageId).value;																							\r\n");
		sb.append("		if(isNaN(strPage) || strPage=='')																												\r\n");
		sb.append("		{																																				\r\n");
		sb.append("		alert('请输入页码！');																															\r\n");
		sb.append("		return false;																																	\r\n");
		sb.append("		}																																				\r\n");
		sb.append("		else																																			\r\n");
		sb.append("		{																																				\r\n");
		sb.append("		var ip = parseInt(strPage);																														\r\n");
		sb.append("			if(ip > " + pageCount + " || ip < 1)																										\r\n");
		sb.append("			{																																			\r\n");
		sb.append("				alert('请输入1—" + pageCount + "范围内的页码！');																							\r\n");
		sb.append("				return false;																															\r\n");
		sb.append("			}																																			\r\n");
		sb.append("			else																																		\r\n");
		sb.append("			{																																			\r\n");
		sb.append("				var strURL='';																															\r\n");
		sb.append("				if(ip == 1)																																\r\n");
		sb.append("				{																																		\r\n");
		sb.append("					if(" + intPageStaticMax + " > 0)																									\r\n");
		sb.append("					{																																	\r\n");
		sb.append("						strURL='" + pageFirstURL + "';																									\r\n");
		sb.append("					}																																	\r\n");
		sb.append("					else																																\r\n");
		sb.append("					{																																	\r\n");
		sb.append("						strURL='" + pageDynamicURLFormat + "';																							\r\n");
		sb.append("						strURL = strURL.replace('{0}',ip);																								\r\n");
		sb.append("					}																																	\r\n");
		sb.append("				}																																		\r\n");
		sb.append("				else																																	\r\n");
		sb.append("				{																																		\r\n");
		sb.append("					if(ip <= " + intPageStaticMax + ")																									\r\n");
		sb.append("					{																																	\r\n");
		sb.append("						strURL='" + pageStaticURLFormat + "';																							\r\n");
		sb.append("					}																																	\r\n");
		sb.append("					else																																\r\n");
		sb.append("					{																																	\r\n");
		sb.append("						strURL='" + pageDynamicURLFormat + "';																							\r\n");
		sb.append("					}																																	\r\n");
		sb.append("					strURL = strURL.replace('{0}',ip);																									\r\n");
		sb.append("				}																																		\r\n");
		sb.append("				document.location.href = strURL																											\r\n");
		sb.append("			}																																			\r\n");
		sb.append("		}																																				\r\n");
		sb.append("	}																																					\r\n");
		sb.append("	function tagLib_" + this.id + "_tbInputPageOnkeydown(inputPageId){																					\r\n");
		sb.append("		if (event.keyCode == 13){																														\r\n");
		sb.append("			tagLib_" + this.id + "_btnGoPage(inputPageId);																								\r\n");
		sb.append("		}																																				\r\n");
		sb.append("	}																																					\r\n");
		sb.append("</script>																																			\r\n");    
		
        sb.append("		<div class = \"" + this.pageCSS + "\" >																																															\r\n");
        sb.append("		" + strPaper.toString() + "																																																		\r\n");
        sb.append("		<h6>当前显示第&nbsp;<span>" + Integer.toString(intPageIndex) + "</span>/" + pageCount + "&nbsp;页&nbsp;&nbsp;转到</h6>																											\r\n");		
		sb.append("		<h4><input id=\"" + this.id + "_tbPager\" type=\"text\" style=\"width:20px\" value=\"\" onkeydown=\"javascript:tagLib_" + this.id + "_tbInputPageOnkeydown('" + this.id + "_tbPager')\"  /></h4>								\r\n");
		sb.append("		<h6>页</h6>																																																						\r\n");
		sb.append("		<h2><a href=\"#\" onclick=\"javascript:tagLib_" + this.id + "_btnGoPage('" + this.id + "_tbPager')\" />" + this.searchText + "</a></h2>																			\r\n");
        sb.append("		</div>																																																							\r\n");
       

        return sb.toString().replaceAll("\r\n", "").replaceAll("\t", "");
    }
	
	public int doEndTag()
	{
		try{
			pageContext.getOut().println(creatPaper());
		}catch(Exception e){
			System.err.println("分页标签出错！");
		}
		return EVAL_PAGE;
	}
	
	private int toInt(String str,int intDefault){
		if(str==null)
			return intDefault;
		if(str.trim().length()==0)
			return intDefault;
		try{
			return Integer.parseInt(str.trim());
		}catch(Exception e){
			return intDefault;
		}
	}
	
	private boolean isEmpty(String str){
		if(str == null)
			return true;
		if(str.trim().length() == 0)
			return true;
		
		return false;
	}
}
