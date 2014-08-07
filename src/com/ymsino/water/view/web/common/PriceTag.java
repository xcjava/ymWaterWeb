package com.ymsino.water.view.web.common;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
/**
 * 价格毫转成元
 * 参数说明
 * longPrice					必要参数，以分为单位的long型价格；
 * scale						保留小数位，默认保留0位；
 * 例：<gdcct:price longPrice="${goodsSpec.price }" scale="0" ></gdcct:price>
 * @author xuyongbin 2014-6-8
 *
 */
public class PriceTag extends TagSupport {

	private static final long serialVersionUID = 1L;

	private Long longPrice;
	private int scale = 4;


	public int getScale() {
		return scale;
	}

	public void setScale(int scale) {
		this.scale = scale;
	}

	public Long getLongPrice() {
		return longPrice;
	}

	public void setLongPrice(Long longPrice) {
		this.longPrice = longPrice;
	}

	@Override
	public int doStartTag() throws JspException {
		
		try {
			JspWriter out = this.pageContext.getOut();
			if (longPrice == null) {
				out.print("");
			}else{
				out.print(subZeroAndDot(Arith.div(String.valueOf(longPrice), "10000", scale)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return SKIP_BODY;
	}
	
    /** 
     * 使用java正则表达式去掉多余的.与0 
     * @param s 
     * @return  
     */  
    public static String subZeroAndDot(String s){
        if(s.indexOf(".") > 0){
            s = s.replaceAll("0+?$", "");//去掉多余的0
            s = s.replaceAll("[.]$", "");//如最后一位是.则去掉
        }
        return s;
    }

	@Override
	public int doEndTag() throws JspException {

		return EVAL_PAGE;
	}

}
