package com.ymsino.water.service.data.checkingFreezeData;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for modify complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modify">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="checkingFreezeDataModifyParam" type="{http://api.service.data.esb.ymsino.com/}checkingFreezeDataModifyParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modify", propOrder = { "checkingFreezeDataModifyParam" })
public class Modify {

	protected CheckingFreezeDataModifyParam checkingFreezeDataModifyParam;

	/**
	 * Gets the value of the checkingFreezeDataModifyParam property.
	 * 
	 * @return possible object is {@link CheckingFreezeDataModifyParam }
	 * 
	 */
	public CheckingFreezeDataModifyParam getCheckingFreezeDataModifyParam() {
		return checkingFreezeDataModifyParam;
	}

	/**
	 * Sets the value of the checkingFreezeDataModifyParam property.
	 * 
	 * @param value
	 *            allowed object is {@link CheckingFreezeDataModifyParam }
	 * 
	 */
	public void setCheckingFreezeDataModifyParam(CheckingFreezeDataModifyParam value) {
		this.checkingFreezeDataModifyParam = value;
	}

}
