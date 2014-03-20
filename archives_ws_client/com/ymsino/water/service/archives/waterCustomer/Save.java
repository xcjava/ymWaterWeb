package com.ymsino.water.service.archives.waterCustomer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for save complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="save">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="waterCustomerSaveParam" type="{http://api.service.archives.esb.ymsino.com/}waterCustomerSaveParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "save", propOrder = { "waterCustomerSaveParam" })
public class Save {

	protected WaterCustomerSaveParam waterCustomerSaveParam;

	/**
	 * Gets the value of the waterCustomerSaveParam property.
	 * 
	 * @return possible object is {@link WaterCustomerSaveParam }
	 * 
	 */
	public WaterCustomerSaveParam getWaterCustomerSaveParam() {
		return waterCustomerSaveParam;
	}

	/**
	 * Sets the value of the waterCustomerSaveParam property.
	 * 
	 * @param value
	 *            allowed object is {@link WaterCustomerSaveParam }
	 * 
	 */
	public void setWaterCustomerSaveParam(WaterCustomerSaveParam value) {
		this.waterCustomerSaveParam = value;
	}

}
