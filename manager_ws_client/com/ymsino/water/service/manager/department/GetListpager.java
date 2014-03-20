package com.ymsino.water.service.manager.department;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for getListpager complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getListpager">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="queryParam" type="{http://api.service.manager.esb.ymsino.com/}queryParam" minOccurs="0"/>
 *         &lt;element name="startRow" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getListpager", propOrder = { "queryParam", "startRow", "pageSize" })
public class GetListpager {

	protected QueryParam queryParam;
	protected Integer startRow;
	protected Integer pageSize;

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

	/**
	 * Gets the value of the startRow property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getStartRow() {
		return startRow;
	}

	/**
	 * Sets the value of the startRow property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setStartRow(Integer value) {
		this.startRow = value;
	}

	/**
	 * Gets the value of the pageSize property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getPageSize() {
		return pageSize;
	}

	/**
	 * Sets the value of the pageSize property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setPageSize(Integer value) {
		this.pageSize = value;
	}

}
