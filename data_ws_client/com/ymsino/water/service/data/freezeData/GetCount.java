package com.ymsino.water.service.data.freezeData;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for getCount complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="queryParam" type="{http://api.service.data.esb.ymsino.com/}queryParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCount", propOrder = { "queryParam" })
public class GetCount {

	protected QueryParam queryParam;

	/**
	 * Gets the value of the queryParam property.
	 * 
	 * @return possible object is {@link QueryParam }
	 * 
	 */
	public QueryParam getQueryParam() {
		return queryParam;
	}

	/**
	 * Sets the value of the queryParam property.
	 * 
	 * @param value
	 *            allowed object is {@link QueryParam }
	 * 
	 */
	public void setQueryParam(QueryParam value) {
		this.queryParam = value;
	}

}
