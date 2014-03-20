package com.ymsino.water.service.archives.waterCustomer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for modidy complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="modidy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="waterCustomerModifyParam" type="{http://api.service.archives.esb.ymsino.com/}waterCustomerModifyParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modidy", propOrder = { "waterCustomerModifyParam" })
public class Modidy {

	protected WaterCustomerModifyParam waterCustomerModifyParam;

	/**
	 * Gets the value of the waterCustomerModifyParam property.
	 * 
	 * @return possible object is {@link WaterCustomerModifyParam }
	 * 
	 */
	public WaterCustomerModifyParam getWaterCustomerModifyParam() {
		return waterCustomerModifyParam;
	}

	/**
	 * Sets the value of the waterCustomerModifyParam property.
	 * 
	 * @param value
	 *            allowed object is {@link WaterCustomerModifyParam }
	 * 
	 */
	public void setWaterCustomerModifyParam(WaterCustomerModifyParam value) {
		this.waterCustomerModifyParam = value;
	}

}
