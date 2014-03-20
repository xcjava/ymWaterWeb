package com.ymsino.water.service.manager.chargingUnit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for queryParam complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="queryParam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customOrderParamStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderParamStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="queryCon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="queryLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="queryValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryParam", propOrder = { "customOrderParamStr", "orderParamStr", "queryCon", "queryLink", "queryValue" })
public class QueryParam {

	protected String customOrderParamStr;
	protected String orderParamStr;
	protected String queryCon;
	protected String queryLink;
	protected String queryValue;

	/**
	 * Gets the value of the customOrderParamStr property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCustomOrderParamStr() {
		return customOrderParamStr;
	}

	/**
	 * Sets the value of the customOrderParamStr property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCustomOrderParamStr(String value) {
		this.customOrderParamStr = value;
	}

	/**
	 * Gets the value of the orderParamStr property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOrderParamStr() {
		return orderParamStr;
	}

	/**
	 * Sets the value of the orderParamStr property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOrderParamStr(String value) {
		this.orderParamStr = value;
	}

	/**
	 * Gets the value of the queryCon property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getQueryCon() {
		return queryCon;
	}

	/**
	 * Sets the value of the queryCon property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setQueryCon(String value) {
		this.queryCon = value;
	}

	/**
	 * Gets the value of the queryLink property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getQueryLink() {
		return queryLink;
	}

	/**
	 * Sets the value of the queryLink property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setQueryLink(String value) {
		this.queryLink = value;
	}

	/**
	 * Gets the value of the queryValue property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getQueryValue() {
		return queryValue;
	}

	/**
	 * Sets the value of the queryValue property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setQueryValue(String value) {
		this.queryValue = value;
	}

}
