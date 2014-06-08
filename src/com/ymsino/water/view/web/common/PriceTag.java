package com.ymsino.water.view.web.common;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
/**
 * 价格毫转成元
 * 参数说明
 * longPrice					必要参数，以分为单位的long型价格；
 * scale						保留小数位，默认保留4位；
 * 例：<gdcct:price longPrice="${goodsSpec.price }" scale="4" ></gdcct:price>
 * @author xuyongbin 2014-6-8
 *
 */
public class PriceTag extends TagSupport {

	private static final long serialVersionUID = 1L;

	private Long longPrice;
	private int scale = 2;


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
				out.print(Arith.div(longPrice, 10000, scale));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return SKIP_BODY;
	}

	@Override
	public int doEndTag() throws JspException {

		return EVAL_PAGE;
	}

}
